package user;

/**
 * Created by HP on 09/09/2017.
 */
public class Professor extends Person {
    public Professor(String name, String email, String cpf) {
        super(name, email, cpf);
    }

    @Override
    public String toString() {
        return super.toString("Professor");
    }
}
