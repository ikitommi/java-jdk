(ns jdk.security.cert.CertPathValidatorException
  "An exception indicating one of a variety of problems encountered when
  validating a certification path.

  A CertPathValidatorException provides support for wrapping
  exceptions. The getCause method returns the throwable,
  if any, that caused this exception to be thrown.

  A CertPathValidatorException may also include the
  certification path that was being validated when the exception was thrown,
  the index of the certificate in the certification path that caused the
  exception to be thrown, and the reason that caused the failure. Use the
  getCertPath, getIndex, and
  getReason methods to retrieve this information.


  Concurrent Access

  Unless otherwise specified, the methods defined in this class are not
  thread-safe. Multiple threads that need to access a single
  object concurrently should synchronize amongst themselves and
  provide the necessary locking. Multiple threads each manipulating
  separate objects need not synchronize."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.security.cert CertPathValidatorException]))

(defn ->cert-path-validator-exception
  "Constructor.

  Creates a CertPathValidatorException with the specified
   detail message, cause, certification path, index, and reason.

  msg - the detail message (or null if none) - `java.lang.String`
  cause - the cause (or null if none) - `java.lang.Throwable`
  cert-path - the certification path that was in the process of being validated when the error was encountered - `java.security.cert.CertPath`
  index - the index of the certificate in the certification path that caused the error (or -1 if not applicable). Note that the list of certificates in a CertPath is zero based. - `int`
  reason - the reason the validation failed - `java.security.cert.CertPathValidatorException.Reason`

  throws: java.lang.IndexOutOfBoundsException - if the index is out of range (index < -1 || (certPath != null && index >= certPath.getCertificates().size())"
  ([msg cause cert-path index reason]
    (new CertPathValidatorException msg cause cert-path index reason))
  ([msg cause cert-path index]
    (new CertPathValidatorException msg cause cert-path index))
  ([msg cause]
    (new CertPathValidatorException msg cause))
  ([msg]
    (new CertPathValidatorException msg))
  ([]
    (new CertPathValidatorException )))

(defn get-cert-path
  "Returns the certification path that was being validated when
   the exception was thrown.

  returns: the CertPath that was being validated when
   the exception was thrown (or null if not specified) - `java.security.cert.CertPath`"
  ([this]
    (-> this (.getCertPath))))

(defn get-index
  "Returns the index of the certificate in the certification path
   that caused the exception to be thrown. Note that the list of
   certificates in a CertPath is zero based. If no
   index has been set, -1 is returned.

  returns: the index that has been set, or -1 if none has been set - `int`"
  ([this]
    (-> this (.getIndex))))

(defn get-reason
  "Returns the reason that the validation failed. The reason is
   associated with the index of the certificate returned by
   getIndex().

  returns: the reason that the validation failed, or
      BasicReason.UNSPECIFIED if a reason has not been
      specified - `java.security.cert.CertPathValidatorException.Reason`"
  ([this]
    (-> this (.getReason))))

