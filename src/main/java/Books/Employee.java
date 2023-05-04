package Books;

public class Employee {
    Integer registration;
    String name;
    String email;
    String password;

    public Employee(Integer registration, String name, String email, String password) {
        this.registration = registration;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Integer getRegistration() {
        return registration;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String senha) {
        password = senha;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "registration=" + registration +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
