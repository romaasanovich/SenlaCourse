public class Kitchener {
	public String name;
	public boolean isCook;
	public Dish dish;
	public Table table;
	
	Kitchener(String name){
		this.name=name;
		this.isCook=false;
	}
	
	public void getOrder(Dish dish,Table table) {
		this.dish=dish;
		this.table=table;
		isCook=true;
		}
}
