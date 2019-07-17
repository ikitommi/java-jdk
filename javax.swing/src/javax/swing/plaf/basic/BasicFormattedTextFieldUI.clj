(ns javax.swing.plaf.basic.BasicFormattedTextFieldUI
  "Provides the look and feel implementation for
  JFormattedTextField."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing.plaf.basic BasicFormattedTextFieldUI]))

(defn ->basic-formatted-text-field-ui
  "Constructor."
  ([]
    (new BasicFormattedTextFieldUI )))

(defn *create-ui
  "Creates a UI for a JFormattedTextField.

  c - the formatted text field - `javax.swing.JComponent`

  returns: the UI - `javax.swing.plaf.ComponentUI`"
  ([c]
    (BasicFormattedTextFieldUI/createUI c)))

