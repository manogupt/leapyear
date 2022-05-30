
public class leapyear {


		public static void main(String[] args) {
			
			int year = 2005;
			boolean isleapyear =false;
			
			if (year % 4 !=0 ){
				isleapyear = false;
			}
			
			else if (year % 400 == 0 ){
				isleapyear = true;
			}
			
			else {
				isleapyear = true;
			}
			
			if (isleapyear){
				System.out.println(year + " is a leap year");
			}
			
			else {
				System.out.println(year + " is not a leap year");
			}
		}

	}

