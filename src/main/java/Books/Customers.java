package Books;

public class Customers {
    private String name;
    private String sexo;
    private String email;
    private String password;
    private String cpf;
    private Integer age;
    private Boolean login;
    private Integer points;

    public Customers(String name, String sexo, String email, String password, String cpf, Integer age) {
        this.name = name;
        this.sexo = sexo;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.age = age;
        this.login = false;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getLogin() {
        return login;
    }

    public void setLogin(Boolean login) {
        this.login = login;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "name='" + name + '\'' +
                ", sexo='" + sexo + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + password + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + age +
                '}';
    }
}
