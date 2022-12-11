package com.hillel.dolhunin.homework.homework4.part2;

public class Main {
    public static void main(String[] args) {

        Person person1 =  new Person("Bob", 34, 3);
        Cat cat1 = new Cat("Tom", 21, 2);
        Robot robot1 =  new Robot("Verter", 54, 4);

        Participant [] participants = new Participant[] {person1, cat1, robot1};

        Wall wall1  = new Wall(3);
        Racetrack racetrack1 = new Racetrack(35);

        Obstacle[] obstacles = new Obstacle[] {wall1, racetrack1};

        play(participants, obstacles);

    }

    public static void play(Participant [] participants, Obstacle[] obstacles) {
        for(Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(participant);
                if (obstacle.getCounter() == 0) {
                    break;
                }
            }
        }
    }
}
