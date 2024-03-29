package homeTask2;

import java.util.Scanner;

public class Person {

    boolean gender;
    String name;
    String surname;
    float height;
    float weight;

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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


        //Constructor
        Person (boolean g, String n, String s, float h, float w){
            setGender(g);
            setName(n);
            setSurname(s);
            setHeight(h);
            setWeight(w);
        }

    public static boolean testCompatibility(boolean gender1, boolean gender2) {
        if (gender1 == true | gender1 == false | gender2 == true | gender2 == false) {
            System.out.println("Compatibility test is in progress. Please wait... \n We are people.");
            return true;
        } else {
            System.out.println("Compatibility test cannot be started \n");
            return false;
        }
    }

    public static boolean speak(boolean gender1, boolean gender2){
        if (gender1 == false & gender2 == false){ //gender.false = woman, gender.true = man
            System.out.println("Speaking test: \n We are women. We can speak forever");
            return true;
        }
        else if (gender1 == false | gender2 == false) {
            System.out.println("Speaking test: \n One man and one woman. Ok, let's speak a little bit.");
            return true;
        } else {
            System.out.println("Speaking test: \n We are men. We can speak but we had better go to a pub");
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

    public static void main(String[] args) {

        Person[] persons = new Person[2];
        System.out.println("You have to enter two people. Let's begin");

        for (int i = 0; i < persons.length; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter gender for the user" + (i + 1) + ": woman or man");
            String gs;
            do {
                gs = in.nextLine();
                if (!"man".equals(gs) & !"woman".equals(gs)) {
                    System.out.println("Please enter correct gender: woman or man");
                }
            } while (!"man".equals(gs) & !"woman".equals(gs));

            if (gs.equals("man")) {
                gs = "true";
            }
            else {
                gs = "false";
            }

            boolean g = Boolean.parseBoolean(gs);

            System.out.println("Please enter name: ");
            String n = in.nextLine();

            System.out.println("Please enter surname: ");
            String s = in.nextLine();

            System.out.println("Please enter height: ");
            String hs = in.nextLine();
            float h = Float.parseFloat(hs);

            System.out.println("Please enter weight: ");
            String ws = in.nextLine();
            float w = Float.parseFloat(ws);

            persons[i] = new Person(g, n, s, h, w);
        }

        testCompatibility(persons[0].gender, persons[1].gender);
        speak(persons[0].gender, persons[1].gender);
    }
}
