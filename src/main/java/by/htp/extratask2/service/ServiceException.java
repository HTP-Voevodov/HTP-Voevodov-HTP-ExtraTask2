package by.htp.extratask2.service;

public class ServiceException extends Exception{
	private static final long serialVersionUID = 3289872164315667609L;

	public ServiceException() {
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Exception e) {
		super(e);
	}

	public ServiceException(String message, Exception e) {
		super(message, e);
	}
}
