(ns recursion)

(defn product [[x & xs]]
  (if (nil? x)
      1
      (* x
         (product xs))))

(defn singleton? [[x & xs]]
  (nil? xs))

(defn my-last [xs]
  (if
    (singleton? xs)
    (first xs)
    (my-last (rest xs))))

(defn max-element [[x & xs]]
  (if (nil? xs)
      x
      (max x (max-element xs))))

(defn seq-max [xs ys]
  (if (> (count xs) (count ys))
      xs
      ys))

(defn longest-sequence [xs]
  (if
    (empty? xs)
    nil
    (seq-max (first xs)
             (longest-sequence (rest xs)))))


(defn my-filter [pred? a-seq]
  [:-])

(defn sequence-contains? [elem a-seq]
  :-)

(defn my-take-while [pred? a-seq]
  [:-])

(defn my-drop-while [pred? a-seq]
  [:-])

(defn seq= [a-seq b-seq]
  :-)

(defn my-map [f seq-1 seq-2]
  [:-])

(defn power [n k]
  :-)

(defn fib [n]
  :-)

(defn my-repeat [how-many-times what-to-repeat]
  [:-])

(defn my-range [up-to]
  [:-])

(defn tails [a-seq]
  [:-])

(defn inits [a-seq]
  [:-])

(defn rotations [a-seq]
  [:-])

(defn my-frequencies-helper [freqs a-seq]
  [:-])

(defn my-frequencies [a-seq]
  [:-])

(defn un-frequencies [a-map]
  [:-])

(defn my-take [n coll]
  [:-])

(defn my-drop [n coll]
  [:-])

(defn halve [a-seq]
  [:-])

(defn seq-merge [a-seq b-seq]
  [:-])

(defn merge-sort [a-seq]
  [:-])

(defn split-into-monotonics [a-seq]
  [:-])

(defn permutations [a-set]
  [:-])

(defn powerset [a-set]
  [:-])

