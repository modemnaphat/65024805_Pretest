
public class program {
    public static void main(String[] args) {
        BillPayment bill1 = new BillPayment("Electric", 250);
        bill1.setBill_CurrentUnit(450);
        bill1.calculateUnit();
        bill1.calculateBill();
        bill1.DisplayBill();
    }
    
}

class BillPayment {
    private String bill_type;
    private int bill_lastUnit;
    private int bill_currentUnit;
    private double bill_result;

    public BillPayment(String bill_type,int bill_lastUnit){
        this.bill_type = bill_type;
        this.bill_lastUnit = bill_lastUnit;
    }

    public int getBill_CurrentUnit(){
        return bill_currentUnit;
    }

    public void setBill_CurrentUnit(int bill_currentUnit){
        this.bill_currentUnit = bill_currentUnit;
    }

    public int calculateUnit(){
        if (bill_currentUnit > bill_lastUnit) {
            bill_currentUnit = bill_currentUnit-bill_lastUnit;
            return bill_currentUnit;
        }else{
            System.out.println("Please Insert a correct unit");
        }
        return bill_currentUnit;
    }

    public double calculateBill(){
        if(bill_type == "Water"){
            bill_result = bill_currentUnit * 5;
            return bill_result;
        }else if(bill_type == "Electric"){
            bill_result = bill_currentUnit * 6;
            return bill_result;
        }
        return bill_result;
    }

    public void DisplayBill(){
        System.out.print("My payment bill is : = " + bill_type + "\n" + "The result is : " + bill_result);
    }
}