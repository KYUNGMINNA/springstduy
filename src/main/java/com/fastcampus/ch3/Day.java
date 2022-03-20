package com.fastcampus.ch3;

public class Day {
    int year;
    int month;
    int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Day{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
