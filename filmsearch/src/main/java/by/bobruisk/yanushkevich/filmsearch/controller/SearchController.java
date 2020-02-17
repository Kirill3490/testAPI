package by.bobruisk.yanushkevich.filmsearch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import by.bobruisk.yanushkevich.filmsearch.model.Director;
import by.bobruisk.yanushkevich.filmsearch.model.Film;
import by.bobruisk.yanushkevich.filmsearch.model.SearchResult;
import by.bobruisk.yanushkevich.filmsearch.service.DirectorService;
import by.bobruisk.yanushkevich.filmsearch.service.FilmService;

@RestController
@RequestMapping("/api")
public class SearchController {
	@Autowired
	private DirectorService directorService;
	@Autowired
	private FilmService filmService;
	
	Director director = new Director();
	
	SearchResult searchResult;
	
	private List<SearchResult> resultList;
	
	@GetMapping("/films/{filmId}")
	public Film get(@PathVariable Long filmId){
		return filmService.get(filmId);
	}
	
	@GetMapping("/films/director/{directorId}")
	public List<Film> getFilmsByDirector(@PathVariable Long directorId){
		return filmService.getByDirectorId(directorId);
	}
	
	@GetMapping("films/release/{date}")
	public List<SearchResult> getFilmsByReleaseDate(@PathVariable Integer date){
		List<Film> tempList = filmService.getByReleaseDate(date);
		resultList = addDatetoResultList(tempList, director);
		return resultList;
	}
	
	@GetMapping("/film/director{directorId}/release{releaseDate}")
	public List<SearchResult>getFilmListByDirectorIdAndReleaseDate(@PathVariable Long directorId, @PathVariable Integer releaseDate){
		List<Film> tempList = filmService.getByReleaseDateAndRelease(directorId, releaseDate);
		resultList = addDatetoResultList(tempList, director);
		return resultList;
	}
	
	@GetMapping("/film/director/{directorId}")
	public List<SearchResult> getFilmInfoByDirector(@PathVariable Long directorId){
		List<Film> tempList = filmService.getByDirectorId(directorId);
		Director director = directorService.get(directorId);
		resultList = addDatetoResultList(tempList, director);
		return resultList;
	}
	
	
	private List<SearchResult> addDatetoResultList(List<Film> tempList, Director director) {
		resultList = new ArrayList<SearchResult>();
		if (tempList != null) {
			for (int i = 0; i < tempList.size(); i++) {
				Film film = tempList.get(i);
				searchResult = new SearchResult();
				director = directorService.get(film.getDirector().getId());
				searchResult.setFirst_name(director.getName());
				searchResult.setLast_name(director.getLastLame());
				searchResult.setBirth_date(director.getBirthDate());
				searchResult.setGenre(film.getGenre());
				searchResult.setFilmName(film.getName());
				searchResult.setReleaseDate(film.getRelease_date());
				resultList.add(searchResult);
			}
		}
		return resultList;
	}
	
}
