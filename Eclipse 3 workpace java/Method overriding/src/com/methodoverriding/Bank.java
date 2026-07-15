package com.methodoverriding;

class Banks {
    public void calculateInterest() {
        System.out.println("General Interest Calculation");
    }
}

class SBI extends Banks {
    @Override
    public void calculateInterest() {
        System.out.println("SBI Interest = 6.5%");
    }
}

class HDFC extends Banks {
    @Override
    public void calculateInterest() {
        System.out.println("HDFC Interest = 7%");
    }
}

class ICICI extends Banks {
    @Override
    public void calculateInterest() {
        System.out.println("ICICI Interest = 8%");
    }
}

public class Bank {   // <-- this is your runner class
    public static void main(String[] args) {
        Banks sbi = new SBI();
        sbi.calculateInterest();

        Banks hdfc = new HDFC();
        hdfc.calculateInterest();

        Banks icici = new ICICI();
        icici.calculateInterest();
    }
}

