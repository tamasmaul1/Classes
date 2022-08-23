public class JavaBasic_ControlStatements {
    public static void main(String[] args) throws Exception {
        
        boolean valueCheck = true;
        if(valueCheck)
            System.out.println("Condition Met");

        int numberToCheck = 0;
        if(isNumberEven(numberToCheck))
            System.out.println("Condition Met");
        else{
            System.out.println("Condition Not Met");
        }
        
        int number = 0;

        switch(number){
            case 0: {
                System.out.println("Number is zero");
                break;
            }
            default: {
                System.out.println("");
            }
        }
    }
    
    private static boolean isNumberEven(int numberToCheck){
        return false;
    }
}