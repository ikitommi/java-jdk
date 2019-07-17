(ns jdk.lang.NoSuchMethodException
  "Thrown when a particular method cannot be found."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.lang NoSuchMethodException]))

(defn ->no-such-method-exception
  "Constructor.

  Constructs a NoSuchMethodException with a detail message.

  s - the detail message. - `java.lang.String`"
  ([s]
    (new NoSuchMethodException s))
  ([]
    (new NoSuchMethodException )))

