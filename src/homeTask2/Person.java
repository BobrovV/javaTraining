package homeTask2;

public class Person {
        boolean gender;
        String name;
        String surname;
        float heigh;
        float weight;

        //Constructor
        Person (boolean g, String n, String s, float h, float w){
            gender = g;
            name = n;
            surname = s;
            heigh = h;
            weight = w;
        }

    public boolean speak(Object obj){
        if (this.gender == false | obj.gender == false){
            return true;
        }
        else {
            return true; // if men need to add probability 0.5;
        }
    }

    public boolean tolerate(){
        if (){
            return true;
        }
        else {
            return false;
        }

    }
    public boolean spendTimeTogether(){
        if (){
            return true;
        }
        else {
            return false;
        }
    }
    public Object haveRelationships(){
        return Object;
    }

    public static void main(String[] args) {
        Person person1 = new Person(true, "Rocky", "Balboa", 180, 80); //gender true = man
        Person person2 = new Person(false, "Anna", "Doe", 162, 53); // gender false = woman
        person1.speak(person2);
        }




}
