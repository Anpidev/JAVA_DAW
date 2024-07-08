package tareas.poo.persona;
import java.util.Scanner;

public class Persona {

    // Constructor
    public Persona() {
    }

    //Getter and setters
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getHobbiesToString() {
        if (hobbies == null || hobbies.length == 0) {
            return "No se han registrado hobbies.";
        } else {
            StringBuilder mostrarHobbies = new StringBuilder();
            for (int i = 0; i < hobbies.length; i++) {
                mostrarHobbies.append(hobbies[i]);
                if (i < hobbies.length - 1) {
                    mostrarHobbies.append(", ");
                }
            }
            return mostrarHobbies.toString();
        }
    }

    public String [] getHobbies(){
        return hobbies;
    }

    public void setHobbies() {
        Scanner scanner= new Scanner(System.in);
        this.hobbies = new String[3];
        for (int i = 0; i < this.hobbies.length; i++) {
            System.out.println("Hobby " + (i + 1) + ":");
            this.hobbies[i] = scanner.nextLine();
        }

    }




    // Campos de clase
    private String name;
    private String surname;
    private String address;
    private String phone;
    private String[] hobbies;
}
