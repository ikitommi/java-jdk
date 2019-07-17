(ns jdk.time.OffsetDateTime
  "A date-time with an offset from UTC/Greenwich in the ISO-8601 calendar system,
  such as 2007-12-03T10:15:30+01:00.

  OffsetDateTime is an immutable representation of a date-time with an offset.
  This class stores all date and time fields, to a precision of nanoseconds,
  as well as the offset from UTC/Greenwich. For example, the value
  `2nd October 2007 at 13:45.30.123456789 02:00` can be stored in an OffsetDateTime.

  OffsetDateTime, ZonedDateTime and Instant all store an instant
  on the time-line to nanosecond precision.
  Instant is the simplest, simply representing the instant.
  OffsetDateTime adds to the instant the offset from UTC/Greenwich, which allows
  the local date-time to be obtained.
  ZonedDateTime adds full time-zone rules.

  It is intended that ZonedDateTime or Instant is used to model data
  in simpler applications. This class may be used when modeling date-time concepts in
  more detail, or when communicating to a database or in a network protocol.


  This is a value-based
  class; use of identity-sensitive operations (including reference equality
  (==), identity hash code, or synchronization) on instances of
  OffsetDateTime may have unpredictable results and should be avoided.
  The equals method should be used for comparisons."
  (:refer-clojure :only [require comment defn ->])
  (:import [java.time OffsetDateTime]))

(def *-min
  "Static Constant.

  The minimum supported OffsetDateTime, '-999999999-01-01T00:00:00+18:00'.
   This is the local date-time of midnight at the start of the minimum date
   in the maximum offset (larger offsets are earlier on the time-line).
   This combines LocalDateTime.MIN and ZoneOffset.MAX.
   This could be used by an application as a `far past` date-time.

  type: java.time.OffsetDateTime"
  OffsetDateTime/MIN)

(def *-max
  "Static Constant.

  The maximum supported OffsetDateTime, '+999999999-12-31T23:59:59.999999999-18:00'.
   This is the local date-time just before midnight at the end of the maximum date
   in the minimum offset (larger negative offsets are later on the time-line).
   This combines LocalDateTime.MAX and ZoneOffset.MIN.
   This could be used by an application as a `far future` date-time.

  type: java.time.OffsetDateTime"
  OffsetDateTime/MAX)

(defn *time-line-order
  "Gets a comparator that compares two OffsetDateTime instances
   based solely on the instant.

   This method differs from the comparison in compareTo(java.time.OffsetDateTime) in that it
   only compares the underlying instant.

  returns: a comparator that compares in time-line order - `java.util.Comparator<java.time.OffsetDateTime>`"
  ([]
    (OffsetDateTime/timeLineOrder )))

(defn *now
  "Obtains the current date-time from the system clock in the specified time-zone.

   This will query the system clock to obtain the current date-time.
   Specifying the time-zone avoids dependence on the default time-zone.
   The offset will be calculated from the specified time-zone.

   Using this method will prevent the ability to use an alternate clock for testing
   because the clock is hard-coded.

  zone - the zone ID to use, not null - `java.time.ZoneId`

  returns: the current date-time using the system clock, not null - `java.time.OffsetDateTime`"
  ([zone]
    (OffsetDateTime/now zone))
  ([]
    (OffsetDateTime/now )))

(defn *of
  "Obtains an instance of OffsetDateTime from a year, month, day,
   hour, minute, second, nanosecond and offset.

   This creates an offset date-time with the seven specified fields.

   This method exists primarily for writing test cases.
   Non test-code will typically use other methods to create an offset time.
   LocalDateTime has five additional convenience variants of the
   equivalent factory method taking fewer arguments.
   They are not provided here to reduce the footprint of the API.

  year - the year to represent, from MIN_YEAR to MAX_YEAR - `int`
  month - the month-of-year to represent, from 1 (January) to 12 (December) - `int`
  day-of-month - the day-of-month to represent, from 1 to 31 - `int`
  hour - the hour-of-day to represent, from 0 to 23 - `int`
  minute - the minute-of-hour to represent, from 0 to 59 - `int`
  second - the second-of-minute to represent, from 0 to 59 - `int`
  nano-of-second - the nano-of-second to represent, from 0 to 999,999,999 - `int`
  offset - the zone offset, not null - `java.time.ZoneOffset`

  returns: the offset date-time, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the value of any field is out of range, or if the day-of-month is invalid for the month-year"
  ([year month day-of-month hour minute second nano-of-second offset]
    (OffsetDateTime/of year month day-of-month hour minute second nano-of-second offset))
  ([date time offset]
    (OffsetDateTime/of date time offset))
  ([date-time offset]
    (OffsetDateTime/of date-time offset)))

(defn *of-instant
  "Obtains an instance of OffsetDateTime from an Instant and zone ID.

   This creates an offset date-time with the same instant as that specified.
   Finding the offset from UTC/Greenwich is simple as there is only one valid
   offset for each instant.

  instant - the instant to create the date-time from, not null - `java.time.Instant`
  zone - the time-zone, which may be an offset, not null - `java.time.ZoneId`

  returns: the offset date-time, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported range"
  ([instant zone]
    (OffsetDateTime/ofInstant instant zone)))

