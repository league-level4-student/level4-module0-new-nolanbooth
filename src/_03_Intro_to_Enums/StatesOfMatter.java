package _03_Intro_to_Enums;

public enum StatesOfMatter {
	
	
	SOLID (0), LIQUID(25.55f), GAS(100), PLASMA(10000);
	
	float celsiusTemp;

	private StatesOfMatter(float celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
		// TODO Auto-generated constructor stub
	}
	public float convertToFahrenheit(float temp) {
		float fah = (temp*(9/5))+32;
		
		
		
		return fah;
	}
}

