

public class Platypus {
	private String pname;

	public Platypus(String iname) {
		this.pname = iname;
	}

	public void setName(String input2) {
		this.pname = input2;
	}

	public String getName() {
		return pname;
	}

	void sayHi() {
		System.out.println("The platypus " + pname + " is smarter than your average platypus.");
	}
}
