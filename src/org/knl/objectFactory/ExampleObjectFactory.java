package org.knl.objectFactory;

import java.util.List;
import java.util.Properties;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

/**
 * 创建对象扩展类
 * 
 * @author yanglikai
 * 
 */
public class ExampleObjectFactory extends DefaultObjectFactory {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public Object create(Class type) {
		return super.create(type);
	}

	public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes,
			List<Object> constructorArgs) {
		return super.create(type, constructorArgTypes, constructorArgs);
	}

	public void setProperties(Properties properties) {
		super.setProperties(properties);
	}
}
