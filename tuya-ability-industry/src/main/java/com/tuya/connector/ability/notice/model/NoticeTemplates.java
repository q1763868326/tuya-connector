package com.tuya.connector.ability.notice.model;

import lombok.Data;

import java.util.List;

/**
 * <p> TODO
 *
 * @author 哲也
 * @since 2021/6/23
 */
@Data
public abstract class NoticeTemplates {

    private long total;

    private List<NoticeTemplate> list;

    private boolean hasMore;

    @Data
    static class NoticeTemplate {
        private String templateId;
        private String name;
        private String content;
        private int status;
    }
}
