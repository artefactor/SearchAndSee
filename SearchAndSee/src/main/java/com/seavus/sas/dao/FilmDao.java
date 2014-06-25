
package com.seavus.sas.dao;

import java.util.List;

import com.seavus.sas.model.Film;


public interface FilmDao {

	public void create(Film film) throws FilmDAOException;

	public Film read(int film) throws FilmDAOException;

	public void update(Film film) throws FilmDAOException;

	public void delete(Film film) throws FilmDAOException;

	public List<Film> getList() throws FilmDAOException;
	

}

