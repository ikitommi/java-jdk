(ns jdk.security.MessageDigest
  "This MessageDigest class provides applications the functionality of a
  message digest algorithm, such as SHA-1 or SHA-256.
  Message digests are secure one-way hash functions that take arbitrary-sized
  data and output a fixed-length hash value.

  A MessageDigest object starts out initialized. The data is
  processed through it using the update
  methods. At any point reset can be called
  to reset the digest. Once all the data to be updated has been
  updated, one of the digest methods should
  be called to complete the hash computation.

  The digest method can be called once for a given number
  of updates. After digest has been called, the MessageDigest
  object is reset to its initialized state.

  Implementations are free to implement the Cloneable interface.
  Client applications can test cloneability by attempting cloning
  and catching the CloneNotSupportedException:



  MessageDigest md = MessageDigest.getInstance(`SHA-256`);

  try {
      md.update(toChapter1);
      MessageDigest tc1 = md.clone();
      byte[] toChapter1Digest = tc1.digest();
      md.update(toChapter2);
      ...etc.
  } catch (CloneNotSupportedException cnse) {
      throw new DigestException(`couldn't make digest of partial content`);
  }

  Note that if a given implementation is not cloneable, it is
  still possible to compute intermediate digests by instantiating
  several instances, if the number of digests is known in advance.

  Note that this class is abstract and extends from
  MessageDigestSpi for historical reasons.
  Application developers should only take notice of the methods defined in
  this MessageDigest class; all the methods in
  the superclass are intended for cryptographic service providers who wish to
  supply their own implementations of message digest algorithms.

   Every implementation of the Java platform is required to support
  the following standard MessageDigest algorithms:

  MD5
  SHA-1
  SHA-256

  These algorithms are described in the
  MessageDigest section of the
  Java Cryptography Architecture Standard Algorithm Name Documentation.
  Consult the release documentation for your implementation to see if any
  other algorithms are supported."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.security MessageDigest]))

(defn *get-instance
  "Returns a MessageDigest object that implements the specified digest
   algorithm.

    A new MessageDigest object encapsulating the
   MessageDigestSpi implementation from the specified provider
   is returned.  The specified provider must be registered
   in the security provider list.

    Note that the list of registered providers may be retrieved via
   the Security.getProviders() method.

  algorithm - the name of the algorithm requested. See the MessageDigest section in the Java Cryptography Architecture Standard Algorithm Name Documentation for information about standard algorithm names. - `java.lang.String`
  provider - the name of the provider. - `java.lang.String`

  returns: a MessageDigest object that implements the specified algorithm. - `java.security.MessageDigest`

  throws: java.security.NoSuchAlgorithmException - if a MessageDigestSpi implementation for the specified algorithm is not available from the specified provider."
  ([algorithm provider]
    (MessageDigest/getInstance algorithm provider))
  ([algorithm]
    (MessageDigest/getInstance algorithm)))

(defn *equal?
  "Compares two digests for equality. Does a simple byte compare.

  digesta - one of the digests to compare. - `byte[]`
  digestb - the other digest to compare. - `byte[]`

  returns: true if the digests are equal, false otherwise. - `boolean`"
  ([digesta digestb]
    (MessageDigest/isEqual digesta digestb)))

(defn get-provider
  "Returns the provider of this message digest object.

  returns: the provider of this message digest object - `java.security.Provider`"
  ([this]
    (-> this (.getProvider))))

(defn update
  "Updates the digest using the specified array of bytes, starting
   at the specified offset.

  input - the array of bytes. - `byte[]`
  offset - the offset to start from in the array of bytes. - `int`
  len - the number of bytes to use, starting at offset. - `int`"
  ([this input offset len]
    (-> this (.update input offset len)))
  ([this input]
    (-> this (.update input))))

(defn digest
  "Completes the hash computation by performing final operations
   such as padding. The digest is reset after this call is made.

  buf - output buffer for the computed digest - `byte[]`
  offset - offset into the output buffer to begin storing the digest - `int`
  len - number of bytes within buf allotted for the digest - `int`

  returns: the number of bytes placed into buf - `int`

  throws: java.security.DigestException - if an error occurs."
  ([this buf offset len]
    (-> this (.digest buf offset len)))
  ([this input]
    (-> this (.digest input)))
  ([this]
    (-> this (.digest))))

(defn to-string
  "Returns a string representation of this message digest object.

  returns: a string representation of the object. - `java.lang.String`"
  ([this]
    (-> this (.toString))))

(defn reset
  "Resets the digest for further use."
  ([this]
    (-> this (.reset))))

(defn get-algorithm
  "Returns a string that identifies the algorithm, independent of
   implementation details. The name should be a standard
   Java Security name (such as `SHA-256`).
   See the MessageDigest section in the
   Java Cryptography Architecture Standard Algorithm Name Documentation
   for information about standard algorithm names.

  returns: the name of the algorithm - `java.lang.String`"
  ([this]
    (-> this (.getAlgorithm))))

(defn get-digest-length
  "Returns the length of the digest in bytes, or 0 if this operation is
   not supported by the provider and the implementation is not cloneable.

  returns: the digest length in bytes, or 0 if this operation is not
   supported by the provider and the implementation is not cloneable. - `int`"
  ([this]
    (-> this (.getDigestLength))))

(defn clone
  "Returns a clone if the implementation is cloneable.

  returns: a clone if the implementation is cloneable. - `java.lang.Object`

  throws: java.lang.CloneNotSupportedException - if this is called on an implementation that does not support Cloneable."
  ([this]
    (-> this (.clone))))

