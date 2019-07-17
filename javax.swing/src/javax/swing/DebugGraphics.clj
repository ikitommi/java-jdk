(ns javax.swing.DebugGraphics
  "Graphics subclass supporting graphics debugging. Overrides most methods
  from Graphics.  DebugGraphics objects are rarely created by hand.  They
  are most frequently created automatically when a JComponent's
  debugGraphicsOptions are changed using the setDebugGraphicsOptions()
  method.

  NOTE: You must turn off double buffering to use DebugGraphics:
        RepaintManager repaintManager = RepaintManager.currentManager(component);
        repaintManager.setDoubleBufferingEnabled(false);"
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.swing DebugGraphics]))

(defn ->debug-graphics
  "Constructor.

  Constructs a debug graphics context from an existing graphics
   context that slows down drawing for the specified component.

  graphics - the Graphics context to slow down - `java.awt.Graphics`
  component - the JComponent to draw slowly - `javax.swing.JComponent`"
  ([graphics component]
    (new DebugGraphics graphics component))
  ([graphics]
    (new DebugGraphics graphics))
  ([]
    (new DebugGraphics )))

(def *-log-option
  "Static Constant.

  Log graphics operations.

  type: int"
  DebugGraphics/LOG_OPTION)

(def *-flash-option
  "Static Constant.

  Flash graphics operations.

  type: int"
  DebugGraphics/FLASH_OPTION)

(def *-buffered-option
  "Static Constant.

  Show buffered operations in a separate Frame.

  type: int"
  DebugGraphics/BUFFERED_OPTION)

(def *-none-option
  "Static Constant.

  Don't debug graphics operations.

  type: int"
  DebugGraphics/NONE_OPTION)

(defn *set-flash-color
  "Sets the Color used to flash drawing operations.

  flash-color - `java.awt.Color`"
  ([flash-color]
    (DebugGraphics/setFlashColor flash-color)))

(defn *flash-color
  "Returns the Color used to flash drawing operations.

  returns: `java.awt.Color`"
  ([]
    (DebugGraphics/flashColor )))

(defn *set-flash-time
  "Sets the time delay of drawing operation flashing.

  flash-time - `int`"
  ([flash-time]
    (DebugGraphics/setFlashTime flash-time)))

(defn *flash-time
  "Returns the time delay of drawing operation flashing.

  returns: `int`"
  ([]
    (DebugGraphics/flashTime )))

(defn *set-flash-count
  "Sets the number of times that drawing operations will flash.

  flash-count - `int`"
  ([flash-count]
    (DebugGraphics/setFlashCount flash-count)))

(defn *flash-count
  "Returns the number of times that drawing operations will flash.

  returns: `int`"
  ([]
    (DebugGraphics/flashCount )))

(defn *set-log-stream
  "Sets the stream to which the DebugGraphics logs drawing operations.

  stream - `java.io.PrintStream`"
  ([stream]
    (DebugGraphics/setLogStream stream)))

(defn *log-stream
  "Returns the stream to which the DebugGraphics logs drawing operations.

  returns: `java.io.PrintStream`"
  ([]
    (DebugGraphics/logStream )))

(defn set-debug-options
  "Enables/disables diagnostic information about every graphics
   operation. The value of options indicates how this information
   should be displayed. LOG_OPTION causes a text message to be printed.
   FLASH_OPTION causes the drawing to flash several times. BUFFERED_OPTION
   creates a new Frame that shows each operation on an
   offscreen buffer. The value of options is bitwise OR'd into
   the current value. To disable debugging use NONE_OPTION.

  options - `int`"
  ([this options]
    (-> this (.setDebugOptions options))))

