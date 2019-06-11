package OrderTest;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OrderTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }

    Main main = new Main();
    Scanner sc = new Scanner(System.in);

    @Test
    public void Given_68F_When_ConvertCelsiusToFahr20_Then_ShouldDisplayNumber() {
        main.equals(1);
        Assertions.assertEquals("Veuillez renseigner la température en °C");

    }
}

