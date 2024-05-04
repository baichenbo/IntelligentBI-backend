package com.bcb.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcb.example.model.entity.Chart;
import com.bcb.example.service.ChartService;
import com.bcb.example.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
 * 图表服务实现
 *
 * @author bcb
 */
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
        implements ChartService {

}




