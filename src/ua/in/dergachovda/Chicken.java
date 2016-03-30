package ua.in.dergachovda;

import java.util.Date;


public class Chicken {
    String name;    // Имя
    Date lastTime;
    int age;        // возраст (часов)
    int health;     // здоровье (%)
    int hunger;     // голод (%)
    int mood;       // настроение (%)


    public Chicken(String name) {
        this.name = name;
        this.age = 0;
        this.health = 100;
        this.hunger = 20;
        this.mood = 80;
        this.lastTime = new Date();
    }

    public void feed() {
        lifetime();
        byte n = 30;
        this.hunger = this.hunger - n < 0 ? 0 : this.hunger - n;
    }

    public void game() {
        lifetime();
        byte n = 30;
        this.mood = this.mood + n > 100 ? 100 : this.mood + n;
    }

    public void doctor() {
        lifetime();
        this.health = 100;
    }

    public void lifetime() {
        Date time = new Date();
        long step = (time.getTime() - this.lastTime.getTime()) / ( 1000 * 10);
        if (step > 0) {
            this.lastTime = time;
            for (int i = 0; i < step; i++) {
                stepLive();
                if (this.health == 0)
                    rip();
            }
        }
    }

    // Смерть циплёнка
    public void rip() {
        System.out.println(this);
        System.out.println(this.name + " is RIP :(");
        System.exit(0);
    }

    // Один шаг жизни циплёнка
    public void stepLive() {
        //изменение возроста
        this.age++;
        // изменение голода
        if (this.hunger < 100) {
            byte n = 2;
            this.hunger = this.hunger + n > 100 ? 100 : this.hunger + n;
        }
        else
            this.health = this.health <= 0 ? 0 : this.health - 2;
        // изменение настроения
        if (this.mood > 0) {
            byte n = 1;
            this.mood = this.mood - n < 0 ? 0 : this.mood - n;
        }
        else
            this.health = this.health <= 0 ? 0 : this.health - 1;
    }

    public String toString() {
        int day = this.age / 24;
        int hours = this.age - (day * 24);
        String chickenAge = day + " day, " + hours + " hours";
        return "Chicken: " + name + "\nage    : " + chickenAge + "\nhealth : " + this.health + "%\nhungry : " + this.hunger + "%\nmood   : " + this.mood + "%\nᕙ(`▽´)ᕗ";
    }

}
