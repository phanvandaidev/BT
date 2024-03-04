package StudentTeacher;

import java.util.Scanner;

public class Person {
    String Name;
    String Gender;
    String dob;
    String add;

    public Person() {
    }

    public Person(String Name, String Gender, String dob, String add) {
        this.Name = Name;
        this.Gender = Gender;
        this.dob = dob;
        this.add = add;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
    
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao Ten: ");
        Name = input.nextLine();
        System.out.print("Nhap vao Gioi tinh: ");
        Gender = input.nextLine();
        System.out.print("Nhap vao Ngay sinh: ");
        dob = input.nextLine();
        System.out.print("Nhap vao dia chi: ");
        add = input.nextLine();
    }
    
    public void showInfo(){
        System.out.println("\nTên la: "+Name);
        System.out.println("Giới tính la: "+Gender);
        System.out.println("Ngày sinh la: "+dob);
        System.out.println("Địa chỉ la: "+add);
    }
}