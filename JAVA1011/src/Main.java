import java.util.Scanner; //Kullanıcıdan veri almak için bunu yaptık.

public class Main { // mainin yerin içine yazıyoruz.

    public static void main(String[] args) {
        //değişkenleri oluşturacağız

        int mat, fizik, kimya;

        Scanner input = new Scanner(System.in); // Scanner sınıfımızı ekledik.

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        double toplam = (mat + fizik + kimya) ;
        double sonuc = toplam / 3.0;

        System.out.println("Ortalamanız : " + sonuc);

        //if(sonuc >= 60)
            //System.out.println(" GEÇTİNİZ ");

        //else if (sonuc < 60)

            //System.out.println(" KALDINIZ ");

        System.out.println(sonuc > 60.0 ? "Sınıfı Geçti": "Sınıfta Kaldı");
        }
    }





