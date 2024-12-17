import ru.itis.inf403.lab12.model.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        Random r = new Random();

        Apple[] basketOfApple = {new Apple("Red", 120),
                                 new Apple("Gold", 135),
                                 new Apple("Green", 100)};
        for (int i = 0; i < 3; i++){
            list.addLast(basketOfApple[i]);
        }

        list.print();
        System.out.println("-----------");
        list.forwardSort();
        list.print();

    }
}
