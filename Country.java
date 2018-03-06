
public class Country {
String CountryName;
int Population;
double Area;
	public Country(String CountryName2,int Population2, double Area2) {
		// TODO Auto-generated constructor stub
		CountryName = CountryName2;
		Population = Population2;
		Area = Area2;
	}


public static int ComparePopulation (int Country1, int Country2){
	if (Country1 < Country2){
		return Country2;
}
	else {
		return Country1;
	}
			
		}
}
