public class Main {
    public static void main(String[] args) {
        GmailAccount gmailAccount = new GmailAccount("John Doe", "john.doe@gmail.com");

        // Envía un email utilizando EmailSender
        EmailSender.sendEmail(gmailAccount, "Hello, John!");

        // Crear un contacto completo y enviar tanto un email como un SMS
        Contacto contacto = new Contacto();
        contacto.setName("Jane Doe");
        contacto.setEmailAddress("jane.doe@gmail.com");
        contacto.setTelephone("1234567890");

        EmailSender.sendEmail(contacto, "Hello, Jane!");
        SMSSender.sendSMS(contacto, "Hello, Jane via SMS!");
    }
}
