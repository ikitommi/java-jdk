(ns javax.sql.CommonDataSource
  "Interface that defines the methods which are common between DataSource,
  XADataSource and ConnectionPoolDataSource."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.sql CommonDataSource]))

(defn get-log-writer
  "Retrieves the log writer for this DataSource
   object.

   The log writer is a character output stream to which all logging
   and tracing messages for this data source will be
   printed.  This includes messages printed by the methods of this
   object, messages printed by methods of other objects manufactured
   by this object, and so on.  Messages printed to a data source
   specific log writer are not printed to the log writer associated
   with the java.sql.DriverManager class.  When a
   DataSource object is
   created, the log writer is initially null; in other words, the
   default is for logging to be disabled.

  returns: the log writer for this data source or null if
          logging is disabled - `java.io.PrintWriter`

  throws: java.sql.SQLException - if a database access error occurs"
  (^java.io.PrintWriter [^javax.sql.CommonDataSource this]
    (-> this (.getLogWriter))))

(defn set-log-writer
  "Sets the log writer for this DataSource
   object to the given java.io.PrintWriter object.

   The log writer is a character output stream to which all logging
   and tracing messages for this data source will be
   printed.  This includes messages printed by the methods of this
   object, messages printed by methods of other objects manufactured
   by this object, and so on.  Messages printed to a data source-
   specific log writer are not printed to the log writer associated
   with the java.sql.DriverManager class. When a
   DataSource object is created the log writer is
   initially null; in other words, the default is for logging to be
   disabled.

  out - the new log writer; to disable logging, set to null - `java.io.PrintWriter`

  throws: java.sql.SQLException - if a database access error occurs"
  ([^javax.sql.CommonDataSource this ^java.io.PrintWriter out]
    (-> this (.setLogWriter out))))

(defn set-login-timeout
  "Sets the maximum time in seconds that this data source will wait
   while attempting to connect to a database.  A value of zero
   specifies that the timeout is the default system timeout
   if there is one; otherwise, it specifies that there is no timeout.
   When a DataSource object is created, the login timeout is
   initially zero.

  seconds - the data source login time limit - `int`

  throws: java.sql.SQLException - if a database access error occurs."
  ([^javax.sql.CommonDataSource this ^Integer seconds]
    (-> this (.setLoginTimeout seconds))))

(defn get-login-timeout
  "Gets the maximum time in seconds that this data source can wait
   while attempting to connect to a database.  A value of zero
   means that the timeout is the default system timeout
   if there is one; otherwise, it means that there is no timeout.
   When a DataSource object is created, the login timeout is
   initially zero.

  returns: the data source login time limit - `int`

  throws: java.sql.SQLException - if a database access error occurs."
  (^Integer [^javax.sql.CommonDataSource this]
    (-> this (.getLoginTimeout))))

(defn get-parent-logger
  "Return the parent Logger of all the Loggers used by this data source. This
   should be the Logger farthest from the root Logger that is
   still an ancestor of all of the Loggers used by this data source. Configuring
   this Logger will affect all of the log messages generated by the data source.
   In the worst case, this may be the root Logger.

  returns: the parent Logger for this data source - `java.util.logging.Logger`

  throws: java.sql.SQLFeatureNotSupportedException - if the data source does not use java.util.logging"
  (^java.util.logging.Logger [^javax.sql.CommonDataSource this]
    (-> this (.getParentLogger))))

