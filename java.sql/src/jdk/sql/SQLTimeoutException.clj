(ns jdk.sql.SQLTimeoutException
  "The subclass of SQLException thrown when the timeout specified by
  Statement.setQueryTimeout, DriverManager.setLoginTimeout,
  DataSource.setLoginTimeout,XADataSource.setLoginTimeout
  has expired.
   This exception does not correspond to a standard SQLState."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.sql SQLTimeoutException]))

(defn ->sql-timeout-exception
  "Constructor.

  Constructs a SQLTimeoutException object
   with a given
   reason, SQLState, vendorCode
   and  cause.

  reason - a description of the exception - `java.lang.String`
  sql-state - an XOPEN or SQL:2003 code identifying the exception - `java.lang.String`
  vendor-code - a database vendor-specific exception code - `int`
  cause - the underlying reason for this SQLException (which is saved for later retrieval by the getCause() method); may be null indicating the cause is non-existent or unknown. - `java.lang.Throwable`"
  ([reason sql-state vendor-code cause]
    (new SQLTimeoutException reason sql-state vendor-code cause))
  ([reason sql-state vendor-code]
    (new SQLTimeoutException reason sql-state vendor-code))
  ([reason sql-state]
    (new SQLTimeoutException reason sql-state))
  ([reason]
    (new SQLTimeoutException reason))
  ([]
    (new SQLTimeoutException )))

