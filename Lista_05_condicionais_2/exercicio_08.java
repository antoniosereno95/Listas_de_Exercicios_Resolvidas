package Lista_05_condicionais_2;

import java.util.Scanner;
public class exercicio_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int dia , mes , ano;
        int bissexto;
        int chave_valida;
        
        System.out.println("digite o valor do dia");
        dia = input.nextInt();
        System.out.println("digite o valor do mes");
        mes = input.nextInt();
        System.out.println("digite o valor do ano");
        ano = input.nextInt();
        
        //primeiro passo verrificar se o ano é bissexto.
        bissexto = 0;// zero para anos nao bissestos e 1 para anos bissestos.
        if(ano%400==0){
            bissexto = 1;
        }
        if(ano%4 == 0 && ano%100 != 0){
            bissexto = 1;
        }
        
        
        chave_valida = 0;// zero para datas validas e 1 para datas invalisdas.
        if(bissexto == 1){ //para um nao bissexto teremos o dia extra 29 de fevereiro.
         
            if(ano >= 1900){
                if(mes <= 12){
                    if(mes == 1){
                        if(dia < 1 || dia > 31){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 2){
                        if(dia < 1 || dia > 29){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 3){
                        if(dia < 1 || dia > 31){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 4){
                        if(dia < 1 || dia > 30){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 5){
                        if(dia < 1 || dia > 31){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 6){
                        if(dia < 1 || dia > 30){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 7){
                        if(dia < 1 || dia > 31){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 8){
                        if(dia < 1 || dia > 31){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 9){
                        if(dia < 1 || dia > 30){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 10){
                        if(dia < 1 || dia > 31){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 11){
                        if(dia < 1 || dia > 30){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 1){
                        if(dia < 1 || dia > 31){
                            chave_valida = 2;
                        }  
                    }
                }else{
                    chave_valida = 2;
                }
            }else{
                chave_valida = 2;
            }
            
        }else{ //para ano nao bissexto teremos. 
          
            if(ano >= 1900){
                if(mes <= 12){
                    if(mes == 1){
                        if(dia < 1 || dia > 31){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 2){
                        if(dia < 1 || dia > 28){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 3){
                        if(dia < 1 || dia > 31){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 4){
                        if(dia < 1 || dia > 30){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 5){
                        if(dia < 1 || dia > 31){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 6){
                        if(dia < 1 || dia > 30){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 7){
                        if(dia < 1 || dia > 31){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 8){
                        if(dia < 1 || dia > 31){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 9){
                        if(dia < 1 || dia > 30){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 10){
                        if(dia < 1 || dia > 31){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 11){
                        if(dia < 1 || dia > 30){
                            chave_valida = 2;
                        }  
                    }
                    if(mes == 1){
                        if(dia < 1 || dia > 31){
                            chave_valida = 2;
                        }  
                    }
                }else{
                    chave_valida = 2;
                }
            }else{
                chave_valida = 2;
            }
            
        }
        
        
        //chave de data valida.
        if(chave_valida == 0){
            System.out.println( "a data "+dia+" / "+mes+" / "+ano+" é valida." ); 
        }else{
            System.out.println("a data "+dia+" / "+mes+" / "+ano+" NAO é valida.");
        }
        
    }
}
