import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EquipmentList {

    ArrayList<Equipment> equipmentArrayList = new ArrayList<>();


    public EquipmentList() {

        //When EquipmentList is created, it runs ReadFromFile and adds it to the ArrayList.
        ReadFromFile.addEquipmentFromFile("equipment.txt", equipmentArrayList);
    }

    //Goes through the equipmentArrayList and shows all of the equipment
    public void showAllEquipment(){
        System.out.println("---------------------");
        System.out.println("    ALL EQUIPMENT    ");
        System.out.println("---------------------");
        for(Equipment e : equipmentArrayList){
            System.out.println(e.toString());
        }
    }

    //Goes through the equipmentArrayList and shows balls that needs more air
    public void printBallsNeedingMoreAir(){
        System.out.println("---------------------");
        System.out.println("   NEEDS MORE AIR    ");
        System.out.println("---------------------");

        for(Equipment e : equipmentArrayList){
            //prints if e is a ball and needsAir returns true
            if(e instanceof Ball && ((Ball) e).needsAir){
                System.out.println(e.toString());

            }
        }
    }

    //Goes through the equipmentArrayList and shows all equipemtn that needs replacement
    public void printEquipmentNeedingToBeReplaced(){
        System.out.println("---------------------");
        System.out.println("  NEEDS REPLACEMENT  ");
        System.out.println("---------------------");

        for(Equipment e : equipmentArrayList){
            //prints if e.needsReplacement returns "true"
            if(e.needsReplacement){
                System.out.println(e.toString());
            }
        }
    }

    //Goes through the equipmentArrayList and shows all equipemtn that needs replacement
    public void printTableTennisRacketsNeedingNewPad(){
        System.out.println("---------------------");
        System.out.println("    NEEDS NEW PAD    ");
        System.out.println("---------------------");

        for(Equipment e : equipmentArrayList){
            //prints if e is a tableTennisRacket and needsRubberChange returns true
            if(e instanceof TableTennisRacket && ((TableTennisRacket) e).needsRubberChange){
                System.out.println(e.toString());
            }
        }
    }

    //Runs interface where the user can select which preview they'd like of the equipment
    public void runInterface(){
        Scanner userInput = new Scanner(System.in);
        int chosenMenu = 0;

        //will run until the user types "5"
        while(chosenMenu != 5){

            //printing menu
            printMenuList();

            try{
                //takes userinput and parses it to int, in case you want to use strings as well as ints in a later stage (ex. adding to the list)
                chosenMenu = Integer.parseInt(userInput.nextLine());

                //runs the different options based on the userinput
                switch (chosenMenu){
                    case 1 -> showAllEquipment();
                    case 2 -> printBallsNeedingMoreAir();
                    case 3 -> printEquipmentNeedingToBeReplaced();
                    case 4 -> printTableTennisRacketsNeedingNewPad();
                    case 5 -> {System.out.println("ENDING SESSION");}
                    default -> System.out.println("Please enter valid number");
                }
            }
            //catches if the user isn't typing a number
            catch (NumberFormatException n){
                System.out.println("Please enter a valid NUMBER");
            }
        }
    }

    //Method to show the different options
    private void printMenuList(){
        System.out.println("---------------------");
        System.out.println("         MENU        ");
        System.out.println("---------------------");
        System.out.println("1. Show all equipment");
        System.out.println("2. Show Balls that needs more air");
        System.out.println("3. Show Equipment that needs replacement");
        System.out.println("4. Show Table Tennis Rackets that needs new pads");
        System.out.println("5. Quit");
    }
}
