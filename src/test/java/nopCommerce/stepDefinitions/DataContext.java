package nopCommerce.stepDefinitions;

import java.util.HashMap;
import java.util.Map;

public class DataContext {

    private Map<String, Object> dataContext;

    public DataContext()  {
        dataContext = new HashMap<String, Object>();
    }

    public void setContext(Context key, Object value) {
        dataContext.put(key.toString(), value);
    }

    public Object getDataContext(Context key) {
        return dataContext.get(key.toString());
    }
}
