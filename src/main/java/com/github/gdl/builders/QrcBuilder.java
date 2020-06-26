package com.github.gdl.builders;

import com.github.gdl.dto.QrcDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QrcBuilder {
    private QrcDto qrc = new QrcDto();

    public QrcBuilder(QrcDto qrc) {
        this.qrc = qrc;
    }

    public QrcBuilder() {
    }

    public Qrc build() {
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

        log.info(builder.toString());
        return new Qrc(builder.toString());
    }

    public QrcBuilder seller(String seller) {
        this.qrc.setSeller(seller);
        return this;
    }

    public QrcBuilder referenceNo1(String referenceNo1) {
        this.qrc.setReferenceNo1(referenceNo1);
        return this;
    }

    public QrcBuilder referenceNo2(String referenceNo2) {
        this.qrc.setReferenceNo2(referenceNo2);
        return this;
    }

    public QrcBuilder totalAmount(String totalAmount) {
        this.qrc.setTotalAmount(totalAmount);
        return this;
    }

    public QrcBuilder transactionType(String transactionType) {
        this.qrc.setTransactionType(transactionType);
        return this;
    }

    public QrcBuilder dueDate(String dueDate) {
        this.qrc.setDueDate(dueDate);
        return this;
    }

    public QrcBuilder quantity(String quantity) {
        this.qrc.setQuantity(quantity);
        return this;
    }

    public QrcBuilder salesAmount(String salesAmount) {
        this.qrc.setSalesAmount(salesAmount);
        return this;
    }

    public QrcBuilder vatRate(String vatRate) {
        this.qrc.setVatRate(vatRate);
        return this;
    }

    public QrcBuilder vatAmount(String vatAmount) {
        this.qrc.setVatAmount(vatAmount);
        return this;
    }

    public QrcBuilder sellerVatBranchId(String sellerVatBranchId) {
        this.qrc.setSellerVatBranchId(sellerVatBranchId);
        return this;
    }

    public QrcBuilder buyerTaxId(String buyerTaxId) {
        this.qrc.setBuyerTaxId(buyerTaxId);
        return this;
    }

    public QrcBuilder buyerVatBranchId(String buyerVatBranchId) {
        this.qrc.setBuyerVatBranchId(buyerVatBranchId);
        return this;
    }

    public QrcBuilder buyerName(String buyerName) {
        this.qrc.setBuyerName(buyerName);
        return this;
    }

    public QrcBuilder referenceNo3(String referenceNo3) {
        this.qrc.setReferenceNo3(referenceNo3);
        return this;
    }

    public QrcBuilder proxyId(String proxyId) {
        this.qrc.setProxyId(proxyId);
        return this;
    }

    public QrcBuilder proxyType(String proxyType) {
        this.qrc.setProxyType(proxyType);
        return this;
    }

    public QrcBuilder netAmount(String netAmount) {
        this.qrc.setNetAmount(netAmount);
        return this;
    }

    public QrcBuilder typeOfIncome(String typeOfIncome) {
        this.qrc.setTypeOfIncome(typeOfIncome);
        return this;
    }

    public QrcBuilder withholdingTaxRate(String withholdingTaxRate) {
        this.qrc.setWithholdingTaxRate(withholdingTaxRate);
        return this;
    }

    public QrcBuilder withholdingTaxAmount(String withholdingTaxAmount) {
        this.qrc.setWithholdingTaxAmount(withholdingTaxAmount);
        return this;
    }

    public QrcBuilder withholdingTaxConditions(String withholdingTaxConditions) {
        this.qrc.setWithholdingTaxConditions(withholdingTaxConditions);
        return this;
    }

}
