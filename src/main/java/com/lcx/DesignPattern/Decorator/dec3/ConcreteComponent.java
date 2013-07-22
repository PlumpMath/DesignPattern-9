package com.lcx.DesignPattern.Decorator.dec3;

/**
 * 具体的组件 <br/>
 * 比如被装饰的人、房子
 * @author 李晨星
 * @date 2013-7-22 下午3:38:39
 */
public class ConcreteComponent extends Component {

	@Override
	public void operation() {
		System.out.println("具体对象的操作");
	}

}
