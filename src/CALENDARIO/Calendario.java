
package CALENDARIO;

/**
 *
 * @author Miguel
 */
    public class Calendario {
    int año;
    int mes;
    int dia;

    public Calendario(int dia, int mes, int año) {
        if (año > 0 && mes > 0 && mes <= 12 && dia > 0 && dia <= 31) {
            this.año = año;
            this.mes= mes;
            this.dia = dia;
        } else {
            System.out.println("FECHA INVALIDA");
        }
    }

    public void incrementarDia() {
        if (dia == 31) {
            if (mes == 12) {
                año++;
                mes = 1;
                dia = 1;
            } else {
                mes++;
                dia = 1;
            }
        } else {
            dia++;
        }
    }

    public void incrementarMes() {
        if (mes == 12) {
            año++;
            mes = 1;
        } else {
            mes++;
        }
    }

    public void incrementarAño(int cantidad) {
        año += cantidad;
    }

    public void mostrar() {
        System.out.println(dia + "/" + mes + "/" + año);
    }

    public boolean iguales(Calendario otraFecha) {
        return this.año == otraFecha.año && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
    }
}
    

