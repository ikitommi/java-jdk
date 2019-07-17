(ns javax.swing.JViewport
  "The `viewport` or `porthole` through which you see the underlying
  information. When you scroll, what moves is the viewport. It is like
  peering through a camera's viewfinder. Moving the viewfinder upwards
  brings new things into view at the top of the picture and loses
  things that were at the bottom.

  By default, JViewport is opaque. To change this, use the
  setOpaque method.

  NOTE:We have implemented a faster scrolling algorithm that
  does not require a buffer to draw in. The algorithm works as follows:
  The view and parent view and checked to see if they are
  JComponents,
  if they aren't, stop and repaint the whole viewport.
  If the viewport is obscured by an ancestor, stop and repaint the whole
  viewport.
  Compute the region that will become visible, if it is as big as
  the viewport, stop and repaint the whole view region.
  Obtain the ancestor Window's graphics and
  do a copyArea on the scrolled region.
  Message the view to repaint the newly visible region.
  The next time paint is invoked on the viewport, if the clip region
  is smaller than the viewport size a timer is kicked off to repaint the
  whole region.

  In general this approach is much faster. Compared to the backing store
  approach this avoids the overhead of maintaining an offscreen buffer and
  having to do two copyAreas.
  Compared to the non backing store case this
  approach will greatly reduce the painted region.

  This approach can cause slower times than the backing store approach
  when the viewport is obscured by another window, or partially offscreen.
  When another window
  obscures the viewport the copyArea will copy garbage and a
  paint event will be generated by the system to inform us we need to
  paint the newly exposed region. The only way to handle this is to
  repaint the whole viewport, which can cause slower performance than the
  backing store case. In most applications very rarely will the user be
  scrolling while the viewport is obscured by another window or offscreen,
  so this optimization is usually worth the performance hit when obscured.

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
  (:import [javax.swing JViewport]))

(defn ->j-viewport
  "Constructor.

  Creates a JViewport."
  ([]
    (new JViewport )))

(def *-blit-scroll-mode
  "Static Constant.

  Use graphics.copyArea to implement scrolling.
   This is the fastest for most applications.

  type: int"
  JViewport/BLIT_SCROLL_MODE)

(def *-backingstore-scroll-mode
  "Static Constant.

  Draws viewport contents into an offscreen image.
   This was previously the default mode for JTable.
   This mode may offer advantages over `blit mode`
   in some cases, but it requires a large chunk of extra RAM.

  type: int"
  JViewport/BACKINGSTORE_SCROLL_MODE)

(def *-simple-scroll-mode
  "Static Constant.

  This mode uses the very simple method of redrawing the entire
   contents of the scrollpane each time it is scrolled.
   This was the default behavior in Swing 1.0 and Swing 1.1.
   Either of the other two options will provide better performance
   in most cases.

  type: int"
  JViewport/SIMPLE_SCROLL_MODE)

(defn add-change-listener
  "Adds a ChangeListener to the list that is
   notified each time the view's
   size, position, or the viewport's extent size has changed.

  l - the ChangeListener to add - `javax.swing.event.ChangeListener`"
  ([^javax.swing.JViewport this ^javax.swing.event.ChangeListener l]
    (-> this (.addChangeListener l))))

(defn get-view
  "Returns the JViewport's one child or null.

  returns: the viewports child, or null if none exists - `java.awt.Component`"
  (^java.awt.Component [^javax.swing.JViewport this]
    (-> this (.getView))))

(defn get-scroll-mode
  "Returns the current scrolling mode.

  returns: the scrollMode property - `int`"
  (^Integer [^javax.swing.JViewport this]
    (-> this (.getScrollMode))))

(defn get-view-position
  "Returns the view coordinates that appear in the upper left
   hand corner of the viewport, or 0,0 if there's no view.

  returns: a Point object giving the upper left coordinates - `java.awt.Point`"
  (^java.awt.Point [^javax.swing.JViewport this]
    (-> this (.getViewPosition))))

(defn get-insets
  "Returns an Insets object containing this
   JViewports inset values.  The passed-in
   Insets object will be reinitialized, and
   all existing values within this object are overwritten.

  insets - the Insets object which can be reused - `java.awt.Insets`

  returns: this viewports inset values - `java.awt.Insets`"
  (^java.awt.Insets [^javax.swing.JViewport this ^java.awt.Insets insets]
    (-> this (.getInsets insets)))
  (^java.awt.Insets [^javax.swing.JViewport this]
    (-> this (.getInsets))))

