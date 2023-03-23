#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.repository.mysql.config;

import ${package}.${rootArtifactId}.repository.mysql.mybatis.MysqlMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Mapperscan basePackages cannot include the supper mapper
 * @see MysqlMapper
 * @author zzq
 * @date 2022/10/31 18:30
 */
@MapperScan("${package}.${rootArtifactId}.repository.mysql.mybatis.mapper")
@Configuration
public class MybatisConfig {

    /**
     * fix : no mybatis mapper was found in '[xx.mapper]' package. pls check your configuration.
     */
    @Mapper
    public interface NoWarnMapper {}
}
