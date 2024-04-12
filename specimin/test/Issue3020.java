enum SomeEnum {
    INSTANCE;
  
    void retrieveConstant() {
      Class<?> theClass = SomeEnum.class;
      Object unused = passThrough(theClass.getEnumConstants())[0];
    }
  
    <T> T passThrough(T t) {
      return t;
    }
  }