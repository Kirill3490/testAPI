package by.bobruisk.yanushkevich.filmsearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.bobruisk.yanushkevich.filmsearch.dao.DirectorDAO;
import by.bobruisk.yanushkevich.filmsearch.model.Director;

@Service
public class DirectorServiceImpl implements DirectorService {

	@Autowired
	private DirectorDAO direcorDAO;

	@Transactional
	@Override
	public List<Director> get() {
		return direcorDAO.get();
	}
	
	@Transactional
	@Override
	public Director get(Long id) {
		return direcorDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Director film) {
		// TODO Auto-generated method stub

	}
	
	@Transactional
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
