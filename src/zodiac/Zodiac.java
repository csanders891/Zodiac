package zodiac;
import java.util.Scanner;
public class Zodiac {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("When is Your birthday? (Enter month)");
		Scanner sc = new Scanner(System.in);
		String month = sc.nextLine();
		System.out.println("When is Your birthday? (Enter day)");
		int day = sc.nextInt();
		String sign = null;
		do {
			//cannot accept 0s, negative numbers, or numbers greater than 31
			while(day< 1 || day > 31)
			{
				System.out.println("Invalid entry.  Try again");
				sc.nextLine();
				month = sc.nextLine();
				day = sc.nextInt();
			}

			//only 28 days in February (29 in a leap year)
			while (month.equals("February") && day > 29)
			{
				System.out.println("Invalid entry.  Try again");
				sc.nextLine();
				month = sc.nextLine();
				day = sc.nextInt();	
			}

			//30 days hath September,  April, June, and November
			while (month.equals("April") && day > 30 || month.equals("June") && day > 30 || month.equals("September") && day > 30 
					|| month.equals("November") && day > 30)
			{
				System.out.println("Invalid entry.  Try again");
				sc.nextLine();
				month = sc.nextLine();
				day = sc.nextInt();	
			}

			//Zodiac signs based on user input
			if(month.equalsIgnoreCase("March")  && day >= 21 && day <= 31 || month.equalsIgnoreCase("April") && day >=1  && day <= 19)
				sign = "Aries";

			else if(month.equalsIgnoreCase("April" ) && day >= 20 && day <= 30 || month.equalsIgnoreCase("May")  && day >=1 && day <=20)
				sign = "Taurus";

			else if(month .equalsIgnoreCase("May") && day >= 21 && day <= 31 || month .equalsIgnoreCase("June") && day >=1 && day <= 20)
				sign = "Gemini";

			else if (month .equalsIgnoreCase("June") && day >= 21 && day <= 30 || month .equalsIgnoreCase("July") && day >= 1 && day <= 22)
				sign = "Cancer";

			else if(month.equalsIgnoreCase("July") && day >= 23 && day <= 31 || month.equalsIgnoreCase("August") && day >= 1 && day <= 22)
				sign = "Leo";

			else if(month.equalsIgnoreCase("August") && day >= 23 && day <= 31 || month.equalsIgnoreCase("September") && day >= 1 && day <= 22)
				sign = "Virgo";

			else if(month.equalsIgnoreCase("September") && day >= 23 && day <= 30 || month.equalsIgnoreCase("October") && day >=1 && day <= 22)
				sign = "Libra";

			else if(month.equalsIgnoreCase("October") && day >= 23 && day <= 31 || month.equalsIgnoreCase("November") && day >=1 && day <= 21)
				sign = "Scorpio";

			else if(month.equalsIgnoreCase("November") && day >=22 && day <= 30 || month.equalsIgnoreCase("December") && day >=1 && day <=21)
				sign = "Sagittarius";

			else if(month.equalsIgnoreCase("December") && day >= 22 && day <= 31 || month.equalsIgnoreCase("January") && day >= 1 && day <= 19)
				sign = "Capricorn";

			else if(month.equalsIgnoreCase("January") && day >= 20 && day <= 31 || month.equalsIgnoreCase("February") && day >= 1 && day <=18)
				sign = "Aquarius";

			else if(month.equalsIgnoreCase("February") && day >=19 && day <= 29 || month.equalsIgnoreCase("March") && day >= 1 && day <= 20)
				sign = "Pisces";
			
			//if the user enters a month
			if(sign != null)
			{
				System.out.println("Your sign is " + sign);	
				
				if(month.equals("February") && day == 29)
					System.out.println("(every 4 years)");
			}
				

			//if the user doesn't enter a month
			while(sign == null)
			{
				System.out.println("Invalid entry.  Try again");
				sc.nextLine();
				month = sc.nextLine();	
				day = sc.nextInt();	
				
				if(month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("March"))
					break;
				
				else if(month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")  || month.equalsIgnoreCase("June"))
					break;
				
				else if(month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") || month.equalsIgnoreCase("September"))
					break;
				
				else if (month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November") || month.equalsIgnoreCase("December"))
					break;
			}
		 
		}while(sign == null);
			
	}
}



