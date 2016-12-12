package practice_spring.vo;

public class PlayerVO {
	private int number;
	private String name;
	private String team;
	private int age;
	private String nation;

	public PlayerVO() {

	}
	public PlayerVO(String name, String team, int age, String nation) {
		super();
		this.name = name;
		this.team = team;
		this.age = age;
		this.nation = nation;
	}
	public PlayerVO(int number, String name, String team, int age, String nation) {
		
		this.number = number;
		this.name = name;
		this.team = team;
		this.age = age;
		this.nation = nation;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	@Override
	public String toString() {
		return "PlayerVO [number=" + number + ", name=" + name + ", team=" + team + ", age=" + age + ", nation="
				+ nation + "]";
	}


}
