class Car {
    public static void toStart() {
        System.out.println("Hi..... Car Started");
    }
}
class Audi extends Car {

}
class Q7 extends Audi {
    public static void information() {
        System.out.println("One of the best SUV car.....");
    }
}

class Multilevel {
    public static void main (String[] args) {
        Q7 audiQ7 = new Q7();
        audiQ7.toStart();
        audiQ7.information();
    }
}