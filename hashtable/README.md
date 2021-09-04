# Hashtables

Hash tables are created with an algorithm that stores the keys into hash buckets, which contain key-value pairs. Since different keys may hash to the same bucket, the goal of hash table design is to spread out the key-value pairs evenly with each bucket containing as few key-value pairs as possible. When an item is looked up, its key is hashed to find the appropriate bucket, and the bucket is then compared to find the right key-value pair.

## Challenge

implement HashTable class with 4 methods (add , hash , contains , get).

## Approach & Efficiency

the big O notation is big O(n) for the time and space because we used while loop and we use array.

## API

1. hash(): takes a key and convert it to an integer index.
2. add(): to add a new key-value pair to the hash table.
3. get(): to check and return the value of the given key.
4. contains: to check if the key exists in the hash table and returns a boolian acordingly.
