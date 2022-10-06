<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>기업 회원가입 페이지</title>
</head>
<body>
	<form>
		Username : <input type="text" id="companyUsername" name="companyUsername"> </br>
		Password :<input type="text" id="companyPassword"  name="companyPassword"> </br>
		Name :<input type="text" id="companyName" name="companyName"> </br>
		Email :<input type="text" id="companyEmail"  name="companyEmail"> </br>
		PhoneNumber :<input type="text" id="companyPhoneNumber"  name="companyPhoneNumber"> </br> 
		Address : <input type="text" id="companyAddress" placeholder="주소" name="companyAddress">
		<input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"> </br>
		
        <label class="form-check-label">
          <input onclick="getCategoryList();" id="companyCategory1" type="checkbox" value="분야1" name="companyCategory">
          분야1
        </label>
        <label class="form-check-label">
          <input onclick="getCategoryList();" id="companyCategory2" type="checkbox" value="분야2" name="companyCategory">
          분야2
        </label>
        <label class="form-check-label">
          <input onclick="getCategoryList();" id="companyCategory3" type="checkbox" value="분야3" name="companyCategory">
          분야3
        </label>
        
		<button id="btnSave" type="button" value="전송">전송</button>
	</form>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("companyAddress").value = addr+extraAddr;
                
                } else {
                    document.getElementById("companyAddress").value = '';
                }
            }
        }).open();
    }
    
    // ajax로 form 태그 json으로 보내기(company insert)
    $("#btnSave").click(()=>{
    	let arr = getCategoryList();
    	console.log(arr);
    	joinCompany();
    })
    
    // getCategoryList()
    function getCategoryList() {
    	let arr = new Array();
    	
    	$("input:checkbox[name='companyCategory']").each(function() {
    		if ($(this).is(":checked") == true) {
    			arr.push($(this).val());
    		}
    	});
    	
    	  console.log(arr);
    	  return arr;
    }
    
    
    function joinCompany() {

    	let data = {
    		companyUsername:$("#companyUsername").val(),
    		companyPassword:$("#companyPassword").val(),
    		companyName:$("#companyName").val(),
    		companyEmail:$("#companyEmail").val(),
    		companyPhoneNumber:$("#companyPhoneNumber").val(),
    		companyAddress:$("#companyAddress").val(),
    		categoryList:getCategoryList()
    	}
    	
    	
    	$.ajax("/company/join", {
        	type: "POST",
        	dataType: "json",
        	data: JSON.stringify(data), 
    		headers: { 
    			"Content-Type": "application/json; charset=utf-8"
    		}
        }).done((res)=>{
        	if(res.code == 1){ // 성공
        		alert(res.msg);
    			location.href="/";
    		}else{ // 실패
    			alert("기업 회원 가입에 실패하였습니다.");
    		}
        });
    }
    
    
    
    
    
</script>
	
</body>
</html>