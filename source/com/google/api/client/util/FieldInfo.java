package com.google.api.client.util;

import com.google.common.base.Ascii;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class FieldInfo {

    /* renamed from: e */
    public static final Map f52316e = new WeakHashMap();

    /* renamed from: a */
    public final boolean f52317a;

    /* renamed from: b */
    public final Field f52318b;

    /* renamed from: c */
    public final Method[] f52319c;

    /* renamed from: d */
    public final String f52320d;

    public FieldInfo(Field field, String str) {
        String intern;
        this.f52318b = field;
        if (str == null) {
            intern = null;
        } else {
            intern = str.intern();
        }
        this.f52320d = intern;
        this.f52317a = Data.isPrimitive(getType());
        this.f52319c = m41702a(field);
    }

    public static Object getFieldValue(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: of */
    public static FieldInfo m41701of(Enum<?> r5) {
        try {
            FieldInfo m41700of = m41700of(r5.getClass().getField(r5.name()));
            Preconditions.checkArgument(m41700of != null, "enum constant missing @Value or @NullValue annotation: %s", r5);
            return m41700of;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setFieldValue(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object fieldValue = getFieldValue(field, obj);
            if (obj2 == null) {
                if (fieldValue == null) {
                    return;
                }
            } else if (obj2.equals(fieldValue)) {
                return;
            }
            throw new IllegalArgumentException("expected final value <" + fieldValue + "> but was <" + obj2 + "> on " + field.getName() + " field in " + obj.getClass().getName());
        }
        try {
            field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        } catch (SecurityException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: a */
    public final Method[] m41702a(Field field) {
        Method[] declaredMethods;
        ArrayList arrayList = new ArrayList();
        String str = "set" + Ascii.toUpperCase(field.getName().substring(0, 1));
        if (field.getName().length() > 1) {
            str = str + field.getName().substring(1);
        }
        for (Method method : field.getDeclaringClass().getDeclaredMethods()) {
            if (method.getParameterTypes().length == 1) {
                if (method.getName().equals(str)) {
                    arrayList.add(0, method);
                } else if (Ascii.toLowerCase(method.getName()).equals(Ascii.toLowerCase(str))) {
                    arrayList.add(method);
                }
            }
        }
        return (Method[]) arrayList.toArray(new Method[0]);
    }

    public <T extends Enum<T>> T enumValue() {
        return (T) Enum.valueOf(this.f52318b.getDeclaringClass(), this.f52318b.getName());
    }

    public ClassInfo getClassInfo() {
        return ClassInfo.m41709of(this.f52318b.getDeclaringClass());
    }

    public Field getField() {
        return this.f52318b;
    }

    public Type getGenericType() {
        return this.f52318b.getGenericType();
    }

    public String getName() {
        return this.f52320d;
    }

    public Class<?> getType() {
        return this.f52318b.getType();
    }

    public Object getValue(Object obj) {
        return getFieldValue(this.f52318b, obj);
    }

    public boolean isFinal() {
        return Modifier.isFinal(this.f52318b.getModifiers());
    }

    public boolean isPrimitive() {
        return this.f52317a;
    }

    public void setValue(Object obj, Object obj2) {
        Method[] methodArr;
        for (Method method : this.f52319c) {
            if (obj2 == null || method.getParameterTypes()[0].isAssignableFrom(obj2.getClass())) {
                try {
                    method.invoke(obj, obj2);
                    return;
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    continue;
                }
            }
        }
        setFieldValue(this.f52318b, obj, obj2);
    }

    /* renamed from: of */
    public static FieldInfo m41700of(Field field) {
        String str = null;
        if (field == null) {
            return null;
        }
        Map map = f52316e;
        synchronized (map) {
            try {
                FieldInfo fieldInfo = (FieldInfo) map.get(field);
                boolean isEnumConstant = field.isEnumConstant();
                if (fieldInfo == null) {
                    if (!isEnumConstant) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                        }
                    }
                    if (isEnumConstant) {
                        Value value = (Value) field.getAnnotation(Value.class);
                        if (value != null) {
                            str = value.value();
                        } else if (((NullValue) field.getAnnotation(NullValue.class)) == null) {
                            return null;
                        }
                    } else {
                        Key key = (Key) field.getAnnotation(Key.class);
                        if (key == null) {
                            return null;
                        }
                        str = key.value();
                        field.setAccessible(true);
                    }
                    if ("##default".equals(str)) {
                        str = field.getName();
                    }
                    fieldInfo = new FieldInfo(field, str);
                    map.put(field, fieldInfo);
                }
                return fieldInfo;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
