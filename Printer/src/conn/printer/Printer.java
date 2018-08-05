package conn.printer;

public class Printer {
    private int tonerLevel=100;
    private int totalPages;

    public int getTotalPages() {
        return totalPages;
    }

    private int noOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int totalPages, boolean isDuplex) {
        if (tonerLevel>=0&&tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }
        this.totalPages = totalPages;
        this.isDuplex = isDuplex;
    }

    public int fillTonerLevel(int toLevel){
        if (toLevel>=0&&toLevel<=100){
            tonerLevel+=tonerLevel+toLevel;
        }
        else if (toLevel>=0){
            tonerLevel=100;
        }
    return tonerLevel;
    }
    public int printPages(int num){

            for(int i=1;i<=num;i++){
               if(tonerLevel>0&&totalPages>0) {
                   System.out.println("Printing Page " + i);
                   noOfPagesPrinted++;
                   tonerLevel--;
                   totalPages--;
               }
               else if (tonerLevel<=0){
                   System.out.println("Toner Empty Exiting....");
                   break;
               }
               else {
                   System.out.println("No empty Pages to print on Exiting....");
                    break;
               }
            }
            return noOfPagesPrinted;
        }



    public int addPages(int num){
        totalPages+=num;
        if (totalPages>500){
            totalPages=500;
        }
        return totalPages;
    }
    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNoOfPagesPrinted() {
        return noOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
