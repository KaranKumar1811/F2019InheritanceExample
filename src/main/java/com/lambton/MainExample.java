package com.lambton;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class MainExample
{
    public static void main(String[] args)
    {
        Person p1;

        Student s1 = new Student(1,
                "Pritesh",
                "Patel",
                LocalDate.now(),
                "Male",
                "MADT",
                2);

        p1 = s1;

        p1.display();
        p1.print();

        Faculty f1 = new FullTimeFaculty(1,
                "Pritesh",
                "Patel",
                LocalDate.now(),
                "Male",
                "Software Engineer", 1000.00f,
                "Mobile Software Development",
                200);

        f1.calculateTotalSalary();
        p1 = f1;
        p1.display();





    }

}
