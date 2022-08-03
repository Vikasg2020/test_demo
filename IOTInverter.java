
public class IOTInverter {
	
	
	public static void main(String[] args) {
		
		Solar s=new Solar();
		s.solar_Dispale();
		System.out.println("After");
		PCU b= new PCU();
		b.dis_Pcu(); 
	}
	 
}
	
class Solar extends IOTInverter
{
		String battery;
	 	String grid;
		String solar; 
		public void solar_Dispale() { 
			System.out.println("Solar Inverter");
			System.out.println("PCU");
			System.out.println("GTI");
			System.out.println("Regalia"); 
      }
}
		
class PCU extends Solar{ 
			
			public void dis_Pcu() { 
				battery="yes";
				grid="no";
				solar="yes";
				System.out.println("this is PCU class");
				System.out.println(" Solar :"+solar);
				System.out.println("Battery "+battery);
				System.out.println("Grid On "+grid);
			}
			 
}
class GTI extends Solar{ 
				public void dis_Gti() {
					battery="no";
					grid="yes";
					solar="yes";
					System.out.println("this is GIT class");
					System.out.println("Solar :"+solar);
					System.out.println("Battery : "+battery);
					System.out.println("Grid On : "+grid);
				}
			
}
class Regalia extends Solar { 
				public void dis_Regalia() {
					battery="no";
					grid="yes";
					solar="yes";
					System.out.println("this is GIT Regalia");
					System.out.println("Solar :"+solar);
					System.out.println("Battery : "+battery);
					System.out.println("Grid On : "+grid);
				}
			
		} 
	class NonSolar{ 
		String battery="yes";
		String grid="no";
		String solar="no";
              public void solar_Dispale() {
			
			System.out.println("Non Solar Inverter");
			System.out.println("Zelio");
			System.out.println("IcrureInverter"); 
		}
		   
	}
		
class Zelio extends NonSolar{ 
				public void dis_Zelio() {
					System.out.println("this is GIT Zelio");
					System.out.println("Solar :"+solar);
					System.out.println("Battery : "+battery);
					System.out.println("Grid On : "+grid);
				}
			
}
class IcrureInverter extends NonSolar{
			 
				public void dis_Icrure() {
					System.out.println("this is IcrureInverter");
					System.out.println("Solar :"+solar);
					System.out.println("Battery : "+battery);
					System.out.println("Grid On : "+grid);
				}
}
		
	


