public class Contacto implements IEmailContact, ISMSContact {
    private String name, address, emailAddress, telephone;

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String getAddress() {
        return address;
    }

    public void setEmailAddress(String ea) {
        emailAddress = ea;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setTelephone(String t) {
        telephone = t;
    }

    @Override
    public String getTelephone() {
        return telephone;
    }
}
