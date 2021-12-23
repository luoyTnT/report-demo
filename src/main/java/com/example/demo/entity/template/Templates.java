package com.example.demo.entity.template;

import lombok.Data;

import java.util.List;

/**
 * 模板
 */
@Data
public class Templates {

    private List<LendingAgency> lendingAgencies;

    private List<CustomerBaseInfo> customerBaseInfos;

    private List<RzContractBaseInfo> rzContractBaseInfos;

    private List<FrzContractBaseInfo> frzContractBaseInfos;

    private List<ContractShare> contractShares;

    private List<ContractClearing> contractClearings;

    private List<ContractCompen> contractCompens;

    private List<ContractRecovery> contractRecoveries;

}
