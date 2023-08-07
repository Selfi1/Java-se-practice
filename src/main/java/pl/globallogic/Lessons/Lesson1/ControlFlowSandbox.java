package pl.globallogic.Lessons.Lesson1;
import java.util.Objects;
import java.util.Scanner;

public class ControlFlowSandbox{
        public static void main(String[] args) {
        // Scanner class to make excercises more interactive
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("How many times you want me to greet you?");
        int numberOfGreetings = scanner.nextInt();
        String greeting = switch (name.trim()) {
                case "Chen", "Woo" -> "Nihao, " + name;
                case "Monika", "Maja" -> "Czesc" + name;
                default -> "Hello, " + name;
        };
        for (int i = 0; i < numberOfGreetings;i++){
                System.out.println(greeting);
                if (i == 1)
                        break;
                System.out.println("current iteration is " + i);
        }
                System.out.println("this code run after our main processing flow!");
        /*int i = 7;
        do {
                System.out.println(greeting);
                i++;
        } while (i < numberOfGreetings);*/

        /*while (i <numberOfGreetings){
                System.out.println(greeting);
                i++;
        } */

        /*if (Objects.equals(name, "Maja")) {
                greeting = "Czesc, " + name;
        } else if(Objects.equals(name, "Chen")){
                greeting = "Nihao, " + name;
        }else {
                greeting = "Czesc, " + name;
        }

        switch (name.trim()){
                case "Chen", "Woo" : greeting = "Nihao, " + name; break;
                case "Monika":
                case "Maja" : greeting = "Czesc" + name; break;
                default: greeting = "Hello" + name;
        }
        */

}}
