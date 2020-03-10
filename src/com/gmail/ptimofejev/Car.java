package com.gmail.ptimofejev;

public class Car {
	private String model;
	private String color;
	private int year;
	private double engineCub;

	public Car() {

	}

	public Car(String model, String color, int year, double engineCub) {
		this.model = model;
		this.color = color;
		this.year = year;
		this.engineCub = engineCub;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getEngineCub() {
		return engineCub;
	}

	public void setEngineCub(double engineCub) {
		this.engineCub = engineCub;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(engineCub);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(engineCub) != Double.doubleToLongBits(other.engineCub))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", year=" + year + ", engineCub=" + engineCub + "]";
	}

}
