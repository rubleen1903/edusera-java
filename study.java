class student{
 int a;
 static int id = 1603;
 
 void display()
 {  
     System.out.println(id);
 }

}
public class study {
    public static void main(String[] args) {
        student obj1 = new student();
        student obj2 = new student();
        obj1.display();

        obj2.id = 1;
        obj2.display();

        obj1.display();

    }
}
