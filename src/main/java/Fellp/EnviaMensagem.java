package Fellp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Fellp.Mensagem;


public class EnviaMensagem {


    public void EnviarMensagem(Mensagem mensagem, WebDriver webDriver){


        try{

            var elemento = findContato(mensagem.getContatos(), webDriver);
            elemento.click();
            var caixaTexto = findCaixaTexto(webDriver);
            caixaTexto.sendKeys(mensagem.getConteudo());
            caixaTexto.sendKeys(Keys.RETURN);
        } catch (Exception e){

            System.err.println("Não foi possível enviar a mensagem para o contato  "+ mensagem.getContatos() + e);
        }


    }

    public WebElement findContato(String nomeContato,WebDriver webDriver ) {
        var xPathContato = "//*[@id=\"pane-side\"]/*//span[@title='" + nomeContato + "']";;
        return webDriver.findElement(By.xpath(xPathContato));
    }

   public WebElement findCaixaTexto(WebDriver webDriver) {
        var xPathCaixaTexto = "//*[@id=\"main\"]/footer//*[@role ='textbox']";
        return webDriver.findElement(By.xpath(xPathCaixaTexto));
    }



}
