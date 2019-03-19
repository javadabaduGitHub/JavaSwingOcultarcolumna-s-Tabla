package model.dto;

/**
 * Javadabadu
 *
 *
 * @author https://javadabadu.com/blog
 * @see https://github.com/javadabaduGitHub
 *
 */
public class VehiculoDTO {
    private String placa;
    private String marca;
    private String color;

    public VehiculoDTO(String placa, String marca, String color) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
