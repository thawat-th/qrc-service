package com.github.gdl.builders;

import com.github.gdl.dto.QrcDto;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import java.awt.image.BufferedImage;
import java.util.Hashtable;

@Slf4j
@Builder
@Data
public class QrcBuilder {
    private QrcDto qrc;
    private String content;
    private BufferedImage bufferedImage;

    public BufferedImage writeToImage() throws WriterException {
        Assert.notNull(this.qrc, "QRC must not be null");
        this.buildContent();
        return this.writeToImage(this.qrc.getMatrix().getWidth(), this.qrc.getMatrix().getWidth());
    }

    public BufferedImage writeToImage(final int width, final int height) throws WriterException {
        Assert.notNull(this.content, "QRC content must not be null");
        QRCodeWriter barcodeWriter = new QRCodeWriter();
        Hashtable<EncodeHintType, String> hints = new Hashtable<>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        BitMatrix bitMatrix = barcodeWriter.encode(this.content, BarcodeFormat.QR_CODE, width, height, hints);
        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }

    private void buildContent() {
        StringBuilder builder = new StringBuilder();
        builder.append(qrc.getSeller());
        builder.append("\n");
        builder.append(qrc.getReferenceNo1());
        builder.append("\n");
        builder.append(qrc.getReferenceNo2());
        builder.append("\n");
        builder.append(qrc.getTotalAmount());
        builder.append("\n");
        builder.append(qrc.getTransactionType());
        builder.append("\n");
        builder.append(qrc.getDueDate());
        builder.append("\n");
        builder.append(qrc.getQuantity());
        builder.append("\n");
        builder.append(qrc.getSalesAmount());
        builder.append("\n");
        builder.append(qrc.getVatRate());
        builder.append("\n");
        builder.append(qrc.getVatAmount());
        builder.append("\n");
        builder.append(qrc.getSellerVatBranchId());
        builder.append("\n");
        builder.append(qrc.getBuyerTaxId());
        builder.append("\n");
        builder.append(qrc.getBuyerVatBranchId());
        builder.append("\n");
        builder.append(qrc.getBuyerName());
        builder.append("\n");
        builder.append(qrc.getReferenceNo3());
        builder.append("\n");
        builder.append(qrc.getProxyId());
        builder.append("\n");
        builder.append(qrc.getProxyType());
        builder.append("\n");
        builder.append(qrc.getNetAmount());
        builder.append("\n");
        builder.append(qrc.getTypeOfIncome());
        builder.append("\n");
        builder.append(qrc.getWithholdingTaxRate());
        builder.append("\n");
        builder.append(qrc.getWithholdingTaxAmount());
        builder.append("\n");
        builder.append(qrc.getWithholdingTaxConditions());
        builder.append("\n");
        this.content = builder.toString();
    }

}
