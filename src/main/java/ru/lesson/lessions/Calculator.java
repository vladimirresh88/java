package  ru.lesson.lessions;
public class Calculator {

	public int result;
	
	public int calc(int f){
	return result + f; 
	}
	
	public void add(int ... params){
		for (Integer param : params){
			this.result += param;
		}
	}

	/**
	 * Вычисление деления
	 * @param args входящие аргументы
	 * @throws UserExeption исключение
	 */
	public  void div(int ... args) throws  UserExeption {
		if(args.length >0) {
			this.result = args[0];
			for (int arg : args)
				if (arg == 0 )
					throw new IllegalArgumentException("Vvel 0 !!!!!!!!!!");
				this.result = args[0]/args[1];
		} else {
			throw  new UserExeption("You shuld enteer args");
		}
	}
	
}