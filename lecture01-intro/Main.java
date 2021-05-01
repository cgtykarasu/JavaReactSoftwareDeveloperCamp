/**
 * @author Çağatay KARASU
 * @since 04.2021
 **/

public class Main {

    public static void main(String[] args) {

        // camelCase
        // don't repeat yourself

        String enteringButton = "İnternet şubeye gir.";
        double yesterdayDollar = 8.22;
        double todayDollar = 8.22;
        int expiry = 36;
        boolean status = false;

        System.out.println(enteringButton);

        if (todayDollar < yesterdayDollar) {
            System.out.println("Dolar düştü.");
        }
        else if (todayDollar > yesterdayDollar) {
            System.out.println("Dolar yükseldi.");
        }
        else {
            System.out.println("Dolar aaynı..");
        }

        String[] credits = {
                "Hızlı kredi",
                "Mutlu emekli kredisi",
                "Konut kredisi",
                "Çiftçi kredisi",
                "Msb kredisi",
                "Meb kredisi",
                "Kültür bakanlığı kredisi"
        };

        // foreach
        for (String credit : credits) {
            System.out.println(credit);
        }

        for (int i = 0; i < credits.length; i++) {
            System.out.println(credits[i]);
        }

        // value type
        int number1 = 10;
        int number2 = 20;
        number1 = number2;
        number2 = 100;
        System.out.println(number1);

        // reference type
        int[] numbers1 = {1,2,3,4,5};
        int[] numbers2 = {10,20,30,40,50};
        numbers1 = numbers2;
        numbers2[0] = 100;
        System.out.println(numbers1[0]);

        // String's exceptional condition -> works like value type
        String city1 = "Ankara";
        String city2 = "İstanbul";
        city1 = city2;
        city2 = "İzmir";
        System.out.println(city1);


        String msg01 = "Bugün hava çok güzel.";
        String msg02 = " Yaşasın!";

        System.out.println(msg01.concat(msg02));
        System.out.println(msg01.replace(" ","-"));
        System.out.println(msg01.substring(0,5));
    }
}
