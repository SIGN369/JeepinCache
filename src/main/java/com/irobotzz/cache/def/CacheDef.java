package com.irobotzz.cache.def;

import java.io.IOException;

/**
 * Interface define cache operation specifications.
 * @author Flint
 *
 */
public interface CacheDef {
	// Default cache directory.
	public static final String defaultCacheDIr="defalut";
	// Parent cache directory.
	public static final String parentDirectory="JeepinCache";
    /**
     * Add a Cache to a specified directory.
     * @param directory   	The directory where the caches are stored.
     * @param key Key for the Object.
     * @param value  Object to be stored.
     * @throws IOException 
     */
	public  void add(String directory, String key, Object value) throws IOException;
	/**
	 * Add a Cache to the default directory.
	 * @param key
	 * @param value
	 * @throws IOException
	 */
	public  void add(String key, Object value) throws IOException;
	/**
	 * Get Cache from disk with given directory and key.
	 * @param directory The directory where the caches are stored.
	 * @param key
	 * @return
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public  Object get(String directory, String key) throws ClassNotFoundException, IOException;
	/**
	 * Get Cache from disk with given  key.
	 * @param key
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public  Object get(String key) throws ClassNotFoundException, IOException;
	/**
	 * Delete specified cache from disk with a given directory and key.
	 * @param directory
	 * @param key
	 */
	public  void remove(String directory, String key);
	/**
	 * Delete specified cache from disk with a  given key.
	 * @param key
	 */
	public  void remove(String key);
	/**
	 *Clear all caches from disk.
	 * @param directory
	 */
	public  void clear();
}
