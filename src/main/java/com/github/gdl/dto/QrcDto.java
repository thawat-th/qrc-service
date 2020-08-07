package com.github.gdl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QrcDto {

    @Size(max = 16)
    private String seller;

    @Size(max = 20)
    private String referenceNo1;

    @Size(max = 20)
    private String referenceNo2;

    @Size(max = 10)
    private String totalAmount;

    @Size(max = 1)
    private String transactionType;

    @Size(max = 8)
    private String dueDate;

    @Size(max = 10)
    private String quantity;

    @Size(max = 10)
    private String salesAmount;

    @Size(max = 4)
    private String vatRate;

    @Size(max = 10)
    private String vatAmount;

    @Size(max = 5)
    private String sellerVatBranchId;

    @Size(max = 13)
    private String buyerTaxId;

    @Size(max = 5)
    private String buyerVatBranchId;

    @Size(max = 140)
    private String buyerName;

    @Size(max = 20)
    private String referenceNo3;

    @Size(max = 30)
    private String proxyId;

    @Size(max = 12)
    private String proxyType;

    @Size(max = 10)
    private String netAmount;

    @Size(max = 3)
    private String typeOfIncome;

    @Size(max = 4)
    private String withholdingTaxRate;

    @Size(max = 10)
    private String withholdingTaxAmount;

    @Size(max = 1)
    private String withholdingTaxConditions;

    private QrBitMatrixDto matrix;
}
