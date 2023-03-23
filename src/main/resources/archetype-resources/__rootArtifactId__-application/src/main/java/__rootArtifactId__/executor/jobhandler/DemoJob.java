#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.executor.jobhandler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author zzq
 * @date 2022/11/24 10:42
 */
@Component
public class DemoJob {
    private static Logger logger = LoggerFactory.getLogger(DemoJob.class);

    @XxlJob(value = "verboseJobHandler")
    public void verboseJobHandler() {
        XxlJobHelper.log("Just execute a verbose job--{}", new Date());
    }

    @XxlJob(value = "timestampJobHandler")
    public void timestampJobHandler() {
        XxlJobHelper.log("print current time--{}", new Date());
    }
}
