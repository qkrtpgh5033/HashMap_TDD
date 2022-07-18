package exam.ll;

import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {

    ArrayList<Object> keys = new ArrayList<>();
    ArrayList<Object> values = new ArrayList<>();


    public int indexOfKey(Object key){
        for(int i = 0; i < keys.size(); i++){
            if (keys.get(i).equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public void put(K key, V value) {
        int index = indexOfKey(key);
        if(index == -1){
            keys.add(key);
            values.add(value);
        }
        else {
            values.set(index, value);
        }
    }


    public V get(K key) {
        int index = indexOfKey(key);
        if (index == -1)
            return null;

        return (V)values.get(index);

    }

    public int size() {
        return keys.size();
    }

    public void remove(K key) {
        int index = indexOfKey(key);
        keys.remove(index);
        values.remove(index);
    }

    public ArrayList<K> keySet() {
        return (ArrayList<K>) keys;
    }
}
