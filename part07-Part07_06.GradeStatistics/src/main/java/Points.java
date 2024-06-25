import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    private ArrayList<Integer> grades;

    public Points() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addPoints(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrade(points));

        if (points >= 50) {
            this.passingPoints.add(points);
        }
    }

    public double pointsAverage() {
        int sumOfPoints = 0;
        int count = 0;

        if (this.points.isEmpty()) {
            return -1;
        }

        for (int point: this.points) {
            sumOfPoints += point;
            count++;
        }

        return 1.0 * sumOfPoints / count;
    }

    public double passingPointsAverage() {
        int sumOfPassedPoints = 0;
        int count = 0;

        if (this.points.isEmpty()) {
            return -1;
        }

        for (int pass: this.passingPoints) {
            sumOfPassedPoints += pass;
            count++;
        }

        return 1.0 * sumOfPassedPoints / count;
    }

    public double percentageOfPassedPoints() {
        return 100.0 * passingPoints.size()/ points.size();
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public int gradeDistribution(int grade) {
        int count = 0;
        for (int g: grades) {
            if (g == grade) {
                count ++;
            }
        }
        return count;
    }
    

}