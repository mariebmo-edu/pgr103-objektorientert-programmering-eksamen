public class TableTennisRacket extends Equipment{

    //Adding variables unique to class - inheriting from Equipment
    boolean needsRubberChange;

    //Constructor
    public TableTennisRacket(int id, String lockerNum, boolean needsReplacement, boolean needsRubberChange) {
        super(id, lockerNum, needsReplacement);
        this.needsRubberChange = needsRubberChange;
    }

    //Getters and Setters
    public boolean isNeedsRubberChange() {
        return needsRubberChange;
    }

    public void setNeedsRubberChange(boolean needsRubberChange) {
        this.needsRubberChange = needsRubberChange;
    }


    //Overrides
    @Override
    public String toString() {
        return "Table Tennis Racket, id: " + id + ", LockerNum: " + lockerNum + ", Needs Replacement: " + needsReplacement + ", Needs Rubber Change: " + needsRubberChange;
    }
}
