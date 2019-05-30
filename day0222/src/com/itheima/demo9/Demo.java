package com.itheima.demo9;

/**
 * @author wz
 * @create 2019-02-22 11:29
 */
public class Demo {
    public static void main(String[] args) {

//        Car Q7 = getCar(()->new Car());
        Car Q7 = getCar(Car::new);
        Q7.setBrand("奥迪");
    }
    public static Car getCar(BeanFactory<Car> factory){
        return factory.getBean();
    }

}
