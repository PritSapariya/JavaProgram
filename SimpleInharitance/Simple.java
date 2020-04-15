class Car {
    public static void toStart() {
        System.out.println("Hi..... Car Started");
    }
}

class Audi extends Car {

}

class Simple {
    public static void main (String[] args) {
        Audi audi = new Audi();
        audi.toStart();
    }
}