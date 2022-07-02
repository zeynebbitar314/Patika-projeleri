import java.util.Scanner ;
public class sinif {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner sin=new Scanner(System.in);
        System.out.print("Matematik notunuz:");
        mat=sin.nextInt();
        System.out.print("Fizik Notunuz:");
              fizik=sin.nextInt();
           System.out.print("Kimya Notunuz:");
         kimya=sin.nextInt();
     System.out.print("Türkçe Notunuz:");
        turkce=sin.nextInt();
     System.out.print("Tarih Notunuz:");
        tarih=sin.nextInt();
     System.out.print("Müzik Notunuz:");
          muzik=sin.nextInt();
          int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
          double cikis= toplam/6 ;
          System.out.println("Ortalamanız:"+cikis);
        String sonuc= cikis >= 60 ? "Sınıfta Geçti" : "Sınıfta Kaldı" ;
        System.out.println(sonuc);
    }
}
