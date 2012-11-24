(ns fp-oop-solutions.ch3)

(load-file "src/fp_oop_solutions/sources/add-and-make.clj")

(def add
  (fn [point1 point2]
    (Point (+ (x point1) (x point2))
           (+ (y point1) (y point2)))))

