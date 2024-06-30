package com.mycompany.ketoan.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class PriceUtils {
	
	public static String convertToVND(BigDecimal price) {
		if (price == null) return "";
		DecimalFormatSymbols instance = DecimalFormatSymbols.getInstance(Locale.getDefault());
		DecimalFormat formatter = new DecimalFormat("#,###.##đ", instance);
		return formatter.format(price);
	}
	
	public static BigDecimal VNDconvertToPrice(String s) {
            if(s.contains("đ")) s = s.substring(0, s.length() - 1);
            s = s.replaceAll(",", "");
            return new BigDecimal(s);
	}
}
