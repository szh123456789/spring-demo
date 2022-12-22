package Bean;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {

    private Map<String, Object> beanMap = new ConcurrentHashMap<>();

    public Object getBeanByName(String beanName) {
        return beanMap.get(beanName);
    }

    public void setBeanMap(String beanName, Object bean){
        beanMap.put(beanName, bean);
    }
}
