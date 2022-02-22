package LamdaEx;

public class LamdaEx1 {
    public static void main(String[] args) {
        MyFunction add = (x, y) -> {return x + y;};
        MyFunction minus = (x, y) -> {return x - y;};

        System.out.println(add.calc(1, 3));
        System.out.println(minus.calc(4, 2));

        MyFunction2 f = () -> {
            System.out.println("Hello");
        };

        f.print();

        f = () -> System.out.println("hihihih");

        f.print();

        MyFunction3<String> f1 = x -> System.out.println(x.toString());
        f1.print("abcccc");

        MyFunction3<Integer> f2 = x -> System.out.println(x.toString());
        f2.print(100);
    }
}
