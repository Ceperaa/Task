package edu.homeWork.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<DragMetal> drag = new ArrayList<>();
        List<Seif> list = new ArrayList();
        DragMetal dragMetal = null;

        drag.add(new DragMetal(700, 2, "Кольцо"));
        drag.add(new DragMetal(1500, 1, "Браслет"));
        drag.add(new DragMetal(3000, 3, "Часы"));
        drag.add(new DragMetal(500, 4, "Медаль"));
        drag.add(new DragMetal(300, 1, "Серьги"));

        Comparator<DragMetal> comparator = new Comparator<DragMetal>() {
            @Override
            public int compare(DragMetal left, DragMetal right) {
                return left.price / left.amount - right.price / left.amount;
            }
        };
        Collections.sort(drag, comparator.reversed());
        Seif cell = null;
        int limit = 0;
        for (int i = 0; i < drag.size(); i++) {
            limit = limit + drag.get(i).amount;
            if (limit <= 8) {
                cell = new Seif(drag.get(i));
                list.add(i, cell);
                dragMetal = list.get(i).getDragMetal();
                System.out.println(" name " + dragMetal.name +
                        " price " + dragMetal.price +
                        " amount " + dragMetal.amount);
            } else {
                System.out.println("Сейф забит ");
                break;
            }
        }
    }
}
