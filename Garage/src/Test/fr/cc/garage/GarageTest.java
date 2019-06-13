package fr.cc.garage;

import fr.cc.garage.Garage;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class GarageTest {
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
