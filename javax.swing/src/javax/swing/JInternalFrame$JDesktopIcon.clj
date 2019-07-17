(ns javax.swing.JInternalFrame$JDesktopIcon
  "This component represents an iconified version of a
  JInternalFrame.
  This API should NOT BE USED by Swing applications, as it will go
  away in future versions of Swing as its functionality is moved into
  JInternalFrame.  This class is public only so that
  UI objects can display a desktop icon.  If an application
  wants to display a desktop icon, it should create a
  JInternalFrame instance and iconify it.

  Warning:
  Serialized objects of this class will not be compatible with
  future Swing releases. The current serialization support is
  appropriate for short term storage or RMI between applications running
  the same version of Swing.  As of 1.4, support for long term storage
  of all JavaBeans™
  has been added to the java.beans package.
  Please see XMLEncoder."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing JInternalFrame$JDesktopIcon]))

(defn ->j-desktop-icon
  "Constructor.

  Creates an icon for an internal frame.

  f - the JInternalFrame for which the icon is created - `javax.swing.JInternalFrame`"
  ([f]
    (new JInternalFrame$JDesktopIcon f)))

(defn get-ui
  "Returns the look-and-feel object that renders this component.

  returns: the DesktopIconUI object that renders
                this component - `javax.swing.plaf.DesktopIconUI`"
  ([this]
    (-> this (.getUI))))

(defn set-ui
  "Sets the look-and-feel object that renders this component.

  ui - the DesktopIconUI look-and-feel object - `javax.swing.plaf.DesktopIconUI`"
  ([this ui]
    (-> this (.setUI ui))))

(defn get-internal-frame
  "Returns the JInternalFrame that this
   DesktopIcon is associated with.

  returns: the JInternalFrame with which this icon
                is associated - `javax.swing.JInternalFrame`"
  ([this]
    (-> this (.getInternalFrame))))

(defn set-internal-frame
  "Sets the JInternalFrame with which this
   DesktopIcon is associated.

  f - the JInternalFrame with which this icon is associated - `javax.swing.JInternalFrame`"
  ([this f]
    (-> this (.setInternalFrame f))))

(defn get-desktop-pane
  "Convenience method to ask the icon for the Desktop
   object it belongs to.

  returns: the JDesktopPane that contains this
             icon's internal frame, or null if none found - `javax.swing.JDesktopPane`"
  ([this]
    (-> this (.getDesktopPane))))

(defn update-ui
  "Notification from the UIManager that the look and feel
   has changed.
   Replaces the current UI object with the latest version from the
   UIManager."
  ([this]
    (-> this (.updateUI))))

(defn get-ui-class-id
  "Returns the name of the look-and-feel
   class that renders this component.

  returns: the string `DesktopIconUI` - `java.lang.String`"
  ([this]
    (-> this (.getUIClassID))))

(defn get-accessible-context
  "Gets the AccessibleContext associated with this JDesktopIcon.
   For desktop icons, the AccessibleContext takes the form of an
   AccessibleJDesktopIcon.
   A new AccessibleJDesktopIcon instance is created if necessary.

  returns: an AccessibleJDesktopIcon that serves as the
           AccessibleContext of this JDesktopIcon - `javax.accessibility.AccessibleContext`"
  ([this]
    (-> this (.getAccessibleContext))))