(defn *from
  "Obtains an instance of OffsetDateTime from a temporal object.

   This obtains an offset date-time based on the specified temporal.
   A TemporalAccessor represents an arbitrary set of date and time information,
   which this factory converts to an instance of OffsetDateTime.

   The conversion will first obtain a ZoneOffset from the temporal object.
   It will then try to obtain a LocalDateTime, falling back to an Instant if necessary.
   The result will be the combination of ZoneOffset with either
   with LocalDateTime or Instant.
   Implementations are permitted to perform optimizations such as accessing
   those fields that are equivalent to the relevant objects.

   This method matches the signature of the functional interface TemporalQuery
   allowing it to be used as a query via method reference, OffsetDateTime::from.

  temporal - the temporal object to convert, not null - `java.time.temporal.TemporalAccessor`

  returns: the offset date-time, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if unable to convert to an OffsetDateTime"
  ([temporal]
    (OffsetDateTime/from temporal)))

(defn *parse
  "Obtains an instance of OffsetDateTime from a text string using a specific formatter.

   The text is parsed using the formatter, returning a date-time.

  text - the text to parse, not null - `java.lang.CharSequence`
  formatter - the formatter to use, not null - `java.time.format.DateTimeFormatter`

  returns: the parsed offset date-time, not null - `java.time.OffsetDateTime`

  throws: java.time.format.DateTimeParseException - if the text cannot be parsed"
  ([text formatter]
    (OffsetDateTime/parse text formatter))
  ([text]
    (OffsetDateTime/parse text)))

(defn minus-minutes
  "Returns a copy of this OffsetDateTime with the specified number of minutes subtracted.

   This instance is immutable and unaffected by this method call.

  minutes - the minutes to subtract, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the minutes subtracted, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this minutes]
    (-> this (.minusMinutes minutes))))

(defn truncated-to
  "Returns a copy of this OffsetDateTime with the time truncated.

   Truncation returns a copy of the original date-time with fields
   smaller than the specified unit set to zero.
   For example, truncating with the minutes unit
   will set the second-of-minute and nano-of-second field to zero.

   The unit must have a duration
   that divides into the length of a standard day without remainder.
   This includes all supplied time units on ChronoUnit and
   DAYS. Other units throw an exception.

   The offset does not affect the calculation and will be the same in the result.

   This instance is immutable and unaffected by this method call.

  unit - the unit to truncate to, not null - `java.time.temporal.TemporalUnit`

  returns: an OffsetDateTime based on this date-time with the time truncated, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if unable to truncate"
  ([this unit]
    (-> this (.truncatedTo unit))))

(defn minus-weeks
  "Returns a copy of this OffsetDateTime with the specified number of weeks subtracted.

   This method subtracts the specified amount in weeks from the days field decrementing
   the month and year fields as necessary to ensure the result remains valid.
   The result is only invalid if the maximum/minimum year is exceeded.

   For example, 2008-12-31 minus one week would result in 2009-01-07.

   This instance is immutable and unaffected by this method call.

  weeks - the weeks to subtract, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the weeks subtracted, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this weeks]
    (-> this (.minusWeeks weeks))))

(defn to-instant
  "Converts this date-time to an Instant.

   This returns an Instant representing the same point on the
   time-line as this date-time.

  returns: an Instant representing the same instant, not null - `java.time.Instant`"
  ([this]
    (-> this (.toInstant))))

(defn plus-weeks
  "Returns a copy of this OffsetDateTime with the specified number of weeks added.

   This method adds the specified amount in weeks to the days field incrementing
   the month and year fields as necessary to ensure the result remains valid.
   The result is only invalid if the maximum/minimum year is exceeded.

   For example, 2008-12-31 plus one week would result in 2009-01-07.

   This instance is immutable and unaffected by this method call.

  weeks - the weeks to add, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the weeks added, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this weeks]
    (-> this (.plusWeeks weeks))))

(defn range
  "Gets the range of valid values for the specified field.

   The range object expresses the minimum and maximum valid values for a field.
   This date-time is used to enhance the accuracy of the returned range.
   If it is not possible to return the range, because the field is not supported
   or for some other reason, an exception is thrown.

   If the field is a ChronoField then the query is implemented here.
   The supported fields will return
   appropriate range instances.
   All other ChronoField instances will throw an UnsupportedTemporalTypeException.

   If the field is not a ChronoField, then the result of this method
   is obtained by invoking TemporalField.rangeRefinedBy(TemporalAccessor)
   passing this as the argument.
   Whether the range can be obtained is determined by the field.

  field - the field to query the range for, not null - `java.time.temporal.TemporalField`

  returns: the range of valid values for the field, not null - `java.time.temporal.ValueRange`

  throws: java.time.DateTimeException - if the range for the field cannot be obtained"
  ([this field]
    (-> this (.range field))))

(defn get-hour
  "Gets the hour-of-day field.

  returns: the hour-of-day, from 0 to 23 - `int`"
  ([this]
    (-> this (.getHour))))

(defn at-zone-same-instant
  "Combines this date-time with a time-zone to create a ZonedDateTime
   ensuring that the result has the same instant.

   This returns a ZonedDateTime formed from this date-time and the specified time-zone.
   This conversion will ignore the visible local date-time and use the underlying instant instead.
   This avoids any problems with local time-line gaps or overlaps.
   The result might have different values for fields such as hour, minute an even day.

   To attempt to retain the values of the fields, use atZoneSimilarLocal(ZoneId).
   To use the offset as the zone ID, use toZonedDateTime().

  zone - the time-zone to use, not null - `java.time.ZoneId`

  returns: the zoned date-time formed from this date-time, not null - `java.time.ZonedDateTime`"
  ([this zone]
    (-> this (.atZoneSameInstant zone))))

