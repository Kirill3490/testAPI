package by.bobruisk.yanushkevich.filmsearch.service;

import java.util.List;

import by.bobruisk.yanushkevich.filmsearch.model.Director;

public interface DirectorService {
	List<Director> get();
	
	Director get(Long id);
	
	void save(Director director);
	
	void delete(Long id);
}
