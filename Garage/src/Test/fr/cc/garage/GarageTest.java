package fr.cc.garage;

import fr.cc.Main;
import fr.cc.garage.Garage;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;


import org.junit.jupiter.api.*;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.jupiter.api.Assertions.assertEquals;




public class GarageTest {
    Main main = new Main();
    Garage garage = new Garage();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Garage.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void addVoiture() {

    }

    @org.junit.Test
    public void getPrixVehicule() {
        garage.setPrixVehicule(5000);
        assertEquals(5000, outContent.toString().replace("\r\n", "\n"));

    }

    @org.junit.Test
    public void getNomVehicule() {
    }

    @org.junit.Test
    public void getListVehicule() {
    }

    @org.junit.Test
    public void toString1() {
    }
}
