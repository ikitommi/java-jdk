(ns javax.lang.model.util.SimpleTypeVisitor6
  "A simple visitor of types with default behavior appropriate for the
  RELEASE_6 source version.

  Visit methods corresponding to RELEASE_6 language
  constructs call defaultAction, passing their
  arguments to defaultAction's corresponding parameters.

  For constructs introduced in RELEASE_7 and later, visitUnknown is called instead.

   Methods in this class may be overridden subject to their
  general contract.  Note that annotating methods in concrete
  subclasses with @Override will help
  ensure that methods are overridden as intended.

   WARNING: The TypeVisitor interface implemented
  by this class may have methods added to it in the future to
  accommodate new, currently unknown, language structures added to
  future versions of the Java™ programming language.
  Therefore, methods whose names begin with `visit` may be
  added to this class in the future; to avoid incompatibilities,
  classes which extend this class should not declare any instance
  methods with names beginning with `visit`.

  When such a new visit method is added, the default
  implementation in this class will be to call the visitUnknown method.  A new simple type visitor
  class will also be introduced to correspond to the new language
  level; this visitor will have different default behavior for the
  visit method in question.  When the new visitor is introduced, all
  or portions of this visitor may be deprecated.

  Note that adding a default implementation of a new visit method
  in a visitor class will occur instead of adding a default
  method directly in the visitor interface since a Java SE 8
  language feature cannot be used to this version of the API since
  this version is required to be runnable on Java SE 7
  implementations.  Future versions of the API that are only required
  to run on Java SE 8 and later may take advantage of default methods
  in this situation."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.lang.model.util SimpleTypeVisitor6]))

(defn visit-declared
  "Visits a declared type. This implementation calls defaultAction.

  t - the type to visit - `javax.lang.model.type.DeclaredType`
  p - a visitor-specified parameter - `SimpleTypeVisitor6.P`

  returns: the result of defaultAction - `SimpleTypeVisitor6.R`"
  (^SimpleTypeVisitor6.R [^javax.lang.model.util.SimpleTypeVisitor6 this ^javax.lang.model.type.DeclaredType t ^SimpleTypeVisitor6.P p]
    (-> this (.visitDeclared t p))))

(defn visit-array
  "Visits an array type. This implementation calls defaultAction.

  t - the type to visit - `javax.lang.model.type.ArrayType`
  p - a visitor-specified parameter - `SimpleTypeVisitor6.P`

  returns: the result of defaultAction - `SimpleTypeVisitor6.R`"
  (^SimpleTypeVisitor6.R [^javax.lang.model.util.SimpleTypeVisitor6 this ^javax.lang.model.type.ArrayType t ^SimpleTypeVisitor6.P p]
    (-> this (.visitArray t p))))

(defn visit-type-variable
  "Visits a type variable. This implementation calls defaultAction.

  t - the type to visit - `javax.lang.model.type.TypeVariable`
  p - a visitor-specified parameter - `SimpleTypeVisitor6.P`

  returns: the result of defaultAction - `SimpleTypeVisitor6.R`"
  (^SimpleTypeVisitor6.R [^javax.lang.model.util.SimpleTypeVisitor6 this ^javax.lang.model.type.TypeVariable t ^SimpleTypeVisitor6.P p]
    (-> this (.visitTypeVariable t p))))

(defn visit-null
  "Visits the null type. This implementation calls defaultAction.

  t - the type to visit - `javax.lang.model.type.NullType`
  p - a visitor-specified parameter - `SimpleTypeVisitor6.P`

  returns: the result of defaultAction - `SimpleTypeVisitor6.R`"
  (^SimpleTypeVisitor6.R [^javax.lang.model.util.SimpleTypeVisitor6 this ^javax.lang.model.type.NullType t ^SimpleTypeVisitor6.P p]
    (-> this (.visitNull t p))))

(defn visit-no-type
  "Visits a NoType instance. This implementation calls defaultAction.

  t - the type to visit - `javax.lang.model.type.NoType`
  p - a visitor-specified parameter - `SimpleTypeVisitor6.P`

  returns: the result of defaultAction - `SimpleTypeVisitor6.R`"
  (^SimpleTypeVisitor6.R [^javax.lang.model.util.SimpleTypeVisitor6 this ^javax.lang.model.type.NoType t ^SimpleTypeVisitor6.P p]
    (-> this (.visitNoType t p))))

(defn visit-wildcard
  "Visits a wildcard type. This implementation calls defaultAction.

  t - the type to visit - `javax.lang.model.type.WildcardType`
  p - a visitor-specified parameter - `SimpleTypeVisitor6.P`

  returns: the result of defaultAction - `SimpleTypeVisitor6.R`"
  (^SimpleTypeVisitor6.R [^javax.lang.model.util.SimpleTypeVisitor6 this ^javax.lang.model.type.WildcardType t ^SimpleTypeVisitor6.P p]
    (-> this (.visitWildcard t p))))

(defn visit-primitive
  "Visits a primitive type. This implementation calls defaultAction.

  t - the type to visit - `javax.lang.model.type.PrimitiveType`
  p - a visitor-specified parameter - `SimpleTypeVisitor6.P`

  returns: the result of defaultAction - `SimpleTypeVisitor6.R`"
  (^SimpleTypeVisitor6.R [^javax.lang.model.util.SimpleTypeVisitor6 this ^javax.lang.model.type.PrimitiveType t ^SimpleTypeVisitor6.P p]
    (-> this (.visitPrimitive t p))))

(defn visit-executable
  "Visits an executable type. This implementation calls defaultAction.

  t - the type to visit - `javax.lang.model.type.ExecutableType`
  p - a visitor-specified parameter - `SimpleTypeVisitor6.P`

  returns: the result of defaultAction - `SimpleTypeVisitor6.R`"
  (^SimpleTypeVisitor6.R [^javax.lang.model.util.SimpleTypeVisitor6 this ^javax.lang.model.type.ExecutableType t ^SimpleTypeVisitor6.P p]
    (-> this (.visitExecutable t p))))

(defn visit-error
  "Visits an error type. This implementation calls defaultAction.

  t - the type to visit - `javax.lang.model.type.ErrorType`
  p - a visitor-specified parameter - `SimpleTypeVisitor6.P`

  returns: the result of defaultAction - `SimpleTypeVisitor6.R`"
  (^SimpleTypeVisitor6.R [^javax.lang.model.util.SimpleTypeVisitor6 this ^javax.lang.model.type.ErrorType t ^SimpleTypeVisitor6.P p]
    (-> this (.visitError t p))))

