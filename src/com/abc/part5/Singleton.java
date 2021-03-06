package com.abc.part5;

/**
 * @author mi
 */
public class Singleton {
    /**
     * 使用一个类变量来缓存曾经创建过的实例
     */
    private static Singleton instance;

    /**
     * 对构造器使用private修饰，隐藏该构造器
     */
    private Singleton() {

    }

    /**
     * 提供一个静态方法，用于返回Singleton实例
     * 该方法可以加入自定义控制，保证只产生一个Singleton对象
     *
     * @return Singleton对象
     */
    public static Singleton getInstance() {
        /**
         * 如果instance为null，则表明还不曾创建过Singleton对象
         * 如果instance不为null，则表明已经创建了Singleton对象，将不会重新创建新的实例
         */
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
