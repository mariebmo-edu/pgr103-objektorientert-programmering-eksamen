public abstract class Equipment {

    int id;
    String lockerNum;
    boolean needsReplacement;

    public Equipment(int id, String lockerNum, boolean needsReplacement){
        this.id = id;
        this.lockerNum = lockerNum;
        this.needsReplacement = needsReplacement;
    }
}
