(ns jdk.util.MissingResourceException
  "Signals that a resource is missing."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.util MissingResourceException]))

(defn ->missing-resource-exception
  "Constructor.

  Constructs a MissingResourceException with the specified information.
   A detail message is a String that describes this particular exception.

  s - the detail message - `java.lang.String`
  class-name - the name of the resource class - `java.lang.String`
  key - the key for the missing resource. - `java.lang.String`"
  ([s class-name key]
    (new MissingResourceException s class-name key)))

(defn get-class-name
  "Gets parameter passed by constructor.

  returns: the name of the resource class - `java.lang.String`"
  ([this]
    (-> this (.getClassName))))

(defn get-key
  "Gets parameter passed by constructor.

  returns: the key for the missing resource - `java.lang.String`"
  ([this]
    (-> this (.getKey))))

