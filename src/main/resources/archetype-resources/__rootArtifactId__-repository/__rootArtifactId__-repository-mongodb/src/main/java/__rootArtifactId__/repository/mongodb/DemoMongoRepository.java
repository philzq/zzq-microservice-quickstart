#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.repository.mongodb;

import ${package}.${rootArtifactId}.repository.mongodb.domain.DemoMongoDO;
import org.springframework.stereotype.Repository;

/**
 * @author ${author}
 */
@Repository
public interface DemoMongoRepository extends BaseMongoRepository<DemoMongoDO> {
}