(defn minus-hours
  "Returns a copy of this OffsetDateTime with the specified number of hours subtracted.

   This instance is immutable and unaffected by this method call.

  hours - the hours to subtract, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the hours subtracted, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this hours]
    (-> this (.minusHours hours))))

(defn with-month
  "Returns a copy of this OffsetDateTime with the month-of-year altered.

   The time and offset do not affect the calculation and will be the same in the result.
   If the day-of-month is invalid for the year, it will be changed to the last valid day of the month.

   This instance is immutable and unaffected by this method call.

  month - the month-of-year to set in the result, from 1 (January) to 12 (December) - `int`

  returns: an OffsetDateTime based on this date-time with the requested month, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the month-of-year value is invalid"
  ([this month]
    (-> this (.withMonth month))))

(defn equal?
  "Checks if the instant of this date-time is equal to that of the specified date-time.

   This method differs from the comparison in compareTo(java.time.OffsetDateTime) and equals(java.lang.Object)
   in that it only compares the instant of the date-time. This is equivalent to using
   dateTime1.toInstant().equals(dateTime2.toInstant());.

  other - the other date-time to compare to, not null - `java.time.OffsetDateTime`

  returns: true if the instant equals the instant of the specified date-time - `boolean`"
  ([this other]
    (-> this (.isEqual other))))

(defn get-nano
  "Gets the nano-of-second field.

  returns: the nano-of-second, from 0 to 999,999,999 - `int`"
  ([this]
    (-> this (.getNano))))

(defn to-offset-time
  "Converts this date-time to an OffsetTime.

   This returns an offset time with the same local time and offset.

  returns: an OffsetTime representing the time and offset, not null - `java.time.OffsetTime`"
  ([this]
    (-> this (.toOffsetTime))))

(defn at-zone-similar-local
  "Combines this date-time with a time-zone to create a ZonedDateTime
   trying to keep the same local date and time.

   This returns a ZonedDateTime formed from this date-time and the specified time-zone.
   Where possible, the result will have the same local date-time as this object.

   Time-zone rules, such as daylight savings, mean that not every time on the
   local time-line exists. If the local date-time is in a gap or overlap according to
   the rules then a resolver is used to determine the resultant local time and offset.
   This method uses ZonedDateTime.ofLocal(LocalDateTime, ZoneId, ZoneOffset)
   to retain the offset from this instance if possible.

   Finer control over gaps and overlaps is available in two ways.
   If you simply want to use the later offset at overlaps then call
   ZonedDateTime.withLaterOffsetAtOverlap() immediately after this method.

   To create a zoned date-time at the same instant irrespective of the local time-line,
   use atZoneSameInstant(ZoneId).
   To use the offset as the zone ID, use toZonedDateTime().

  zone - the time-zone to use, not null - `java.time.ZoneId`

  returns: the zoned date-time formed from this date and the earliest valid time for the zone, not null - `java.time.ZonedDateTime`"
  ([this zone]
    (-> this (.atZoneSimilarLocal zone))))

(defn get-year
  "Gets the year field.

   This method returns the primitive int value for the year.

   The year returned by this method is proleptic as per get(YEAR).
   To obtain the year-of-era, use get(YEAR_OF_ERA).

  returns: the year, from MIN_YEAR to MAX_YEAR - `int`"
  ([this]
    (-> this (.getYear))))

(defn minus-seconds
  "Returns a copy of this OffsetDateTime with the specified number of seconds subtracted.

   This instance is immutable and unaffected by this method call.

  seconds - the seconds to subtract, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the seconds subtracted, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this seconds]
    (-> this (.minusSeconds seconds))))

(defn get-second
  "Gets the second-of-minute field.

  returns: the second-of-minute, from 0 to 59 - `int`"
  ([this]
    (-> this (.getSecond))))

(defn plus-nanos
  "Returns a copy of this OffsetDateTime with the specified number of nanoseconds added.

   This instance is immutable and unaffected by this method call.

  nanos - the nanos to add, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the nanoseconds added, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the unit cannot be added to this type"
  ([this nanos]
    (-> this (.plusNanos nanos))))

(defn get-day-of-year
  "Gets the day-of-year field.

   This method returns the primitive int value for the day-of-year.

  returns: the day-of-year, from 1 to 365, or 366 in a leap year - `int`"
  ([this]
    (-> this (.getDayOfYear))))

(defn plus
  "Returns a copy of this date-time with the specified amount added.

   This returns an OffsetDateTime, based on this one, with the amount
   in terms of the unit added. If it is not possible to add the amount, because the
   unit is not supported or for some other reason, an exception is thrown.

   If the field is a ChronoUnit then the addition is implemented by
   LocalDateTime.plus(long, TemporalUnit).
   The offset is not part of the calculation and will be unchanged in the result.

   If the field is not a ChronoUnit, then the result of this method
   is obtained by invoking TemporalUnit.addTo(Temporal, long)
   passing this as the argument. In this case, the unit determines
   whether and how to perform the addition.

   This instance is immutable and unaffected by this method call.

  amount-to-add - the amount of the unit to add to the result, may be negative - `long`
  unit - the unit of the amount to add, not null - `java.time.temporal.TemporalUnit`

  returns: an OffsetDateTime based on this date-time with the specified amount added, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the addition cannot be made"
  ([this amount-to-add unit]
    (-> this (.plus amount-to-add unit)))
  ([this amount-to-add]
    (-> this (.plus amount-to-add))))

