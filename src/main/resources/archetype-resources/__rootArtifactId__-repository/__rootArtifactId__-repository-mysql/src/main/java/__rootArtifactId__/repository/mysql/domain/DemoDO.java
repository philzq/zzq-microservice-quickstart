#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.repository.mysql.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.annotation.ColumnType;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author MBG(MyBatisGenerator)
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "demo")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class DemoDO {
    @Id
    @Column(name = "`id`")
    @ColumnType(jdbcType = JdbcType.BIGINT)
    private Long id;

    @Column(name = "`name`")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String name;
    //████████上面是自动生成的，改了会被覆盖，有需要可以添加到下面(不能用@Column,要加上@Transient)，此行不能删除████████
}