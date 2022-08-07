package com.citic.sign.model;

import java.io.Serializable;
import lombok.Data;

/**
 * PARA_CONTRACT_ACCT
 * @author 
 */
@Data
public class ParaContractExchKey implements Serializable {
    private String cMainRef;

    private String custAcNo;

    private String chgCustAcCcy;

    private static final long serialVersionUID = 1L;
}