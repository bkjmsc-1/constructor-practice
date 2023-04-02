public class ParameterizedConstructor{

    String employee;
    String gender;
    int age;

    public ParameterizedConstructor(String employee, String gender, int age){
        this.employee = employee;
        this.gender = gender;
        this.age = age;
    }

    void decidePronouns(){
        gender = gender == "male" ? "His" : "Her";
    }

    void display(){
        System.out.println("The employee's name is " + employee);
        System.out.println(gender + " age is " + age);
    }

    public static void main(String[] args){
        ParameterizedConstructor employee1 = new ParameterizedConstructor("Betty", "female", 22);
        ParameterizedConstructor employee2 = new ParameterizedConstructor("George", "male", 33);
        employee1.decidePronouns();
        employee2.decidePronouns();
        employee1.display();
        employee2.display();
    }
}