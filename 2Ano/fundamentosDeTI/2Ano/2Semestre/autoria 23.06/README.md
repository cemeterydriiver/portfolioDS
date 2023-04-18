# ⚙️ Autoria com placa LCD 
    
<h3 align="center">Código</h3> 
 
                       #include <LiquidCrystal.h>    
                  LiquidCrystal lcd(12, 11, 5, 4, 3, 2);
                                          
        void setup()
      {
      //Define o número de colunas e linhas do LCD
        lcd.begin(16, 2);
      }
       
      void loop()
      {
       //Limpa a tela
      lcd.clear();
      //Posiciona o cursor na coluna 3, linha 0;
      lcd.setCursor(3, 0);
      //Envia o texto entre aspas para o LCD
      lcd.print("NOSSA AUTORIA COM LCD");
      lcd.setCursor(3, 1);
      lcd.print("<3");
      delay(5000);
      }
Utilizamos o LCD para mostrar uma mensagem na tela somente quando apertasse o botão.

  
  


  
