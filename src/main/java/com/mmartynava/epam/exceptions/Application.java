package com.mmartynava.epam.exceptions;

import com.mmartynava.epam.exceptions.model.*;

public class Application {

    public static void main(String[] args) {
        University university = fillData();
        System.out.println("Средний балл по всем предметам студента:" + university.getAverageMarkOfSubjectsByStudentName("Mariya"));
        System.out.println("Средний балл по конкретному предмету в конкретной группе и на конкретном факультете:"
                + university.getAverageMarkOfSubjectByFacultyNameAndGroupName("Электротехнический",
                "АСОИ-101", "Программирование"));
        System.out.println("Средний балл по предмету для всего университета:" + university.getAverageMarkBySubjectName("Механика"));
    }

    private static University fillData() {
        University university = new University("БРУ", "проспект Мира 43");

        Faculty elect = new Faculty("Электротехнический");
        Faculty econom = new Faculty("Экономический");
        Faculty auto = new Faculty("Автомеханический");

        Group asoi = new Group("АСОИ-101");
        Group fk = new Group("ФК");
        Group avt = new Group("АВТ");

        Student grusha = new Student("Grusha");
        Student mihail = new Student("Mihail");
        Student mariya = new Student("Mariya");
        Student anna = new Student("Anna");
        Student dmitriy = new Student("Dmitriy");
        Student oleg = new Student("Oleg");

        Subject micromih = new Subject("Микроэкономика");
        Subject microdmit = new Subject("Микроэкономика");
        Subject accounmih = new Subject("Бухгалтерский учет");
        Subject accoundmit = new Subject("Бухгалтерский учет");
        Subject alggrush = new Subject("Алгоритмизация");
        Subject algann = new Subject("Алгоритмизация");
        Subject proggrush = new Subject("Программирование");
        Subject progann = new Subject("Программирование");
        Subject mechmar = new Subject("Механика");
        Subject mechol = new Subject("Механика");
        Subject mechatmar = new Subject("Мехатроника");
        Subject mechatol = new Subject("Мехатроника");

        grusha.getSubjects().add(alggrush);
        grusha.getSubjects().add(proggrush);
        anna.getSubjects().add(algann);
        anna.getSubjects().add(progann);
        mihail.getSubjects().add(micromih);
        mihail.getSubjects().add(accounmih);
        dmitriy.getSubjects().add(microdmit);
        dmitriy.getSubjects().add(accoundmit);
        mariya.getSubjects().add(mechatmar);
        mariya.getSubjects().add(mechmar);
        oleg.getSubjects().add(mechatol);
        oleg.getSubjects().add(mechol);

        alggrush.setMark(10);
        proggrush.setMark(10);
        algann.setMark(6);
        progann.setMark(2);
        micromih.setMark(8);
        accounmih.setMark(5);
        microdmit.setMark(8);
        accoundmit.setMark(7);
        mechatmar.setMark(6);
        mechmar.setMark(5);
        mechatol.setMark(8);
        mechol.setMark(9);

        asoi.getStudents().add(grusha);
        asoi.getStudents().add(anna);
        fk.getStudents().add(mihail);
        fk.getStudents().add(dmitriy);
        avt.getStudents().add(mariya);
        avt.getStudents().add(oleg);

        elect.getGroups().add(asoi);
        econom.getGroups().add(fk);
        auto.getGroups().add(avt);

        university.getFaculties().add(elect);
        university.getFaculties().add(econom);
        university.getFaculties().add(auto);

        return university;
    }
}
