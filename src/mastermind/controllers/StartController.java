package mastermind.controllers;

import mastermind.views.console.SecretCombinationView;
import mastermind.models.Session;
import mastermind.views.console.StartView;

public class StartController extends Controller {
	
	public StartController(Session session) {
		super(session);
	}
	
	public void control(){
		new StartView().write();
		new SecretCombinationView().writeln(this.session.getGameWidth());
		session.next();
	}
}
