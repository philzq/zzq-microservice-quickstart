#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.service;

import ${package}.${rootArtifactId}.entity.response.dto.DemoDTO;

/**
 * @author zzq
 * @date 2022/10/31 17:43
 */
public interface DemoService {
    /**
     * 测试使用
     * @param name
     * @return
     */
    DemoDTO byName(String name);
}
