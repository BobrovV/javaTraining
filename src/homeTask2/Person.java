package homeTask2;

public class Person {
        boolean gender;
        String name;
        String surname;
        float heigh;

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getHeigh() {
        return heigh;
    }

    public void setHeigh(float heigh) {
        this.heigh = heigh;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    float weight;

        //Constructor
        Person (boolean g, String n, String s, float h, float w){
            gender = g;
            name = n;
            surname = s;
            heigh = h;
            weight = w;
        }

    public static boolean testCompatibility(boolean gender1, boolean gender2) {
        if (gender1 == true | gender1 == false | gender2 == true | gender2 == false) {
            System.out.println("We are people. Compatibility test is in progress. Please wait... \n");
            return true;
        } else {
            System.out.println("Compatibility test cannot be started \n");
            return false;
        }
    }

    public static boolean speak(boolean gender1, boolean gender2){
        if (gender1 == false & gender2 == false){ //gender.false = woman, gender.true = man
            System.out.println("Speaking test: We are women. We can speak forever");
            return true;
        }
        else if (gender1 == false | gender2 == false) {
            System.out.println("Speaking test: One man and one woman. Ok, let's speak a little bit.");
            return true;
        } else {
            System.out.println("Speaking test: We are men. We can speak but we had better go to a pub");
            return false;
        }
    }

    /*public boolean tolerate(){
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
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", heigh=" + heigh +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person(true, "Rocky", "Balboa", 180, 80); //gender true = man
        Person person2 = new Person(true, "Anna", "Doe", 162, 53); // gender false = woman
        testCompatibility(person1.gender, person2.gender);
        speak(person1.gender, person2.gender);
    }




}
