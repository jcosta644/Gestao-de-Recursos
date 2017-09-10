package user;

/**
 * Created by HP on 09/09/2017.
 */
public class Person {
    private String name;
    private String email;
    private String cpf;

    public Person(String name, String email, String cpf) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString(String type) {
        return "Nome: " + this.name + "\nCpf: " + this.cpf + "\nTipo: " + type + "\nE-mail: " + this.email;
    }
}
