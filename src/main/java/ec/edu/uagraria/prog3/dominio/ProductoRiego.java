package ec.edu.uagraria.prog3.dominio;

public sealed interface ProductoRiego permits Cultivo, TurnoRiego, Insumo { }
