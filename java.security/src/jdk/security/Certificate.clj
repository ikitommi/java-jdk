(ns jdk.security.Certificate
  "Deprecated.
 A new certificate handling package is created in the Java platform.
              This Certificate interface is entirely deprecated and
              is here to allow for a smooth transition to the new
              package."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.security Certificate]))

(defn get-guarantor
  "Deprecated.

  returns: the guarantor which guaranteed the principal-key
   binding. - `java.security.Principal`"
  ([this]
    (-> this (.getGuarantor))))

(defn get-principal
  "Deprecated.

  returns: the principal to which this certificate is bound. - `java.security.Principal`"
  ([this]
    (-> this (.getPrincipal))))

(defn get-public-key
  "Deprecated.

  returns: the public key that this certificate certifies belongs
   to a particular principal. - `java.security.PublicKey`"
  ([this]
    (-> this (.getPublicKey))))

(defn encode
  "Deprecated.

  stream - the output stream to which to encode the certificate. - `java.io.OutputStream`

  throws: java.security.KeyException - if the certificate is not properly initialized, or data is missing, etc."
  ([this stream]
    (-> this (.encode stream))))

(defn decode
  "Deprecated.

  stream - the input stream from which to fetch the data being decoded. - `java.io.InputStream`

  throws: java.security.KeyException - if the certificate is not properly initialized, or data is missing, etc."
  ([this stream]
    (-> this (.decode stream))))

(defn get-format
  "Deprecated.

  returns: the name of the coding format. - `java.lang.String`"
  ([this]
    (-> this (.getFormat))))

(defn to-string
  "Deprecated.

  detailed - whether or not to give detailed information about the certificate - `boolean`

  returns: a string representing the contents of the certificate - `java.lang.String`"
  ([this detailed]
    (-> this (.toString detailed))))

