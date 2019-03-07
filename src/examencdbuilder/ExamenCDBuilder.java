package examencdbuilder;

/**
 *
 * @author cromerofajar
 */
public class ExamenCDBuilder {

    public static void main(String[] args) {
        Employee miEmployee;
        miEmployee= new EmployeeBuilder("pepe",3).setBirthDate(4).setLastName("jose").crearEmployee();
        System.out.println(miEmployee);
    }
    
}
