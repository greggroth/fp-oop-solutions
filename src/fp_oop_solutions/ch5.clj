(ns fp-oop-solutions.ch5)

(def class-from-instance
     (fn [instance]
       (eval (:__class_symbol__ instance))))

(def method-from-message
     (fn [message class]
        (message (:__instance_methods__ class))))

(def apply-message-to
     (fn [class instance message args]
       (let [method (method-from-message message class)]
         (try
           (apply method instance args)
           (catch Exception e (message instance))))))

(def make
     (fn [class & args]
       (let [seeded {:__class_symbol__ (:__own_symbol__ class)}]
         (apply-message-to class seeded :add-instance-values args))))

(def send-to
     (fn [instance message & args]
         (apply-message-to (class-from-instance instance) instance message args)))

(def Point
{
  :__own_symbol__ 'Point
  :__instance_methods__
  {
    :add-instance-values (fn [this x y]
                           (assoc this :x x :y y))
    :class class-from-instance
    :class-name :__class_symbol__
    :shift (fn [this xinc yinc]
             (make Point (+ (:x this) xinc)
                         (+ (:y this) yinc)))
    :add (fn [this other]
           (send-to this :shift (:x other)
                                (:y other)))
   }
 })


;; For exercise 4
(def Holder
{
  :__own_symbol__ 'Holder
  :__instance_methods__
  {
    :add-instance-values (fn [this held]
                           (assoc this :held held))
  }
})

