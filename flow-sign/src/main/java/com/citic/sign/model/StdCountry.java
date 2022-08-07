package com.citic.sign.model;

import java.io.Serializable;
import lombok.Data;

/**
 * PARA_CONTRACT_ACCT
 * @author 
 */
@Data
public class StdCountry extends StdCountryKey implements Serializable {
    private String custAcSub;

    private String cancelAcct;

    private String chgCustAcType;

    private static final long serialVersionUID = 1L;
}