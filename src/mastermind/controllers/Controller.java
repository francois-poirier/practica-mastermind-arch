package mastermind.controllers;

import mastermind.models.Session;

public abstract class Controller {

	protected Session session;

	public Controller( Session session) {
		this.session = session;
	}

	public abstract void control();

}
