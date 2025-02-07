package proyecto;

public class UserFactory {

    // Método de fábrica que decide qué tipo de usuario crear
    public static User createUser(String type, String name, String email) {
        if ("admin".equalsIgnoreCase(type)) {
            return new AdminUser(name, email);
        } else if ("customer".equalsIgnoreCase(type)) {
            return new CustomerUser(name, email);
        } else {
            throw new IllegalArgumentException("Tipo de usuario no válido");
        }
    }
}
