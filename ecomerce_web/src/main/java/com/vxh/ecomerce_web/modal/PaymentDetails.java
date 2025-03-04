package com.vxh.ecomerce_web.modal;

import com.vxh.ecomerce_web.domain.PaymentStatus;
import lombok.Data;

@Data
public class PaymentDetails {

    private String paymentId;
    private String momoPaymentLinkId;
    private String momoPaymentLinkReferenceId;
    private String momoPaymentLinkStatus;
    private String momoPaymentIdZWSP;
    private PaymentStatus status;


}
