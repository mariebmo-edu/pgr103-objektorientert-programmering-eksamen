import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile {

    //Reading equipment from file and adds them to the equipmentArrayList. As ReadFromFile doesn't have any variables or supposed to be made to create objects, we can make the method static.
    public static void addEquipmentFromFile(String filePath, ArrayList<Equipment> arrayList){

        try {
            File equipmentList  = new File(filePath);
            Scanner fileReader = new Scanner(equipmentList);

            while(fileReader.hasNextLine()){
                String currentLine = fileReader.nextLine();

                //Checks if the type of equipment is Ball, based on the setup of the equipment list
                if(currentLine.equals("Ball")){
                    int id = Integer.parseInt(fileReader.nextLine());
                    String locker = fileReader.nextLine();
                    boolean needsReplacement = Boolean.parseBoolean(fileReader.nextLine());
                    BallType ballType = BallType.valueOf(fileReader.nextLine());
                    boolean needsAir = Boolean.parseBoolean(fileReader.nextLine());

                    //Reads values from the file and parses them to the correct datatype, then creates a new object that's added to the ArrayList
                    Ball newBall = new Ball(id, locker, needsReplacement, ballType, needsAir);

                    arrayList.add(newBall);
                }
                //Checks if the type of equipment is TableTennisRacket, based on the setup of the equipment list
                else if(currentLine.equals("TableTennisRacket")){
                    int id = Integer.parseInt(fileReader.nextLine());
                    String locker = fileReader.nextLine();
                    boolean needsReplacement = Boolean.parseBoolean(fileReader.nextLine());
                    boolean needsRubberChange = Boolean.parseBoolean(fileReader.nextLine());

                    //Reads values from the file and parses them to the correct datatype, then creates a new object that's added to the ArrayList
                    TableTennisRacket tableTennisRacket = new TableTennisRacket(id, locker, needsReplacement, needsRubberChange);

                    arrayList.add(tableTennisRacket);
                }
                else{
                    //If there's a line not matching the document setup, this is called.
                    System.out.println("Not formatted correctly");
                }
            }
            //closing the filereader when there's no more lines.
            fileReader.close();
        }
        //catches "file not found"-error. Returns "FILE NOT FOUND" in console.
        catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
        }


    }
}
