package com.jeepin.cache.app;

import java.io.IOException;

import com.jeepin.cache.io.CacheUtils;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	 public static void main( String[] args )
	    {
	    	try {
	    		addCacheTest();
	    		clearCacheTest();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    public static void addCacheTest() throws IOException, ClassNotFoundException {
	    	CacheUtils util=new CacheUtils();
			TestVO pp =new TestVO();
			pp.setName("Tom");
			//Add cache with key test under directory userCache.
			util.add("userCacheDir","userCache", pp);
			//Add cache with test under  default directory.
			util.add("testCache", pp);
			//Get Cache
			TestVO object = (TestVO) util.get("userCacheDir","userCache");
			System.out.println(object.getName());
			//Get  Cache
			TestVO ds = (TestVO) util.get("testCache");
			System.out.println(ds.getName());
	    }
	    public static void clearCacheTest() {
	    	CacheUtils util=new CacheUtils();
	    	//Clear a specified cache with a given cache key.
			util.remove("userCacheDir","userCache");
			//Clear all cache under a specified directory
			util.removeCacheDir("userCacheDir");
			// Clear all cache
			util.clear();
	    }
}
