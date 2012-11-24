(ns fp-oop-solutions.ch3)

(load-file "src/fp_oop_solutions/sources/add-and-make.clj")

; Ex 1
(def add1
  (fn [point1 point2]
    (Point (+ (x point1) (x point2))
           (+ (y point1) (y point2)))))

(def add2
  (fn [point1 point2]
    (shift point1 (x point2) (y point2))))

; Ex 2
(defn make [klass & args] (apply klass args))

; Ex 3
(defn equal-triangles? [triangle1, triangle2]
  (= triangle1 triangle2))
