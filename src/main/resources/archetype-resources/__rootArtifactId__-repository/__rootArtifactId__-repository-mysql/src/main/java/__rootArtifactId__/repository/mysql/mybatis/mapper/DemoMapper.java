#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.repository.mysql.mybatis.mapper;

import ${package}.${rootArtifactId}.repository.mysql.domain.DemoDO;
import ${package}.${rootArtifactId}.repository.mysql.mybatis.MysqlMapper;
import org.springframework.stereotype.Repository;

/**
 * @author MBG(MyBatisGenerator)
 */
@Repository
public interface DemoMapper extends MysqlMapper<DemoDO> {
}