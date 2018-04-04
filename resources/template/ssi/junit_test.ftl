package ${package_path};

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.${project}.common.exception.BaseException;
import com.${project}.${class_name?uncap_first}.bean.${class_name};
import com.${project}.${class_name?uncap_first}.bean.${class_name}Search;
import com.${project}.${class_name?uncap_first}.service.spi.I${class_name}Service;

/**
 * ${class_name} JUnit Test<br/>
 * 带事务处理,默认为回滚(MySQL的InnoDB引擎)
 * @author ${author}
 * @date ${sysDate?date}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
@Transactional  
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class ${class_name}Test {
	@Autowired
	private I${class_name}Service ${class_name?uncap_first}Service;
	
	@Test
	public void find() {
		${class_name} s = ${class_name?uncap_first}Service.find(${class_name}.class, 1);
		System.out.println( s );
	}
	
	@Test
	public void queryAll() {
		List<${class_name}> list = ${class_name?uncap_first}Service.queryAll(${class_name}.class);
		System.out.println( list.size() );
	}
	
	@Test(expected = BaseException.class)
	//@Rollback(false)	//引擎:InnoDB
	public void add() {
		try {
			${class_name} entity = new ${class_name}();
			entity.setId(1);
			${class_name?uncap_first}Service.save(entity);
			System.out.println( entity );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void update() {
		${class_name} entity = new ${class_name}();
		entity.setId(1);
		${class_name?uncap_first}Service.update(entity);
	}
	
	@Test
	public void page() {
		${class_name}Search search = new ${class_name}Search();
		// search.setPageSize(5);
		search.setPageNo(1);
		// search.setName("s");
		List<${class_name}> list = ${class_name?uncap_first}Service.page(${class_name}.class, search);
		System.out.println(
				"第:"+search.getPageNo()+"页, " +
				"总页数:"+search.getTotalPages()+", " +
				"总记录:"+search.getTotalRecords());
		for (${class_name} s : list) {
			System.out.println(s);
		}
	}
	
	@Test 
	public void delete() {
		${class_name?uncap_first}Service.delete(${class_name}.class, 1);
		// ${class_name?uncap_first}Service.deleteByIds(${class_name}.class, new Object[]{3,5,9});
	}
	
}
