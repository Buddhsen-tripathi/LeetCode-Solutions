class MyHashMap {
    
    int size = (int)Math.pow(10, 6)+1;
	int[] map;
    
    public MyHashMap() {
        map = new int[size];
		Arrays.fill(map, -1);
    }
    
    public void put(int key, int value) {
        map[key]=value;
    }
    
    public void remove(int key) {
        map[key]=-1;
    }
    
    public int get(int key) {
        return map[key];
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */