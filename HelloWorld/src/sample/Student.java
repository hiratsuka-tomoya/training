package sample;

public class Student {
	// 年齢
	private int age;
	// 身長
	private int height;
	// 名前
	private String name;
	// 性別
	private char sex;
	// コンストラクタ
	public Student(String name, int age,  char sex, int height){
		this.age = age;
		this.height = height;
		this.name = name;
		this.sex = sex;
	}
	// 以下、ゲッターとセッター
	public int getAge(){ return age; }
	public void setAge(int age){ this.age = age; }
	public int getHeight() { return height; }
	public void setHeight(int height) { this.height = height; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public char getSex() { return sex; }
	public void setSex(char sex) { this.sex = sex; }
}
