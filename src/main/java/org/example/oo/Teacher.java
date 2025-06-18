package org.example.oo;

public class Teacher extends Person {
    private String subject;
    private Classroom classroom;

    public Teacher(String first, String last, String subject) {
        super(first, last);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    String getBuildingRoom() {
        return classroom == null ? null : classroom.getBuildingRoom();
    }

    @Override
    public String toString() {
        return "Teacher(" + getFirst() + " " + getLast() + " Subject: " + subject + ")";
    }

    public static class Classroom {
        public static String DIV = "-";

        private String building;
        private String room;

        public Classroom(String building, String room) {
            this.building = building;
            this.room = room;
        }

        public String getBuilding() {
            return building;
        }

        public void setBuilding(String building) {
            this.building = building;
        }

        public String getRoom() {
            return room;
        }

        public void setRoom(String room) {
            this.room = room;
        }

        private String getBuildingRoom() {
            return building + DIV + room;
        }
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Tim", "Smith", "Math");
        Teacher.Classroom cl = new Teacher.Classroom("A", "A1");
        System.out.println(t);
        System.out.println(t.getBuildingRoom());
        t.setClassroom(cl);
        System.out.println(t.getBuildingRoom());
    }
}
