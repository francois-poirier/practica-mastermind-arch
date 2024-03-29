package mastermind.models;

class State {
		
	private StateValue stateValue;
	
	public State() {
		this.stateValue = StateValue.INITIAL;
	}

	public void next() {
		this.stateValue = StateValue.values()[this.stateValue.ordinal()+1];
	}

	public void reset() {
		this.stateValue = StateValue.INITIAL;
	}

	public StateValue getValue() {
		return this.stateValue;
	}

}
