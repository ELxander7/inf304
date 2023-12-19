package ru.itis.inf304.razrabotka;

public class Salary {


    public static void main(String[] args) {
        Office person1 = new Office("Олег", 30, "Москва", "специалиста",225);//создаётся экземпляр класса офис
        person1.sayHello();
        person1.salaryo("Москва", "специалиста", 225);

        System.out.println();

        Taxi person2 = new Taxi("Вова",25, "Казань", "таксистом эконома", "в час пик");
        person2.sayHello();
        person2.salaryt("Казань", "таксистом эконома", "в час пик");

    }
}
