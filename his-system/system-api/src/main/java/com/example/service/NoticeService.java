package com.example.service;

import com.example.domain.Notice;
import com.example.dto.NoticeDto;
import com.example.vo.DataGridView;

/**
 * Author jianghao
 */

public interface NoticeService {
    /**
     * 分页查询
     */
    DataGridView listNoticePage(NoticeDto noticeDto);

    /**
     * 根据ID查询
     */
    Notice getOne(Long noticeId);

    /**
     * 添加
     */
    int addNotice(NoticeDto noticeDto);

    /**
     * 修改
     */
    int updateNotice(NoticeDto noticeDto);

    /**
     * 根据ID删除
     */
    int deleteNoticeByIds(Long[] noticeIds);

}

