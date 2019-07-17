(ns javax.swing.plaf.synth.SynthComboBoxUI
  "Provides the Synth L&F UI delegate for
  JComboBox."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing.plaf.synth SynthComboBoxUI]))

(defn ->synth-combo-box-ui
  "Constructor."
  ([]
    (new SynthComboBoxUI )))

(defn *create-ui
  "Creates a new UI object for the given component.

  c - component to create UI object for - `javax.swing.JComponent`

  returns: the UI object - `javax.swing.plaf.ComponentUI`"
  ([c]
    (SynthComboBoxUI/createUI c)))

(defn install-ui
  "Configures the specified component appropriately for the look and feel.
   This method is invoked when the ComponentUI instance is being installed
   as the UI delegate on the specified component.  This method should
   completely configure the component for the look and feel,
   including the following:

   Install default property values for color, fonts, borders,
       icons, opacity, etc. on the component.  Whenever possible,
       property values initialized by the client program should not
       be overridden.
   Install a LayoutManager on the component if necessary.
   Create/add any required sub-components to the component.
   Create/install event listeners on the component.
   Create/install a PropertyChangeListener on the component in order
       to detect and respond to component property changes appropriately.
   Install keyboard UI (mnemonics, traversal, etc.) on the component.
   Initialize any appropriate instance data.


   Overridden to ensure that ButtonHandler is created prior to any of
   the other installXXX methods, since several of them reference
   buttonHandler.

  c - the component where this UI delegate is being installed - `javax.swing.JComponent`"
  ([this c]
    (-> this (.installUI c))))

(defn uninstall-ui
  "Reverses configuration which was done on the specified component during
   installUI.  This method is invoked when this
   UIComponent instance is being removed as the UI delegate
   for the specified component.  This method should undo the
   configuration performed in installUI, being careful to
   leave the JComponent instance in a clean state (no
   extraneous listeners, look-and-feel-specific property objects, etc.).
   This should include the following:

   Remove any UI-set borders from the component.
   Remove any UI-set layout managers on the component.
   Remove any UI-added sub-components from the component.
   Remove any UI-added event/property listeners from the component.
   Remove any UI-installed keyboard UI from the component.
   Nullify any allocated instance data objects to allow for GC.

  c - the component from which this UI delegate is being removed; this argument is often ignored, but might be used if the UI object is stateless and shared by multiple components - `javax.swing.JComponent`"
  ([this c]
    (-> this (.uninstallUI c))))

(defn get-context
  "Returns the Context for the specified component.

  c - Component requesting SynthContext. - `javax.swing.JComponent`

  returns: SynthContext describing component. - `javax.swing.plaf.synth.SynthContext`"
  ([this c]
    (-> this (.getContext c))))

(defn property-change
  "This method gets called when a bound property is changed.

  e - A PropertyChangeEvent object describing the event source and the property that has changed. - `java.beans.PropertyChangeEvent`"
  ([this e]
    (-> this (.propertyChange e))))

(defn update
  "Notifies this UI delegate to repaint the specified component.
   This method paints the component background, then calls
   the paint(SynthContext,Graphics) method.

   In general, this method does not need to be overridden by subclasses.
   All Look and Feel rendering code should reside in the paint method.

  g - the Graphics object used for painting - `java.awt.Graphics`
  c - the component being painted - `javax.swing.JComponent`"
  ([this g c]
    (-> this (.update g c))))

(defn paint
  "Paints the specified component according to the Look and Feel.
   This method is not used by Synth Look and Feel.
   Painting is handled by the paint(SynthContext,Graphics) method.

  g - the Graphics object used for painting - `java.awt.Graphics`
  c - the component being painted - `javax.swing.JComponent`"
  ([this g c]
    (-> this (.paint g c))))

(defn paint-border
  "Paints the border.

  context - a component context - `javax.swing.plaf.synth.SynthContext`
  g - Graphics to paint on - `java.awt.Graphics`
  x - the X coordinate - `int`
  y - the Y coordinate - `int`
  w - width of the border - `int`
  h - height of the border - `int`"
  ([this context g x y w h]
    (-> this (.paintBorder context g x y w h))))

(defn paint-current-value
  "Paints the currently selected item.

  g - `java.awt.Graphics`
  bounds - `java.awt.Rectangle`
  has-focus - `boolean`"
  ([this g bounds has-focus]
    (-> this (.paintCurrentValue g bounds has-focus))))

