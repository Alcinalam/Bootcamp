import java.util.List;

public class TypeInference {
    public static void main(String[] args) {
        // Java 10
        String x = "hello";

        var x2 = "hello"; // compile-time: compiler knows x2 is with type String
        // String x2 = "hello"
        //x2 = 100; // cannot as it is String type

        var age = 5; 
        var name = "ken";

        var names = List.of("Tom","Ben");

        for (var n : names){
            System.out.println(n);
        }

        var d = new Dog();
        // var c; (refer to item 3)

        // var arr = {1,2,3}; 
        var arr = new int[] {1,2,3};

        // Cannot Do in var - siutation don't know which type when compile time

        // 1. return type
        // eg: public static var print(int x){

        // }

        // 2.instance variable (refer to Dog page)

        // 3. without eg (var c;)

        // 4. lambda

        // 5. Array

        // 6. input parameter


    }
}
