package com.jeepin.cache.io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.jeepin.cache.def.CacheDef;

/**
 * This is an implementation class provides CURD operation on cache .
 * @author Flint
 *
 */
public class CacheUtils implements CacheDef {
	SerilizerUtils cacheUtil = new SerilizerUtils();
	private static File parentDir = new File(parentDirectory);
	
	/**
	 * Initiate parent storage directory.
	 */
	static{
		if(!parentDir.isDirectory()) {
			parentDir.mkdir();
			}
		}
	
	public void add(String directory, String key, Object value) throws IOException {
		File direc = new File(parentDir,directory);
		FileUtils.forceMkdir(direc);
		File file = new File(direc,key);
		cacheUtil.serialize(file, value);
	}

	public void add(String key, Object value) throws IOException {
		add(defaultCacheDIr,key,value);
	}

	public Object get(String directory, String key) throws ClassNotFoundException, IOException {
		File file = new File(parentDir,directory+File.separator+key);
		return cacheUtil.deserialize(file);
	}

	public Object get(String key) throws ClassNotFoundException, IOException {
		return get(defaultCacheDIr,key);
	}

	public void remove(String directory, String key) {
		File file = new File(parentDir,directory+File.separator+key);
		_deleteQuietly(file);
	}

	public void remove(String key) {
		remove(defaultCacheDIr,key);
	}

	public void removeCacheDir(String directory) {
		File file = new File(parentDir,directory);
		 _deleteQuietly(file);
	}

	public void clear() {
		 _deleteQuietly(parentDir);
	}

	private void _deleteQuietly(File file) {
		boolean deleteQuietly = FileUtils.deleteQuietly(file);
		System.out.println("=============Clear Caches："+deleteQuietly+"============");
	}


	
}
