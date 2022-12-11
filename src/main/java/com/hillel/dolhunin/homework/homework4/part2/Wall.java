package com.hillel.dolhunin.homework.homework4.part2;

public class Wall extends Obstacle{


    public Wall(double height) {
        super(height, 0, "Wall");
    }

    @Override
    public void overcome(Participant participant) {
        getCounter();
        if (getHeight() <= participant.getMaxJumpHeight()) {
            System.out.println("Учасник " + participant.getName() + " зміг перетнути перешкоду " + getName() + " висотою " + getHeight() + " м");
        } else {
            setCounter();
            System.out.println("Учасник " + participant.getName() + " не зміг перетнути перешкоду " + getName() + " висотою " + getHeight() + " м. " + "Подолано " + participant.getMaxJumpHeight() + " м.");
        }
    }


}
