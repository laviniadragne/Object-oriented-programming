package Task1;

import java.util.ArrayList;

class MyHashMap<K extends Comparable<K>, V> {

    // Clasa interna cu rol de entry
    static class MyMapEntry<K extends Comparable<K>, V> {

        private final K key;
        private V value;
        MyMapEntry<K, V> next;

        MyMapEntry(K newKey, V newVal) {
            key = newKey;
            value = newVal;
        }

        K getKey() {
            return key;
        }

        V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "MyMapEntry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}' + " ";
        }
    }

        private final ArrayList<MyMapEntry<K, V>> buckets;

        public MyHashMap(int noOfBuckets) {

            buckets = new ArrayList<>();
            for (int i = 0; i < noOfBuckets; i++) {
                buckets.add(null);
            }
        }

        // Implementarea functiei put
        public void put(K key, V value) {
            int bucketIndex = getHash(key);
            MyMapEntry<K, V> head = buckets.get(bucketIndex);

            while (head != null) {

                if(head.getKey().compareTo(key) == 0) {

                    head.setValue(value);
                    return;
                }
                head = head.next;
            }

            head = buckets.get(bucketIndex);
            MyMapEntry<K, V> newEntry = new MyMapEntry<>(key, value);

            newEntry.next = head;
            buckets.set(bucketIndex, newEntry);
        }

        private int getHash (K key){
            return key.hashCode() % (buckets.size());
        }

        // Implementarea functiei get
        public V get (K key){
                int bucketIndex = getHash(key);
                MyMapEntry<K, V> head = buckets.get(bucketIndex);

                while (head != null) {
                    if (head.getKey().compareTo(key) == 0) {
                        return  head.getValue();
                    }
                    head = head.next;
                }
                return null;
            }

        @Override
        public String toString () {
            for (MyMapEntry<K, V> head : buckets) {
                System.out.print("[");
                while (head != null) {
                    System.out.print(head.toString());
                    head = head.next;
                }
                System.out.println("]");
            }
            return null;
        }
}
