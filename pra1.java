
class Bank {
    double r;

    Bank(double rate) {
        r = rate;
    }
}

class Branch extends Bank {
    int n;
    int t;

    Branch(double rate, int times, int years) {
        super(rate);
        n = times;
        t = years;
    }
}

class Client extends Branch {
    double P;

    Client(double principal, double rate, int times, int years) {
        super(rate, times, years);
        P = principal;
    }

    void calculateCompoundInterest() {
        double A = P * Math.pow(1 + r / n, n * t);
        System.out.println("Final Amount (A) = " + A);
    }
}

public class pra1 {
    public static void main(String[] args) {
        Client c = new Client(100, 0.5, 4, 3);
        c.calculateCompoundInterest();
}
}