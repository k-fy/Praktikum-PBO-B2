public class MainDAO{
    public static void main(String agrs[]){
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}