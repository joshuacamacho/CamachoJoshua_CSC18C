package assignment2;

public class Stack<T>{
	private T[] data;
	int pos;
	int capacity;
	public Stack(){
		capacity=1;
		data=(T[]) new Object[capacity];
		pos=-1;
	}
	public void add(T n){
		if(pos==capacity-1){
			capacity*=2;
			T[] ndata=(T[]) new Object[capacity];
			int p=0;
			for(T val: data){
				ndata[p]=val;
				p++;
			}
			data=ndata;
			pos++;
			data[pos]=n;
		}else{
		pos++;
		data[pos]=n;
		}
		
	}
	public T peek(){
		return data[pos];
	}
	public T pop(){
		T ret=data[pos];
		data[pos]=null;
		pos--;
		return ret;
	}
}
