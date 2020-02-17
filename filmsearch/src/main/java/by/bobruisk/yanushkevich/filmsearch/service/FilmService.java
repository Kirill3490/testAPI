package by.bobruisk.yanushkevich.filmsearch.service;

import java.util.List;

import by.bobruisk.yanushkevich.filmsearch.model.Film;

public interface FilmService {
	List<Film> get();
	
	List<Film> getByDirectorId(Long id);
	
	List<Film> getByReleaseDate(Integer date);
	
	List<Film> getByReleaseDateAndRelease(Long id, Integer date);
	
	Film get(Long id);
	
	void save(Film film);
	
	void delete(Long id);
}
