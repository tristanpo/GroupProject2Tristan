package com.syntax.Tasks;

public abstract class Marks {
    int subject1;
    int subject2;
    int subject3;
    int subject4;

    public Marks(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public Marks(int subject1, int subject2, int subject3, int subject4) {
        this(subject1, subject2, subject3);
        this.subject4 = subject4;
    }

    abstract double getPercentage();
}

class A extends Marks {

    public A(int subject1, int subject2, int subject3) {
        super(subject1, subject2, subject3);
    }

    @Override
    double getPercentage() {
        double total = subject1 + subject2 + subject3;
        return (total / 300) * 100;
    }
}

class B extends Marks {

    public B(int subject1, int subject2, int subject3, int subject4) {
        super(subject1, subject2, subject3, subject4);
    }

    @Override
    double getPercentage() {
        double total = subject1 + subject2 + subject3 + subject4;
        return (total / 400) * 100;
    }
}

class MarksTest {
    public static void main(String[] args) {
        Marks a = new A(89, 90, 70);
        System.out.println(a.getPercentage());

        Marks b = new B(80, 67, 99, 90);
        System.out.println(b.getPercentage());

    }

}
