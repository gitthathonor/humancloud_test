package site.metacoding.humancloud.web;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;
import site.metacoding.humancloud.domain.temp.Temp;
import site.metacoding.humancloud.service.TempService;
import site.metacoding.humancloud.web.dto.CMRespDto;
import site.metacoding.humancloud.web.dto.request.temp.SaveDto;

@Controller
@RequiredArgsConstructor
public class TempController {
	
	private final TempService tempService;
	
	@GetMapping("/saveForm")
	public String saveForm() {
		return "fileSaveForm";
	}
	
	@PostMapping(value = "/save", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE })
	  public @ResponseBody CMRespDto<?> save(@RequestPart("file") MultipartFile file, @RequestPart("saveDto") SaveDto saveDto) throws Exception {
	    int pos = file.getOriginalFilename().lastIndexOf(".");
	    String extension = file.getOriginalFilename().substring(pos + 1);
	    String filePath = "C:\\temp\\img\\";
	    String logoSaveName = UUID.randomUUID().toString();
	    String logo = logoSaveName + "." + extension;

	    File makeFileFolder = new File(filePath);
	    if (!makeFileFolder.exists()) {
	      if (!makeFileFolder.mkdir()) {
	        throw new Exception("File.mkdir():Fail.");
	      }
	    }

	    File dest = new File(filePath, logo);
	    try {
	      Files.copy(file.getInputStream(), dest.toPath());
	    } catch (IOException e) {
	      e.printStackTrace();
	    }

	    Temp temp = saveDto.toEntity(logo);
	    tempService.saveFile(temp);
	    return new CMRespDto<>(1, "업로드 성공", logo);
	  }
	
	
	@GetMapping("/view/{id}")
	public String view(@PathVariable Integer id, Model model) {
		model.addAttribute("file", tempService.viewFile(id));
		return "fileView";
	}
	
	
}
