(ns jdk.lang.invoke.LambdaConversionException
  "LambdaConversionException"
  (:refer-clojure :only [require comment defn ->])
  (:import [java.lang.invoke LambdaConversionException]))

(defn ->lambda-conversion-exception
  "Constructor.

  Constructs a LambdaConversionException with a message,
   cause, and other settings.

  message - the detail message - `java.lang.String`
  cause - the cause - `java.lang.Throwable`
  enable-suppression - whether or not suppressed exceptions are enabled - `boolean`
  writable-stack-trace - whether or not the stack trace is writable - `boolean`"
  ([message cause enable-suppression writable-stack-trace]
    (new LambdaConversionException message cause enable-suppression writable-stack-trace))
  ([message cause]
    (new LambdaConversionException message cause))
  ([message]
    (new LambdaConversionException message))
  ([]
    (new LambdaConversionException )))

