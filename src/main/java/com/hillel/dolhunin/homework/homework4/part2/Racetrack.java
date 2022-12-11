package com.hillel.dolhunin.homework.homework4.part2;

public class Racetrack extends Obstacle{

    public Racetrack(double distance) {
        super(0, distance, "Racetrack");
    }

    @Override
    public void overcome(Participant participant) {
        getCounter();
        if (getDistance() <= participant.getMaxRunDistance()) {
            System.out.println("Учасник " + participant.getName() + " пробіг " + getName() + " " +  getDistance() + " м");
        } else {
            setCounter();
            System.out.println("Учасник " + participant.getName() + " не зміг пробігти " + getName() + " " + getDistance() + " м. " + "Пройдено " + participant.getMaxRunDistance() + " м.");
        }
    }
}
