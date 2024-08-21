public class SMSSender {
    public static void sendSMS(ISMSContact contact, String message) {
        // Envía un mensaje SMS al teléfono del contacto
        System.out.println("Enviando SMS a: " + contact.getTelephone() + " con mensaje: " + message);
    }
}