#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.service.impl;

import ${package}.${rootArtifactId}.service.DemoService;
import ${package}.${rootArtifactId}.repository.mysql.domain.DemoDO;
import ${package}.${rootArtifactId}.entity.response.dto.DemoDTO;
import ${package}.${rootArtifactId}.repository.mysql.mybatis.mapper.DemoMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author zzq
 * @date 2022/10/31 17:48
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;
    @Override
    public DemoDTO byName(String name) {
        DemoDO demoDO = new DemoDO();
        demoDO.setName(name);
        List<DemoDO> list = demoMapper.select(demoDO);
        if (!CollectionUtils.isEmpty(list)) {
            DemoDTO demoDTO = new DemoDTO();
            DemoDO one = list.get(0);
            BeanUtils.copyProperties(one, demoDTO);
            return demoDTO;
        }
        return null;
    }
}