(defn with-hour
  "Returns a copy of this OffsetDateTime with the hour-of-day altered.

   The date and offset do not affect the calculation and will be the same in the result.

   This instance is immutable and unaffected by this method call.

  hour - the hour-of-day to set in the result, from 0 to 23 - `int`

  returns: an OffsetDateTime based on this date-time with the requested hour, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the hour value is invalid"
  ([this hour]
    (-> this (.withHour hour))))

(defn with-minute
  "Returns a copy of this OffsetDateTime with the minute-of-hour altered.

   The date and offset do not affect the calculation and will be the same in the result.

   This instance is immutable and unaffected by this method call.

  minute - the minute-of-hour to set in the result, from 0 to 59 - `int`

  returns: an OffsetDateTime based on this date-time with the requested minute, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the minute value is invalid"
  ([this minute]
    (-> this (.withMinute minute))))

(defn plus-minutes
  "Returns a copy of this OffsetDateTime with the specified number of minutes added.

   This instance is immutable and unaffected by this method call.

  minutes - the minutes to add, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the minutes added, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this minutes]
    (-> this (.plusMinutes minutes))))

(defn query
  "Queries this date-time using the specified query.

   This queries this date-time using the specified query strategy object.
   The TemporalQuery object defines the logic to be used to
   obtain the result. Read the documentation of the query to understand
   what the result of this method will be.

   The result of this method is obtained by invoking the
   TemporalQuery.queryFrom(TemporalAccessor) method on the
   specified query passing this as the argument.

  query - the query to invoke, not null - `java.time.temporal.TemporalQuery<R>`

  returns: the query result, null may be returned (defined by the query) - `<R> R`

  throws: java.time.DateTimeException - if unable to query (defined by the query)"
  ([this query]
    (-> this (.query query))))

(defn with-offset-same-instant
  "Returns a copy of this OffsetDateTime with the specified offset ensuring
   that the result is at the same instant.

   This method returns an object with the specified ZoneOffset and a LocalDateTime
   adjusted by the difference between the two offsets.
   This will result in the old and new objects representing the same instant.
   This is useful for finding the local time in a different offset.
   For example, if this time represents 2007-12-03T10:30+02:00 and the offset specified is
   +03:00, then this method will return 2007-12-03T11:30+03:00.

   To change the offset without adjusting the local time use withOffsetSameLocal(java.time.ZoneOffset).

   This instance is immutable and unaffected by this method call.

  offset - the zone offset to change to, not null - `java.time.ZoneOffset`

  returns: an OffsetDateTime based on this date-time with the requested offset, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this offset]
    (-> this (.withOffsetSameInstant offset))))

(defn get-day-of-week
  "Gets the day-of-week field, which is an enum DayOfWeek.

   This method returns the enum DayOfWeek for the day-of-week.
   This avoids confusion as to what int values mean.
   If you need access to the primitive int value then the enum
   provides the int value.

   Additional information can be obtained from the DayOfWeek.
   This includes textual names of the values.

  returns: the day-of-week, not null - `java.time.DayOfWeek`"
  ([this]
    (-> this (.getDayOfWeek))))

(defn to-string
  "Outputs this date-time as a String, such as 2007-12-03T10:15:30+01:00.

   The output will be one of the following ISO-8601 formats:

   uuuu-MM-dd'T'HH:mmXXXXX
   uuuu-MM-dd'T'HH:mm:ssXXXXX
   uuuu-MM-dd'T'HH:mm:ss.SSSXXXXX
   uuuu-MM-dd'T'HH:mm:ss.SSSSSSXXXXX
   uuuu-MM-dd'T'HH:mm:ss.SSSSSSSSSXXXXX

   The format used will be the shortest that outputs the full value of
   the time where the omitted parts are implied to be zero.

  returns: a string representation of this date-time, not null - `java.lang.String`"
  ([this]
    (-> this (.toString))))

(defn plus-months
  "Returns a copy of this OffsetDateTime with the specified number of months added.

   This method adds the specified amount to the months field in three steps:

   Add the input months to the month-of-year field
   Check if the resulting date would be invalid
   Adjust the day-of-month to the last valid day if necessary


   For example, 2007-03-31 plus one month would result in the invalid date
   2007-04-31. Instead of returning an invalid result, the last valid day
   of the month, 2007-04-30, is selected instead.

   This instance is immutable and unaffected by this method call.

  months - the months to add, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the months added, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this months]
    (-> this (.plusMonths months))))

(defn before?
  "Checks if the instant of this date-time is before that of the specified date-time.

   This method differs from the comparison in compareTo(java.time.OffsetDateTime) in that it
   only compares the instant of the date-time. This is equivalent to using
   dateTime1.toInstant().isBefore(dateTime2.toInstant());.

  other - the other date-time to compare to, not null - `java.time.OffsetDateTime`

  returns: true if this is before the instant of the specified date-time - `boolean`"
  ([this other]
    (-> this (.isBefore other))))

(defn minus-months
  "Returns a copy of this OffsetDateTime with the specified number of months subtracted.

   This method subtracts the specified amount from the months field in three steps:

   Subtract the input months from the month-of-year field
   Check if the resulting date would be invalid
   Adjust the day-of-month to the last valid day if necessary


   For example, 2007-03-31 minus one month would result in the invalid date
   2007-04-31. Instead of returning an invalid result, the last valid day
   of the month, 2007-04-30, is selected instead.

   This instance is immutable and unaffected by this method call.

  months - the months to subtract, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the months subtracted, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this months]
    (-> this (.minusMonths months))))

