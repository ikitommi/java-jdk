(ns jdk.awt.CheckboxMenuItem
  "This class represents a check box that can be included in a menu.
  Selecting the check box in the menu changes its state from
  `on` to `off` or from `off` to `on.`

  The following picture depicts a menu which contains an instance
  of CheckBoxMenuItem:



  The item labeled Check shows a check box menu item
  in its `off` state.

  When a check box menu item is selected, AWT sends an item event to
  the item. Since the event is an instance of ItemEvent,
  the processEvent method examines the event and passes
  it along to processItemEvent. The latter method redirects
  the event to any ItemListener objects that have
  registered an interest in item events generated by this menu item."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.awt CheckboxMenuItem]))

(defn ->checkbox-menu-item
  "Constructor.

  Create a check box menu item with the specified label and state.

  label - a string label for the check box menu item, or null for an unlabeled menu item. - `java.lang.String`
  state - the initial state of the menu item, where true indicates `on` and false indicates `off.` - `boolean`

  throws: java.awt.HeadlessException - if GraphicsEnvironment.isHeadless() returns true"
  ([label state]
    (new CheckboxMenuItem label state))
  ([label]
    (new CheckboxMenuItem label))
  ([]
    (new CheckboxMenuItem )))

(defn add-item-listener
  "Adds the specified item listener to receive item events from
   this check box menu item.  Item events are sent in response to user
   actions, but not in response to calls to setState().
   If l is null, no exception is thrown and no action is performed.
   Refer to AWT Threading Issues for details on AWT's threading model.

  l - the item listener - `java.awt.event.ItemListener`"
  ([this l]
    (-> this (.addItemListener l))))

(defn remove-item-listener
  "Removes the specified item listener so that it no longer receives
   item events from this check box menu item.
   If l is null, no exception is thrown and no action is performed.
   Refer to AWT Threading Issues for details on AWT's threading model.

  l - the item listener - `java.awt.event.ItemListener`"
  ([this l]
    (-> this (.removeItemListener l))))

(defn set-state
  "Sets this check box menu item to the specified state.
   The boolean value true indicates `on` while
   false indicates `off.`

   Note that this method should be primarily used to
   initialize the state of the check box menu item.
   Programmatically setting the state of the check box
   menu item will not trigger
   an ItemEvent.  The only way to trigger an
   ItemEvent is by user interaction.

  b - true if the check box menu item is on, otherwise false - `boolean`"
  ([this b]
    (-> this (.setState b))))

(defn get-state?
  "Determines whether the state of this check box menu item
   is `on` or `off.`

  returns: the state of this check box menu item, where
                       true indicates `on` and
                       false indicates `off` - `boolean`"
  ([this]
    (-> this (.getState))))

(defn add-notify
  "Creates the peer of the checkbox item.  This peer allows us to
   change the look of the checkbox item without changing its
   functionality.
   Most applications do not call this method directly."
  ([this]
    (-> this (.addNotify))))

(defn get-accessible-context
  "Gets the AccessibleContext associated with this CheckboxMenuItem.
   For checkbox menu items, the AccessibleContext takes the
   form of an AccessibleAWTCheckboxMenuItem.
   A new AccessibleAWTCheckboxMenuItem is created if necessary.

  returns: an AccessibleAWTCheckboxMenuItem that serves as the
           AccessibleContext of this CheckboxMenuItem - `javax.accessibility.AccessibleContext`"
  ([this]
    (-> this (.getAccessibleContext))))

(defn param-string
  "Returns a string representing the state of this
   CheckBoxMenuItem. This
   method is intended to be used only for debugging purposes, and the
   content and format of the returned string may vary between
   implementations. The returned string may be empty but may not be
   null.

  returns: the parameter string of this check box menu item - `java.lang.String`"
  ([this]
    (-> this (.paramString))))

(defn get-selected-objects
  "Returns the an array (length 1) containing the checkbox menu item
   label or null if the checkbox is not selected.

  returns: `java.lang.Object[]`"
  ([this]
    (-> this (.getSelectedObjects))))

(defn get-listeners
  "Returns an array of all the objects currently registered
   as FooListeners
   upon this CheckboxMenuItem.
   FooListeners are registered using the
   addFooListener method.


   You can specify the listenerType argument
   with a class literal, such as
   FooListener.class.
   For example, you can query a
   CheckboxMenuItem c
   for its item listeners with the following code:



  ItemListener[] ils = (ItemListener[])(c.getListeners(ItemListener.class));

   If no such listeners exist, this method returns an empty array.

  listener-type - the type of listeners requested; this parameter should specify an interface that descends from java.util.EventListener - `java.lang.Class<T>`

  returns: an array of all objects registered as
            FooListeners on this checkbox menuitem,
            or an empty array if no such
            listeners have been added - `<T extends java.util.EventListener> T[]`

  throws: java.lang.ClassCastException - if listenerType doesn't specify a class or interface that implements java.util.EventListener"
  ([this listener-type]
    (-> this (.getListeners listener-type))))

(defn get-item-listeners
  "Returns an array of all the item listeners
   registered on this checkbox menuitem.

  returns: all of this checkbox menuitem's ItemListeners
           or an empty array if no item
           listeners are currently registered - `java.awt.event.ItemListener[]`"
  ([this]
    (-> this (.getItemListeners))))

