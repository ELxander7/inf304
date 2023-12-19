package ru.itis.inf304.razrabotka;

public class Office extends  Personage{

    public int hours;
    public String role;
    private int slr = 0;

    public Office (String name,int age, String city, String role, int hours) {
        super(name, age, city);
        this.role = role;
        this.hours = hours;
    }

    public void salaryo (String city, String role, int hours) {
        if (city == "Москва") {
            if (role == "специалиста") {
                slr = hours * 600;
            } else if (role == "заместителя начальника отдела") {
                slr = hours * 650;
            } else if (role == "начальника отдела") {
                slr = hours * 700;
            }
        }
        else if (city == "Санкт-Петербург") {
            if (role == "специалиста") {
                slr = hours * 500;
            } else if (role == "заместителя начальника отдела") {
                slr = hours * 550;
            } else if (role == "начальника отдела") {
                slr = hours * 600;
            }
        }
        else if (city == "Казань") {
            if (role == "специалиста") {
                slr = hours * 400;
            } else if (role == "заместителя начальника отдела") {
                slr = hours * 450;
            } else if (role == "начальника отдела") {
                slr = hours * 500;
            }
        }
        System.out.println("Я занимаю должность " + role + " и зарабатываю " + slr + " рублей в месяц");
    }


}
