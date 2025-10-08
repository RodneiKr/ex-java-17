package org.kr.exjava17.record;

sealed interface Shape permits Circle, Retangle {
    Double getArea();
}
