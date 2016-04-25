package ua.in.dergachovda;

import java.util.Date;

class Chicken {
    String name;    // Имя
    String avatar;  // Аватарка
//    private Date lastTime;  // Время создания, а потом время последнего обращения
    private int age;        // возраст
    private int health;     // здоровье (%)
    private int hunger;     // голод (%)
    private int mood;       // настроение (%)


    Chicken(String name) {
        this.name = name;
        avatar = "~(`v´)~";
        age = 0;
        health = 100;
        hunger = 20;
        mood = 80;
//        lastTime = new Date();
    }

    void feed(int n) {
        if (hunger - n < 0) {
            burp();
            hunger = n - hunger;
        } else {
            hunger = hunger - n;
        }
    }

    void game() {
        byte n = 30;
        this.mood = this.mood + n > 100 ? 100 : this.mood + n;
    }

    private void burp() {
        System.out.println("The chicken is burped!");
        health = health - 20;
    }

    void doctor() {
        this.health = 100;
    }

    void lifeTime() {
        stepLive();
        if (this.health == 0) rip();
        this.avatar = getAvatar();
    }

//    void lifetime() {
//        Date time = new Date();
//        long step = (time.getTime() - this.lastTime.getTime()) / (1000 * 2);
//        if (step > 0) {
//            this.lastTime = time;
//            for (int i = 0; i < step; i++) {
//                stepLive();
//                if (this.health == 0)
//                    rip();
//            }
//            this.avatar = getAvatar();
//        }
//    }

    private String getAvatar() {
        String moodl, moodr, healthl, healthr, hungerc;
        if (this.hunger > 55) {
            hungerc = "O";
        } else {
            hungerc = "v";
        }
        if (this.health > 45) {
            healthl = "`";
            healthr = "´";
        } else {
            healthl = "´";
            healthr = "`";
        }
        if (this.mood > 50) {
            moodl = "~";
            moodr = "~";
        } else {
            moodl = "<";
            moodr = ">";
        }
        return moodl + "(" + healthl + hungerc + healthr + ")" + moodr;
    }

    // Смерть циплёнка
    private void rip() {
        System.out.println(this);
        System.out.println(this.name + " is RIP :(");
        System.exit(0);
    }

    // Один шаг жизни циплёнка
    private void stepLive() {
        //изменение возроста
        this.age++;
        // изменение голода
        if (this.hunger < 100) {
            byte n = 2;
            this.hunger = this.hunger + n > 100 ? 100 : this.hunger + n;
        } else
            this.health = this.health <= 0 ? 0 : this.health - 2;
        // изменение настроения
        if (this.mood > 0) {
            byte n = 1;
            this.mood = this.mood - n < 0 ? 0 : this.mood - n;
        } else
            this.health = this.health <= 0 ? 0 : this.health - 1;
    }

    public String toString() {
        int day = this.age / 24;
        int hours = this.age - (day * 24);
        String chickenAge = day + " day, " + hours + " hours";
        return "Chicken: " + name + "\nage    : " + chickenAge + "\nhealth : " + this.health + "%\nhungry : " + this.hunger + "%\nmood   : " + this.mood + "%\n" + this.avatar;
    }

}
