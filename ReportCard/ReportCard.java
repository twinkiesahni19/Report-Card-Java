package com.example.android.reportcard;

/**
 * Created by Twinkle Sahni on 04-May-17.
 */

public class ReportCard {
    private int mclanguage;
    private int mdatabase;
    private int moperating;
    private int mlinux;
    private int total;
    private float percentage;
    private char grade[] = new char[4];

    public ReportCard(int clanguage, int database, int operating, int linux) {
        mclanguage = clanguage;
        mdatabase = database;
        moperating = operating;
        mlinux = linux;
    }

    // Get c++ marks
    public int getCppmarks() {
        return mclanguage;
    }

    public void setcppmarks(int clanguage) {
        mclanguage = clanguage;
        grade[0] = grades(clanguage);
    }

    // Get OS marks
    public int getosmarks() {
        return moperating;
    }

    public void setosmarks(int operating) {
        moperating = operating;
        grade[1] = grades(operating);
    }

    // Get DBMS marks
    public int getdbmsmarks() {
        return mdatabase;
    }

    public void setdbmsmarks(int database) {
        mdatabase = database;
        grade[2] = grades(database);
    }

    // Get ITL marks
    public int getitlmarks() {
        return mlinux;
    }

    public void setitlmarks(int linux) {
        mlinux = linux;
        grade[3] = grades(linux);
    }

    public int totalMarks() {
        total = mclanguage + mdatabase + mlinux + moperating;
        return total;
    }

    public float percentage() {
        percentage = (total * 100) / 4;
        return percentage;
    }

    private char grades(int marks) {
        if (marks >= 95) {
            return 'O';
        } else if (marks >= 85) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 65) {
            return 'C';
        } else if (marks >= 55) {
            return 'D';
        } else if (marks <= 35) {
            return 'F';
        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("REPORT");
        stringBuilder.append("MARKS IN C++").append(mclanguage).append("GRADE IS ").append(grade[0]);
        stringBuilder.append("MARKS IN ITL").append(mlinux).append("GRADE IS ").append(grade[1]);
        stringBuilder.append("MARKS IN DBMS").append(mdatabase).append("GRADE IS ").append(grade[2]);
        stringBuilder.append("MARKS IN OS").append(moperating).append("GRADE IS ").append(grade[3]);
        return stringBuilder.toString();

    }
}
