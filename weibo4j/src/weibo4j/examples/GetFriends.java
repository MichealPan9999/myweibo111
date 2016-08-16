package weibo4j.examples;

import java.util.List;

import weibo4j.Weibo;
import weibo4j.User;

public class GetFriends {

	    /**
	     * Usage: java -DWeibo4j.oauth.consumerKey=[consumer key] -DWeibo4j.oauth.consumerSecret=[consumer secret] Weibo4j.examples.GetFriends [accessToken] [accessSecret]
	     * @param args message
	     */
	    public static void main(String[] args) {
	        try {
	        	System.setProperty("weibo4j.oauth.consumerKey", Weibo.CONSUMER_KEY);
	        	System.setProperty("weibo4j.oauth.consumerSecret", Weibo.CONSUMER_SECRET);
	        	
	            Weibo weibo = new Weibo();
	            
	            weibo.setToken(args[0], args[1]);
	  
				 try {
                        int cursor;
                        cursor=5;
						List<User> list= weibo.getFriendsStatuses(cursor);
						for(User u:list){
							System.out.println(u.getScreenName()+":"+u.getStatusText());
						}
			
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	            System.exit(0);
	        } catch (Exception ioe) {
	            System.out.println("Failed to read the system input.");
	            System.exit( -1);
	        }
	    }
}
