package innerclass;

import innerclass.StaticOuterClass.StaticNestedClass;

public class Test {

    public static void main(String[] args) {
        StaticOuterClass.StaticNestedClass snested = new StaticNestedClass();
        snested.print(); // 1234 <--the ID

        LocalOuterClass outer = new LocalOuterClass("Lam");
        outer.getAlt(); // Cherry Lam ...Carmen Lam


        // before java 8 (before lambda)
        // using interface
        Precipitable weather = new Precipitable() {
            @Override
            public void rain() {
                System.out.println("Heavy rain");
            }

            @Override
            public void snow() {
                System.out.println("Snowfall");
            }
        };

        weather.rain(); // Heavy rain
        weather.snow(); // Snowfall

    }
}
