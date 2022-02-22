package comparable;

import java.awt.*;

public class student implements Comparable<student>{
    int age;
    int classNumber;

    public student(int age, int classNumber) {
        this.age = age;
        this.classNumber = classNumber;
    }


    @Override
    public int compareTo(student o) {
        return this.age - o.age;
    }

    Rectangle rectangle = new Rectangle(){
        @Override
        public double getX() {
            return -1;
        }

        @Override
        public double getY() {
            return super.getY();
        }
    };
}
