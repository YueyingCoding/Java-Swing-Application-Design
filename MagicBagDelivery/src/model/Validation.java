/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author evelyn
 */
public class Validation {
    public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isName(String input) {
		for (int i = input.length(); --i >= 0;) {
			if (!Character.isLetter(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static boolean isDouble(String input) {
		try {
			Double.parseDouble(input);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
        public  static boolean isZipcode(String input) {
        String bigStr;
        try {
            int length = input.length();
            bigStr = new BigDecimal(input).toString();
            if (length == 5) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        } 

    public static boolean isPhone(String input) {
        String bigStr;
        try {
            int length = input.length();
            bigStr = new BigDecimal(input).toString();
            if (length == 10) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
      public static boolean  isEmail(String input){
        try{
            int k = input.indexOf('@');
            if(k>0)
            return true;
        else 
                return false;
        }
        catch(Exception e){
            return false;
        }
    }
}