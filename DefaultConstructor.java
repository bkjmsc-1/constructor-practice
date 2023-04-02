public class DefaultConstructor{

    String name;
    byte age;

    public static void main(String[] args){

        DefaultConstructor employee1 = new DefaultConstructor();
        DefaultConstructor employee2 = new DefaultConstructor();
        employee1.name = "Ted";
        employee1.age = 23;
        
        employee2.name = "Fred";
        employee2. age = 40;

        System.out.println(employee1.name);
        System.out.println(employee1.age);

        System.out.println(employee2.name);
        System.out.println(employee2.age);
    }

}

