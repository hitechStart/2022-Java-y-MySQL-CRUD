
import Datos.PersonaJDBC;
import domain.Persona;
import java.util.List;

public class TestPersonas {

    public static void main(String[] args) {

        PersonaJDBC personaJDBC = new PersonaJDBC();

        List<Persona> personas = personaJDBC.select();

        Persona person = new Persona();

//        person.setNombre("carlos");
//        person.setApellido("Lopez");
//        person.setEmail("lopez@mail.com");
//        person.setTelefono("33954738");
//        personaJDBC.insert(person);


//        person.setIdPersona(6);
//        person.setNombre("Luis");
//        person.setApellido("Lopez");
//        person.setEmail("lopez@mail.com");
//        person.setTelefono("33954738");
//        personaJDBC.update(person);


        person.setIdPersona(6);
        personaJDBC.delete(person);

        for (Persona persona : personas) {
            System.out.println("Persona " + persona);
        }
    }
}
