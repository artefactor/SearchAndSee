package com.seavus.sas.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.seavus.sas.model.Film;


public class FilmDaoImplJDBC implements FilmDao {
	Map<Integer, String> map = new HashMap<Integer, String>();
	Map<Integer, String> otherMap = new HashMap<Integer, String>();

	public FilmDaoImplJDBC() {
		map.put(FilmQueryCodes.RATED_FILMS, FilmQueries.RATED_FILMS_QUERY);
		map.put(FilmQueryCodes.UNRATED_FILMS, FilmQueries.UNRATED_FILMS_QUERY);
		otherMap.put(new FilmQueryCodes().UNRATED_FILMS, FilmQueries.UNRATED_FILMS_QUERY);

	}

	@Override
	public void create(Film film) throws FilmDAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Film read(int film) throws FilmDAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Film film) throws FilmDAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Film film) throws FilmDAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Film> getList() throws FilmDAOException {
		// TODO Auto-generated method stub
		return null;
	}
}
