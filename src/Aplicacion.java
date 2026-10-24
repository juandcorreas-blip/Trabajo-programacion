import java.time.LocalDate;

public class Aplicacion {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("AutoRent", "Armenia, Quindío");


        Turista turista = new Turista("John Smith", "john@mail.com", "P123456", "VISA-001");
        Residente residente = new Residente("Ana Gómez", "ana@mail.com", "1094000000", "Calle 10 # 5-20");
        empresa.getListEmpresaCliente().add(turista);
        empresa.getListEmpresaCliente().add(residente);


        Automovil automovil = new Automovil("ABC123", "Mazda", "3", 2022, EstadoVehiculo.BUENO, 4);
        Motocicleta motocicleta = new Motocicleta("XYZ12A", "Yamaha", "FZ", 2021, EstadoVehiculo.BUENO, 150);
        Camioneta camioneta = new Camioneta("DEF456", "Toyota", "Hilux", 2020, EstadoVehiculo.MALO, 1000);
        empresa.getListEmpresaVehiculo().add(automovil);
        empresa.getListEmpresaVehiculo().add(motocicleta);
        empresa.getListEmpresaVehiculo().add(camioneta);


        System.out.println("---- EMPRESA " + empresa.getNombre() + " - " + empresa.getCiudad() + " ----");

        System.out.println();
        System.out.println("---- TURISTA ----");
        System.out.println("Nombre: " + turista.getNombre());
        System.out.println("Correo: " + turista.getCorreo());
        System.out.println("Documento: " + turista.getDocumentoIdentidad());
        System.out.println("Visa: " + turista.getVisa());

        System.out.println();
        System.out.println("---- RESIDENTE ----");
        System.out.println("Nombre: " + residente.getNombre());
        System.out.println("Correo: " + residente.getCorreo());
        System.out.println("Documento: " + residente.getDocumentoIdentidad());
        System.out.println("Dirección: " + residente.getDireccionResidencia());

        System.out.println();
        System.out.println("---- AUTOMOVIL ----");
        System.out.println("Placa: " + automovil.getPlaca());
        System.out.println("Marca: " + automovil.getMarca());
        System.out.println("Modelo: " + automovil.getModelo());
        System.out.println("Año de fabricación: " + automovil.getAnioFabricacion());
        System.out.println("Estado: " + automovil.getEstado());
        System.out.println("Número de puertas: " + automovil.getNumeroPuertas());

        System.out.println();
        System.out.println("---- MOTOCICLETA ----");
        System.out.println("Placa: " + motocicleta.getPlaca());
        System.out.println("Marca: " + motocicleta.getMarca());
        System.out.println("Modelo: " + motocicleta.getModelo());
        System.out.println("Año de fabricación: " + motocicleta.getAnioFabricacion());
        System.out.println("Estado: " + motocicleta.getEstado());
        System.out.println("Cilindraje: " + motocicleta.getCilindraje());

        System.out.println();
        System.out.println("---- CAMIONETA ----");
        System.out.println("Placa: " + camioneta.getPlaca());
        System.out.println("Marca: " + camioneta.getMarca());
        System.out.println("Modelo: " + camioneta.getModelo());
        System.out.println("Año de fabricación: " + camioneta.getAnioFabricacion());
        System.out.println("Estado: " + camioneta.getEstado());
        System.out.println("Capacidad de carga (kg): " + camioneta.getCapacidadCargaKg());


        Alquiler alquiler1 = new Alquiler("A001", LocalDate.of(2026, 10, 20), 3, turista, automovil);
        Alquiler alquiler2 = new Alquiler("A002", LocalDate.of(2026, 10, 22), 5, residente, motocicleta);
        Alquiler alquiler3 = new Alquiler("A003", LocalDate.of(2026, 10, 23), 2, turista, camioneta);
        empresa.getListEmpresaAlquiler().add(alquiler1);
        empresa.getListEmpresaAlquiler().add(alquiler2);
        empresa.getListEmpresaAlquiler().add(alquiler3);


        System.out.println();
        System.out.println("---- ALQUILER 1 ----");
        System.out.println("Código: " + alquiler1.getCodigo());
        System.out.println("Fecha: " + alquiler1.getFecha());
        System.out.println("Cliente: " + alquiler1.getCliente().getNombre());
        System.out.println("Vehículo: " + alquiler1.getVehiculo().getPlaca());
        System.out.println("Días contratados: " + alquiler1.getDiasContratados());
        System.out.println("Costo total: $" + alquiler1.calcularCostoTotal());

        System.out.println();
        System.out.println("---- ALQUILER 2 ----");
        System.out.println("Código: " + alquiler2.getCodigo());
        System.out.println("Fecha: " + alquiler2.getFecha());
        System.out.println("Cliente: " + alquiler2.getCliente().getNombre());
        System.out.println("Vehículo: " + alquiler2.getVehiculo().getPlaca());
        System.out.println("Días contratados: " + alquiler2.getDiasContratados());
        System.out.println("Costo total: $" + alquiler2.calcularCostoTotal());

        System.out.println();
        System.out.println("---- ALQUILER 3 ----");
        System.out.println("Código: " + alquiler3.getCodigo());
        System.out.println("Fecha: " + alquiler3.getFecha());
        System.out.println("Cliente: " + alquiler3.getCliente().getNombre());
        System.out.println("Vehículo: " + alquiler3.getVehiculo().getPlaca());
        System.out.println("Días contratados: " + alquiler3.getDiasContratados());
        System.out.println("Costo total: $" + alquiler3.calcularCostoTotal());
    }
}