(ns fp-oop-solutions.ch1-test
  (:use clojure.test
        fp-oop-solutions.ch1))

(deftest test-second
  (is (= 2 (second '(1 2 3 4 5)))))

(deftest test-third
  (is (= 3 (third '(1 2 3 4 5)))))

(deftest test-square
  (is (= 25 (square 5)))
  (is (= 36 (square 6))))

(deftest test-prefix-of?
  (is (= true  (prefix-of? '(1 2) '(1 2 3 4))))
  (is (= false (prefix-of? '(2 3) '(1 2 3 4))))
  (is (= false (prefix-of? '(1 3) '(1 2 3 4)))))

(deftest test-tails
  (is (= '((1 2 3 4) (2 3 4) (3 4) (4) ()) (tails '(1 2 3 4)))))
