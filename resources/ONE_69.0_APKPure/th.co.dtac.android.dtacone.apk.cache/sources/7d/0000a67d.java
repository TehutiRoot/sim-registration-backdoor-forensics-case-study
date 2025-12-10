package com.google.api.client.util;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes4.dex */
public class Types {

    /* renamed from: com.google.api.client.util.Types$a */
    /* loaded from: classes4.dex */
    public static class C7310a implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ Object f52365a;

        /* renamed from: com.google.api.client.util.Types$a$a */
        /* loaded from: classes4.dex */
        public class C7311a implements Iterator {

            /* renamed from: a */
            public final int f52366a;

            /* renamed from: b */
            public int f52367b = 0;

            public C7311a() {
                this.f52366a = Array.getLength(C7310a.this.f52365a);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f52367b < this.f52366a) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (hasNext()) {
                    Object obj = C7310a.this.f52365a;
                    int i = this.f52367b;
                    this.f52367b = i + 1;
                    return Array.get(obj, i);
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public C7310a(Object obj) {
            this.f52365a = obj;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C7311a();
        }
    }

    /* renamed from: a */
    public static Type m41681a(Type type, Class cls, int i) {
        Type resolveTypeVariable;
        ParameterizedType superParameterizedType = getSuperParameterizedType(type, cls);
        if (superParameterizedType == null) {
            return null;
        }
        Type type2 = superParameterizedType.getActualTypeArguments()[i];
        if ((type2 instanceof TypeVariable) && (resolveTypeVariable = resolveTypeVariable(Arrays.asList(type), (TypeVariable) type2)) != null) {
            return resolveTypeVariable;
        }
        return type2;
    }

    /* renamed from: b */
    public static IllegalArgumentException m41680b(Exception exc, Class cls) {
        StringBuilder sb = new StringBuilder("unable to create new instance of class ");
        sb.append(cls.getName());
        ArrayList arrayList = new ArrayList();
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (!Modifier.isPublic(cls.getModifiers())) {
                arrayList.add("possibly because it is not public");
            } else {
                try {
                    cls.getConstructor(null);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            }
        }
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                sb.append(" and");
            } else {
                z = true;
            }
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            sb.append(str);
        }
        return new IllegalArgumentException(sb.toString(), exc);
    }

    public static Type getArrayComponentType(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Type getBound(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length != 0) {
            return lowerBounds[0];
        }
        return wildcardType.getUpperBounds()[0];
    }

    public static Type getIterableParameter(Type type) {
        return m41681a(type, Iterable.class, 0);
    }

    public static Type getMapValueParameter(Type type) {
        return m41681a(type, Map.class, 1);
    }

    public static Class<?> getRawArrayComponentType(List<Type> list, Type type) {
        boolean z;
        if (type instanceof TypeVariable) {
            type = resolveTypeVariable(list, (TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(getRawArrayComponentType(list, getArrayComponentType(type)), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return getRawClass((ParameterizedType) type);
        }
        if (type == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "wildcard type is not supported: %s", type);
        return Object.class;
    }

    public static Class<?> getRawClass(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    public static ParameterizedType getSuperParameterizedType(Type type, Class<?> cls) {
        Class<?> cls2;
        Type[] genericInterfaces;
        Class<?> rawClass;
        if ((type instanceof Class) || (type instanceof ParameterizedType)) {
            while (type != null && type != Object.class) {
                if (type instanceof Class) {
                    cls2 = (Class) type;
                } else {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Class<?> rawClass2 = getRawClass(parameterizedType);
                    if (rawClass2 == cls) {
                        return parameterizedType;
                    }
                    if (cls.isInterface()) {
                        for (Type type2 : rawClass2.getGenericInterfaces()) {
                            if (type2 instanceof Class) {
                                rawClass = (Class) type2;
                            } else {
                                rawClass = getRawClass((ParameterizedType) type2);
                            }
                            if (cls.isAssignableFrom(rawClass)) {
                                type = type2;
                                break;
                            }
                        }
                    }
                    cls2 = rawClass2;
                }
                type = cls2.getGenericSuperclass();
            }
            return null;
        }
        return null;
    }

    public static boolean isArray(Type type) {
        if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
            return false;
        }
        return true;
    }

    public static boolean isAssignableToOrFrom(Class<?> cls, Class<?> cls2) {
        if (!cls.isAssignableFrom(cls2) && !cls2.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    public static <T> Iterable<T> iterableOf(Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        Preconditions.checkArgument(cls.isArray(), "not an array or Iterable: %s", cls);
        if (!cls.getComponentType().isPrimitive()) {
            return Arrays.asList((Object[]) obj);
        }
        return new C7310a(obj);
    }

    public static <T> T newInstance(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw m41680b(e, cls);
        } catch (InstantiationException e2) {
            throw m41680b(e2, cls);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.GenericDeclaration] */
    public static Type resolveTypeVariable(List<Type> list, TypeVariable<?> typeVariable) {
        Type resolveTypeVariable;
        ?? genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class cls = (Class) genericDeclaration;
            int size = list.size();
            ParameterizedType parameterizedType = null;
            while (parameterizedType == null) {
                size--;
                if (size < 0) {
                    break;
                }
                parameterizedType = getSuperParameterizedType(list.get(size), cls);
            }
            if (parameterizedType != null) {
                TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
                int i = 0;
                while (i < typeParameters.length && !typeParameters[i].equals(typeVariable)) {
                    i++;
                }
                Type type = parameterizedType.getActualTypeArguments()[i];
                if ((type instanceof TypeVariable) && (resolveTypeVariable = resolveTypeVariable(list, (TypeVariable) type)) != null) {
                    return resolveTypeVariable;
                }
                return type;
            }
        }
        return null;
    }

    public static Object toArray(Collection<?> collection, Class<?> cls) {
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance(cls, collection.size());
            Iterator<?> it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                Array.set(newInstance, i, it.next());
                i++;
            }
            return newInstance;
        }
        return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
    }
}