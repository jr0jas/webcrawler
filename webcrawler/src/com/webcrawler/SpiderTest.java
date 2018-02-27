package com.webcrawler;

public class SpiderTest {
	/**
	 * This is our test. It creates a spider (which creates spider legs) and
	 * crawls the web.
	 * 
	 * @param args
	 *            - not used
	 */
	public static void main(String[] args) {
		Spider spider = new Spider();
		spider.search("https://www.facebook.com/carlosalvaradoquesada/posts/353929445105736", "Carlos");
	}
}