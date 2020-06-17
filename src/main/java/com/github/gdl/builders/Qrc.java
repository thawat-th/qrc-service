package com.github.gdl.builders;

import com.github.gdl.dto.QrcDto;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import lombok.*;

import java.awt.image.BufferedImage;

@Getter
@Setter
@AllArgsConstructor
public class Qrc {
    private String content;

    public BufferedImage writeToImage(int width, int height) throws WriterException {
        QRCodeWriter barcodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = barcodeWriter.encode(this.content, BarcodeFormat.QR_CODE, width, height);
        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }

}
