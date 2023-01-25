package nopCommerce.stepDefinitions;

import java.util.HashMap;
import java.util.Map;

public class TextContext {

    public DataContext dataContext;

    public TextContext()  {
        dataContext = new DataContext();
    }


    public DataContext getDataContext() {
        return dataContext;
    }
}
