3 categories

Creational Patterns
*Object creation mechanisms
2 sub types
*object creational patterns
*class creational patterns

Singleton pattern:
*only one instance of class allowed
*allow global point of access to the instance
*suppress the constructor by making it private
*declare attribute for that class inside, create instance for that and return it

Lazy instantiation:
class Singleton {
	public:
		static Singleton* getInstance() {
			if(instance == 0) {
				//acquire lock
				instance = new Singleton();
			}
			return instance;
		}	
	private:
		Singleton() {}	//private constructor
		static Singleton* instance;
}


Early instantiation:
class Singleton {
	static Singleton instance = new Singleton();
	Singleton() {}
	public:
		static Singleton getInstance() {
			return instance;
		}
}

Structural Patterns
*describe how classes and objects can be combined to form larger structures

Behavioral Patterns
*describes interaction between objects 