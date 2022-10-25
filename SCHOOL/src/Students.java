public class Students extends Persions{
    public Double Score;
    public String grade;
    
    public Students(String id, String name, String address, String phone, 
            int age, String gender, Double Score, String grade) {
        super(id, name, address, phone, age, gender);
        this.Score = Score;
        this.grade = grade;
    }

    public Double getScore() {
        return Score;
    }

    public void setScore(Double Score) {
        this.Score = Score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // @Override
    // public String showInfor() {
    //     return getName() + " " + getAge() + " " + getGender() + " " + getAddress() +" " + getPhone() + " " + getScore() + "\n" +
    //         "----------------------------------------------------";
    // } 

    @Override
    public String showInfor() {
        return "Student {" +
                "Name = '" + getName() + '\'' +
                ", Age = '" + getAge() + '\'' +
                ", Gender = '" + getGender() + '\'' +
                ", Address = '" + getAddress() + '\'' +
                ", Phone = '" + getPhone() + '\'' +
                ", Score = '" + getScore() + '\'' +
                '}';
    }
}
