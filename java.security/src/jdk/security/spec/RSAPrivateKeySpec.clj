(ns jdk.security.spec.RSAPrivateKeySpec
  "This class specifies an RSA private key."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.security.spec RSAPrivateKeySpec]))

(defn ->rsa-private-key-spec
  "Constructor.

  Creates a new RSAPrivateKeySpec.

  modulus - the modulus - `java.math.BigInteger`
  private-exponent - the private exponent - `java.math.BigInteger`"
  ([modulus private-exponent]
    (new RSAPrivateKeySpec modulus private-exponent)))

(defn get-modulus
  "Returns the modulus.

  returns: the modulus - `java.math.BigInteger`"
  ([this]
    (-> this (.getModulus))))

(defn get-private-exponent
  "Returns the private exponent.

  returns: the private exponent - `java.math.BigInteger`"
  ([this]
    (-> this (.getPrivateExponent))))

