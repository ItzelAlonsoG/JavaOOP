import model.*;


import java.util.*;

public class Main {
   public static <IScheduable> void main(String[] args) {

    //  showMenu();
/*
     Doctor myDoctor = new Doctor("Itzel ALonso","itze@hotmail.com");
      myDoctor.addAvailableAppointment(new Date(), "4pm");
       myDoctor.addAvailableAppointment(new Date(), "5pm");
       myDoctor.addAvailableAppointment(new Date(), "7pm");

       System.out.println(myDoctor);

       for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {

           System.out.println(aA.getDate() + " "+ aA.getTime());
           
       }


       model.Patient patient = new model.Patient("Alejandra","itzel.alonso@hotmail.com");
       patient.setWeight(54.6);
       System.out.println(patient.getWeight());

       patient.setPhoneNumber("12345671");
       System.out.println(patient.getPhoneNumber());

*/
    /*       int i = 0;
       int b = 2;
       b = i; // b= 0
       String name = "Ann";

       System.out.println();
       System.out.println();
       Patient patient = new Patient("Alejandra","alejandra@gmain.com");
       Patient patient2 = new Patient("Anahí","anahí@gmain.com");

       System.out.println(patient);

     */
      /* System.out.println(patient.getName());
       System.out.println(patient2.getName());

        patient2 = patient;
        System.out.println(patient2.getName());
        patient2.setName("Manuel");

       System.out.println(patient2);
       System.out.println(patient.getName());
       System.out.println(patient2.getName());

       Map<Integer,String> map = new HashMap<Integer,String>(); // HashMap: Los elementos no se ordenan. No aceptan claves duplicadas ni valores nulos.
       Map <Integer,String> treeMap = new TreeMap<Integer,String>(); //LinkedHashMap: Ordena los elementos conforme se van insertando; provocando que las búsquedas sean más lentas que las demás clases.
       Map <Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>(); //TreeMap: El Mapa lo ordena de forma “natural”. Por ejemplo, si la clave son valores enteros (como luego veremos), los ordena de menos a mayor.

    //Imprimimos el Map con un Iterador

       Iterator it = map.keySet().iterator();
       while (it.hasNext()){
           Integer key = (Integer) it.next();
           System.out.println("Clave: " + key + "-> Valor: " +map.get(key));
       }

       Iterator itL = linkedHashMap.keySet().iterator();
       while (itL.hasNext()){
           Integer key = (Integer) itL.next();
           System.out.println("Clave: " + key + "-> Valor: " +linkedHashMap.get(key));
       }

       Iterator itT = treeMap.keySet().iterator();
       while (itT.hasNext()){
           Integer key = (Integer) itT.next();
           System.out.println("Clave: " + key + "-> Valor: " +treeMap.get(key));
       }
 */

       User user = new Doctor("Itzel Alonso","itzel@hotmail.com");
       user.showDataUser();

       User nurse = new Nurse("Anahí Salgado","ana@accenture.com");
       nurse.showDataUser();

       User patient = new Patient("Kevin Castillo","ckv207@gmail.com");
       patient.showDataUser();

       //método abstracto
       User user1 = new User("Itzel","itzel@.com") {
           @Override
           public void showDataUser() {
               System.out.println("método abstracto");
               System.out.println("Doctor \n");
               System.out.println("Hispital: Cruz Verde");
               System.out.println("Departamento: Geriatría");
           }

       };

       user1.showDataUser();

      /* IScheduable iScheduable = new IScheduable() {
           @Override
           public void schedule(Date date, String time) {

           }
           */
       };



   }
}
