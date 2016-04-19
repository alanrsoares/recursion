(ns recursion)

(defn product [xs]
  (if (empty? xs)
      1
      (* (first xs)
         (product (rest xs)))))

(defn singleton? [xs]
  (and (not (empty? xs))
       (empty? (rest xs))))

(defn my-last [xs]
  (if (empty? xs)
      nil
    (if (singleton? xs)
        (first xs)
        (my-last (rest xs)))))

(defn max-element [[x & xs]]
  (if (nil? xs)
      x
      (max x (max-element xs))))

(defn seq-max [xs ys]
  (if (> (count xs) (count ys))
      xs
      ys))

(defn longest-sequence [xs]
  (if (empty? xs)
      nil
      (seq-max (first xs)
               (longest-sequence (rest xs)))))

(defn my-filter [pred? a-seq]
  (let [x  (first a-seq)
        xs (rest a-seq)]
    (if (empty? a-seq)
      []
      (if (pred? x)
        (cons x (my-filter pred? xs))
        (my-filter pred? xs)))))

(defn sequence-contains? [elem a-seq]
  (let [p? #(= elem %)]
    (and (not (empty? a-seq))
         (or (p? (first a-seq))
             (sequence-contains? elem (rest a-seq))))))

(defn my-take-while [pred? a-seq]
  (let [x  (first a-seq)
        xs (rest a-seq)]
    (if (empty? a-seq)
      []
      (if (pred? x)
        (cons x (my-take-while pred? xs))
        []))))

(defn my-drop-while [pred? a-seq]
  (let [x  (first a-seq)
        xs (rest a-seq)]
    (if (empty? a-seq)
      []
      (if (pred? x)
        (my-drop-while pred? xs)
          a-seq))))

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
