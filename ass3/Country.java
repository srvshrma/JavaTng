package comm.ass3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Country {
	
	private String cName;

	List<State> stateList=new ArrayList<State>();

	public String getCname() {
		return cName;
	}

	public void setName(String cName) {
		this.cName = cName;
	}

	public List<State> getStateList() {
		Collections.sort(List<State>);
		return stateList;
	}

	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}

	public Country(String cName) {
		super();
		this.cName = cName;
	}
	
	public void addState(String statename) {
		State sn=new State(statename);
		sn.getName();
		
	}
	

}
