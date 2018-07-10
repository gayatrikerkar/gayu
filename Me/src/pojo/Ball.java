package pojo;

public class Ball {
private Integer size;
private Integer weight;
private String color;
private String brand;

public Integer getSize() {
	return size;
}
public void setSize(Integer size) {
	this.size = size;
}
public Integer getWeight() {
	return weight;
}
public void setWeight(Integer weight) {
	this.weight = weight;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Ball()
{
	size = 0;
	weight = 0;
	color = "";
	brand = "";
}

public Ball(Integer size, Integer weight, String color, String brand) {
	this.size = size;
	this.weight = weight;
	this.color = color;
	this.brand = brand;
}


}
