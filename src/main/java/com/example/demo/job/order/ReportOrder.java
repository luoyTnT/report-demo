package com.example.demo.job.order;

import lombok.Data;

import java.util.List;

@Data
public class ReportOrder {

    /**
     * 上报期次
     */
    List<String> issueList;

}
