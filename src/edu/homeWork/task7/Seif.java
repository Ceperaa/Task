package edu.homeWork.task7;

public class Seif {

    private final DragMetal dragMetal; // Опять же... + по условию мы набиваем сейф и закрываем его. Не уверен, но возможно, его уже нельзя открыть и что-то изменить там. Значит Final.


    public Seif(DragMetal dragMetal) {
        this.dragMetal = dragMetal;
    }

    public DragMetal getDragMetal() {
        return dragMetal;
    }
}
