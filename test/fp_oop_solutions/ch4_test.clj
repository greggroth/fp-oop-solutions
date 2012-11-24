(ns fp-oop-solutions.ch4-test
  (:use midje.sweet
        fp-oop-solutions.ch4))

(def point (make Point 1 2))

(fact (send-to point :x) => 1)
(fact (send-to point :y) => 2)

(def point2 (make Point 2 5))

(fact (send-to point :add point2) => (contains {:x 3, :y 7}))
