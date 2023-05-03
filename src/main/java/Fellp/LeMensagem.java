package Fellp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class LeMensagem {

    public void LerMensagem(Mensagem msg, WebDriver webDriver){

        var elemento = findUltimaMensagem(webDriver);

        while (elemento == null){

            msg.setConteudoRecebido(elemento.getText());
            if (elemento != null){

                msg.setConteudoRecebido(elemento.getText());
                break;

            }
        }

    }


    public WebElement findUltimaMensagem(WebDriver webDriver){

        var xPathCaixaTexto = "//*[@id=\"main\"]/div[2]/div/div[2]/div[2]/div[9]/div/div/div/div[1]/div[1]/div[1]/div/span[1]/span";
        return webDriver.findElement(By.xpath(xPathCaixaTexto));

    }

}
