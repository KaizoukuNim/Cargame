import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String string1, string2;
            System.out.println("Enter hint for hints");
            string1 = sc.nextLine();

            if (string1.equals("hint")) {
                System.out.println("Enter start to start car");

                System.out.println("Enter end to end car");

                System.out.println("Enter quit to quit game");


                while (true) {
                    string2 = sc.nextLine();

                    if (string2.equals("start")) {
                        System.out.println("Car started");
                    }
                    else if (string2.equals("end")) {
                        System.out.println("Car stopped");

                    } else if (string2.equals("quit")) {
                        break;

                    }

                }
            }


        }}

