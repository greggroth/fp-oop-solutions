(ns fp-oop-solutions.ch5-test
  (:use midje.sweet
        fp-oop-solutions.ch5))

(fact (make Point 1 2) => (contains {:x 1, :y 2}))
(fact (send-to (make Point 2 3) :class) => 'Point)
