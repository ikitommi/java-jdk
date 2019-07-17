(ns jdk.rmi.server.UnicastRemoteObject
  "Used for exporting a remote object with JRMP and obtaining a stub
  that communicates to the remote object. Stubs are either generated
  at runtime using dynamic proxy objects, or they are generated statically
  at build time, typically using the rmic tool.

  Deprecated: Static Stubs. Support for statically
  generated stubs is deprecated. This includes the API in this class that
  requires the use of static stubs, as well as the runtime support for
  loading static stubs.  Generating stubs dynamically is preferred, using one
  of the five non-deprecated ways of exporting objects as listed below. Do
  not run rmic to generate static stub classes. It is unnecessary, and
  it is also deprecated.

  There are six ways to export remote objects:



  Subclassing UnicastRemoteObject and calling the
  UnicastRemoteObject() constructor.

  Subclassing UnicastRemoteObject and calling the
  UnicastRemoteObject(port) constructor.

  Subclassing UnicastRemoteObject and calling the
  UnicastRemoteObject(port, csf, ssf) constructor.

  Calling the
  exportObject(Remote) method.
  Deprecated.

  Calling the
  exportObject(Remote, port) method.

  Calling the
  exportObject(Remote, port, csf, ssf) method.



  The fourth technique, exportObject(Remote),
  always uses statically generated stubs and is deprecated.

  The other five techniques all use the following approach: if the
  java.rmi.server.ignoreStubClasses property is true
  (case insensitive) or if a static stub cannot be found, stubs are generated
  dynamically using Proxy objects. Otherwise,
  static stubs are used.

  The default value of the
  java.rmi.server.ignoreStubClasses property is false.

  Statically generated stubs are typically pregenerated from the
  remote object's class using the rmic tool. A static stub is
  loaded and an instance of that stub class is constructed as described
  below.



  A `root class` is determined as follows: if the remote object's
  class directly implements an interface that extends Remote, then
  the remote object's class is the root class; otherwise, the root class is
  the most derived superclass of the remote object's class that directly
  implements an interface that extends Remote.

  The name of the stub class to load is determined by concatenating
  the binary name of the root class with the suffix _Stub.

  The stub class is loaded by name using the class loader of the root
  class. The stub class must extend RemoteStub and must have a
  public constructor that has one parameter of type RemoteRef.

  Finally, an instance of the stub class is constructed with a
  RemoteRef.

  If the appropriate stub class could not be found, or if the stub class
  could not be loaded, or if a problem occurs creating the stub instance, a
  StubNotFoundException is thrown.



  Stubs are dynamically generated by constructing an instance of
  a Proxy with the following characteristics:



  The proxy's class is defined by the class loader of the remote
  object's class.

  The proxy implements all the remote interfaces implemented by the
  remote object's class.

  The proxy's invocation handler is a RemoteObjectInvocationHandler instance constructed with a
  RemoteRef.

  If the proxy could not be created, a StubNotFoundException
  will be thrown."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.rmi.server UnicastRemoteObject]))

(defn *export-object
  "Exports the remote object to make it available to receive incoming
   calls, using a transport specified by the given socket factory.

   Either socket factory may be null, in which case
   the corresponding client or server socket creation method of
   RMISocketFactory is used instead.

  obj - the remote object to be exported - `java.rmi.Remote`
  port - the port to export the object on - `int`
  csf - the client-side socket factory for making calls to the remote object - `java.rmi.server.RMIClientSocketFactory`
  ssf - the server-side socket factory for receiving remote calls - `java.rmi.server.RMIServerSocketFactory`

  returns: remote object stub - `java.rmi.Remote`

  throws: java.rmi.RemoteException - if export fails"
  ([obj port csf ssf]
    (UnicastRemoteObject/exportObject obj port csf ssf))
  ([obj port]
    (UnicastRemoteObject/exportObject obj port))
  ([obj]
    (UnicastRemoteObject/exportObject obj)))

(defn *unexport-object
  "Removes the remote object, obj, from the RMI runtime. If
   successful, the object can no longer accept incoming RMI calls.
   If the force parameter is true, the object is forcibly unexported
   even if there are pending calls to the remote object or the
   remote object still has calls in progress.  If the force
   parameter is false, the object is only unexported if there are
   no pending or in progress calls to the object.

  obj - the remote object to be unexported - `java.rmi.Remote`
  force - if true, unexports the object even if there are pending or in-progress calls; if false, only unexports the object if there are no pending or in-progress calls - `boolean`

  returns: true if operation is successful, false otherwise - `boolean`

  throws: java.rmi.NoSuchObjectException - if the remote object is not currently exported"
  ([obj force]
    (UnicastRemoteObject/unexportObject obj force)))

(defn clone
  "Returns a clone of the remote object that is distinct from
   the original.

  returns: the new remote object - `java.lang.Object`

  throws: java.lang.CloneNotSupportedException - if clone failed due to a RemoteException."
  ([this]
    (-> this (.clone))))

