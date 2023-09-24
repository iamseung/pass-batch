package repository;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

// MappedSuperclass, 엔티티가 이 클래스를 상속하게 된다면 아래의 두개를 컬럼으로 인식을
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    // 엔티티가 생성됐을 때, 생성일 자동 생성
    @CreatedDate
    @Column(updatable = false, nullable = false)    // update & null 방지
    private LocalDateTime createdAt;
    // 변경할 때 update
    @LastModifiedDate
    private LocalDateTime modifiedAt;
}