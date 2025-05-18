/* Nama File : DAOManager.java
 * Deskripsi : Kelas untuk mengelola objek DAO
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 15/05/2025
 */
public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