(defn minus
  "Returns a copy of this date-time with the specified amount subtracted.

   This returns an OffsetDateTime, based on this one, with the amount
   in terms of the unit subtracted. If it is not possible to subtract the amount,
   because the unit is not supported or for some other reason, an exception is thrown.

   This method is equivalent to plus(long, TemporalUnit) with the amount negated.
   See that method for a full description of how addition, and thus subtraction, works.

   This instance is immutable and unaffected by this method call.

  amount-to-subtract - the amount of the unit to subtract from the result, may be negative - `long`
  unit - the unit of the amount to subtract, not null - `java.time.temporal.TemporalUnit`

  returns: an OffsetDateTime based on this date-time with the specified amount subtracted, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the subtraction cannot be made"
  ([this amount-to-subtract unit]
    (-> this (.minus amount-to-subtract unit)))
  ([this amount-to-subtract]
    (-> this (.minus amount-to-subtract))))

(defn plus-hours
  "Returns a copy of this OffsetDateTime with the specified number of hours added.

   This instance is immutable and unaffected by this method call.

  hours - the hours to add, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the hours added, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this hours]
    (-> this (.plusHours hours))))

(defn plus-days
  "Returns a copy of this OffsetDateTime with the specified number of days added.

   This method adds the specified amount to the days field incrementing the
   month and year fields as necessary to ensure the result remains valid.
   The result is only invalid if the maximum/minimum year is exceeded.

   For example, 2008-12-31 plus one day would result in 2009-01-01.

   This instance is immutable and unaffected by this method call.

  days - the days to add, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the days added, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this days]
    (-> this (.plusDays days))))

(defn to-local-time
  "Gets the LocalTime part of this date-time.

   This returns a LocalTime with the same hour, minute, second and
   nanosecond as this date-time.

  returns: the time part of this date-time, not null - `java.time.LocalTime`"
  ([this]
    (-> this (.toLocalTime))))

(defn get-long
  "Gets the value of the specified field from this date-time as a long.

   This queries this date-time for the value of the specified field.
   If it is not possible to return the value, because the field is not supported
   or for some other reason, an exception is thrown.

   If the field is a ChronoField then the query is implemented here.
   The supported fields will return valid
   values based on this date-time.
   All other ChronoField instances will throw an UnsupportedTemporalTypeException.

   If the field is not a ChronoField, then the result of this method
   is obtained by invoking TemporalField.getFrom(TemporalAccessor)
   passing this as the argument. Whether the value can be obtained,
   and what the value represents, is determined by the field.

  field - the field to get, not null - `java.time.temporal.TemporalField`

  returns: the value for the field - `long`

  throws: java.time.DateTimeException - if a value for the field cannot be obtained"
  ([this field]
    (-> this (.getLong field))))

(defn get-offset
  "Gets the zone offset, such as '+01:00'.

   This is the offset of the local date-time from UTC/Greenwich.

  returns: the zone offset, not null - `java.time.ZoneOffset`"
  ([this]
    (-> this (.getOffset))))

(defn to-zoned-date-time
  "Converts this date-time to a ZonedDateTime using the offset as the zone ID.

   This creates the simplest possible ZonedDateTime using the offset
   as the zone ID.

   To control the time-zone used, see atZoneSameInstant(ZoneId) and
   atZoneSimilarLocal(ZoneId).

  returns: a zoned date-time representing the same local date-time and offset, not null - `java.time.ZonedDateTime`"
  ([this]
    (-> this (.toZonedDateTime))))

(defn with-year
  "Returns a copy of this OffsetDateTime with the year altered.

   The time and offset do not affect the calculation and will be the same in the result.
   If the day-of-month is invalid for the year, it will be changed to the last valid day of the month.

   This instance is immutable and unaffected by this method call.

  year - the year to set in the result, from MIN_YEAR to MAX_YEAR - `int`

  returns: an OffsetDateTime based on this date-time with the requested year, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the year value is invalid"
  ([this year]
    (-> this (.withYear year))))

(defn with-nano
  "Returns a copy of this OffsetDateTime with the nano-of-second altered.

   The date and offset do not affect the calculation and will be the same in the result.

   This instance is immutable and unaffected by this method call.

  nano-of-second - the nano-of-second to set in the result, from 0 to 999,999,999 - `int`

  returns: an OffsetDateTime based on this date-time with the requested nanosecond, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the nano value is invalid"
  ([this nano-of-second]
    (-> this (.withNano nano-of-second))))

(defn to-epoch-second
  "Converts this date-time to the number of seconds from the epoch of 1970-01-01T00:00:00Z.

   This allows this date-time to be converted to a value of the
   epoch-seconds field. This is primarily
   intended for low-level conversions rather than general application usage.

  returns: the number of seconds from the epoch of 1970-01-01T00:00:00Z - `long`"
  ([this]
    (-> this (.toEpochSecond))))

