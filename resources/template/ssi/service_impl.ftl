package ${package_path};

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.${project}.${class_name?uncap_first}.service.spi.I${class_name}Service;

/**
 * Service Implementation:${class_name}
 * @author ${author}
 * @date ${sysDate?date}
 */
@Service
@Transactional
public class ${class_name}ServiceImpl implements I${class_name}Service {
	
}
