package model;

public class Nurse extends User {

    private String speciality;

    public Nurse (String name, String email){
        super(name,email);
    }

    @Override
    public void showDataUser() {
        System.out.println();
        System.out.println("Hospitl: Cruz Verde");
        System.out.println("Departamentos: Nutríología, oncología");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
