package com.pododoserver.common.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@DynamicInsert
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseET {

    @Column(name = "delete_yn", nullable = false, length = 1)
    private String deleteYn = "N";

    @CreatedDate
    @Column(name = "reg_date", nullable = false, updatable = false)
    private LocalDateTime regDate = LocalDateTime.now();

    @Column(name = "reg_id", nullable = false)
    private Long regId;

    @LastModifiedDate
    @Column(name = "upd_date", nullable = false)
    private LocalDateTime updDate;

    @Column(name = "mod_id", nullable = false)
    private Long modId;

}