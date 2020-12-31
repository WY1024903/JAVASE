package user;

import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-06
 * Time: 16:11
 */
public abstract class User {
    protected String name;
    protected IOperation[] iOperations;
    public User(String name){
      this.name=name;
    }
    public abstract int menue();
    public IOperation doOperation(int choice) {
        return this.iOperations[choice];
    }
}
