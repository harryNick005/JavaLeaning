import java.util.function.Consumer;

public class test {
    public static void main(String[] args) {
        Consumer<String> consumer=new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello: "+s);
            }
        };
        consumer.accept("boy");
    }
}
