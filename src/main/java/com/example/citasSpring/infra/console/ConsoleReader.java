package com.example.citasSpring.infra.console;

import com.example.citasSpring.domain.Cita;
import com.example.citasSpring.service.CitaService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleReader {
    CitaService citaService;
    SimpleDateFormat fechaFormateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.forLanguageTag("es_ES"));

    public ConsoleReader(CitaService citaService) {
        this.citaService = citaService;
    }

    public void init(){
        Scanner sc = new Scanner(System.in);
        int option = 1;
        String entradaConsola;
        while (option != 0){
            System.out.println("Menú por consola");
            System.out.println("1 - Registrar nueva cita");
            System.out.println("2 - Modificar una cita ");
            System.out.println("3 - Borrar una cita ");
            System.out.println("4 - Listar todas las citas");
            System.out.println("0 - Salir");
            System.out.println("Ingrese la acción a realizar: ");
            entradaConsola = sc.next();
            try{
                option = Integer.parseInt(entradaConsola);
            }catch (Exception e){
                System.out.println("Opción no válida, ingresa un número");
            }

            switch (option){
                case 0:
                    System.out.println("Hasta luego");
                    break;
                case 1:
                    System.out.println("Ingrese nombre");
                    String nombre = sc.next();
                    System.out.println("Ingrese apellido");
                    String apellido = sc.next();
                    System.out.println("Ingrese fecha (dd/MM/YYYY HH:mm:ss): ");
                    String fecha = sc.nextLine();

                    Date fechaCita;
                    try{
                        fechaCita = fechaFormateador.parse(sc.nextLine());
                        citaService.alta(new Cita(nombre,apellido,fechaCita));
                    } catch (ParseException e) {
                        System.out.println("El formato de fecha no es válido");
                    }
                    break;
                case 2:
                    //TODO Por desarrollar
                    break;
                case 3:
                    //TODO Por desarrollar
                    break;
                case 4:
                    List<Cita> citas = citaService.listar();
                    System.out.println("Listado de citas: ");
                    for(Cita cita: citas){
                        System.out.printf("Id %s, nombre: %s, apellidos: %s, fecha: %s", citas.indexOf(cita), cita.getNombre() , cita.getApellido() ,fechaFormateador.format(cita.getDate()));
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
