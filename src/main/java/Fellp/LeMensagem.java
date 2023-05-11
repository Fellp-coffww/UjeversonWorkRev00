package Fellp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class LeMensagem {

    public void LerMensagem(Mensagem msg, WebDriver webDriver){

        var elemento = findUltimaMensagem(webDriver);
        msg.setConteudoRecebido(elemento.getText());

    }


    public WebElement findUltimaMensagem(WebDriver webDriver){

        var xPathCaixaTexto = "//*[@id=\"pane-side\"]/div[1]/div/div/div[1]/div/div/div/div[2]/div[2]/div[1]/span/span[3]";
        return webDriver.findElement(By.xpath(xPathCaixaTexto));

    }

}
