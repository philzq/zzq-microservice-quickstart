#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.facade;

import ${package}.${rootArtifactId}.entity.response.dto.DemoDTO;
import ${package}.${rootArtifactId}.entity.request.SearchDemoParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zzq
 * @date 2022/12/9 11:27
 */
@FeignClient(name = "demo-api")
public interface DemoFacade {
}