(defn scroll-rect-to-visible
  "Scrolls the view so that Rectangle
   within the view becomes visible.

   This attempts to validate the view before scrolling if the
   view is currently not valid - isValid returns false.
   To avoid excessive validation when the containment hierarchy is
   being created this will not validate if one of the ancestors does not
   have a peer, or there is no validate root ancestor, or one of the
   ancestors is not a Window or Applet.

   Note that this method will not scroll outside of the
   valid viewport; for example, if contentRect is larger
   than the viewport, scrolling will be confined to the viewport's
   bounds.

  content-rect - the Rectangle to display - `java.awt.Rectangle`"
  ([^javax.swing.JViewport this ^java.awt.Rectangle content-rect]
    (-> this (.scrollRectToVisible content-rect))))

(defn get-extent-size
  "Returns the size of the visible part of the view in view coordinates.

  returns: a Dimension object giving the size of the view - `java.awt.Dimension`"
  (^java.awt.Dimension [^javax.swing.JViewport this]
    (-> this (.getExtentSize))))

(defn set-scroll-mode
  "Used to control the method of scrolling the viewport contents.
   You may want to change this mode to get maximum performance for your
   use case.

  mode - one of the following values: JViewport.BLIT_SCROLL_MODE JViewport.BACKINGSTORE_SCROLL_MODE JViewport.SIMPLE_SCROLL_MODE - `int`"
  ([^javax.swing.JViewport this ^Integer mode]
    (-> this (.setScrollMode mode))))

(defn get-ui-class-id
  "Returns a string that specifies the name of the L&F class
   that renders this component.

  returns: the string `ViewportUI` - `java.lang.String`"
  (^java.lang.String [^javax.swing.JViewport this]
    (-> this (.getUIClassID))))

(defn set-extent-size
  "Sets the size of the visible part of the view using view coordinates.

  new-extent - a Dimension object specifying the size of the view - `java.awt.Dimension`"
  ([^javax.swing.JViewport this ^java.awt.Dimension new-extent]
    (-> this (.setExtentSize new-extent))))

(defn set-view-size
  "Sets the size of the view.  A state changed event will be fired.

  new-size - a Dimension object specifying the new size of the view - `java.awt.Dimension`"
  ([^javax.swing.JViewport this ^java.awt.Dimension new-size]
    (-> this (.setViewSize new-size))))

(defn reshape
  "Sets the bounds of this viewport.  If the viewport's width
   or height has changed, fire a StateChanged event.

  x - left edge of the origin - `int`
  y - top edge of the origin - `int`
  w - width in pixels - `int`
  h - height in pixels - `int`"
  ([^javax.swing.JViewport this ^Integer x ^Integer y ^Integer w ^Integer h]
    (-> this (.reshape x y w h))))

(defn get-view-rect
  "Returns a rectangle whose origin is getViewPosition
   and size is getExtentSize.
   This is the visible part of the view, in view coordinates.

  returns: a Rectangle giving the visible part of
            the view using view coordinates. - `java.awt.Rectangle`"
  (^java.awt.Rectangle [^javax.swing.JViewport this]
    (-> this (.getViewRect))))

(defn set-view-position
  "Sets the view coordinates that appear in the upper left
   hand corner of the viewport, does nothing if there's no view.

  p - a Point object giving the upper left coordinates - `java.awt.Point`"
  ([^javax.swing.JViewport this ^java.awt.Point p]
    (-> this (.setViewPosition p))))

(defn is-backing-store-enabled
  "Deprecated. As of Java 2 platform v1.3, replaced by
               getScrollMode().

  returns: true if scrollMode is
      BACKINGSTORE_SCROLL_MODE - `java.lang.  boolean`"
  ([^javax.swing.JViewport this]
    (-> this (.isBackingStoreEnabled))))

(defn remove-change-listener
  "Removes a ChangeListener from the list that's notified each
   time the views size, position, or the viewports extent size
   has changed.

  l - the ChangeListener to remove - `javax.swing.event.ChangeListener`"
  ([^javax.swing.JViewport this ^javax.swing.event.ChangeListener l]
    (-> this (.removeChangeListener l))))

(defn get-change-listeners
  "Returns an array of all the ChangeListeners added
   to this JViewport with addChangeListener().

  returns: all of the ChangeListeners added or an empty
           array if no listeners have been added - `javax.swing.event.ChangeListener[]`"
  ([^javax.swing.JViewport this]
    (-> this (.getChangeListeners))))

(defn set-ui
  "Sets the L&F object that renders this component.

  ui - the ViewportUI L&F object - `javax.swing.plaf.ViewportUI`"
  ([^javax.swing.JViewport this ^javax.swing.plaf.ViewportUI ui]
    (-> this (.setUI ui))))

