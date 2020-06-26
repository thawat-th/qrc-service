package com.github.gdl.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class QrcDto {

    @Size(max = 16)
    @ApiModelProperty(position = 1)
    private String seller;

    @Size(max = 20)
    @ApiModelProperty(position = 2)
    private String referenceNo1;

    @Size(max = 20)
    @ApiModelProperty(position = 3)
    private String referenceNo2;

    @Size(max = 10)
    @ApiModelProperty(position = 4)
    private String totalAmount;

    @Size(max = 1)
    @ApiModelProperty(position = 5)
    private String transactionType;

    @Size(max = 8)
    @ApiModelProperty(position = 6)
    private String dueDate;

    @Size(max = 10)
    @ApiModelProperty(position = 7)
    private String quantity;

    @Size(max = 10)
    @ApiModelProperty(position = 8)
    private String salesAmount;

    @Size(max = 4)
    @ApiModelProperty(position = 9)
    private String vatRate;

    @Size(max = 10)
    @ApiModelProperty(position = 10)
    private String vatAmount;

    @Size(max = 5)
    @ApiModelProperty(position = 11)
    private String sellerVatBranchId;

    @Size(max = 13)
    @ApiModelProperty(position = 12)
    private String buyerTaxId;

    @Size(max = 5)
    @ApiModelProperty(position = 13)
    private String buyerVatBranchId;

    @Size(max = 140)
    @ApiModelProperty(position = 14)
    private String buyerName;

    @Size(max = 20)
    @ApiModelProperty(position = 15)
    private String referenceNo3;

    @Size(max = 30)
    @ApiModelProperty(position = 16)
    private String proxyId;

    @Size(max = 12)
    @ApiModelProperty(position = 17)
    private String proxyType;

    @Size(max = 10)
    @ApiModelProperty(position = 18)
    private String netAmount;

    @Size(max = 3)
    @ApiModelProperty(position = 19)
    private String typeOfIncome;

    @Size(max = 4)
    @ApiModelProperty(position = 20)
    private String withholdingTaxRate;

    @Size(max = 10)
    @ApiModelProperty(position = 21)
    private String withholdingTaxAmount;

    @Size(max = 1)
    @ApiModelProperty(position = 22)
    private String withholdingTaxConditions;

    @ApiModelProperty(position = 23)
    private QrBitMatrixDto matrix;
}
