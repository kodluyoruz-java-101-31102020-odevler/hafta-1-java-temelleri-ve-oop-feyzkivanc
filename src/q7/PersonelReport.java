package q7;

import java.io.UnsupportedEncodingException;

public class PersonelReport extends Report{
	
	
	
	
	
	public PersonelReport() {
		
		super();
	}
		private static String hashMD5Result(final String md5) throws UnsupportedEncodingException {
	        StringBuffer sb=null;
	        try {
	            final java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
	            final byte[] array = md.digest(md5.getBytes("UTF-8"));
	            sb = new StringBuffer();
	            for (int i = 0; i < array.length; ++i) {
	                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
	            }
	            return sb.toString();
	        } catch (final java.security.NoSuchAlgorithmException e) {
	        }
	        return sb.toString();
	    }
		
		
}