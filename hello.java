class Person { //定义一个类
	String name;
	int age;
	public void info(){
		System.out.println("name="+name+"、age="+age);
	}
}

//声明并实例化对象
	//类名称 对象名称=new类名称();
	//分步进行对象的实例化
		//声明对象：类名称 对象名称=null;
		//实例化对象：对象名称=new 类名称();

//new:开辟内存
//所谓的性能调优，调整的就是内存问题

public class TestDemo{
	public static void main(String args[]){
		Person per=new Person();//实例化了一个per对象
		per.name="张三";  //设置对象中的属性
		per.age=18;
		per.info();//调用类中的方法
		
		}
	}


//对象的产生分析
	//引用数据类型
		//数组、类、接口
//堆内存空间：保存真正的数据，保存对象的属性信息
//栈内存空间：保存堆内存的地址，对堆内存的操作权，保存对象名称

public class TestDemo{
	public static void main(String args[]){
		Person per =null;声明一个新的对象
		per=new Person();//实例化了一个per对象
		per.name="张三";  //设置对象中的属性
		per.age=18;
		per.info();//调用类中的方法
		
		}
	}

//NullPointerException 错误  为对象未实例化
