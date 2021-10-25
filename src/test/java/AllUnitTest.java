import com.practica.cajanegra.ToStringTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ToStringTest.class})    // Añadir aqui cada clase de test que se vaya a crear
public class AllUnitTest {
                                        /*
                                           - No hace falta poner nada aqui.
                                           - Si queremos correr los test mediante IntelliJ hacemos click derecho Run.
                                           - Si queremos correrlos con Maven (es lo que nos piden) hacemos
                                             Ctrl * 2 y sale una consolita, escribimos "mvn test".
                                           - La idea sería crear una clase por cada método que vayamos a testear.
                                           - Creadlos en la carpeta en la que ya está ToStringTest.
                                         */
}
