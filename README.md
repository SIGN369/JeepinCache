[![license](https://img.shields.io/hexpm/l/plug.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)

# JeepinCache
A local cache tool used to storage program-status,so in case of  program interrupted we can have program-status persisted in disk and  the next time we can keep our program going from the interrupted point and don't have to start it all over again.
本地磁盘缓存工具用于存储程序执行状态，这样在断电或者程序中断的时候可以将执行状态持久化到本地磁盘中，下次启动时直接读取执行状态继续执行，不用从头开始工作（比如：爬虫、更新数据等等）

# How it works
  Quite simple,look at the flowchart given below.  
	![image]( https://github.com/FlintZheng/JeepinCache/blob/master/image/process.png)
     
# How to Use
## use in maven
```
 <dependency>
	  <groupId>com.irobotzz.cache</groupId>
	  <artifactId>JeepinCache</artifactId>
	  <version>1.2</version>
    </dependency>
```
## Add cache 
 ```  
CacheUtils util=new CacheUtils();
TestVO pp =new TestVO();
pp.setName("Tom");
//Add cache with key test to directory userCache.
util.add("userCacheDir","userCache", pp);
//Add cache with key-test to default directory.
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
