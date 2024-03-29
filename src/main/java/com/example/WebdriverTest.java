package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import static org.junit.Assert.*;

public class WebDriverTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Configurar o driver do Edge
        System.setProperty("webdriver.edge.driver", "C:\\dev\\edgedriver\\msedgedriver.exe");
        // Inicializar o WebDriver
        driver = new EdgeDriver();
    }

    @Test
    public void testGoogleSearch() {
        // Navegar para o site do Google
        driver.get("https://www.google.com");

        // Verificar se o título da página contém a palavra "Google"
        assertTrue(driver.getTitle().contains("Google"));
    }

    @After
    public void tearDown() {
        // Fechar o navegador ao finalizar
        if (driver != null) {
            driver.quit();
        }
    }
}
