public class Teacher extends Persions{
    public String subject;
    
    public Teacher(String id, String name, String address, String phone, int age, String gender, String subject) {
        super(id, name, address, phone, age, gender);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String showInfor() {
        return getName() + " " + getGender() + " " + getPhone() + " " + getAddress() + " " + getSubject()+ "\n" +
        "----------------------------------------------------";
    }
    
}
