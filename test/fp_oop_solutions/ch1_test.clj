(ns fp-oop-solutions.ch1-test
  (:use midje.sweet
        fp-oop-solutions.ch1))

(fact (second '(1 2 3 4 5)) => 2)

(fact (third '(1 2 3 4 5)) => 3)

(fact (square 5) => 25)
(fact (square 6) => 36)

(fact (prefix-of? '(1 2) '(1 2 3 4)) => true)
(fact (prefix-of? '(2 3) '(1 2 3 4)) => false)
(fact (prefix-of? '(1 3) '(1 2 3 4)) => false)

(fact (tails '(1 2 3 4)) => '((1 2 3 4) (2 3 4) (3 4) (4) ()))
