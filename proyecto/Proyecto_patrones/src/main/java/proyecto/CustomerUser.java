package proyecto;

public class CustomerUser extends User {
    public CustomerUser(String name, String email) {
        super(name, email);
    }

    @Override
    public String toString() {
        return "Customer: " + super.toString();
    }
}