(defn draw-image
  "Overrides Graphics.drawImage.

  img - the specified image to be drawn. This method does nothing if img is null. - `java.awt.Image`
  dx-1 - the x coordinate of the first corner of the destination rectangle. - `int`
  dy-1 - the y coordinate of the first corner of the destination rectangle. - `int`
  dx-2 - the x coordinate of the second corner of the destination rectangle. - `int`
  dy-2 - the y coordinate of the second corner of the destination rectangle. - `int`
  sx-1 - the x coordinate of the first corner of the source rectangle. - `int`
  sy-1 - the y coordinate of the first corner of the source rectangle. - `int`
  sx-2 - the x coordinate of the second corner of the source rectangle. - `int`
  sy-2 - the y coordinate of the second corner of the source rectangle. - `int`
  bgcolor - the background color to paint under the non-opaque portions of the image. - `java.awt.Color`
  observer - object to be notified as more of the image is scaled and converted. - `java.awt.image.ImageObserver`

  returns: false if the image pixels are still changing;
             true otherwise. - `boolean`"
  ([this img dx-1 dy-1 dx-2 dy-2 sx-1 sy-1 sx-2 sy-2 bgcolor observer]
    (-> this (.drawImage img dx-1 dy-1 dx-2 dy-2 sx-1 sy-1 sx-2 sy-2 bgcolor observer)))
  ([this img dx-1 dy-1 dx-2 dy-2 sx-1 sy-1 sx-2 sy-2 observer]
    (-> this (.drawImage img dx-1 dy-1 dx-2 dy-2 sx-1 sy-1 sx-2 sy-2 observer)))
  ([this img x y width height bgcolor observer]
    (-> this (.drawImage img x y width height bgcolor observer)))
  ([this img x y width height observer]
    (-> this (.drawImage img x y width height observer)))
  ([this img x y bgcolor observer]
    (-> this (.drawImage img x y bgcolor observer)))
  ([this img x y observer]
    (-> this (.drawImage img x y observer))))

(defn draw-arc
  "Overrides Graphics.drawArc.

  x - the x coordinate of the upper-left corner of the arc to be drawn. - `int`
  y - the y coordinate of the upper-left corner of the arc to be drawn. - `int`
  width - the width of the arc to be drawn. - `int`
  height - the height of the arc to be drawn. - `int`
  start-angle - the beginning angle. - `int`
  arc-angle - the angular extent of the arc, relative to the start angle. - `int`"
  ([this x y width height start-angle arc-angle]
    (-> this (.drawArc x y width height start-angle arc-angle))))

(defn copy-area
  "Overrides Graphics.copyArea.

  x - the x coordinate of the source rectangle. - `int`
  y - the y coordinate of the source rectangle. - `int`
  width - the width of the source rectangle. - `int`
  height - the height of the source rectangle. - `int`
  dest-x - the horizontal distance to copy the pixels. - `int`
  dest-y - the vertical distance to copy the pixels. - `int`"
  ([this x y width height dest-x dest-y]
    (-> this (.copyArea x y width height dest-x dest-y))))

(defn draw-oval
  "Overrides Graphics.drawOval.

  x - the x coordinate of the upper left corner of the oval to be drawn. - `int`
  y - the y coordinate of the upper left corner of the oval to be drawn. - `int`
  width - the width of the oval to be drawn. - `int`
  height - the height of the oval to be drawn. - `int`"
  ([this x y width height]
    (-> this (.drawOval x y width height))))

(defn get-clip
  "Overrides Graphics.getClip.

  returns: a Shape object representing the
                current clipping area, or null if
                no clip is set. - `java.awt.Shape`"
  ([this]
    (-> this (.getClip))))

(defn drawing-buffer?
  "Returns the drawingBuffer value.

  returns: true if this object is drawing from a Buffer - `boolean`"
  ([this]
    (-> this (.isDrawingBuffer))))

(defn translate
  "Overrides Graphics.translate.

  x - the x coordinate. - `int`
  y - the y coordinate. - `int`"
  ([this x y]
    (-> this (.translate x y))))

(defn clip-rect
  "Overrides Graphics.clipRect.

  x - the x coordinate of the rectangle to intersect the clip with - `int`
  y - the y coordinate of the rectangle to intersect the clip with - `int`
  width - the width of the rectangle to intersect the clip with - `int`
  height - the height of the rectangle to intersect the clip with - `int`"
  ([this x y width height]
    (-> this (.clipRect x y width height))))

(defn draw-polyline
  "Overrides Graphics.drawPolyline.

  x-points - an array of x points - `int[]`
  y-points - an array of y points - `int[]`
  n-points - the total number of points - `int`"
  ([this x-points y-points n-points]
    (-> this (.drawPolyline x-points y-points n-points))))

(defn dispose
  "Overrides Graphics.dispose."
  ([this]
    (-> this (.dispose))))

(defn fill-polygon
  "Overrides Graphics.fillPolygon.

  x-points - a an array of x coordinates. - `int[]`
  y-points - a an array of y coordinates. - `int[]`
  n-points - a the total number of points. - `int`"
  ([this x-points y-points n-points]
    (-> this (.fillPolygon x-points y-points n-points))))

