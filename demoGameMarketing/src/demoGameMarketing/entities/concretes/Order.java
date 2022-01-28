package demoGameMarketing.entities.concretes;

public class Order {

	private int id;
	private Game game;
	private User user;
	private Promotion promotion;
	private double discountedPrice;
	public Order() {
		super();
	}
	public Order(int id, Game game, User user, Promotion promotion, double discountedPrice) {
		super();
		this.id = id;
		this.game = game;
		this.user = user;
		this.promotion = promotion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Promotion getPromotion() {
		return promotion;
	}
	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
	public double getDiscountedPrice() {
		discountedPrice = game.getGamePrice() - promotion.getAmountOfDiscount() ;
		return discountedPrice;
	}
	
}
