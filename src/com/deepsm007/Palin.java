/**
 * 
 */
package com.deepsm007;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Deep Mistry
 * 
 *         This class checks whether an input string is palindrome or not.
 *
 */
public class Palin extends HttpServlet {

	private static final long serialVersionUID = -6153042195803461840L;
	private static String input;
	private static String result;

	/**
	 * This method performs the POST request and redirects it to GET method.
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	/**
	 * This method performs the GET request. The input from the browser is stored in
	 * the input string variable. The input is passed on to the boolean isPlaindrome
	 * method to check if the string is palindrome or not. The result is then used
	 * to forward the response back to the browser.
	 *
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		input = request.getParameter("palin");
		result = "The input string \"" + input + "\" is" + (isPalindrome(input) ? "" : " not") + " palindrome.\n";
		request.setAttribute("output", result);
		request.getRequestDispatcher("/").forward(request, response);
	}

	/**
	 * This method checks if the input string is palindrome or not. It ignores all
	 * the special characters, spacing and punctuations before checking the string.
	 * It return true or false.
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isPalindrome(String input) {
		StringBuilder sb = new StringBuilder();

		for (char c : input.toCharArray())
			if (Character.isLetter(c))
				sb.append(Character.toLowerCase(c));

		String str = sb.toString();
		int len = str.length();
		for (int i = 0; i < len / 2; i++)
			if (str.charAt(i) != str.charAt(len - 1 - i))
				return false;
		return true;
	}
}
