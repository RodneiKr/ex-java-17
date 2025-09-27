package record;

sealed interface Shape permits Circle, Retangle {
    Double getArea();
}