(defn until
  "Calculates the amount of time until another date-time in terms of the specified unit.

   This calculates the amount of time between two OffsetDateTime
   objects in terms of a single TemporalUnit.
   The start and end points are this and the specified date-time.
   The result will be negative if the end is before the start.
   For example, the amount in days between two date-times can be calculated
   using startDateTime.until(endDateTime, DAYS).

   The Temporal passed to this method is converted to a
   OffsetDateTime using from(TemporalAccessor).
   If the offset differs between the two date-times, the specified
   end date-time is normalized to have the same offset as this date-time.

   The calculation returns a whole number, representing the number of
   complete units between the two date-times.
   For example, the amount in months between 2012-06-15T00:00Z and 2012-08-14T23:59Z
   will only be one month as it is one minute short of two months.

   There are two equivalent ways of using this method.
   The first is to invoke this method.
   The second is to use TemporalUnit.between(Temporal, Temporal):


     // these two lines are equivalent
     amount = start.until(end, MONTHS);
     amount = MONTHS.between(start, end);
   The choice should be made based on which makes the code more readable.

   The calculation is implemented in this method for ChronoUnit.
   The units NANOS, MICROS, MILLIS, SECONDS,
   MINUTES, HOURS and HALF_DAYS, DAYS,
   WEEKS, MONTHS, YEARS, DECADES,
   CENTURIES, MILLENNIA and ERAS are supported.
   Other ChronoUnit values will throw an exception.

   If the unit is not a ChronoUnit, then the result of this method
   is obtained by invoking TemporalUnit.between(Temporal, Temporal)
   passing this as the first argument and the converted input temporal
   as the second argument.

   This instance is immutable and unaffected by this method call.

  end-exclusive - the end date, exclusive, which is converted to an OffsetDateTime, not null - `java.time.temporal.Temporal`
  unit - the unit to measure the amount in, not null - `java.time.temporal.TemporalUnit`

  returns: the amount of time between this date-time and the end date-time - `long`

  throws: java.time.DateTimeException - if the amount cannot be calculated, or the end temporal cannot be converted to an OffsetDateTime"
  ([this end-exclusive unit]
    (-> this (.until end-exclusive unit))))

(defn with-offset-same-local
  "Returns a copy of this OffsetDateTime with the specified offset ensuring
   that the result has the same local date-time.

   This method returns an object with the same LocalDateTime and the specified ZoneOffset.
   No calculation is needed or performed.
   For example, if this time represents 2007-12-03T10:30+02:00 and the offset specified is
   +03:00, then this method will return 2007-12-03T10:30+03:00.

   To take into account the difference between the offsets, and adjust the time fields,
   use withOffsetSameInstant(java.time.ZoneOffset).

   This instance is immutable and unaffected by this method call.

  offset - the zone offset to change to, not null - `java.time.ZoneOffset`

  returns: an OffsetDateTime based on this date-time with the requested offset, not null - `java.time.OffsetDateTime`"
  ([this offset]
    (-> this (.withOffsetSameLocal offset))))

(defn with-day-of-month
  "Returns a copy of this OffsetDateTime with the day-of-month altered.

   If the resulting OffsetDateTime is invalid, an exception is thrown.
   The time and offset do not affect the calculation and will be the same in the result.

   This instance is immutable and unaffected by this method call.

  day-of-month - the day-of-month to set in the result, from 1 to 28-31 - `int`

  returns: an OffsetDateTime based on this date-time with the requested day, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the day-of-month value is invalid, or if the day-of-month is invalid for the month-year"
  ([this day-of-month]
    (-> this (.withDayOfMonth day-of-month))))

(defn get-day-of-month
  "Gets the day-of-month field.

   This method returns the primitive int value for the day-of-month.

  returns: the day-of-month, from 1 to 31 - `int`"
  ([this]
    (-> this (.getDayOfMonth))))

(defn after?
  "Checks if the instant of this date-time is after that of the specified date-time.

   This method differs from the comparison in compareTo(java.time.OffsetDateTime) and equals(java.lang.Object) in that it
   only compares the instant of the date-time. This is equivalent to using
   dateTime1.toInstant().isAfter(dateTime2.toInstant());.

  other - the other date-time to compare to, not null - `java.time.OffsetDateTime`

  returns: true if this is after the instant of the specified date-time - `boolean`"
  ([this other]
    (-> this (.isAfter other))))

(defn minus-nanos
  "Returns a copy of this OffsetDateTime with the specified number of nanoseconds subtracted.

   This instance is immutable and unaffected by this method call.

  nanos - the nanos to subtract, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the nanoseconds subtracted, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this nanos]
    (-> this (.minusNanos nanos))))

(defn supported?
  "Checks if the specified field is supported.

   This checks if this date-time can be queried for the specified field.
   If false, then calling the range,
   get and with(TemporalField, long)
   methods will throw an exception.

   If the field is a ChronoField then the query is implemented here.
   The supported fields are:

   NANO_OF_SECOND
   NANO_OF_DAY
   MICRO_OF_SECOND
   MICRO_OF_DAY
   MILLI_OF_SECOND
   MILLI_OF_DAY
   SECOND_OF_MINUTE
   SECOND_OF_DAY
   MINUTE_OF_HOUR
   MINUTE_OF_DAY
   HOUR_OF_AMPM
   CLOCK_HOUR_OF_AMPM
   HOUR_OF_DAY
   CLOCK_HOUR_OF_DAY
   AMPM_OF_DAY
   DAY_OF_WEEK
   ALIGNED_DAY_OF_WEEK_IN_MONTH
   ALIGNED_DAY_OF_WEEK_IN_YEAR
   DAY_OF_MONTH
   DAY_OF_YEAR
   EPOCH_DAY
   ALIGNED_WEEK_OF_MONTH
   ALIGNED_WEEK_OF_YEAR
   MONTH_OF_YEAR
   PROLEPTIC_MONTH
   YEAR_OF_ERA
   YEAR
   ERA
   INSTANT_SECONDS
   OFFSET_SECONDS

   All other ChronoField instances will return false.

   If the field is not a ChronoField, then the result of this method
   is obtained by invoking TemporalField.isSupportedBy(TemporalAccessor)
   passing this as the argument.
   Whether the field is supported is determined by the field.

  field - the field to check, null returns false - `java.time.temporal.TemporalField`

  returns: true if the field is supported on this date-time, false if not - `boolean`"
  ([this field]
    (-> this (.isSupported field))))

