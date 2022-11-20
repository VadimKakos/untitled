package Passport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Passport {
    private int number;
    private String name;
    private String surname;
    private String patronim;
    private String dataOfBirth;
    private static final List<Passport> passportList = new ArrayList<Passport>();

    public Passport(int number, String name, String surname, String dataOfBirth) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.patronim = patronim;
        this.dataOfBirth = dataOfBirth;
    }

    public Passport(int number, String name, String surname, String patronim, String dataOfBirth) {
        if (number <= 0) {
            throw new RuntimeException("Номер паспорта больше 0 ");
        } else {
            this.number = number;
        }
        if (name == null && name.isBlank() && name.isBlank()) {
            throw new RuntimeException("Имя некорректно");
        } else {
            this.name = name;
        }
        if (surname == null && surname.isBlank() && surname.isBlank()) {
            throw new RuntimeException("Фамилия некорректно");
        } else {
            this.surname = surname;
        }
        this.patronim = patronim;
        if (parseData(dataOfBirth) == null) {
            throw new RuntimeException("Неверный формат");
        } else {
            this.dataOfBirth = dataOfBirth;
        }
    }

    public static Date parseData(String date) {
        try {
            return new SimpleDateFormat("dd.MM.yyyy").parse(date);
        } catch (ParseException e) {
            return null;
        }

    }

    public static void addNewPassport(Passport newPassword) {
        boolean checkNewPasswoed = true;
        for (Passport passport : passportList) {
            if (passport.getNumber() == newPassword.getNumber()) {
                passport.setName(newPassword.getName());
                passport.setSurname(newPassword.getSurname());
                passport.setPatronim(newPassword.getPatronim());
                passport.setDataOfBirth(newPassword.getDataOfBirth());
                checkNewPasswoed = false;
                break;
            }
        }
    }

    public static Passport searchPassport(Passport passport) {
        for (Passport passport1 : passportList) {
            if (passport1.getNumber() == passport1.getNumber()) {
                return passport;
            }
        }
        return null;
    }

    public static void printPassportList() {
        for (Passport passport : passportList) {
            System.out.println(passport);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number && Objects.equals(name, passport.name) && Objects.equals(surname, passport.surname) && Objects.equals(patronim, passport.patronim) && Objects.equals(dataOfBirth, passport.dataOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, surname, patronim, dataOfBirth);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronim='" + patronim + '\'' +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronim() {
        return patronim;
    }

    public void setPatronim(String patronim) {
        this.patronim = patronim;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }
}

