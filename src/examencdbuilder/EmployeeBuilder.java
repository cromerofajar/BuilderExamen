
package examencdbuilder;

/**
 *
 * @author cromerofajar
 */
public class EmployeeBuilder {
   private String lastName=null;
   private String middleName=null;
   private String firstName;
   private long id;
   private int birthYear=0;
   private int birthMonth=0;
   private int birthDate=0;
   private int hireYear=0;
   private int hireMonth=0;
   private int hireDate=0;
   
   public EmployeeBuilder(String firstName,int id){
       this.firstName=firstName;
       this.id=id;
   }

    public EmployeeBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public EmployeeBuilder setBirthYear(int birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public EmployeeBuilder setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
        return this;
    }

    public EmployeeBuilder setBirthDate(int birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public EmployeeBuilder setHireYear(int hireYear) {
        this.hireYear = hireYear;
        return this;
    }

    public EmployeeBuilder setHireMonth(int hireMonth) {
        this.hireMonth = hireMonth;
        return this;
    }

    public EmployeeBuilder setHireDate(int hireDate) {
        this.hireDate = hireDate;
        return this;
    }
    
    public Employee crearEmployee(){
        return new Employee(this.lastName,this.middleName,this.firstName,this.id,this.birthYear,this.birthMonth,this.birthDate,this.hireYear,this.hireMonth,this.hireDate);
    }
   
}
