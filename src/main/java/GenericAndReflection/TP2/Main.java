package GenericAndReflection.TP2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main (String [] args){
        try {
            //Métodos para obtener constructores y clase
            Class<?> clazz = Class.forName("GenericAndReflection.TP2.Persona");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            System.out.println("\nConstructores:");
            for (Constructor<?> constructor : constructors){
                System.out.println(" " + constructor.getName());
            }
            Constructor<?> constructorAInstanciar = constructors[0];
            constructorAInstanciar.setAccessible(true);

            //Objeto instanciado desde la clase obtenida.
            Object instance1 = constructorAInstanciar.newInstance("Juan", 22);

            //Objeto Modificado.
            Field nameField = clazz.getDeclaredField("nombre");
            nameField.setAccessible(true);
            nameField.set(instance1, "José");

            //Métodos de la clase obtenida
            Method metodoSaludar = clazz.getDeclaredMethod("sayHello");
            metodoSaludar.invoke(instance1);

            metodoSaludar.setAccessible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
