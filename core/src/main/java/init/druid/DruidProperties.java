package init.druid;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@RefreshScope
@ConfigurationProperties(prefix = "druid")
@Data
public class DruidProperties {
    /* Druid开关 */
    private Map<String,String> initParams;
}
