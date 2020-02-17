package by.bobruisk.yanushkevich.filmsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import by.bobruisk.yanushkevich.filmsearch.model.Film;
import by.bobruisk.yanushkevich.filmsearch.service.FilmService;

@RestController
@RequestMapping("/api")
public class FilmController {
	@Autowired
	private FilmService filmService;
	
	@RequestMapping("/film")
	public List<Film> get(){
		return filmService.get();
	}
}
