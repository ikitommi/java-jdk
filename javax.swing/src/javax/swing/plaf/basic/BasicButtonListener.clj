(ns javax.swing.plaf.basic.BasicButtonListener
  "Button Listener"
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing.plaf.basic BasicButtonListener]))

(defn ->basic-button-listener
  "Constructor.

  b - `javax.swing.AbstractButton`"
  ([b]
    (new BasicButtonListener b)))

(defn uninstall-keyboard-actions
  "Unregister's default key actions

  c - `javax.swing.JComponent`"
  ([this c]
    (-> this (.uninstallKeyboardActions c))))

(defn state-changed
  "Description copied from interface: ChangeListener

  e - a ChangeEvent object - `javax.swing.event.ChangeEvent`"
  ([this e]
    (-> this (.stateChanged e))))

(defn mouse-moved
  "Description copied from interface: MouseMotionListener

  e - `java.awt.event.MouseEvent`"
  ([this e]
    (-> this (.mouseMoved e))))

(defn focus-gained
  "Description copied from interface: FocusListener

  e - `java.awt.event.FocusEvent`"
  ([this e]
    (-> this (.focusGained e))))

(defn mouse-pressed
  "Description copied from interface: MouseListener

  e - `java.awt.event.MouseEvent`"
  ([this e]
    (-> this (.mousePressed e))))

(defn mouse-released
  "Description copied from interface: MouseListener

  e - `java.awt.event.MouseEvent`"
  ([this e]
    (-> this (.mouseReleased e))))

(defn property-change
  "Description copied from interface: PropertyChangeListener

  e - A PropertyChangeEvent object describing the event source and the property that has changed. - `java.beans.PropertyChangeEvent`"
  ([this e]
    (-> this (.propertyChange e))))

(defn focus-lost
  "Description copied from interface: FocusListener

  e - `java.awt.event.FocusEvent`"
  ([this e]
    (-> this (.focusLost e))))

(defn mouse-exited
  "Description copied from interface: MouseListener

  e - `java.awt.event.MouseEvent`"
  ([this e]
    (-> this (.mouseExited e))))

(defn mouse-entered
  "Description copied from interface: MouseListener

  e - `java.awt.event.MouseEvent`"
  ([this e]
    (-> this (.mouseEntered e))))

(defn mouse-dragged
  "Description copied from interface: MouseMotionListener

  e - `java.awt.event.MouseEvent`"
  ([this e]
    (-> this (.mouseDragged e))))

(defn install-keyboard-actions
  "Register default key actions: pressing space to `click` a
   button and registring the keyboard mnemonic (if any).

  c - `javax.swing.JComponent`"
  ([this c]
    (-> this (.installKeyboardActions c))))

(defn mouse-clicked
  "Description copied from interface: MouseListener

  e - `java.awt.event.MouseEvent`"
  ([this e]
    (-> this (.mouseClicked e))))

