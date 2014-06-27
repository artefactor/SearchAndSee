package com.seavus.sas.dao;

public class FilmDAOException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7897328907261490267L;

	public FilmDAOException() {
		super();
	}

	public FilmDAOException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FilmDAOException(String message, Throwable cause) {
		super(message, cause);
	}

	public FilmDAOException(Throwable cause) {
		super(cause);
	}

	public FilmDAOException(String message) {
		super(message);
	}

}
