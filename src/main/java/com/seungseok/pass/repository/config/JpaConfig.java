package repository.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // 시간에 대해서 자동으로 값을 넣어주는 ?
@Configuration
public class JpaConfig {
}
