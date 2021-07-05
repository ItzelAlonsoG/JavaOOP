package model;

import javax.jws.soap.SOAPBinding;

public class Enumeration {

    public enum Day {
        SUNDAY("Domingo","Sonntag"),
        MONDAY("Lunes","Montag"),
        TUESDAY("Martes","Dienstag"),
        WEDNESDAY("Miércoles","Mittwoch"),
        THURSDAY("Jueves","Donnerstag"),
        FRIDAY("Viernes","Freitag"),
        SATURDAY("Sabado","Samstag");

        private String spanish;
        private String german;
        private Day (String s, String g){
            spanish = s;
            german = g;
        }

        private String getSpanish(){
            return spanish;
        }

        private String getGerman(){
            return german;
        }
    }

    public static void main(String[] args) {
        System.out.println(Day.MONDAY);
        System.out.println(Day.MONDAY.getSpanish());
        System.out.println(Day.MONDAY.getGerman());
    }
}

