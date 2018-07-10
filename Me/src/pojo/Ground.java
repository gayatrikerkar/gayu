package pojo;

public class Ground {
private Integer length;
private Integer breadth;
private Integer noOfPlayers;
public Integer getLength() {
	return length;
}
public void setLength(Integer length) {
	this.length = length;
}
public Integer getBreadth() {
	return breadth;
}
public void setBreadth(Integer breadth) {
	this.breadth = breadth;
}
public Integer getNoOfPlayers() {
	return noOfPlayers;
}
public void setNoOfPlayers(Integer noOfPlayers) {
	this.noOfPlayers = noOfPlayers;
}
public Ground()
{
	length = 0;
	breadth = 0;
	noOfPlayers = 0;
}

public Ground(Integer length, Integer breadth, Integer noOfPlayers) {
	this.length = length;
	this.breadth = breadth;
	this.noOfPlayers = noOfPlayers;
}



}
