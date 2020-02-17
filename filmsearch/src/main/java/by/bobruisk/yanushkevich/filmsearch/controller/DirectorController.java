package by.bobruisk.yanushkevich.filmsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import by.bobruisk.yanushkevich.filmsearch.model.Director;
import by.bobruisk.yanushkevich.filmsearch.service.DirectorService;

@RestController
@RequestMapping("/api")
public class DirectorController {
	@Autowired
	private DirectorService directorService;
	
	@RequestMapping("/director")
	public List<Director> get(){
		return directorService.get();
	}
}
