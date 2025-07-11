package collections;

public class MyHashSet<E> {
    private final static int DEFAULT_SIZE = 8;
    private final static double RESIZE_INDEX = 0.75;

    private Node<E>[] buckets;
    private int size;

    public MyHashSet () {
        buckets = new Node[DEFAULT_SIZE];
        size = 0;
    }
    public boolean add(E ...data) {
        if (data == null || data.length == 0) return false;

        boolean result = false;
        for(E d : data) {
            if (d != null && add(d)) result = true;
        }
        return result;
    }

    public boolean add(E data) {
        if(size >= RESIZE_INDEX * buckets.length) resize();

        int index = getBucketIndex(data);

        Node<E> bucket = buckets[index];
        while (bucket != null) {
            if(bucket.data.equals(data)) return false;
            bucket = bucket.nextBucket;
        }

        buckets[index] = new Node<>(data, buckets[index]);
        size++;

        return true;
    }

    public boolean remove(E ...data){
        if (data == null || data.length == 0) return false;

        boolean result = false;
        for (E d : data) {
            if ( d !=null && remove(d)) result = true;
        }
        return  result;
    }

    public boolean remove(E data) {
        int index = getBucketIndex(data);
        Node<E> thisBucket = buckets[index];
        Node<E> oldbucket = null;

        while (thisBucket != null) {
            if (thisBucket.data.equals(data)) {
                if (oldbucket == null) buckets[index] = thisBucket.nextBucket;
                else oldbucket.nextBucket = thisBucket.nextBucket;
                size--;
                return true;
            }
            oldbucket = thisBucket;
            thisBucket = thisBucket.nextBucket;
        }
        return false;
    }

    private int getBucketIndex(E data) {
        return data == null ?  0 : ((buckets.length - 1) & data.hashCode());
    }

    private void resize() {
        Node<E>[] oldBuckets = buckets;
        buckets = new Node[oldBuckets.length * 2];
        size = 0;

        for(Node<E> node : oldBuckets){
            while (node != null){
                add(node.data);
                node = node.nextBucket;
            }
        }

    }

    private static class Node<E> {
        E data;
        Node<E> nextBucket;

        public Node(E data, Node<E> nextBucket) {
            this.data = data;
            this.nextBucket = nextBucket;
        }
    }
}
