package proyecto;

public class AdminUser extends User {
    public AdminUser(String name, String email) {
        super(name, email);
    }

    @Override
    public String toString() {
        return "Admin: " + super.toString();
    }

    public void performAdminTask() {
        System.out.println("Administrador realizando una tarea administrativa.");
    }
}
