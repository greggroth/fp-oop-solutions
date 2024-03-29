(ns fp-oop-solutions.ch4)

(def make
     (fn [type & args]
       (apply type args)))

(def send-to
     (fn [object message & args]
       (apply (message (:__methods__ object)) object args)))

(def Point
     (fn [x y]
       {:x x,
        :y y
        :__class_symbol__ 'Point
        :__methods__ {
           :class :__class_symbol__
           :x :x
           :y :y
           :shift (fn [this xinc yinc]
                    (make Point (+ (:x this) xinc)
                                (+ (:y this) yinc)))
           :add (fn [this point2] (send-to this :shift (send-to point2 :x)
                                                       (send-to point2 :y)))}}))

