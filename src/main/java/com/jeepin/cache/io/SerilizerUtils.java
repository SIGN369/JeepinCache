package com.jeepin.cache.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.jeepin.cache.def.SerilizerDef;

/**
 * SerilizerUtils that serializes Object to local disk  and deserialize Object from the local disk.
 * @author Flint
 *
 */
public class SerilizerUtils implements SerilizerDef{
	
	/**
	 * Serializes Object to local disk.
	 */
	public void serialize(File file, Object obj) throws IOException {
		if(!file.exists()) {
			file.createNewFile();
		}
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(file));
		oo.writeObject(obj);
		oo.close();
	}
	/**
	 * Deserialize Object from the local disk.
	 */
	public Object deserialize(File file) throws IOException, ClassNotFoundException {
		ObjectInputStream io = new ObjectInputStream(new FileInputStream(file));
		Object c_back = io.readObject();
		io.close();
		return c_back;
		
	}



}
