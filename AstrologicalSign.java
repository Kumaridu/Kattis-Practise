import java.util.Scanner;

public class AstrologicalSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int classMates = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<classMates;i++){
            String sign = "";
            String birthDate = sc.nextLine();
            String[] date = birthDate.split(" ");

            int day = Integer.parseInt(date[0]);
            String month = date[1];
            if(month.equals("Jan")){
                if(day<21)
                    sign = "Capricorn";
                 else
                    sign = "Aquarius";
            }
            else if(month.equals("Feb")){
                if(day<20)
                    sign = "Aquarius";
                else
                    sign = "Pisces";
            }
            else if(month.equals("Mar")){
                if(day<21)
                    sign = "Pisces";
                else
                    sign = "Aries";
            }
            else if(month.equals("Apr")){
                if(day<21)
                    sign = "Aries";
                else
                    sign = "Taurus";
            }
            else if(month.equals("May")){
                if(day<21)
                    sign = "Taurus";
                else
                    sign = "Gemini";
            }
            else if(month.equals("Jun")){
                if(day<22)
                    sign = "Gemini";
                else
                    sign = "Cancer";
            }
            else if(month.equals("Jul")){
                if(day<23)
                    sign = "Cancer";
                else
                    sign = "Leo";
            }
            else if(month.equals("Aug")){
                if(day<23)
                    sign = "Leo";
                else
                    sign = "Virgo";
            }
            else if(month.equals("Sep")){
                if(day<22)
                    sign = "Virgo";
                else
                    sign = "Libra";
            }
            else if(month.equals("Oct")){
                if(day<23)
                    sign = "Libra";
                else
                    sign = "Scorpio";
            }
            else if(month.equals("Nov")){
                if(day<23)
                    sign = "Libra";
                else
                    sign = "Sagittarius";
            }
            else if(month.equals("Dec")){
                if(day<22)
                    sign = "Libra";
                else
                    sign = "Capricorn";
            }
            System.out.println(sign);
        }
    }
}
