package com.tuya.connector.industry.ability.notice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@SuperBuilder
public class NoticeTemplates implements Serializable {
    static final long serialVersionUID = 1L;

    private long total;

    private List<NoticeTemplate> list;

    private boolean hasMore;

}
