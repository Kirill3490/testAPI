package by.bobruisk.yanushkevich.filmsearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.bobruisk.yanushkevich.filmsearch.dao.FilmDAO;
import by.bobruisk.yanushkevich.filmsearch.model.Film;

@Service
public class FilmServiceImpl implements FilmService{
	
	@Autowired
	private FilmDAO filmDAO;
	
	@Transactional
	@Override
	public List<Film> get() {
		return filmDAO.get();
	}

	@Transactional
	@Override
	public Film get(Long id) {
		return filmDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Film film) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public List<Film> getByDirectorId(Long id) {
		return filmDAO.getByDirectorId(id);
	}

	@Override
	public List<Film> getByReleaseDate(Integer date) {
		return filmDAO.getByReleaseDate(date);
	}

	@Override
	public List<Film> getByReleaseDateAndRelease(Long id, Integer date) {
		return filmDAO.getByReleaseDateAndRelease(id, date);
	}

}