(defn remove
  "Removes the Viewports one lightweight child.

  child - the component to be removed - `java.awt.Component`"
  ([^javax.swing.JViewport this ^java.awt.Component child]
    (-> this (.remove child))))

(defn get-ui
  "Returns the L&F object that renders this component.

  returns: a ViewportUI object - `javax.swing.plaf.ViewportUI`"
  (^javax.swing.plaf.ViewportUI [^javax.swing.JViewport this]
    (-> this (.getUI))))

(defn repaint
  "Always repaint in the parents coordinate system to make sure
   only one paint is performed by the RepaintManager.

  tm - maximum time in milliseconds before update - `long`
  x - the x coordinate (pixels over from left) - `int`
  y - the y coordinate (pixels down from top) - `int`
  w - the width - `int`
  h - the height - `int`"
  ([^javax.swing.JViewport this ^Long tm ^Integer x ^Integer y ^Integer w ^Integer h]
    (-> this (.repaint tm x y w h))))

(defn get-view-size
  "If the view's size hasn't been explicitly set, return the
   preferred size, otherwise return the view's current size.
   If there is no view, return 0,0.

  returns: a Dimension object specifying the size of the view - `java.awt.Dimension`"
  (^java.awt.Dimension [^javax.swing.JViewport this]
    (-> this (.getViewSize))))

(defn paint
  "Depending on whether the backingStore is enabled,
   either paint the image through the backing store or paint
   just the recently exposed part, using the backing store
   to `blit` the remainder.

   The term `blit` is the pronounced version of the PDP-10
   BLT (BLock Transfer) instruction, which copied a block of
   bits. (In case you were curious.)

  g - the Graphics context within which to paint - `java.awt.Graphics`"
  ([^javax.swing.JViewport this ^java.awt.Graphics g]
    (-> this (.paint g))))

(defn get-accessible-context
  "Gets the AccessibleContext associated with this JViewport.
   For viewports, the AccessibleContext takes the form of an
   AccessibleJViewport.
   A new AccessibleJViewport instance is created if necessary.

  returns: an AccessibleJViewport that serves as the
           AccessibleContext of this JViewport - `javax.accessibility.AccessibleContext`"
  (^javax.accessibility.AccessibleContext [^javax.swing.JViewport this]
    (-> this (.getAccessibleContext))))

(defn set-backing-store-enabled
  "Deprecated. As of Java 2 platform v1.3, replaced by
               setScrollMode().

  enabled - if true, maintain an offscreen backing store - `boolean`

  returns: `java.lang.  void`"
  ([^javax.swing.JViewport this ^Boolean enabled]
    (-> this (.setBackingStoreEnabled enabled))))

(defn to-view-coordinates
  "Converts a size in pixel coordinates to view coordinates.
   Subclasses of viewport that support `logical coordinates`
   will override this method.

  size - a Dimension object using pixel coordinates - `java.awt.Dimension`

  returns: a Dimension object converted to view coordinates - `java.awt.Dimension`"
  (^java.awt.Dimension [^javax.swing.JViewport this ^java.awt.Dimension size]
    (-> this (.toViewCoordinates size))))

(defn set-border
  "The viewport `scrolls` its child (called the `view`) by the
   normal parent/child clipping (typically the view is moved in
   the opposite direction of the scroll).  A non-null border,
   or non-zero insets, isn't supported, to prevent the geometry
   of this component from becoming complex enough to inhibit
   subclassing.  To create a JViewport with a border,
   add it to a JPanel that has a border.
   Note:  If border is non-null, this
   method will throw an exception as borders are not supported on
   a JViewPort.

  border - the Border to set - `javax.swing.border.Border`

  throws: java.lang.IllegalArgumentException - this method is not implemented"
  ([^javax.swing.JViewport this ^javax.swing.border.Border border]
    (-> this (.setBorder border))))

(defn update-ui
  "Resets the UI property to a value from the current look and feel."
  ([^javax.swing.JViewport this]
    (-> this (.updateUI))))

(defn set-view
  "Sets the JViewport's one lightweight child
   (view), which can be null.

  view - the viewport's new lightweight child - `java.awt.Component`"
  ([^javax.swing.JViewport this ^java.awt.Component view]
    (-> this (.setView view))))

(defn optimized-drawing-enabled?
  "The JViewport overrides the default implementation of
   this method (in JComponent) to return false.
   This ensures
   that the drawing machinery will call the Viewport's
   paint
   implementation rather than messaging the JViewport's
   children directly.

  returns: false - `boolean`"
  (^Boolean [^javax.swing.JViewport this]
    (-> this (.isOptimizedDrawingEnabled))))

