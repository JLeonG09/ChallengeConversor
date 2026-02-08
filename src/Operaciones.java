public class Operaciones{
    private ConsultaMoneda consulta = new ConsultaMoneda();

    public double convertir(String base, String destino, double monto){
        Moneda datos = consulta.consultaMoneda(base);
        Double tasa = datos.conversion_rates().get(destino);

        if (tasa == null){
            throw new RuntimeException("Moneda destino no valida!");
        }
        return monto * tasa;
    }
}
