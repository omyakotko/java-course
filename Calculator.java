/*
	Класс реализующий калькулятор
*/
public class Calculator{

/*
	Результат вычисления
*/
private int result;

/*
	Суммируем аргументы
	@params params Аргументы суммирования
*/
public void add(int ... params) {
	for(Integer param: params) {
		this.result +=param;
	}
}

/*
	Получить результат
*/
public int getResult() {
	return this.result;
}

/*
	Очистить результат
*/
public void cleanResult() {
	this.result = 0;
}

}