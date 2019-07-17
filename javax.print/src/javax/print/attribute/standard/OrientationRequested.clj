(ns javax.print.attribute.standard.OrientationRequested
  "Class OrientationRequested is a printing attribute class, an enumeration,
  that indicates the desired orientation for printed print-stream pages; it
  does not describe the orientation of the client-supplied print-stream
  pages.

  For some document formats (such as `application/postscript`),
  the desired orientation of the print-stream pages is specified within the
  document data. This information is generated by a device driver prior to
  the submission of the print job. Other document formats (such as
  `text/plain`) do not include the notion of desired orientation
  within the document data. In the latter case it is possible for the printer
  to bind the desired orientation to the document data after it has been
  submitted. It is expected that a printer would only support the
  OrientationRequested attribute for some document formats (e.g.,
  `text/plain` or `text/html`) but not others (e.g.
  `application/postscript`). This is no different from any other
  job template attribute, since a print job can always impose constraints
  among the values of different job template attributes.
   However, a special mention
  is made here since it is very likely that a printer will support the
  OrientationRequested attribute for only a subset of the supported document
  formats.

  IPP Compatibility: The category name returned by
  getName() is the IPP attribute name.  The enumeration's
  integer value is the IPP enum value.  The toString() method
  returns the IPP string representation of the attribute value."
  (:refer-clojure :only [require comment defn ->])
  (:import [javax.print.attribute.standard OrientationRequested]))

(def *-portrait
  "Static Constant.

  The content will be imaged across the short edge of the medium.

  type: javax.print.attribute.standard.OrientationRequested"
  OrientationRequested/PORTRAIT)

(def *-landscape
  "Static Constant.

  The content will be imaged across the long edge of the medium.
   Landscape is defined to be a rotation of the print-stream page to be
   imaged by 90 degrees with respect to the medium
   (i.e. anti-clockwise) from the
   portrait orientation. Note: The 90 direction was chosen because
   simple finishing on the long edge is the same edge whether portrait or
   landscape.

  type: javax.print.attribute.standard.OrientationRequested"
  OrientationRequested/LANDSCAPE)

(def *-reverse-landscape
  "Static Constant.

  The content will be imaged across the long edge of the medium, but in
   the opposite manner from landscape. Reverse-landscape is defined to be
   a rotation of the print-stream page to be imaged by -90 degrees with
   respect to the medium (i.e. clockwise) from the portrait orientation.
   Note: The REVERSE_LANDSCAPE value was added because some
   applications rotate landscape -90 degrees from portrait, rather than
   90 degrees.

  type: javax.print.attribute.standard.OrientationRequested"
  OrientationRequested/REVERSE_LANDSCAPE)

(def *-reverse-portrait
  "Static Constant.

  The content will be imaged across the short edge of the medium, but in
   the opposite manner from portrait. Reverse-portrait is defined to be a
   rotation of the print-stream page to be imaged by 180 degrees with
   respect to the medium from the portrait orientation. Note: The
   REVERSE_PORTRAIT value was added for use with the Finishings attribute in cases where the
   opposite edge is desired for finishing a portrait document on simple
   finishing devices that have only one finishing position. Thus a
   `text/plain` portrait document can be stapled `on the
   right` by a simple finishing device as is common use with some
   Middle Eastern languages such as Hebrew.

  type: javax.print.attribute.standard.OrientationRequested"
  OrientationRequested/REVERSE_PORTRAIT)

(defn get-category
  "Get the printing attribute class which is to be used as the `category`
   for this printing attribute value.

   For class OrientationRequested, the
   category is class OrientationRequested itself.

  returns: Printing attribute class (category), an instance of class
            java.lang.Class. - `java.lang.Class<? extends javax.print.attribute.Attribute>`"
  ([this]
    (-> this (.getCategory))))

(defn get-name
  "Get the name of the category of which this attribute value is an
   instance.

   For class OrientationRequested, the
   category name is `orientation-requested`.

  returns: Attribute category name. - `java.lang.String`"
  ([this]
    (-> this (.getName))))

