import java.util.Scanner;
/**
 * hargabayar03
 */
public class hargabayar03 {
public static void main(String[] args) {
Scanner input =new Scanner(System.in);

int harga, jumlah, halamanbuku;
double dis, total, bayar, jmlDis;
String merkbuku;

System.out.println("Masukan harga barang yang dibeli");
harga=input.nextInt();
System.out.println("Masukan merk buku yang dibeli");
merkbuku=input.next();
System.out.println("Masukan jumlah halaman buku");
halamanbuku=input.nextInt();
System.out.println("Masukan Jumlah jumlah barang yang dibeli");
jumlah=input.nextInt();
System.out.println("Masukan besaran diskon");
dis=input.nextDouble();

total=harga*jumlah;
jmlDis=total*dis;
bayar=total*jmlDis;

    System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
    System.out.println("Jumlah yang harus dibayar adalah " +bayar);
}
}