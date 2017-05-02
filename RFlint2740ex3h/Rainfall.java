package exercise3h;



public class Rainfall {
	private double [] rainfallArry;
	
public Rainfall(double[] rainfall) {
super();

{
}
Rainfall(String[] rainfall){
	super();
}
//******************************************************
// The getTotal method returns the total of the  *
// elements in the rainfall array.              *
//******************************************************
public double getTotal()
{
	double total = 0.0; // Accumulator
	
	// Add up all the values in the rainfall array.
	for(double value: rainfall)
		total += value;
	// Return the total.
	return total;
}
//********************************************************
// The getAverage method returns the average of the *
// elements in the rainfall array.                 *
//********************************************************
public double getAverage()
{
	return getTotal() / rainfall.length;
}
//********************************************************
// The getHighest method returns the highest value *
// stored in the rainfall array.				*
//********************************************************
public double getHighest()
{
	double highest = this.rainfallArry[0];
	
	// Search the array for the highest value.
	for (int index = 0; index < rainfall.length; index++)
	{
		if (rainfall[index] > highest)
			highest = rainfall[index];
	}
	// Return the highest value.
	return highest;
}
//********************************************************
// The getLowest method returns the lowest value   *
// stored in the rainfall array.                 *
//********************************************************
public double getLowest()
{
	double lowest = this.rainfallArry[0];
	// Search the array for the highest value.
	for (int index = 0; index < rainfall.length; index++)
	{
		if (rainfall[index] > lowest)
			lowest = rainfall[index];
	}
	// Return the lowest value.
	return lowest;
}
}

private void Rainfall(Object object) {
	// TODO Auto-generated method stub
	
}

public Rainfall(String[] strRainfall) {
	// TODO Auto-generated constructor stub
}

public String getTotal() {
	// TODO Auto-generated method stub
	return null;
}

public Object getAverage() {
	// TODO Auto-generated method stub
	return null;
}

public Object getHighest() {
	// TODO Auto-generated method stub
	return null;
}

public Object getLowest() {
	// TODO Auto-generated method stub
	return null;
}
}