(defn minus-years
  "Returns a copy of this OffsetDateTime with the specified number of years subtracted.

   This method subtracts the specified amount from the years field in three steps:

   Subtract the input years from the year field
   Check if the resulting date would be invalid
   Adjust the day-of-month to the last valid day if necessary


   For example, 2008-02-29 (leap year) minus one year would result in the
   invalid date 2009-02-29 (standard year). Instead of returning an invalid
   result, the last valid day of the month, 2009-02-28, is selected instead.

   This instance is immutable and unaffected by this method call.

  years - the years to subtract, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the years subtracted, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this years]
    (-> this (.minusYears years))))

(defn with-second
  "Returns a copy of this OffsetDateTime with the second-of-minute altered.

   The date and offset do not affect the calculation and will be the same in the result.

   This instance is immutable and unaffected by this method call.

  second - the second-of-minute to set in the result, from 0 to 59 - `int`

  returns: an OffsetDateTime based on this date-time with the requested second, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the second value is invalid"
  ([this second]
    (-> this (.withSecond second))))

(defn to-local-date
  "Gets the LocalDate part of this date-time.

   This returns a LocalDate with the same year, month and day
   as this date-time.

  returns: the date part of this date-time, not null - `java.time.LocalDate`"
  ([this]
    (-> this (.toLocalDate))))

(defn get-minute
  "Gets the minute-of-hour field.

  returns: the minute-of-hour, from 0 to 59 - `int`"
  ([this]
    (-> this (.getMinute))))

(defn hash-code
  "A hash code for this date-time.

  returns: a suitable hash code - `int`"
  ([this]
    (-> this (.hashCode))))

(defn adjust-into
  "Adjusts the specified temporal object to have the same offset, date
   and time as this object.

   This returns a temporal object of the same observable type as the input
   with the offset, date and time changed to be the same as this.

   The adjustment is equivalent to using Temporal.with(TemporalField, long)
   three times, passing ChronoField.EPOCH_DAY,
   ChronoField.NANO_OF_DAY and ChronoField.OFFSET_SECONDS as the fields.

   In most cases, it is clearer to reverse the calling pattern by using
   Temporal.with(TemporalAdjuster):


     // these two lines are equivalent, but the second approach is recommended
     temporal = thisOffsetDateTime.adjustInto(temporal);
     temporal = temporal.with(thisOffsetDateTime);

   This instance is immutable and unaffected by this method call.

  temporal - the target object to be adjusted, not null - `java.time.temporal.Temporal`

  returns: the adjusted object, not null - `java.time.temporal.Temporal`

  throws: java.time.DateTimeException - if unable to make the adjustment"
  ([this temporal]
    (-> this (.adjustInto temporal))))

(defn with
  "Returns a copy of this date-time with the specified field set to a new value.

   This returns an OffsetDateTime, based on this one, with the value
   for the specified field changed.
   This can be used to change any supported field, such as the year, month or day-of-month.
   If it is not possible to set the value, because the field is not supported or for
   some other reason, an exception is thrown.

   In some cases, changing the specified field can cause the resulting date-time to become invalid,
   such as changing the month from 31st January to February would make the day-of-month invalid.
   In cases like this, the field is responsible for resolving the date. Typically it will choose
   the previous valid date, which would be the last valid day of February in this example.

   If the field is a ChronoField then the adjustment is implemented here.

   The INSTANT_SECONDS field will return a date-time with the specified instant.
   The offset and nano-of-second are unchanged.
   If the new instant value is outside the valid range then a DateTimeException will be thrown.

   The OFFSET_SECONDS field will return a date-time with the specified offset.
   The local date-time is unaltered. If the new offset value is outside the valid range
   then a DateTimeException will be thrown.

   The other supported fields will behave as per
   the matching method on LocalDateTime.
   In this case, the offset is not part of the calculation and will be unchanged.

   All other ChronoField instances will throw an UnsupportedTemporalTypeException.

   If the field is not a ChronoField, then the result of this method
   is obtained by invoking TemporalField.adjustInto(Temporal, long)
   passing this as the argument. In this case, the field determines
   whether and how to adjust the instant.

   This instance is immutable and unaffected by this method call.

  field - the field to set in the result, not null - `java.time.temporal.TemporalField`
  new-value - the new value of the field in the result - `long`

  returns: an OffsetDateTime based on this with the specified field set, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the field cannot be set"
  ([this field new-value]
    (-> this (.with field new-value)))
  ([this adjuster]
    (-> this (.with adjuster))))

(defn to-local-date-time
  "Gets the LocalDateTime part of this date-time.

   This returns a LocalDateTime with the same year, month, day and time
   as this date-time.

  returns: the local date-time part of this date-time, not null - `java.time.LocalDateTime`"
  ([this]
    (-> this (.toLocalDateTime))))

