#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${rootArtifactId}.application.controller;

import zzq.zzqsimpleframeworkcommon.entity.CommonRsp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ${author}
 * @date 2022/10/27 11:36
 */
@RequestMapping("demo")
@RestController
public class DemoController {
    @GetMapping
    public CommonRsp<String> greet(@RequestParam String name) {
        return CommonRsp.success("ok", "hello " + name);
    }
}
