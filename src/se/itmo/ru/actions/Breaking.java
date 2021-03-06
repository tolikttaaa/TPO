package se.itmo.ru.actions;

public interface Breaking {
    default <T extends Breakable> void broke(T object) {
        if (!object.isBroken()) {
            object.beBroken();
        } else {
            //FIXME: мб запилить ошибку здесь
            System.out.println("Already broken!");
        }
    }
}
