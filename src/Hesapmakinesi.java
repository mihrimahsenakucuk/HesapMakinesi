import java.util.InputMismatchException;
import java.util.Scanner;
class CarpmaException extends Exception{
    @Override
    public void printStackTrace(){
    System.out.println("İki sayı da çok büyük lütfen daha küçük sayılar giriniz");
    }
}
public class Hesapmakinesi {
    
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        System.out.println("İşlemi seçiniz.");
        String islem= scan.nextLine();
        int a;
        int b;

      try {
          switch (islem) {
              case "1":
                  System.out.println("Birinci sayı:");
                  a = scan.nextInt();
                  System.out.println("İkinci sayı:");
                  b = scan.nextInt();
                  System.out.println("Girilen değerlerin toplamı: " + (a + b));
                  break;
              case "2":
                  System.out.println("Birinci sayı:");
                  a = scan.nextInt();
                  System.out.println("İkinci sayı:");
                  b = scan.nextInt();
                  System.out.println("Girilen değerlerin farkı: " + (a - b));
                  break;
              case "3":
                  System.out.println("Birinci sayı:");
                  a = scan.nextInt();
                  System.out.println("İkinci sayı:");
                  b = scan.nextInt();
                  if(a > 10000 && b > 10000){
                      throw new CarpmaException();
                  }
                  System.out.println("Girilen değerlerin çarpımı: " + (a * b));
                  break;
              case "4":
                  System.out.println("Birinci sayı:");
                  a = scan.nextInt();
                  System.out.println("İkinci sayı:");
                  b = scan.nextInt();
                  System.out.println("Girilen değerlerin bölümü: " + (a / b));
                  break;
              default:
                  System.out.println("Geçersiz işlem");

          }

      }
      catch(ArithmeticException e){
          System.out.println("Bir sayı 0'a bölünemez...");
      }
      catch(InputMismatchException e){
          System.out.println("Lütfen doğru fortmatta değer giriniz...");
      } catch (CarpmaException e) {
          e.printStackTrace();
      }


    }
}