(defn get-clip-bounds
  "Overrides Graphics.getClipBounds.

  returns: the bounding rectangle of the current clipping area,
                or null if no clip is set. - `java.awt.Rectangle`"
  ([this]
    (-> this (.getClipBounds))))

(defn fill-3-d-rect
  "Overrides Graphics.fill3DRect.

  x - the x coordinate of the rectangle to be filled. - `int`
  y - the y coordinate of the rectangle to be filled. - `int`
  width - the width of the rectangle to be filled. - `int`
  height - the height of the rectangle to be filled. - `int`
  raised - a boolean value that determines whether the rectangle appears to be raised above the surface or etched into the surface. - `boolean`"
  ([this x y width height raised]
    (-> this (.fill3DRect x y width height raised))))

(defn draw-line
  "Overrides Graphics.drawLine.

  x-1 - the first point's x coordinate. - `int`
  y-1 - the first point's y coordinate. - `int`
  x-2 - the second point's x coordinate. - `int`
  y-2 - the second point's y coordinate. - `int`"
  ([this x-1 y-1 x-2 y-2]
    (-> this (.drawLine x-1 y-1 x-2 y-2))))

(defn draw-bytes
  "Overrides Graphics.drawBytes.

  data - the data to be drawn - `byte[]`
  offset - the start offset in the data - `int`
  length - the number of bytes that are drawn - `int`
  x - the x coordinate of the baseline of the text - `int`
  y - the y coordinate of the baseline of the text - `int`"
  ([this data offset length x y]
    (-> this (.drawBytes data offset length x y))))

(defn draw-polygon
  "Overrides Graphics.drawPolygon.

  x-points - a an array of x coordinates. - `int[]`
  y-points - a an array of y coordinates. - `int[]`
  n-points - a the total number of points. - `int`"
  ([this x-points y-points n-points]
    (-> this (.drawPolygon x-points y-points n-points))))

(defn get-font-metrics
  "Overrides Graphics.getFontMetrics.

  f - the specified font - `java.awt.Font`

  returns: the font metrics for the specified font. - `java.awt.FontMetrics`"
  ([this f]
    (-> this (.getFontMetrics f)))
  ([this]
    (-> this (.getFontMetrics))))

(defn draw-string
  "Overrides Graphics.drawString.

  a-string - the string to be drawn. - `java.lang.String`
  x - the x coordinate. - `int`
  y - the y coordinate. - `int`"
  ([this a-string x y]
    (-> this (.drawString a-string x y))))

(defn set-clip
  "Overrides Graphics.setClip.

  x - the x coordinate of the new clip rectangle. - `int`
  y - the y coordinate of the new clip rectangle. - `int`
  width - the width of the new clip rectangle. - `int`
  height - the height of the new clip rectangle. - `int`"
  ([this x y width height]
    (-> this (.setClip x y width height)))
  ([this clip]
    (-> this (.setClip clip))))

(defn fill-arc
  "Overrides Graphics.fillArc.

  x - the x coordinate of the upper-left corner of the arc to be filled. - `int`
  y - the y coordinate of the upper-left corner of the arc to be filled. - `int`
  width - the width of the arc to be filled. - `int`
  height - the height of the arc to be filled. - `int`
  start-angle - the beginning angle. - `int`
  arc-angle - the angular extent of the arc, relative to the start angle. - `int`"
  ([this x y width height start-angle arc-angle]
    (-> this (.fillArc x y width height start-angle arc-angle))))

(defn set-xor-mode
  "Overrides Graphics.setXORMode.

  a-color - the XOR alternation color - `java.awt.Color`"
  ([this a-color]
    (-> this (.setXORMode a-color))))

(defn set-color
  "Sets the color to be used for drawing and filling lines and shapes.

  a-color - the new rendering color. - `java.awt.Color`"
  ([this a-color]
    (-> this (.setColor a-color))))

(defn draw-rect
  "Overrides Graphics.drawRect.

  x - the x coordinate of the rectangle to be drawn. - `int`
  y - the y coordinate of the rectangle to be drawn. - `int`
  width - the width of the rectangle to be drawn. - `int`
  height - the height of the rectangle to be drawn. - `int`"
  ([this x y width height]
    (-> this (.drawRect x y width height))))

