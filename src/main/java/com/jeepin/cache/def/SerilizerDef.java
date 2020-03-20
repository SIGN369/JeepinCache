package com.jeepin.cache.def;

import java.io.File;
import java.io.IOException;

/**
 * SerilizerDef define Object serialize and deserialize specifications.
 * @author Flint
 *
 */
public interface SerilizerDef {
	/**
	 * Serialize an Object to local disk.
	 * @param obj
	 * @return
	 * @throws IOException
	 */
	public void serialize(File file,Object obj) throws IOException ;
	/**
	 * Deserialize an Object from local disk.
	 * @param obj
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException 
	 */
	public Object deserialize(File file) throws IOException, ClassNotFoundException ;
}
