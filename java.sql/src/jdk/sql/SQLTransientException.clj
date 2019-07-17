(ns jdk.sql.SQLTransientException
  "The subclass of SQLException is thrown in situations where a
  previously failed operation might be able to succeed when the operation is
  retried without any intervention by application-level functionality."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.sql SQLTransientException]))

(defn ->sql-transient-exception
  "Constructor.

  Constructs a SQLTransientException object
   with a given
   reason, SQLState, vendorCode
   and  cause.

  reason - a description of the exception - `java.lang.String`
  sql-state - an XOPEN or SQL:2003 code identifying the exception - `java.lang.String`
  vendor-code - a database vendor-specific exception code - `int`
  cause - the underlying reason for this SQLException (which is saved for later retrieval by the getCause() method); may be null indicating the cause is non-existent or unknown. - `java.lang.Throwable`"
  ([reason sql-state vendor-code cause]
    (new SQLTransientException reason sql-state vendor-code cause))
  ([reason sql-state vendor-code]
    (new SQLTransientException reason sql-state vendor-code))
  ([reason sql-state]
    (new SQLTransientException reason sql-state))
  ([reason]
    (new SQLTransientException reason))
  ([]
    (new SQLTransientException )))