(defn fill-round-rect
  "Overrides Graphics.fillRoundRect.

  x - the x coordinate of the rectangle to be filled. - `int`
  y - the y coordinate of the rectangle to be filled. - `int`
  width - the width of the rectangle to be filled. - `int`
  height - the height of the rectangle to be filled. - `int`
  arc-width - the horizontal diameter of the arc at the four corners. - `int`
  arc-height - the vertical diameter of the arc at the four corners. - `int`"
  ([this x y width height arc-width arc-height]
    (-> this (.fillRoundRect x y width height arc-width arc-height))))

(defn get-debug-options
  "Returns the current debugging options for this DebugGraphics.

  returns: `int`"
  ([this]
    (-> this (.getDebugOptions))))

(defn set-font
  "Sets the Font used for text drawing operations.

  a-font - the font. - `java.awt.Font`"
  ([this a-font]
    (-> this (.setFont a-font))))

(defn draw-3-d-rect
  "Overrides Graphics.draw3DRect.

  x - the x coordinate of the rectangle to be drawn. - `int`
  y - the y coordinate of the rectangle to be drawn. - `int`
  width - the width of the rectangle to be drawn. - `int`
  height - the height of the rectangle to be drawn. - `int`
  raised - a boolean that determines whether the rectangle appears to be raised above the surface or sunk into the surface. - `boolean`"
  ([this x y width height raised]
    (-> this (.draw3DRect x y width height raised))))

(defn create
  "Overrides Graphics.create to return a DebugGraphics object.

  x - the x coordinate. - `int`
  y - the y coordinate. - `int`
  width - the width of the clipping rectangle. - `int`
  height - the height of the clipping rectangle. - `int`

  returns: a new graphics context. - `java.awt.Graphics`"
  ([this x y width height]
    (-> this (.create x y width height)))
  ([this]
    (-> this (.create))))

(defn set-paint-mode
  "Overrides Graphics.setPaintMode."
  ([this]
    (-> this (.setPaintMode))))

(defn get-font
  "Returns the Font used for text drawing operations.

  returns: this graphics context's current font. - `java.awt.Font`"
  ([this]
    (-> this (.getFont))))

(defn draw-round-rect
  "Overrides Graphics.drawRoundRect.

  x - the x coordinate of the rectangle to be drawn. - `int`
  y - the y coordinate of the rectangle to be drawn. - `int`
  width - the width of the rectangle to be drawn. - `int`
  height - the height of the rectangle to be drawn. - `int`
  arc-width - the horizontal diameter of the arc at the four corners. - `int`
  arc-height - the vertical diameter of the arc at the four corners. - `int`"
  ([this x y width height arc-width arc-height]
    (-> this (.drawRoundRect x y width height arc-width arc-height))))

(defn draw-chars
  "Overrides Graphics.drawChars.

  data - the array of characters to be drawn - `char[]`
  offset - the start offset in the data - `int`
  length - the number of characters to be drawn - `int`
  x - the x coordinate of the baseline of the text - `int`
  y - the y coordinate of the baseline of the text - `int`"
  ([this data offset length x y]
    (-> this (.drawChars data offset length x y))))

(defn get-color
  "Returns the Color used for text drawing operations.

  returns: this graphics context's current color. - `java.awt.Color`"
  ([this]
    (-> this (.getColor))))

(defn clear-rect
  "Overrides Graphics.clearRect.

  x - the x coordinate of the rectangle to clear. - `int`
  y - the y coordinate of the rectangle to clear. - `int`
  width - the width of the rectangle to clear. - `int`
  height - the height of the rectangle to clear. - `int`"
  ([this x y width height]
    (-> this (.clearRect x y width height))))

(defn fill-rect
  "Overrides Graphics.fillRect.

  x - the x coordinate of the rectangle to be filled. - `int`
  y - the y coordinate of the rectangle to be filled. - `int`
  width - the width of the rectangle to be filled. - `int`
  height - the height of the rectangle to be filled. - `int`"
  ([this x y width height]
    (-> this (.fillRect x y width height))))

(defn fill-oval
  "Overrides Graphics.fillOval.

  x - the x coordinate of the upper left corner of the oval to be filled. - `int`
  y - the y coordinate of the upper left corner of the oval to be filled. - `int`
  width - the width of the oval to be filled. - `int`
  height - the height of the oval to be filled. - `int`"
  ([this x y width height]
    (-> this (.fillOval x y width height))))

