package by.bobruisk.yanushkevich.filmsearch.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.bobruisk.yanushkevich.filmsearch.model.Film;

@Repository
public class FilmDAOImpl implements FilmDAO {
	Film film;

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Film> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Film> query = currentSession.createQuery("from Film", Film.class);
		List<Film> list = query.getResultList();
		return list;
	}

	@Override
	public Film get(Long id) {
		Session currentSession = entityManager.unwrap(Session.class);
		film = currentSession.find(Film.class, id);

		return film;
	}

	@Override
	public void save(Film film) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Film> getByDirectorId(Long id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Film> query = currentSession.createQuery("from Film where director_id =" + id, Film.class);
		List<Film> list = query.getResultList();
		return list;
	}

	@Override
	public List<Film> getByReleaseDate(Integer date) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Film> query = currentSession.createQuery("from Film where release_date >=" + date, Film.class);
		List<Film> list = query.getResultList();
		return list;
	}

	@Override
	public List<Film> getByReleaseDateAndRelease(Long id, Integer date) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Film> query = currentSession.createQuery("from Film WHERE director_id = " + id + " AND release_date >= " + date, Film.class);
		List<Film> list = query.getResultList();
		return list;
	}



}
