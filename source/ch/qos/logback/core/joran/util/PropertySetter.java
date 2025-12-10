package ch.qos.logback.core.joran.util;

import ch.qos.logback.core.joran.spi.DefaultClass;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.AggregationType;
import ch.qos.logback.core.util.PropertySetterException;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public class PropertySetter extends ContextAwareBase {
    protected MethodDescriptor[] methodDescriptors;
    protected Object obj;
    protected Class<?> objClass;
    protected PropertyDescriptor[] propertyDescriptors;

    /* renamed from: ch.qos.logback.core.joran.util.PropertySetter$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5472a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39836a;

        static {
            int[] iArr = new int[AggregationType.values().length];
            f39836a = iArr;
            try {
                iArr[AggregationType.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39836a[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39836a[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39836a[AggregationType.AS_BASIC_PROPERTY_COLLECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39836a[AggregationType.AS_COMPLEX_PROPERTY_COLLECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public PropertySetter(Object obj) {
        this.obj = obj;
        this.objClass = obj.getClass();
    }

    public void addBasicProperty(String str, String str2) {
        if (str2 == null) {
            return;
        }
        String m51484b = m51484b(str);
        Method m51482g = m51482g(m51484b);
        if (m51482g == null) {
            addError("No adder for property [" + m51484b + "].");
            return;
        }
        Class<?>[] parameterTypes = m51482g.getParameterTypes();
        m51474p(m51484b, m51482g, parameterTypes, str2);
        try {
            if (StringToObjectConverter.convertArg(this, str2, parameterTypes[0]) != null) {
                m51475o(m51482g, str2);
            }
        } catch (Throwable th2) {
            addError("Conversion to type [" + parameterTypes[0] + "] failed. ", th2);
        }
    }

    public void addComplexProperty(String str, Object obj) {
        Method m51482g = m51482g(str);
        if (m51482g != null) {
            if (m51474p(str, m51482g, m51482g.getParameterTypes(), obj)) {
                m51475o(m51482g, obj);
                return;
            }
            return;
        }
        addError("Could not find method [add" + str + "] in class [" + this.objClass.getName() + "].");
    }

    /* renamed from: b */
    public final String m51484b(String str) {
        return str.substring(0, 1).toUpperCase(Locale.US) + str.substring(1);
    }

    public AggregationType computeAggregationType(String str) {
        Method m51482g = m51482g(str);
        if (m51482g != null) {
            AggregationType m51483d = m51483d(m51482g);
            int i = C5472a.f39836a[m51483d.ordinal()];
            if (i == 1) {
                return AggregationType.NOT_FOUND;
            }
            if (i == 2) {
                return AggregationType.AS_BASIC_PROPERTY_COLLECTION;
            }
            if (i == 3) {
                return AggregationType.AS_COMPLEX_PROPERTY_COLLECTION;
            }
            if (i == 4 || i == 5) {
                addError("Unexpected AggregationType " + m51483d);
            }
        }
        Method m51481i = m51481i(str);
        return m51481i != null ? m51483d(m51481i) : AggregationType.NOT_FOUND;
    }

    /* renamed from: d */
    public final AggregationType m51483d(Method method) {
        Class m51477m = m51477m(method);
        return m51477m == null ? AggregationType.NOT_FOUND : StringToObjectConverter.canBeBuiltFromSimpleString(m51477m) ? AggregationType.AS_BASIC_PROPERTY : AggregationType.AS_COMPLEX_PROPERTY;
    }

    /* renamed from: g */
    public final Method m51482g(String str) {
        String m51484b = m51484b(str);
        return getMethod(ProductAction.ACTION_ADD + m51484b);
    }

    public Class<?> getClassNameViaImplicitRules(String str, AggregationType aggregationType, DefaultNestedComponentRegistry defaultNestedComponentRegistry) {
        Class<?> findDefaultComponentType = defaultNestedComponentRegistry.findDefaultComponentType(this.obj.getClass(), str);
        if (findDefaultComponentType != null) {
            return findDefaultComponentType;
        }
        Method m51476n = m51476n(str, aggregationType);
        if (m51476n == null) {
            return null;
        }
        Class<?> m51478l = m51478l(str, m51476n);
        return m51478l != null ? m51478l : m51479k(str, m51476n);
    }

    public Method getMethod(String str) {
        if (this.methodDescriptors == null) {
            introspect();
        }
        int i = 0;
        while (true) {
            MethodDescriptor[] methodDescriptorArr = this.methodDescriptors;
            if (i >= methodDescriptorArr.length) {
                return null;
            }
            if (str.equals(methodDescriptorArr[i].getName())) {
                return this.methodDescriptors[i].getMethod();
            }
            i++;
        }
    }

    public Object getObj() {
        return this.obj;
    }

    public Class<?> getObjClass() {
        return this.objClass;
    }

    public PropertyDescriptor getPropertyDescriptor(String str) {
        if (this.propertyDescriptors == null) {
            introspect();
        }
        int i = 0;
        while (true) {
            PropertyDescriptor[] propertyDescriptorArr = this.propertyDescriptors;
            if (i >= propertyDescriptorArr.length) {
                return null;
            }
            if (str.equals(propertyDescriptorArr[i].getName())) {
                return this.propertyDescriptors[i];
            }
            i++;
        }
    }

    /* renamed from: i */
    public final Method m51481i(String str) {
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(Introspector.decapitalize(str));
        if (propertyDescriptor != null) {
            return propertyDescriptor.getWriteMethod();
        }
        return null;
    }

    public void introspect() {
        try {
            this.propertyDescriptors = Introspector.getPropertyDescriptors(this.objClass);
            this.methodDescriptors = Introspector.getMethodDescriptors(this.objClass);
        } catch (IntrospectionException e) {
            addError("Failed to introspect " + this.obj + ": " + e.getMessage());
            this.propertyDescriptors = new PropertyDescriptor[0];
            this.methodDescriptors = new MethodDescriptor[0];
        }
    }

    /* renamed from: j */
    public Annotation m51480j(String str, Class cls, Method method) {
        if (method != null) {
            return method.getAnnotation(cls);
        }
        return null;
    }

    /* renamed from: k */
    public Class m51479k(String str, Method method) {
        Class m51477m = m51477m(method);
        if (m51477m != null && m51473q(m51477m)) {
            return m51477m;
        }
        return null;
    }

    /* renamed from: l */
    public Class m51478l(String str, Method method) {
        DefaultClass defaultClass = (DefaultClass) m51480j(str, DefaultClass.class, method);
        if (defaultClass != null) {
            return defaultClass.value();
        }
        return null;
    }

    /* renamed from: m */
    public final Class m51477m(Method method) {
        if (method == null) {
            return null;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 1) {
            return null;
        }
        return parameterTypes[0];
    }

    /* renamed from: n */
    public Method m51476n(String str, AggregationType aggregationType) {
        String m51484b = m51484b(str);
        if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY_COLLECTION) {
            return m51482g(m51484b);
        }
        if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY) {
            return m51481i(m51484b);
        }
        throw new IllegalStateException(aggregationType + " not allowed here");
    }

    /* renamed from: o */
    public void m51475o(Method method, Object obj) {
        Class<?> cls = obj.getClass();
        try {
            method.invoke(this.obj, obj);
        } catch (Exception e) {
            addError("Could not invoke method " + method.getName() + " in class " + this.obj.getClass().getName() + " with parameter of type " + cls.getName(), e);
        }
    }

    /* renamed from: p */
    public final boolean m51474p(String str, Method method, Class[] clsArr, Object obj) {
        String str2;
        Class<?> cls = obj.getClass();
        if (clsArr.length != 1) {
            str2 = "Wrong number of parameters in setter method for property [" + str + "] in " + this.obj.getClass().getName();
        } else if (clsArr[0].isAssignableFrom(obj.getClass())) {
            return true;
        } else {
            addError("A \"" + cls.getName() + "\" object is not assignable to a \"" + clsArr[0].getName() + "\" variable.");
            addError("The class \"" + clsArr[0].getName() + "\" was loaded by ");
            addError("[" + clsArr[0].getClassLoader() + "] whereas object of type ");
            str2 = OperatorName.SHOW_TEXT_LINE_AND_SPACE + cls.getName() + "\" was loaded by [" + cls.getClassLoader() + "].";
        }
        addError(str2);
        return false;
    }

    /* renamed from: q */
    public final boolean m51473q(Class cls) {
        if (cls.isInterface()) {
            return false;
        }
        return cls.getDeclaredConstructor(null).newInstance(null) != null;
    }

    public void setComplexProperty(String str, Object obj) {
        StringBuilder sb;
        Class<?> cls;
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(Introspector.decapitalize(str));
        if (propertyDescriptor == null) {
            sb = new StringBuilder();
            sb.append("Could not find PropertyDescriptor for [");
            sb.append(str);
            sb.append("] in ");
            cls = this.objClass;
        } else {
            Method writeMethod = propertyDescriptor.getWriteMethod();
            if (writeMethod != null) {
                if (m51474p(str, writeMethod, writeMethod.getParameterTypes(), obj)) {
                    try {
                        m51475o(writeMethod, obj);
                        return;
                    } catch (Exception e) {
                        addError("Could not set component " + this.obj + " for parent component " + this.obj, e);
                        return;
                    }
                }
                return;
            }
            sb = new StringBuilder();
            sb.append("Not setter method for property [");
            sb.append(str);
            sb.append("] in ");
            cls = this.obj.getClass();
        }
        sb.append(cls.getName());
        addWarn(sb.toString());
    }

    public void setProperty(PropertyDescriptor propertyDescriptor, String str, String str2) throws PropertySetterException {
        Method writeMethod = propertyDescriptor.getWriteMethod();
        if (writeMethod == null) {
            throw new PropertySetterException("No setter for property [" + str + "].");
        }
        Class<?>[] parameterTypes = writeMethod.getParameterTypes();
        if (parameterTypes.length != 1) {
            throw new PropertySetterException("#params for setter != 1");
        }
        try {
            Object convertArg = StringToObjectConverter.convertArg(this, str2, parameterTypes[0]);
            if (convertArg != null) {
                try {
                    writeMethod.invoke(this.obj, convertArg);
                    return;
                } catch (Exception e) {
                    throw new PropertySetterException(e);
                }
            }
            throw new PropertySetterException("Conversion to type [" + parameterTypes[0] + "] failed.");
        } catch (Throwable th2) {
            throw new PropertySetterException("Conversion to type [" + parameterTypes[0] + "] failed. ", th2);
        }
    }

    public void setProperty(String str, String str2) {
        if (str2 == null) {
            return;
        }
        String decapitalize = Introspector.decapitalize(str);
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(decapitalize);
        if (propertyDescriptor == null) {
            addWarn("No such property [" + decapitalize + "] in " + this.objClass.getName() + ".");
            return;
        }
        try {
            setProperty(propertyDescriptor, decapitalize, str2);
        } catch (PropertySetterException e) {
            addWarn("Failed to set property [" + decapitalize + "] to value \"" + str2 + "\". ", e);
        }
    }
}
