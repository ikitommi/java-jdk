(ns javax.xml.xpath.XPathException
  "XPathException represents a generic XPath exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.xml.xpath XPathException]))

(defn ->x-path-exception
  "Constructor.

  Constructs a new XPathException
   with the specified detail message.

   The cause is not initialized.

   If message is null,
   then a NullPointerException is thrown.

  message - The detail message. - `java.lang.String`

  throws: java.lang.NullPointerException - When message is null."
  ([message]
    (new XPathException message)))

(defn get-cause
  "Get the cause of this XPathException.

  returns: Cause of this XPathException. - `java.lang.Throwable`"
  ([this]
    (-> this (.getCause))))

(defn print-stack-trace
  "Print stack trace to specified PrintStream.

  s - Print stack trace to this PrintStream. - `java.io.PrintStream`"
  ([this s]
    (-> this (.printStackTrace s)))
  ([this]
    (-> this (.printStackTrace))))

