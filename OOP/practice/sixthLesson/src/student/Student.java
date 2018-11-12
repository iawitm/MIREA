package student;

public class Student {
    private String surname;
    private int age;
    private int iDNumber;

    public Student(String surname, int age, int iDNumber){
        this.surname = surname;
        this.age = age;
        this.iDNumber = iDNumber;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }
}
