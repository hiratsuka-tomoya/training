package sample;

public class Branch {

	int code;
	String name;
	long amount;

	Branch(){
		name = new String();
	}

	void setCode(int code) {
		this.code = code;
	}

	void setName(String name){
		this.name = name;
	}

	void addAmount(long amount){
		this.amount += amount;
	}

	int getCode(){
		return code;
	}

	String getName(){
		return name;
	}

	long getAmount() {
		return amount;
	}

}
