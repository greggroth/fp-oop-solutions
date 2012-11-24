(ns fp-oop-solutions.ch3-test
  (:use midje.sweet
        fp-oop-solutions.ch3))

(def point1 (Point 1 1))
(def point2 (Point 3 5))

(fact (add point1 point2) => (contains {:x 4, :y 6}))
