package comm.advclass;

public enum WEEK {
	SUN("Today is holiday.",7),
	MON("Today is Monday. ",1),
	TUE("Today is Tuesday. ",2),
	WED("Today is Wednesday. ",3),
	THS("Today is Thursday. ",4),
	FRI("Today is Friday. ",5),
	SAT("Today is Saturday. ",6);
	
	private final String name;
	private final int rank;
	
	private WEEK(String n, int r) {
		name = n;
		rank = r;
	}

	public String getName() {
		return name;
	}

	public int getRank() {
		return rank;
	}
	

}
