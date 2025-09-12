// enum Status{
//     Running, Failed, Pending, Success;
// }

enum Status{
    Running, Failed, Pending, Success;
}

// summary
/*
 * enum
 * enum.ordinal()
 * enum class values()
 * comparison in enum ==
 * enum with switch
 */

public class Day10 {
    public static void main(String [] args){
        // Status s = Status.Success;
        // System.out.println(s  == Status.Failed);
        // System.out.println(Status.Running.ordinal());
        // Status [] ss = Status.values();

        // for(Status values:ss){
        //     System.out.println(values + " : " + values.ordinal());
        // }

        Status s = Status.Pending;
        Status f = Status.Failed;

        if(s == Status.Running){
            System.out.println("All Good");
        } else if(s == Status.Failed){
            System.out.println("Try again");
        } else if(s == Status.Pending){
            System.out.println("Please wait");
        } else {
            System.out.println("Done");
        }

        switch(f){
            case Status.Success:
                System.out.println("All Good");
                break;
            case Status.Failed:
                System.out.println("Try Again");
                break;
            case Status.Pending:
                System.out.println("Please wait");
                break;
            case Status.Running:
                System.out.println("Running currently");
                break;
            default:
                System.out.println("Invalid status");
                break;
        }
    }
}
