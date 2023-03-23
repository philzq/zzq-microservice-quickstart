#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.repository.elasticsearch;

import ${package}.${rootArtifactId}.repository.elasticsearch.domain.DemoEsDO;
import org.springframework.stereotype.Repository;

/**
 * @author ${author}
 */
@Repository
public interface DemoElasticsearchRepository extends BaseElasticsearchRepository<DemoEsDO> {
}