(defn get-month-value
  "Gets the month-of-year field from 1 to 12.

   This method returns the month as an int from 1 to 12.
   Application code is frequently clearer if the enum Month
   is used by calling getMonth().

  returns: the month-of-year, from 1 to 12 - `int`"
  ([this]
    (-> this (.getMonthValue))))

(defn with-day-of-year
  "Returns a copy of this OffsetDateTime with the day-of-year altered.

   The time and offset do not affect the calculation and will be the same in the result.
   If the resulting OffsetDateTime is invalid, an exception is thrown.

   This instance is immutable and unaffected by this method call.

  day-of-year - the day-of-year to set in the result, from 1 to 365-366 - `int`

  returns: an OffsetDateTime based on this date with the requested day, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the day-of-year value is invalid, or if the day-of-year is invalid for the year"
  ([this day-of-year]
    (-> this (.withDayOfYear day-of-year))))

(defn compare-to
  "Compares this date-time to another date-time.

   The comparison is based on the instant then on the local date-time.
   It is `consistent with equals`, as defined by Comparable.

   For example, the following is the comparator order:

   2008-12-03T10:30+01:00
   2008-12-03T11:00+01:00
   2008-12-03T12:00+02:00
   2008-12-03T11:30+01:00
   2008-12-03T12:00+01:00
   2008-12-03T12:30+01:00

   Values #2 and #3 represent the same instant on the time-line.
   When two values represent the same instant, the local date-time is compared
   to distinguish them. This step is needed to make the ordering
   consistent with equals().

  other - the other date-time to compare to, not null - `java.time.OffsetDateTime`

  returns: the comparator value, negative if less, positive if greater - `int`"
  ([this other]
    (-> this (.compareTo other))))

(defn get-month
  "Gets the month-of-year field using the Month enum.

   This method returns the enum Month for the month.
   This avoids confusion as to what int values mean.
   If you need access to the primitive int value then the enum
   provides the int value.

  returns: the month-of-year, not null - `java.time.Month`"
  ([this]
    (-> this (.getMonth))))

(defn plus-seconds
  "Returns a copy of this OffsetDateTime with the specified number of seconds added.

   This instance is immutable and unaffected by this method call.

  seconds - the seconds to add, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the seconds added, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this seconds]
    (-> this (.plusSeconds seconds))))

(defn get
  "Gets the value of the specified field from this date-time as an int.

   This queries this date-time for the value of the specified field.
   The returned value will always be within the valid range of values for the field.
   If it is not possible to return the value, because the field is not supported
   or for some other reason, an exception is thrown.

   If the field is a ChronoField then the query is implemented here.
   The supported fields will return valid
   values based on this date-time, except NANO_OF_DAY, MICRO_OF_DAY,
   EPOCH_DAY, PROLEPTIC_MONTH and INSTANT_SECONDS which are too
   large to fit in an int and throw a DateTimeException.
   All other ChronoField instances will throw an UnsupportedTemporalTypeException.

   If the field is not a ChronoField, then the result of this method
   is obtained by invoking TemporalField.getFrom(TemporalAccessor)
   passing this as the argument. Whether the value can be obtained,
   and what the value represents, is determined by the field.

  field - the field to get, not null - `java.time.temporal.TemporalField`

  returns: the value for the field - `int`

  throws: java.time.DateTimeException - if a value for the field cannot be obtained or the value is outside the range of valid values for the field"
  ([this field]
    (-> this (.get field))))

(defn equals
  "Checks if this date-time is equal to another date-time.

   The comparison is based on the local date-time and the offset.
   To compare for the same instant on the time-line, use isEqual(java.time.OffsetDateTime).
   Only objects of type OffsetDateTime are compared, other types return false.

  obj - the object to check, null returns false - `java.lang.Object`

  returns: true if this is equal to the other date-time - `boolean`"
  ([this obj]
    (-> this (.equals obj))))

(defn format
  "Formats this date-time using the specified formatter.

   This date-time will be passed to the formatter to produce a string.

  formatter - the formatter to use, not null - `java.time.format.DateTimeFormatter`

  returns: the formatted date-time string, not null - `java.lang.String`

  throws: java.time.DateTimeException - if an error occurs during printing"
  ([this formatter]
    (-> this (.format formatter))))

(defn plus-years
  "Returns a copy of this OffsetDateTime with the specified number of years added.

   This method adds the specified amount to the years field in three steps:

   Add the input years to the year field
   Check if the resulting date would be invalid
   Adjust the day-of-month to the last valid day if necessary


   For example, 2008-02-29 (leap year) plus one year would result in the
   invalid date 2009-02-29 (standard year). Instead of returning an invalid
   result, the last valid day of the month, 2009-02-28, is selected instead.

   This instance is immutable and unaffected by this method call.

  years - the years to add, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the years added, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this years]
    (-> this (.plusYears years))))

(defn minus-days
  "Returns a copy of this OffsetDateTime with the specified number of days subtracted.

   This method subtracts the specified amount from the days field decrementing the
   month and year fields as necessary to ensure the result remains valid.
   The result is only invalid if the maximum/minimum year is exceeded.

   For example, 2008-12-31 minus one day would result in 2009-01-01.

   This instance is immutable and unaffected by this method call.

  days - the days to subtract, may be negative - `long`

  returns: an OffsetDateTime based on this date-time with the days subtracted, not null - `java.time.OffsetDateTime`

  throws: java.time.DateTimeException - if the result exceeds the supported date range"
  ([this days]
    (-> this (.minusDays days))))

