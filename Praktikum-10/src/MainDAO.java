/* Nama File : MainDAO.java
 * Deskripsi : Kelas utama untuk mengimplementasikan DAO
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 15/05/2025
 */
public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Zoe");

        DAOManager m = new DAOManager();

        m.setPersonDAO(new MySQLPersonDAO());

        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
