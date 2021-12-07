package com.example.demo.job;

import com.example.demo.job.enums.ReportStatusEnum;
import com.example.demo.job.order.ReportOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Component
public class AutoReportTask {

    /**
     * 一分钟执行一次
     */
    @Scheduled(cron = "0 0/1 * * * ?")
    public void reportTask() {
        log.info("上报任务开始，在 {}", LocalDateTime.now());
        try {
            List<String> data = this.statusData(ReportStatusEnum.WAIT.getCode());
            ReportOrder order = new ReportOrder();
            order.setIssueList(data);


        } catch (Exception ex) {
            log.error("上报任务异常，原因 {}", ex.getMessage());
        }
    }

    /**
     * 模拟某个状态下的数据
     */
    private List<String> statusData(String status) {
        List<String> list = new ArrayList<>();
        if (status.equals(ReportStatusEnum.WAIT.getCode())) {
            list.add("one");
            list.add("two");
        }
        return list;
    }
}
