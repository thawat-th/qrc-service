package com.github.gdl.dto;

import lombok.*;

@Getter
@Setter
public class QrBitMatrixDto {
    private int width;
    private int height;

    public QrBitMatrixDto(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
