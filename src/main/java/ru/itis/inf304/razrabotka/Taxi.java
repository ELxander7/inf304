package ru.itis.inf304.razrabotka;

public class Taxi extends Personage{


    private String job;
    private String time;
    private  int slr = 0;

    public Taxi (String name, int age, String city, String job, String time) {
        super(name,age,city);
        this.job = job;
        this.time = time;
    }

    public void salaryt (String city, String job, String time) {
        if (city == "Казань") {
            if (job == "таксистом эконома") {
                slr = 200;
                if (time == "в час пик") {
                    slr += 100;
                }
            } else if (job == "таксистом с детским креслом") {
                slr = 200;
                if (time == "в час пик") {
                    slr += 150;
                }
            } else if (job == "таксистом бизнес класса") {
                slr = 200;
                if (time == "в час пик") {
                    slr += 270;
                }
            }
        } else if (city == "Санкт-Петербург") {
            if (job == "таксистом эконома") {
                slr = 300;
                if (time == "в час пик") {
                    slr += 100;
                }
            } else if (job == "таксистом с детским креслом") {
                slr = 200;
                if (time == "в час пик") {
                    slr += 150;
                }
            } else if (job == "таксистом бизнес класса") {
                slr = 200;
                if (time == "в час пик") {
                    slr += 270;
                }
            }
        } else if (city == "Москва") {
            if (job == "таксистом эконома") {
                slr = 400;
                if (time == "в час пик") {
                    slr += 100;
                }
            } else if (job == "таксистом с детским креслом") {
                slr = 200;
                if (time == "в час пик") {
                    slr += 150;
                }
            } else if (job == "таксистом бизнес класса") {
                slr = 200;
                if (time == "в час пик") {
                    slr += 270;
                }
            }
        }
        System.out.println("Я работаю " + job + " " + time + " и зарабатываю " + slr + " рублей за одну поездку");
    }
}
