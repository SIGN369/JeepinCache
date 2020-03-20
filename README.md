# JeepinCache
A local cache tool used to storage program-status,so in case of  program interrupted we can have program-status persisted in disk and  the next time we can keep our program going from the interrupted point and don't have to start it all over again.


# How it work
  Quite simple,look at the flowchart given below.
     ![image]( https://github.com/FlintZheng/JeepinCache/blob/master/image/process.png)
     
# How to Use
## Add cache 
 ```  
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
``` 
       
## Get cache
   ```  
  	CacheUtils util=new CacheUtils();
	//Get Cache
	TestVO object = (TestVO) util.get("userCacheDir","userCache");
	System.out.println(object.getName());
	//Get  Cache
	TestVO ds = (TestVO) util.get("testCache");
	System.out.println(ds.getName());
 ```
## Clear cache
```
   	 CacheUtils util=new CacheUtils();
    	//Clear a specified cache with a given cache key.
	util.remove("userCacheDir","userCache");
	//Clear all cache under a specified directory
	util.removeCacheDir("userCacheDir");
	// Clear all cache
	util.clear();
```
