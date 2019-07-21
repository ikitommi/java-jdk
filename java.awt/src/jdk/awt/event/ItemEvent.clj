(ns jdk.awt.event.ItemEvent
  "A semantic event which indicates that an item was selected or deselected.
  This high-level event is generated by an ItemSelectable object (such as a
  List) when an item is selected or deselected by the user.
  The event is passed to every ItemListener object which
  registered to receive such events using the component's
  addItemListener method.

  The object that implements the ItemListener interface gets
  this ItemEvent when the event occurs. The listener is
  spared the details of processing individual mouse movements and mouse
  clicks, and can instead process a \"meaningful\" (semantic) event like
  \"item selected\" or \"item deselected\".

  An unspecified behavior will be caused if the id parameter
  of any particular ItemEvent instance is not
  in the range from ITEM_FIRST to ITEM_LAST.

  The stateChange of any ItemEvent instance takes one of the following
  values:

                       ItemEvent.SELECTED
                       ItemEvent.DESELECTED

  Assigning the value different from listed above will cause an unspecified behavior."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.awt.event ItemEvent]))

(defn ->item-event
  "Constructor.

  Constructs an ItemEvent object.
    This method throws an
   IllegalArgumentException if source
   is null.

  source - The ItemSelectable object that originated the event - `java.awt.ItemSelectable`
  id - The integer that identifies the event type. For information on allowable values, see the class description for ItemEvent - `int`
  item - An object -- the item affected by the event - `java.lang.Object`
  state-change - An integer that indicates whether the item was selected or deselected. For information on allowable values, see the class description for ItemEvent - `int`

  throws: java.lang.IllegalArgumentException - if source is null"
  (^ItemEvent [^java.awt.ItemSelectable source ^Integer id ^java.lang.Object item ^Integer state-change]
    (new ItemEvent source id item state-change)))

(def *-item-first
  "Static Constant.

  The first number in the range of ids used for item events.

  type: int"
  ItemEvent/ITEM_FIRST)

(def *-item-last
  "Static Constant.

  The last number in the range of ids used for item events.

  type: int"
  ItemEvent/ITEM_LAST)

(def *-item-state-changed
  "Static Constant.

  This event id indicates that an item's state changed.

  type: int"
  ItemEvent/ITEM_STATE_CHANGED)

(def *-selected
  "Static Constant.

  This state-change value indicates that an item was selected.

  type: int"
  ItemEvent/SELECTED)

(def *-deselected
  "Static Constant.

  This state-change-value indicates that a selected item was deselected.

  type: int"
  ItemEvent/DESELECTED)

(defn get-item-selectable
  "Returns the originator of the event.

  returns: the ItemSelectable object that originated the event. - `java.awt.ItemSelectable`"
  (^java.awt.ItemSelectable [^ItemEvent this]
    (-> this (.getItemSelectable))))

(defn get-item
  "Returns the item affected by the event.

  returns: the item (object) that was affected by the event - `java.lang.Object`"
  (^java.lang.Object [^ItemEvent this]
    (-> this (.getItem))))

(defn get-state-change
  "Returns the type of state change (selected or deselected).

  returns: an integer that indicates whether the item was selected
           or deselected - `int`"
  (^Integer [^ItemEvent this]
    (-> this (.getStateChange))))

(defn param-string
  "Returns a parameter string identifying this item event.
   This method is useful for event-logging and for debugging.

  returns: a string identifying the event and its attributes - `java.lang.String`"
  (^java.lang.String [^ItemEvent this]
    (-> this (.paramString))))

