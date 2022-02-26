public class Gravitacija
{
	public static void main(String args[])
	{
		
	}
	
	public static double GetPospesek(double visina)
	{
		double G = 6.674E-11;
		double R = 6.371E06;
		double M = 5.972E24;
		return G * M / Math.pow(R + visina, 2);
	}
}