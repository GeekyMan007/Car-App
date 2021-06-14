package CarApp;

public class Car {
	private String name;
	private String type;
	private int id;
	private String color;
	private int seats;
	private double speed;

	public Car() {

	}

	public Car(String name, String type, int id, String color, int seats, double speed) {
		this.name = name;
		this.type = type;
		this.id = id;
		this.color = color;
		this.seats = seats;
		this.speed = speed;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
