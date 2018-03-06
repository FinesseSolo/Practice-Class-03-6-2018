		import java.util.Scanner;
		public class CountryTest {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		System.out.println("Please Enter the information");
		
		Scanner scanner = new Scanner(System.in);
		
		String CountryName = scanner.next();int Population = scanner.nextInt(); double Area =scanner.nextDouble();
		
		Country Country1 = new Country (CountryName,Population,Area);
		
		String CountryName2 = scanner.next();int Population2 = scanner.nextInt(); double Area2 =scanner.nextDouble();
		
		Country Country2 = new Country (CountryName2,Population2,Area2);
		
		System.out.println(Country1.ComparePopulation(Country1.Population,Country2.Population));
		
			}
		
		}
