
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        double kenar1,kenar2,kenar3;
        
        Scanner kenarAl = new Scanner(System.in);
        
        System.out.println("Lutfen Ucgenin Kenarlarini Giriniz...");
        System.out.println("*********************************************");
        System.out.print("1. Kenari Giriniz : ");
        kenar1 = kenarAl.nextDouble();
        
        System.out.print("2. Kenari Giriniz : ");
        kenar2 = kenarAl.nextDouble();
        
        System.out.print("3. Kenari Giriniz : ");
        kenar3 = kenarAl.nextDouble();
        
        double u = (kenar1 + kenar2 + kenar3) / 2 ; // Yarı Çevre
        
        double ucgenCevre = u * 2; // Çevre
        
        double ucgenAlan = u * (u - kenar1) * (u - kenar2)* (u - kenar3); // Alan
        
        double hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        
        System.out.println("Ucgeninizin Yari Cevresi : " + u);
        
        System.out.println("Ucgeninizin Cevresi : " + ucgenCevre);
        
        System.out.println("Ucgeninizin Alani : " + ucgenAlan);
        
        System.out.println("Ucgeninizin Hipotenusu : " + hipotenus);
        
        
        
        
        
        
        
        
        
    }
    
}
