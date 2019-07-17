(ns javax.xml.transform.SourceLocator
  "This interface is primarily for the purposes of reporting where
  an error occurred in the XML source or transformation instructions."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.xml.transform SourceLocator]))

(defn get-public-id
  "Return the public identifier for the current document event.

   The return value is the public identifier of the document
   entity or of the external parsed entity in which the markup that
   triggered the event appears.

  returns: A string containing the public identifier, or
           null if none is available. - `java.lang.String`"
  ([this]
    (-> this (.getPublicId))))

(defn get-system-id
  "Return the system identifier for the current document event.

   The return value is the system identifier of the document
   entity or of the external parsed entity in which the markup that
   triggered the event appears.

   If the system identifier is a URL, the parser must resolve it
   fully before passing it to the application.

  returns: A string containing the system identifier, or null
           if none is available. - `java.lang.String`"
  ([this]
    (-> this (.getSystemId))))

(defn get-line-number
  "Return the line number where the current document event ends.

   Warning: The return value from the method
   is intended only as an approximation for the sake of error
   reporting; it is not intended to provide sufficient information
   to edit the character content of the original XML document.

   The return value is an approximation of the line number
   in the document entity or external parsed entity where the
   markup that triggered the event appears.

  returns: The line number, or -1 if none is available. - `int`"
  ([this]
    (-> this (.getLineNumber))))

(defn get-column-number
  "Return the character position where the current document event ends.

   Warning: The return value from the method
   is intended only as an approximation for the sake of error
   reporting; it is not intended to provide sufficient information
   to edit the character content of the original XML document.

   The return value is an approximation of the column number
   in the document entity or external parsed entity where the
   markup that triggered the event appears.

  returns: The column number, or -1 if none is available. - `int`"
  ([this]
    (-> this (.getColumnNumber))))

