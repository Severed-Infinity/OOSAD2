package org.week2;

public class CartItem {

	public CartItem() {
		// TODO - implement CartItem.CartItem
		throw new UnsupportedOperationException();
	}

	public CartItem(short id, float price, float tax){
		itemid = id;
		itemPrice = price;
		itemTaxBand = tax;
	}

	public short getItemid() {
		return this.itemid;
	}

	public void setItemid(short itemid) {
		this.itemid = itemid;
	}

	public float getItemPrice() {
		return this.itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	private short itemid = 0;
	private float itemPrice = 0;
	private float itemTaxBand = 0;

}
