(ns javax.management.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[javax.management.Attribute])
(require '[javax.management.AttributeChangeNotification])
(require '[javax.management.AttributeChangeNotificationFilter])
(require '[javax.management.AttributeList])
(require '[javax.management.AttributeNotFoundException])
(require '[javax.management.AttributeValueExp])
(require '[javax.management.BadAttributeValueExpException])
(require '[javax.management.BadBinaryOpValueExpException])
(require '[javax.management.BadStringOperationException])
(require '[javax.management.DefaultLoaderRepository])
(require '[javax.management.Descriptor])
(require '[javax.management.DescriptorAccess])
(require '[javax.management.DescriptorKey])
(require '[javax.management.DescriptorRead])
(require '[javax.management.DynamicMBean])
(require '[javax.management.ImmutableDescriptor])
(require '[javax.management.InstanceAlreadyExistsException])
(require '[javax.management.InstanceNotFoundException])
(require '[javax.management.IntrospectionException])
(require '[javax.management.InvalidApplicationException])
(require '[javax.management.InvalidAttributeValueException])
(require '[javax.management.JMException])
(require '[javax.management.JMRuntimeException])
(require '[javax.management.JMX])
(require '[javax.management.ListenerNotFoundException])
(require '[javax.management.MBeanAttributeInfo])
(require '[javax.management.MBeanConstructorInfo])
(require '[javax.management.MBeanException])
(require '[javax.management.MBeanFeatureInfo])
(require '[javax.management.MBeanInfo])
(require '[javax.management.MBeanNotificationInfo])
(require '[javax.management.MBeanOperationInfo])
(require '[javax.management.MBeanParameterInfo])
(require '[javax.management.MBeanPermission])
(require '[javax.management.MBeanRegistration])
(require '[javax.management.MBeanRegistrationException])
(require '[javax.management.MBeanServer])
(require '[javax.management.MBeanServerBuilder])
(require '[javax.management.MBeanServerConnection])
(require '[javax.management.MBeanServerDelegate])
(require '[javax.management.MBeanServerDelegateMBean])
(require '[javax.management.MBeanServerFactory])
(require '[javax.management.MBeanServerInvocationHandler])
(require '[javax.management.MBeanServerNotification])
(require '[javax.management.MBeanServerPermission])
(require '[javax.management.MBeanTrustPermission])
(require '[javax.management.MXBean])
(require '[javax.management.MalformedObjectNameException])
(require '[javax.management.NotCompliantMBeanException])
(require '[javax.management.Notification])
(require '[javax.management.NotificationBroadcaster])
(require '[javax.management.NotificationBroadcasterSupport])
(require '[javax.management.NotificationEmitter])
(require '[javax.management.NotificationFilter])
(require '[javax.management.NotificationFilterSupport])
(require '[javax.management.NotificationListener])
(require '[javax.management.ObjectInstance])
(require '[javax.management.ObjectName])
(require '[javax.management.OperationsException])
(require '[javax.management.PersistentMBean])
(require '[javax.management.Query])
(require '[javax.management.QueryEval])
(require '[javax.management.QueryExp])
(require '[javax.management.ReflectionException])
(require '[javax.management.RuntimeErrorException])
(require '[javax.management.RuntimeMBeanException])
(require '[javax.management.RuntimeOperationsException])
(require '[javax.management.ServiceNotFoundException])
(require '[javax.management.StandardEmitterMBean])
(require '[javax.management.StandardMBean])
(require '[javax.management.StringValueExp])
(require '[javax.management.ValueExp])
