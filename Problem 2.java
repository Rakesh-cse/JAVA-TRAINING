class Common {
    static String PM = "Modi";
}

class TN {
    static String CM = "Vijay"; 
    String state;
    String district;
    int peopleRange;

    
    public void set_dim(String state, String district, int peopleRange) {
        this.state = state;
        this.district = district;
        this.peopleRange = peopleRange;
    }

    
    public void display() {
        System.out.println("Prime Minister: " + Common.PM);
        System.out.println("CM: " + CM);
        System.out.println("State: " + state);
        System.out.println("District: " + district);
        System.out.println("People range: " + peopleRange);
    }
}

class An {
    static String CM = "Pawan";
    String state;
    String district;
    int peopleRange;

    public void set_dim(String state, String district, int peopleRange) {
        this.state = state;
        this.district = district;
        this.peopleRange = peopleRange;
    }

    public void display() {
        System.out.println("Prime Minister: " + Common.PM);
        System.out.println("CM: " + CM);
        System.out.println("State: " + state);
        System.out.println("District: " + district);
        System.out.println("People range: " + peopleRange);
    }
}

public class Main {
    public static void main(String[] args) {
        TN a = new TN();
        TN b = new TN();

        An a1 = new An();
        An b1 = new An();

        a.set_dim("Tamil nadu", "madurai", 4567);
        b.set_dim("Tamil nadu", "Kallakurchi", 5677);
        a.display();
        b.display();

        System.out.println("**************************");

        a1.set_dim("AP", "guntur", 2345);
        b1.set_dim("AP", "Thirumala", 7890);
        a1.display();
        b1.display();
    }
}