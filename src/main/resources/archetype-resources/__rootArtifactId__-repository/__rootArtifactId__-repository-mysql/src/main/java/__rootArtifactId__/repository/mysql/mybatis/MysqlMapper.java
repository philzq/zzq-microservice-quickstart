#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.repository.mysql.mybatis;

import tk.mybatis.mapper.common.BaseMapper;

/**
 * @author zzq
 */
public interface MysqlMapper<T> extends BaseMapper<T> {
}
