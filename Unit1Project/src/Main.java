import java.util.*;


public class Main {


    public static double percentToDecimal(double y){
        return y*.01;
    }

    public static double calculateTip(double bill, double percent){
        return bill*percent;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Tip Calculator");
        System.out.println("Enter your bill: ");
        double newBill = Double.parseDouble(s.nextLine());
        System.out.println("Enter the percentage of tip (with the % sign): ");
        String tipPercent = s.nextLine();
        tipPercent = tipPercent.substring(0, tipPercent.indexOf("%"));
        System.out.println(tipPercent);

        System.out.println("Enter the party size (# of people): ");
        int numOfPeople = Integer.parseInt(s.nextLine());
        double theTip = calculateTip(newBill, percentToDecimal(Double.parseDouble(tipPercent)));
        theTip = Double.parseDouble(String.valueOf(theTip).substring(0, String.valueOf(theTip).indexOf(".")+3));

        System.out.println("Total tip amount: "+theTip);
        System.out.println("Total bill (including tip): "+Double.parseDouble(String.valueOf(newBill+theTip).substring(0, String.valueOf(newBill+theTip).indexOf(".")+3)));
        System.out.println("Tip per person: "+Double.parseDouble(String.valueOf(theTip/numOfPeople).substring(0, String.valueOf(theTip/numOfPeople).indexOf(".")+3)));
        String s1 = String.valueOf((theTip / numOfPeople) + (newBill / numOfPeople));
        System.out.println("Total per person: "+Double.parseDouble(s1.substring(0, s1.indexOf(".")+3)));

       

    }
}