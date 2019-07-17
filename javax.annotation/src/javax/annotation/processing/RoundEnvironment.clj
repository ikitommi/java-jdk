(ns javax.annotation.processing.RoundEnvironment
  "An annotation processing tool framework will provide an annotation processor with an object
  implementing this interface so that the processor can query for
  information about a round of annotation processing."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.annotation.processing RoundEnvironment]))

(defn processing-over
  "Returns true if types generated by this round will not
   be subject to a subsequent round of annotation processing;
   returns false otherwise.

  returns: true if types generated by this round will not
   be subject to a subsequent round of annotation processing;
   returns false otherwise - `boolean`"
  (^Boolean [^javax.annotation.processing.RoundEnvironment this]
    (-> this (.processingOver))))

(defn error-raised
  "Returns true if an error was raised in the prior round
   of processing; returns false otherwise.

  returns: true if an error was raised in the prior round
   of processing; returns false otherwise - `boolean`"
  (^Boolean [^javax.annotation.processing.RoundEnvironment this]
    (-> this (.errorRaised))))

(defn get-root-elements
  "Returns the root elements for annotation processing generated
   by the prior round.

  returns: the root elements for annotation processing generated
   by the prior round, or an empty set if there were none - `java.util.Set<? extends javax.lang.model.element.Element>`"
  ([^javax.annotation.processing.RoundEnvironment this]
    (-> this (.getRootElements))))

(defn get-elements-annotated-with
  "Returns the elements annotated with the given annotation type.
   The annotation may appear directly or be inherited.  Only
   package elements and type elements included in this
   round of annotation processing, or declarations of members,
   constructors, parameters, or type parameters declared within
   those, are returned.  Included type elements are root types and any member types nested within
   them.  Elements in a package are not considered included simply
   because a package-info file for that package was
   created.

  a - annotation type being requested - `javax.lang.model.element.TypeElement`

  returns: the elements annotated with the given annotation type,
   or an empty set if there are none - `java.util.Set<? extends javax.lang.model.element.Element>`

  throws: java.lang.IllegalArgumentException - if the argument does not represent an annotation type"
  ([^javax.annotation.processing.RoundEnvironment this ^javax.lang.model.element.TypeElement a]
    (-> this (.getElementsAnnotatedWith a))))

