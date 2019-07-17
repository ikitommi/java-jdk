(ns jdk.sql.RowId
  "The representation (mapping) in the Java programming language of an SQL ROWID
  value. An SQL ROWID is a built-in type, a value of which can be thought of as
  an address  for its identified row in a database table. Whether that address
  is logical or, in any  respects, physical is determined by its originating data
  source.

  Methods in the interfaces ResultSet, CallableStatement,
  and PreparedStatement, such as getRowId and setRowId
  allow a programmer to access a SQL ROWID  value. The RowId
  interface provides a method
  for representing the value of the ROWID as a byte array or as a
  String.

  The method getRowIdLifetime in the interface DatabaseMetaData,
  can be used
  to determine if a RowId object remains valid for the duration of the transaction in
  which  the RowId was created, the duration of the session in which
  the RowId was created,
  or, effectively, for as long as its identified row is not deleted. In addition
  to specifying the duration of its valid lifetime outside its originating data
  source, getRowIdLifetime specifies the duration of a ROWID
  value's valid lifetime
  within its originating data source. In this, it differs from a large object,
  because there is no limit on the valid lifetime of a large  object within its
  originating data source.

  All methods on the RowId interface must be fully implemented if the
  JDBC driver supports the data type."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.sql RowId]))

(defn equals
  "Compares this RowId to the specified object. The result is
   true if and only if the argument is not null and is a RowId
   object that represents the same ROWID as  this object.

   It is important
   to consider both the origin and the valid lifetime of a RowId
   when comparing it to another RowId. If both are valid, and
   both are from the same table on the same data source, then if they are equal
   they identify
   the same row; if one or more is no longer guaranteed to be valid, or if
   they originate from different data sources, or different tables on the
   same data source, they  may be equal but still
   not identify the same row.

  obj - the Object to compare this RowId object against. - `java.lang.Object`

  returns: true if the RowIds are equal; false otherwise - `boolean`"
  ([this obj]
    (-> this (.equals obj))))

(defn get-bytes
  "Returns an array of bytes representing the value of the SQL ROWID
   designated by this java.sql.RowId object.

  returns: an array of bytes, whose length is determined by the driver supplying
       the connection, representing the value of the ROWID designated by this
       java.sql.RowId object. - `byte[]`"
  ([this]
    (-> this (.getBytes))))

(defn to-string
  "Returns a String representing the value of the SQL ROWID designated by this
   java.sql.RowId object.

  Like java.sql.Date.toString()
   returns the contents of its DATE as the String `2004-03-17`
   rather than as  DATE literal in SQL (which would have been the String
   DATE `2004-03-17`), toString()
   returns the contents of its ROWID in a form specific to the driver supplying
   the connection, and possibly not as a ROWID literal.

  returns: a String whose format is determined by the driver supplying the
       connection, representing the value of the ROWID designated
       by this java.sql.RowId  object. - `java.lang.String`"
  ([this]
    (-> this (.toString))))

(defn hash-code
  "Returns a hash code value of this RowId object.

  returns: a hash code for the RowId - `int`"
  ([this]
    (-> this (.hashCode))))

