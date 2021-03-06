package se.itmo.ru.actions;

public interface Repairing {
    default <T extends Breakable> void repair(T object) {
        if (object.isBroken()) {
            object.beRepaired();
        } else {
            //FIXME: мб запилить ошибку здесь
            System.out.println("Already repaired!");
        }
    }
}
