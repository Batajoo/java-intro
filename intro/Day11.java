enum Status {
    Running, Success, Failed, Error
}

public class Day11 {
    public static void main(String [] args){
        Status s = Status.Running;

        switch (s) {
            case Running:
                System.out.println("Program is running");
                break;
            case Success:
                System.out.println("Program is done");
                break;
            case Failed:
                System.out.println("Progam failed");
                break;
            case Error:
                System.out.println("Error in program");
                break;
        
            default:
                break;
        }
    }
}
