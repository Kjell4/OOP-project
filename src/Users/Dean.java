package Users;
import SystemParts.*;
public class Dean {
    private String name;
    private String surname;
    private String login;
    private String password;
    public Dean() {

    }
    public Dean(String name, String surname, String login, String password) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
    }

    public void signOrder(EmployeeOrder employeeOrder) {
        employeeOrder.setSigned(true);
        System.out.println("Request(Order) from " + employeeOrder.getIdFrom() + " was signed");
    }



    @Override
    public String toString() {
        return "Dean{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
