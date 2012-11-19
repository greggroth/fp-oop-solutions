(ns fp-oop-solutions.ch1)
;; ex1
(def second (fn [list] (nth list 1)))

;; ex2
(def third (fn [list] (nth list 2)))
; (def third (fn [list] (first (nnext list))))  ; another way

;; ex3
(defn square [n] (* n n))
(defn add-squares [& nums] (apply + (map square nums)))

;; ex4
(apply * (range 1 5))

;; ex6
(defn prefix-of? [candidates sequ]
  (every? true?
        (map = 
             candidates
             sequ)))

;; ex7
(defn tails [arry]
  (map #(drop % arry) 
       (range (+ 1
                 (count arry)))))
