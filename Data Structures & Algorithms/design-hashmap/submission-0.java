class MyHashMap {

    private int[] m;

    public MyHashMap() {
        m=new int[1_000_001];
        Arrays.fill(m,-1);
    }
    
    public void put(int key, int value) {
        m[key]=value;
    }
    
    public int get(int key) {
        return m[key];
    }
    
    public void remove(int key) {
        m[key]=-1;
    }
}