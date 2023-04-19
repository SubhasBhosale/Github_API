package ecomm_flashcart_enum;
/**
 * This is the enum which consist of common tab names 
 * which are used to access easily and available in all the pages 
 * to avoid the spelling mistakes by the user while writing the script
 * @author Subhas bhosale
 *
 */
public enum CommonTabNamesUser 
{
	MYACCOUNT("My Account"),WISHLIST("Wishlist"),MYCART("My Cart"),LOGIN ("Login"),LOGOUT("Logout");
	private String Y;

	private CommonTabNamesUser(String Y)
	{
		this.Y=Y;
	}

	public String getTabName()
	{
		return Y;
	}
}
