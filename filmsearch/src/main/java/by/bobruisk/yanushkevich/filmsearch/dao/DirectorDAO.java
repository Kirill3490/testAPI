package by.bobruisk.yanushkevich.filmsearch.dao;

import java.util.List;

import by.bobruisk.yanushkevich.filmsearch.model.Director;

public interface DirectorDAO {
	
	List<Director> get();

	Director get(Long id);

	void save(Director director);

	void delete(Long id);
}
