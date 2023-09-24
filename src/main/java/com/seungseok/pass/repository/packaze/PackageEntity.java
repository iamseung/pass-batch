package repository.packaze;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import repository.BaseEntity;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity // 엔티티임을 선언
@Table(name = "package")
    public class PackageEntity extends BaseEntity {
    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // pk 값을 위한 자동 생성 전략을 생성
    private Integer packageSeq;

    private String packageName;
    private Integer count;
    private Integer period;
}
