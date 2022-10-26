package Admin;

public class Scores {
    public Double math;
    public Double english;
    public Double physics;
    public Double music;
    public Double sciences;

    public Double averageofscore;

    public Scores(Double math, Double english, Double physics, Double music, Double sciences, Double averageofscore) {
        this.math = math;
        this.english = english;
        this.physics = physics;
        this.music = music;
        this.sciences = sciences;
        this.averageofscore = averageofscore;
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    public Double getEnglish() {
        return english;
    }

    public void setEnglish(Double english) {
        this.english = english;
    }

    public Double getPhysics() {
        return physics;
    }

    public void setPhysics(Double physics) {
        this.physics = physics;
    }

    public Double getMusic() {
        return music;
    }

    public void setMusic(Double music) {
        this.music = music;
    }

    public Double getSciences() {
        return sciences;
    }

    public void setSciences(Double sciences) {
        this.sciences = sciences;
    }

    public Double getAverageofscore() {
        return averageofscore;
    }

    public void setAverageofscore(Double averageofscore) {
        
        this.averageofscore = (getEnglish() + getMath() + getMusic() + getMusic() + getSciences()) / 6;
    }
}
