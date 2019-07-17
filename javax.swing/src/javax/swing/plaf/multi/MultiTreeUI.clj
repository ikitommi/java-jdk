(ns javax.swing.plaf.multi.MultiTreeUI
  "A multiplexing UI used to combine TreeUIs.

  This file was automatically generated by AutoMulti."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing.plaf.multi MultiTreeUI]))

(defn ->multi-tree-ui
  "Constructor."
  ([]
    (new MultiTreeUI )))

(defn *create-ui
  "Returns a multiplexing UI instance if any of the auxiliary
   LookAndFeels supports this UI.  Otherwise, just returns the
   UI object obtained from the default LookAndFeel.

  a - `javax.swing.JComponent`

  returns: `javax.swing.plaf.ComponentUI`"
  ([a]
    (MultiTreeUI/createUI a)))

(defn install-ui
  "Invokes the installUI method on each UI handled by this object.

  a - the component where this UI delegate is being installed - `javax.swing.JComponent`"
  ([this a]
    (-> this (.installUI a))))

(defn get-minimum-size
  "Invokes the getMinimumSize method on each UI handled by this object.

  a - the component whose minimum size is being queried; this argument is often ignored, but might be used if the UI object is stateless and shared by multiple components - `javax.swing.JComponent`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `java.awt.Dimension`"
  ([this a]
    (-> this (.getMinimumSize a))))

(defn get-row-for-path
  "Invokes the getRowForPath method on each UI handled by this object.

  a - `javax.swing.JTree`
  b - `javax.swing.tree.TreePath`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `int`"
  ([this a b]
    (-> this (.getRowForPath a b))))

(defn get-maximum-size
  "Invokes the getMaximumSize method on each UI handled by this object.

  a - the component whose maximum size is being queried; this argument is often ignored, but might be used if the UI object is stateless and shared by multiple components - `javax.swing.JComponent`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `java.awt.Dimension`"
  ([this a]
    (-> this (.getMaximumSize a))))

(defn get-accessible-child
  "Invokes the getAccessibleChild method on each UI handled by this object.

  a - `javax.swing.JComponent`
  b - `int`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `javax.accessibility.Accessible`"
  ([this a b]
    (-> this (.getAccessibleChild a b))))

(defn get-u-is
  "Returns the list of UIs associated with this multiplexing UI.  This
   allows processing of the UIs by an application aware of multiplexing
   UIs on components.

  returns: `javax.swing.plaf.ComponentUI[]`"
  ([this]
    (-> this (.getUIs))))

(defn get-path-bounds
  "Invokes the getPathBounds method on each UI handled by this object.

  a - `javax.swing.JTree`
  b - `javax.swing.tree.TreePath`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `java.awt.Rectangle`"
  ([this a b]
    (-> this (.getPathBounds a b))))

(defn uninstall-ui
  "Invokes the uninstallUI method on each UI handled by this object.

  a - the component from which this UI delegate is being removed; this argument is often ignored, but might be used if the UI object is stateless and shared by multiple components - `javax.swing.JComponent`"
  ([this a]
    (-> this (.uninstallUI a))))

(defn contains
  "Invokes the contains method on each UI handled by this object.

  a - the component where the x,y location is being queried; this argument is often ignored, but might be used if the UI object is stateless and shared by multiple components - `javax.swing.JComponent`
  b - the x coordinate of the point - `int`
  c - the y coordinate of the point - `int`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `boolean`"
  ([this a b c]
    (-> this (.contains a b c))))

(defn get-row-count
  "Invokes the getRowCount method on each UI handled by this object.

  a - `javax.swing.JTree`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `int`"
  ([this a]
    (-> this (.getRowCount a))))

(defn update
  "Invokes the update method on each UI handled by this object.

  a - the Graphics context in which to paint - `java.awt.Graphics`
  b - the component being painted; this argument is often ignored, but might be used if the UI object is stateless and shared by multiple components - `javax.swing.JComponent`"
  ([this a b]
    (-> this (.update a b))))

(defn get-accessible-children-count
  "Invokes the getAccessibleChildrenCount method on each UI handled by this object.

  a - `javax.swing.JComponent`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `int`"
  ([this a]
    (-> this (.getAccessibleChildrenCount a))))

(defn get-closest-path-for-location
  "Invokes the getClosestPathForLocation method on each UI handled by this object.

  a - `javax.swing.JTree`
  b - `int`
  c - `int`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `javax.swing.tree.TreePath`"
  ([this a b c]
    (-> this (.getClosestPathForLocation a b c))))

(defn paint
  "Invokes the paint method on each UI handled by this object.

  a - the Graphics context in which to paint - `java.awt.Graphics`
  b - the component being painted; this argument is often ignored, but might be used if the UI object is stateless and shared by multiple components - `javax.swing.JComponent`"
  ([this a b]
    (-> this (.paint a b))))

(defn get-path-for-row
  "Invokes the getPathForRow method on each UI handled by this object.

  a - `javax.swing.JTree`
  b - `int`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `javax.swing.tree.TreePath`"
  ([this a b]
    (-> this (.getPathForRow a b))))

(defn get-editing-path
  "Invokes the getEditingPath method on each UI handled by this object.

  a - `javax.swing.JTree`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `javax.swing.tree.TreePath`"
  ([this a]
    (-> this (.getEditingPath a))))

(defn editing?
  "Invokes the isEditing method on each UI handled by this object.

  a - `javax.swing.JTree`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `boolean`"
  ([this a]
    (-> this (.isEditing a))))

(defn start-editing-at-path
  "Invokes the startEditingAtPath method on each UI handled by this object.

  a - `javax.swing.JTree`
  b - `javax.swing.tree.TreePath`"
  ([this a b]
    (-> this (.startEditingAtPath a b))))

(defn get-preferred-size
  "Invokes the getPreferredSize method on each UI handled by this object.

  a - the component whose preferred size is being queried; this argument is often ignored, but might be used if the UI object is stateless and shared by multiple components - `javax.swing.JComponent`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `java.awt.Dimension`"
  ([this a]
    (-> this (.getPreferredSize a))))

(defn cancel-editing
  "Invokes the cancelEditing method on each UI handled by this object.

  a - `javax.swing.JTree`"
  ([this a]
    (-> this (.cancelEditing a))))

(defn stop-editing
  "Invokes the stopEditing method on each UI handled by this object.

  a - `javax.swing.JTree`

  returns: the value obtained from the first UI, which is
   the UI obtained from the default LookAndFeel - `boolean`"
  ([this a]
    (-> this (.stopEditing a))))

