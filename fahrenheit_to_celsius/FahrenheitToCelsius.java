//Rudimentary program created to understand semantics and syntax of Java

/* temperature formulas
 * C = 5/9 x (F-32)
 * F= (9/5*C) + 32
 *
 * reminder 9/5 =1.8 5/9 = .55 */

public class FahrenheitToCelsius{
		public static void main(String[] args) {

			int saturdayFahrenheit = 78, sundayFahrenheit = 81;

			double saturdayCelsius = (5.0/9) * (saturdayFahrenheit -32), sundayCelsius= (5.0/9) * (sundayFahrenheit -32);

			//System.out.println(saturdayFahrenheit); // used to for testing purposes 

			//System.out.print(sundayFahrenheit); // used to testing purposes
			
			System.out.print("These will be your weekend averages");

			System.out.print("For Saturdays weahther:" + saturdayCelsius);

			System.out.print("For Sundays weather:" + sundayCelsius);


			





		}

}
			

