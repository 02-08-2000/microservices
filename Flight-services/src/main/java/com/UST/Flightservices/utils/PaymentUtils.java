package com.UST.Flightservices.utils;

import com.UST.Flightservices.exception.InsufficentAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {
    private static Map<String ,Double> paymentmap=new HashMap<>();
    static {
        paymentmap.put("acc1",20001.00);
        paymentmap.put("acc2",30000.00);
        paymentmap.put("acc3",40000.00);
        paymentmap.put("acc4",50000.00);
        paymentmap.put("acc5",60000.00);
        paymentmap.put("acc6",70000.00);
        paymentmap.put("acc7",80000.00);

    }
    public static boolean validateCreditLimit(String accountNo, double paidamount) throws InsufficentAmountException {
        if(paidamount>paymentmap.get(accountNo)){
            throw new InsufficentAmountException("insufficent amount......");
        }else{
            return true;
        }

    }
}
