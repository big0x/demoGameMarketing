package demoGameMarketing.entities.concretes;

import java.time.LocalDate;

import demoGameMarketing.entities.abstracts.Entity;

public class Promotion implements Entity {
	private int id;
	private String promotionName;
	private LocalDate startDateOfPromotion;
	private LocalDate endDateOfPromotion;
	private double amountOfDiscount;
	public Promotion() {
		super();
	}
	public Promotion(int id, String promotionName, LocalDate startDateOfPromotion, LocalDate endDateOfPromotion,
			double amountOfDiscount) {
		super();
		this.id = id;
		this.promotionName = promotionName;
		this.startDateOfPromotion = startDateOfPromotion;
		this.endDateOfPromotion = endDateOfPromotion;
		this.amountOfDiscount = amountOfDiscount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPromotionName() {
		return promotionName;
	}
	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}
	public LocalDate getStartDateOfPromotion() {
		return startDateOfPromotion;
	}
	public void setStartDateOfPromotion(LocalDate startDateOfPromotion) {
		this.startDateOfPromotion = startDateOfPromotion;
	}
	public LocalDate getEndDateOfPromotion() {
		return endDateOfPromotion;
	}
	public void setEndDateOfPromotion(LocalDate endDateOfPromotion) {
		this.endDateOfPromotion = endDateOfPromotion;
	}
	public double getAmountOfDiscount() {
		return amountOfDiscount;
	}
	public void setAmountOfDiscount(double amountOfDiscount) {
		this.amountOfDiscount = amountOfDiscount;
	}

}
