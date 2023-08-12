package Ejercicio02;

public class ConversorMonedas {
    private double tasaDolarEuro;
    private double tasaPesoDolar;
    private double tasaBolivarDolar;

  
    public ConversorMonedas(double tasaDolarEuro, double tasaPesoDolar, double tasaBolivarDolar) {
        this.tasaDolarEuro = tasaDolarEuro;
        this.tasaPesoDolar = tasaPesoDolar;
        this.tasaBolivarDolar = tasaBolivarDolar;
    }

    public double convertirDolarAEuro(double cantidadDolares) {
        return cantidadDolares * tasaDolarEuro;
    }

    public double convertirPesoADolar(double cantidadPesos) {
        return cantidadPesos / tasaPesoDolar;
    }

    public double convertirDolarAPeso(double cantidadDolares, double tasaDolarPeso) {
        return cantidadDolares * tasaDolarPeso;
    }

    public double convertirBolivarADolar(double cantidadBolivares) {
        return cantidadBolivares * tasaBolivarDolar;
    }

    public double convertirBolivarAEuro(double cantidadBolivares) {
        double dolares = convertirBolivarADolar(cantidadBolivares);
        return convertirDolarAEuro(dolares);
    }
    
    public double convertirPesoAEuro(double cantidadPesos) {
        double dolares = convertirPesoADolar(cantidadPesos);
        return convertirDolarAEuro(dolares);
    }

    public double convertirDolarAPeso(double cantidad) {
      return 0;
    }

}

