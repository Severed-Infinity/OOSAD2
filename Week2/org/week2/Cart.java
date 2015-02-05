package org.week2;

import java.util.*;

public class Cart {

	public Cart() {
		for(short i = 0; i < 100; i++){
			cartItems.add(new CartItem(i, 10.50F, 3.45F));
		}
	}

	protected Collection<CartItem> cartItems;

}
