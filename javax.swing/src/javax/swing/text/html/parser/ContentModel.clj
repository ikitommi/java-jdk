(ns javax.swing.text.html.parser.ContentModel
  "A representation of a content model. A content model is
  basically a restricted BNF expression. It is restricted in
  the sense that it must be deterministic. This means that you
  don't have to represent it as a finite state automaton.
  See Annex H on page 556 of the SGML handbook for more information."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing.text.html.parser ContentModel]))

(defn ->content-model
  "Constructor.

  Create a content model of a particular type.

  type - `int`
  content - `java.lang.Object`
  next - `javax.swing.text.html.parser.ContentModel`"
  ([type content next]
    (new ContentModel type content next))
  ([type content]
    (new ContentModel type content))
  ([content]
    (new ContentModel content))
  ([]
    (new ContentModel )))

(defn -type
  "Instance Field.

  Type. Either '*', '?', '+', ',', '|', '&'.

  type: int"
  [this]
  (-> this .-type))

(defn -content
  "Instance Field.

  The content. Either an Element or a ContentModel.

  type: java.lang.Object"
  [this]
  (-> this .-content))

(defn -next
  "Instance Field.

  The next content model (in a ',', '|' or '&' expression).

  type: javax.swing.text.html.parser.ContentModel"
  [this]
  (-> this .-next))

(defn empty
  "Return true if the content model could
   match an empty input stream.

  returns: `boolean`"
  ([this]
    (-> this (.empty))))

(defn get-elements
  "Update elemVec with the list of elements that are
   part of the this contentModel.

  elem-vec - `java.util.Vector<javax.swing.text.html.parser.Element>`"
  ([this elem-vec]
    (-> this (.getElements elem-vec))))

(defn first
  "Return true if the token could potentially be the
   first token in the input stream.

  token - `java.lang.Object`

  returns: `boolean`"
  ([this token]
    (-> this (.first token)))
  ([this]
    (-> this (.first))))

(defn to-string
  "Convert to a string.

  returns: a string representation of the object. - `java.lang.String`"
  ([this]
    (-> this (.toString))))

