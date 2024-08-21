public class EmailSender {
    public static void sendEmail(IEmailContact contact, String message) {
        // Envía un mensaje a la dirección de correo del contacto
        System.out.println("Enviando correo a: " + contact.getEmailAddress() + " con mensaje: " + message);
    }
}