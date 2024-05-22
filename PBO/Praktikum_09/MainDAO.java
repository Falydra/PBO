
public class MainDAO {

    public static void main(String[] args) {
        // Membuat objek Person
        Person person = new Person("Indra");

        // Membuat objek DAOManager
        DAOManager daoManager = new DAOManager();

        // Mengatur DAO person
        daoManager.setPersonDAO(new MySQLPersonDAO());

        try {
            // Menyimpan data person ke dalam database
            daoManager.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            // Menangani kesalahan saat menyimpan data
            e.printStackTrace();
        }
    }
}

