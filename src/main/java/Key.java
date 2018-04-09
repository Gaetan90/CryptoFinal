
public class Key {
	private String key;
	private byte[] Bkey;
	
	public Key(String key) {
		this.key = key;
		this.Bkey = key.getBytes();
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public byte[] getBkey() {
		return Bkey;
	}

	public void setBkey(byte[] bkey) {
		Bkey = bkey;
	}

	
}
