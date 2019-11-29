import java.util.Arrays;

public class Bootcamp {

	/* Klassenvariablen */
	
	private static int zaehler;
	
	/* statischer Initialisierer */
	
	static {
		zaehler = 0;
	}
	
	/* Klassenmethoden */
	
	public static int getZaehler() {
		return zaehler;
	}
	
	/* Instanzvariablen */
	
	private String trainer;

	private String[] members;
	private int maxMembers;
	
	/* Konstruktoren */
	
	public Bootcamp() {
		this("Andre");
		zaehler++;
	}
	
	public Bootcamp(String trainer) {
		this(trainer, new String[0], 15);
	}

	public Bootcamp(String trainer, String[] members, int maxMembers) {
		this.trainer = trainer;
		this.members = members.clone();
		this.maxMembers = maxMembers;
	}

	/* Instanzmethoden */
	
	public String[] getMembers() {
		return members;
	}

	public void setMember(String member) {
		for (int i = 0; i < this.members.length; i++) {
			if (this.members[i] == null) {
				this.members[i] = member;
				return;
			}
		}
		String[] tmp = new String[this.members.length + 1];
		for (int i = 0; i < this.members.length; i++) {
			tmp[i] = this.members[i];
		}
		tmp[tmp.length - 1] = member;
		this.members = tmp;
	}

	public String getTrainer() {
		return trainer;
	}

	public int getMaxMembers() {
		return maxMembers;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.members);
	}
		
}








