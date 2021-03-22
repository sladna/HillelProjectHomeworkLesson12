package com.annasladkykh;

public class PersonNew {
    private String surname;
    private String name;
    private String patronymic;
    private String dateOfBirth;

    public PersonNew(String surname, String name, String patronymic, String dateOfBirth) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public PersonNew(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String fullName() {
        String fullName = surname + " " + name + " " + patronymic;
        return fullName;
    }

    public String initials() {
        char name1 = name.charAt(0);
        char patronymic1 = patronymic.charAt(0);
        String initials = surname + " " + name1 + ". " + patronymic1 + ".";
        return initials;
    }

    @Override
    public String toString() {
        return "PersonNew{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
