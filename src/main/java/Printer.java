public class Printer {

    private int sheetsLeft;

    public Printer(int sheetsLeft){
        this.sheetsLeft = sheetsLeft;
    }

    public int getSheetsLeft(){
        return this.sheetsLeft;
    }

    public void print(int numberOfPages, int numberOfCopies){
        int sheetsToPrint = numberOfPages * numberOfCopies;

        if(sheetsToPrint < sheetsLeft){
            sheetsLeft -= sheetsToPrint;
        }
    }
}
