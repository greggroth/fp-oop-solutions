(ns fp-oop-solutions.ch3-test
  (:use midje.sweet
        fp-oop-solutions.ch3))

(def point1 (Point 1 1))
(def point2 (Point 3 5))
(def point3 (Point 4 6))

(fact (add1 point1 point2) => (contains {:x 4, :y 6}))
(fact (add2 point1 point2) => (contains {:x 4, :y 6}))

(fact (make Point 3 6) => (contains {:x 3, :y 6}))
(fact (make Triangle point1 point2 point3) => (contains {:point1 point1,
                                                         :point2 point2,
                                                         :point3 point3}))
