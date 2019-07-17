(ns javax.swing.JToolTip
  "Used to display a `Tip` for a Component. Typically components provide api
  to automate the process of using ToolTips.
  For example, any Swing component can use the JComponent
  setToolTipText method to specify the text
  for a standard tooltip. A component that wants to create a custom
  ToolTip
  display can override JComponent's createToolTip
  method and use a subclass of this class.

  See How to Use Tool Tips
  in The Java Tutorial
  for further documentation.

  Warning: Swing is not thread safe. For more
  information see Swing's Threading
  Policy.

  Warning:
  Serialized objects of this class will not be compatible with
  future Swing releases. The current serialization support is
  appropriate for short term storage or RMI between applications running
  the same version of Swing.  As of 1.4, support for long term storage
  of all JavaBeans™
  has been added to the java.beans package.
  Please see XMLEncoder."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing JToolTip]))

(defn ->j-tool-tip
  "Constructor.

  Creates a tool tip."
  ([]
    (new JToolTip )))

(defn get-ui
  "Returns the L&F object that renders this component.

  returns: the ToolTipUI object that renders this component - `javax.swing.plaf.ToolTipUI`"
  ([this]
    (-> this (.getUI))))

(defn update-ui
  "Resets the UI property to a value from the current look and feel."
  ([this]
    (-> this (.updateUI))))

(defn get-ui-class-id
  "Returns the name of the L&F class that renders this component.

  returns: the string `ToolTipUI` - `java.lang.String`"
  ([this]
    (-> this (.getUIClassID))))

(defn set-tip-text
  "Sets the text to show when the tool tip is displayed.
   The string tipText may be null.

  tip-text - the String to display - `java.lang.String`"
  ([this tip-text]
    (-> this (.setTipText tip-text))))

(defn get-tip-text
  "Returns the text that is shown when the tool tip is displayed.
   The returned value may be null.

  returns: the String that is displayed - `java.lang.String`"
  ([this]
    (-> this (.getTipText))))

(defn set-component
  "Specifies the component that the tooltip describes.
   The component c may be null
   and will have no effect.

   This is a bound property.

  c - the JComponent being described - `javax.swing.JComponent`"
  ([this c]
    (-> this (.setComponent c))))

(defn get-component
  "Returns the component the tooltip applies to.
   The returned value may be null.

  returns: the component that the tooltip describes - `javax.swing.JComponent`"
  ([this]
    (-> this (.getComponent))))

(defn get-accessible-context
  "Gets the AccessibleContext associated with this JToolTip.
   For tool tips, the AccessibleContext takes the form of an
   AccessibleJToolTip.
   A new AccessibleJToolTip instance is created if necessary.

  returns: an AccessibleJToolTip that serves as the
           AccessibleContext of this JToolTip - `javax.accessibility.AccessibleContext`"
  ([this]
    (-> this (.getAccessibleContext))))

