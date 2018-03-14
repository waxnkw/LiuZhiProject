package assistant;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import po.UserInfo;

public class ReadAndWriteUserInfoSer {

	public static boolean writeObj(UserInfo userInfo,String path){
		ObjectOutputStream oStream ;
//		System.out.println(path);
		try {
			oStream = new ObjectOutputStream(new FileOutputStream(path));
			oStream.writeObject(userInfo);
			oStream.close();
			return true;
		} catch (IOException e) {
			//e.printStackTrace();
			return false;
		}
	}


	public static UserInfo readObj(String path){
//		System.out.println("path: "+path);
		File file = new File(path);
		if(!file.exists()){return null;}
		UserInfo userInfo= null;
		ObjectInputStream oInputStream;
		try {
			oInputStream = new ObjectInputStream(new FileInputStream(path));
			userInfo = (UserInfo)oInputStream.readObject();
			oInputStream.close();
		}catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			//e.printStackTrace();
			return null;
		}
		return userInfo;
	}
}
