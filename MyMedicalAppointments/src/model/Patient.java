package model;

public class Patient extends User{
//Atributos

 private String birthday;
 private double weight;
 private double height;
 private String blood;

//método constructor sobre cargadro con lo mínimo de parámetros para que exista el objeto Paciente.
public Patient(String name, String email){
    super(name,email);
}

public void setWeight(double weight){
    this.weight = weight;
}
// 64.5 KG String
public String getWeight (){
    return this.weight + " Kg." ;
}


public String getBirthday() {
    return birthday;
}

public void setBirthday(String birthday) {
    this.birthday = birthday;
}

public String getHeight() {
    return height + " Mts.";
}

public void setHeight(double height) {
    this.height = height;
}

public String getBlood() {
    return blood;
}

public void setBlood(String blood) {
    this.blood = blood;
}

    @Override
    public String toString() {
        return super.toString() + " \nAge: " + birthday + " \n Weight: " + getWeight() + "\n Height: " +getHeight() +
                "\n blood: " +getBlood();
    }

    @Override
    public void showDataUser() {
        System.out.println();
        System.out.println("Paciente");
        System.out.println("Historial completo del paciente");
    }
}