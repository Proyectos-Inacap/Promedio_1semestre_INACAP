/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio_1semestre_inacap;

import java.util.Scanner;

/**
 *
 * @author christian_aqueveque
 */
public class Promedio_1semestre_INACAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double autogestion[] = new double[6];
        double comunicacionEfectiva[] = new double[5];
        double matematica[] = new double[7];
        double fundamentosDeProgramacion[] = new double[6];
        double introduccionALasTi[] = new double[5];
        double itEssentials[] = new double[5];
        double promedio[] = new double[6];
        double diezPorciento = 0.1;
        double quincePorciento = 0.15;
        double veintePorciento = 0.2;
        double veinticincoPorciento = 0.25;
        double nota = 0;
        int x;
        int materia;
        System.out.println("Para elegir que materia desea promediar debe escoger un número.");
        System.out.println("1 = Autogestión");
        System.out.println("2 = Comunicación Efectiva");
        System.out.println("3 = Matemática");
        System.out.println("4 = Fundamentos de Programación");
        System.out.println("5 = Introducción a las TI");
        System.out.println("6 = IT Essentials");
        System.out.print("¿Qué materia quiere calcular? ");
        materia = read.nextInt();
        
        switch(materia){
        
            //Nota Autogestión
            case 1:
            //Ingreso de Notas
            x = 1;
            for (int i = 0; i < autogestion.length; i++) {
                System.out.print("Ingrese nota de Autogestión " + x + " de " + autogestion.length + ": ");
                nota = read.nextDouble();
                if(nota >= 1 && nota <= 7){
                    if(i == 0){
                        autogestion[i] = nota * diezPorciento;
                    }else if(i == 1){
                        autogestion[i] = nota * quincePorciento;
                    }else if(i == 2){
                        autogestion[i] = nota * quincePorciento;
                    }else if(i == 3){
                        autogestion[i] = nota * quincePorciento;
                    }else if(i == 4){
                        autogestion[i] = nota * veinticincoPorciento;
                    }else if(i == 5){
                        autogestion[i] = nota * veintePorciento;
                    }else{
                        System.out.println("La nota ingresada es inválida.");
                        i = i - 1;
                    }//End If
                }else if(nota > 7){
                    System.out.println("La nota ingresada es inválida.");
                    i = i - 1;
                    x = x-1;
                }//End If
                x = x+1;
            }//End For

            //Sacar Promedio
            for (int i = 0; i < autogestion.length; i++) {
                promedio[0] = promedio[0] + autogestion[i];
            }//End For

            //Mostrar Promedio
            System.out.println("La nota final en Autogestión es " + promedio[0]);
            break;
            
            //Comunicación Efectiva
            case 2:
            //Ingreso de Notas
            x = 1;
            for (int i = 0; i < comunicacionEfectiva.length; i++) {
                System.out.print("Ingrese nota de Comunicación Efectiva " + x + " de " + comunicacionEfectiva.length + ": ");
                nota = read.nextDouble();
                if(nota >= 1 && nota <= 7){
                    if(i == 0){
                        comunicacionEfectiva[i] = nota * quincePorciento;
                    }else if(i == 1){
                        comunicacionEfectiva[i] = nota * veintePorciento;
                    }else if(i == 2){
                        comunicacionEfectiva[i] = nota * veinticincoPorciento;
                    }else if(i == 3){
                        comunicacionEfectiva[i] = nota * veintePorciento;
                    }else if(i == 4){
                        comunicacionEfectiva[i] = nota * veintePorciento;
                    }//End if
                }else if (nota > 7){
                    System.out.println("La nota ingresada es inválida.");
                    i = i - 1;
                    x = x-1;
                }//End If
                x = x+1;
            }//End For

            //Sacar Promedio
            for (int i = 0; i < comunicacionEfectiva.length; i++) {
                promedio[1] = promedio[1] + comunicacionEfectiva[i];
            }//End For

            //Mostrar Promedio
            System.out.println("La nota final en Comunicación Efectiva es " + promedio[1]);
            break;
                    
                   
            //Matemática
            case 3:
            //Ingreso de Notas
            x= 1;
            for (int i = 0; i < matematica.length; i++) {
                System.out.print("Ingrese nota de Matemática " + x + " de " + matematica.length + ": ");
                nota = read.nextDouble();
                if(nota >= 1 && nota <= 7){
                    if(i == 0){
                        matematica[i] = nota * diezPorciento;
                    }else if(i == 1){
                        matematica[i] = nota * quincePorciento;
                    }else if(i == 2){
                        matematica[i] = nota * diezPorciento;
                    }else if(i == 3){
                        matematica[i] = nota * veintePorciento;
                    }else if(i == 4){
                        matematica[i] = nota * diezPorciento;
                    }else if(i == 5){
                        matematica[i] = nota * quincePorciento;
                    }else if(i == 6){
                        matematica[i] = nota * veintePorciento;
                    }//End if
                }else if (nota > 7){
                    System.out.println("La nota ingresada es inválida.");
                    i = i - 1;
                    x = x-1;
                }//End If
                x = x+1;

            //Sacar Promedio
            }//End For
            for (int i = 0; i < matematica.length; i++) {
                promedio[2] = promedio[2] + matematica[i];
            }//End For

            //Mostrar Promedio
            System.out.println("La nota final en Matemática es " + promedio[2]);
            break;

            //Fundamentos de Programación
            case 4:
            //Ingreso de Notas
            x = 1;
            for (int i = 0; i < fundamentosDeProgramacion.length; i++) {
                System.out.print("Ingrese nota de Fundamentos de Programación " + x + " de " + fundamentosDeProgramacion.length + ": ");
                nota = read.nextDouble();
                if(nota >= 1 && nota <= 7){
                    if(i == 0){
                        fundamentosDeProgramacion[i] = nota * diezPorciento;
                    }else if(i == 1){
                        fundamentosDeProgramacion[i] = nota * veintePorciento;
                    }else if(i == 2){
                        fundamentosDeProgramacion[i] = nota * veintePorciento;
                    }else if(i == 3){
                        fundamentosDeProgramacion[i] = nota * quincePorciento;
                    }else if(i == 4){
                        fundamentosDeProgramacion[i] = nota * quincePorciento;
                    }else if(i == 5){
                        fundamentosDeProgramacion[i] = nota * veintePorciento;
                    }//End if
                }else if (nota > 7){
                    System.out.println("La nota ingresada es inválida.");
                    i = i - 1;
                    x = x-1;
                }//End If
                x = x+1;

            //Sacar Promedio
            }//End For
            for (int i = 0; i < fundamentosDeProgramacion.length; i++) {
                promedio[3] = promedio[3] + fundamentosDeProgramacion[i];
            }//End For

            //Mostrar Promedio
            System.out.println("La nota final en Fundamentos de Programación es " + promedio[3]);
            break;

            //Introducción a las TI
            case 5:
            //Ingreso de Notas
            x = 1;
            for (int i = 0; i < introduccionALasTi.length; i++) {
                System.out.print("Ingrese nota de Introducción a las TI " + x + " de " + introduccionALasTi.length + ": ");
                nota = read.nextDouble();
                if(nota >= 1 && nota <= 7){
                    if(i == 0){
                        introduccionALasTi[i] = nota * quincePorciento;
                    }else if(i == 1){
                        introduccionALasTi[i] = nota * veintePorciento;
                    }else if(i == 2){
                        introduccionALasTi[i] = nota * veintePorciento;
                    }else if(i == 3){
                        introduccionALasTi[i] = nota * veinticincoPorciento;
                    }else if(i == 4){
                        introduccionALasTi[i] = nota * veintePorciento;
                    }//End if
                }else if (nota > 7){
                    System.out.println("La nota ingresada es inválida.");
                    i = i - 1;
                    x = x-1;
                }//End If
                x = x+1;

            //Sacar Promedio
            }//End For
            for (int i = 0; i < introduccionALasTi.length; i++) {
                promedio[4] = promedio[4] + introduccionALasTi[i];
            }//End For

            //Mostrar Promedio
            System.out.println("La nota final en Introducción a las TI es " + promedio[4]);
            break;
            
            //IT Essentials
            case 6:
            //Ingreso de Notas
            x = 1;
            for (int i = 0; i < itEssentials.length; i++) {
                System.out.print("Ingrese nota de IT Essentials " + x + " de " + itEssentials.length + ": ");
                nota = read.nextDouble();
                if(nota >= 1 && nota <= 7){
                    if(i == 0){
                        itEssentials[i] = nota * veintePorciento;
                    }else if(i == 1){
                        itEssentials[i] = nota * quincePorciento;
                    }else if(i == 2){
                        itEssentials[i] = nota * veintePorciento;
                    }else if(i == 3){
                        itEssentials[i] = nota * veinticincoPorciento;
                    }else if(i == 4){
                        itEssentials[i] = nota * veintePorciento;
                    }//End if
                }else if (nota > 7){
                    System.out.println("La nota ingresada es inválida.");
                    i = i - 1;
                    x = x-1;
                }//End If
                x = x+1;

            //Sacar Promedio
            }//End For
            for (int i = 0; i < itEssentials.length; i++) {
                promedio[5] = promedio[5] + itEssentials[i];
            }//End For

            //Mostrar Promedio
            System.out.println("La nota final en IT Essentials es " + promedio[5]);
            break;
        }//End Switch
    }
    
}
