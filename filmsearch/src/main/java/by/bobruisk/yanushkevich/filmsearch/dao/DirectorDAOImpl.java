package by.bobruisk.yanushkevich.filmsearch.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.bobruisk.yanushkevich.filmsearch.model.Director;

@Repository
public class DirectorDAOImpl implements DirectorDAO {

	Director director;
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Director> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Director> query = currentSession.createQuery("from Director", Director.class);
		List<Director> list = query.getResultList();
		return list;
	}

	@Override
	public Director get(Long id) {
		Session currentSession = entityManager.unwrap(Session.class);
		director = currentSession.find(Director.class, id);
		return director;
	}

	@Override
	public void save(Director director) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
