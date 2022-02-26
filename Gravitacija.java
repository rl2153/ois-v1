import java.util.Scanner;
public class Gravitacija {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vnesite nadmorsko visino: ");
        double n = sc.nextDouble();

		System.out.printf("Gravitacijski pospesek je: %f m/s^2", GetPospesek(n));
    }
	public static double GetPospesek(double visina)
	{
		double G = 6.674E-11;
		double R = 6.371E06;
		double M = 5.972E24;
		return G * M / Math.pow(R + visina, 2);
	}
} 
