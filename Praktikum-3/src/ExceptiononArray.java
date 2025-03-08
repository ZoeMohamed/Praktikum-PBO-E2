/* Nama File : ExceptiononArray.java
 * Deskripsi : Progam penggunaan eksepsi menggunakan class library java
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 06/03/2025
 */

public class ExceptiononArray {
    public static void main(String[] args) {
        // instansiasi object array integer

        Integer[] arrayInteger = new Integer[4];

        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            ;
        } finally {
            System.out.println("clean upp code....");
        }

    }
}
