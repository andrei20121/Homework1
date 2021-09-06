package Homework6;

public class Home6 {
    public static void main(String[] args) {

        String tempWinEvent = " молодец";
        String tempLossEvent = " не может";
        String eventName;
        String eventResult;

        Cat cat = new Cat("Один", 200, -1);
        Dog dog = new Dog("Два",  500, 12);

        Animals[] animals = {cat, dog};

        float runLength = 200;
        float swimLength = 12;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName() + " может ";

            eventName = "пробежать " + animals[i].getMaxRun() + "м. Надо было пробежать дистанцию ";
            eventResult = animals[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = animals[i].swim(swimLength);
            eventName = "проплывает " + animals[i].getMaxSwim() + "м. Надо было проплыть ";
            eventResult = (swimResult == Animals.SWIM_OK) ? tempWinEvent : tempLossEvent;

            if (swimResult == Animals.SWIM_NONE)
                eventResult = " кошки не умеют плавать";
            result(nameString, eventName, swimLength, eventResult);
        }

        System.out.println("Всего животных: " + Animals.countAnimals + ". Кошек: " + Cat.countCat + ", собак: " + Dog.countDog);
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + "м. Это значит" + resultEvent);

    }
}
