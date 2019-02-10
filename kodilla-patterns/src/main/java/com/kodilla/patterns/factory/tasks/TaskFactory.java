package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String PAINT_PICTURE = "PAINT_PICTURE";
    public static final String BUY_DRESS = "BUY_DRESS";
    public static final String BUY_BREAD = "BUY_BREAD";
    public static final String GO_WARSAW_BY_TRAIN = "GO_WARSAW_BY_TRAIN";

    public final Task makeTask(final String taskName) {
        switch (taskName) {
            case PAINT_PICTURE:
                return new PaintingTask("Paint Cat", "Black", "Cat");
            case BUY_DRESS:
                return new ShoppingTask(BUY_DRESS, "Dress", 1);
            case BUY_BREAD:
                return new ShoppingTask(BUY_BREAD, "Bread", 2);
            case GO_WARSAW_BY_TRAIN:
                return new DrivingTask(GO_WARSAW_BY_TRAIN, "Warsaw", "Train");
            default:
                return null;
        }
    }
}
