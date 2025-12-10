package org.bson.codecs.pojo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bson.assertions.Assertions;

/* loaded from: classes6.dex */
public final class TypeData implements TypeWithTypeParameters {

    /* renamed from: c */
    public static final Map f75911c;

    /* renamed from: a */
    public final Class f75912a;

    /* renamed from: b */
    public final List f75913b;

    /* loaded from: classes6.dex */
    public static final class Builder<T> {

        /* renamed from: a */
        public final Class f75914a;

        /* renamed from: b */
        public final List f75915b;

        public <S> Builder<T> addTypeParameter(TypeData typeData) {
            this.f75915b.add(Assertions.notNull("typeParameter", typeData));
            return this;
        }

        public Builder<T> addTypeParameters(List<TypeData> list) {
            Assertions.notNull("typeParameters", list);
            for (TypeData typeData : list) {
                addTypeParameter(typeData);
            }
            return this;
        }

        public TypeData build() {
            return new TypeData(this.f75914a, Collections.unmodifiableList(this.f75915b));
        }

        public Builder(Class cls) {
            this.f75915b = new ArrayList();
            this.f75914a = cls;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Short.TYPE, Short.class);
        f75911c = hashMap;
    }

    /* renamed from: b */
    public static Builder m24250b(Class cls) {
        return new Builder((Class) Assertions.notNull("type", cls));
    }

    /* renamed from: c */
    public static void m24249c(Builder builder, Type type) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Builder m24250b = m24250b((Class) parameterizedType.getRawType());
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                m24249c(m24250b, type2);
            }
            builder.addTypeParameter(m24250b.build());
        } else if (type instanceof WildcardType) {
            builder.addTypeParameter(m24250b((Class) ((WildcardType) type).getUpperBounds()[0]).build());
        } else if (type instanceof TypeVariable) {
            builder.addTypeParameter(m24250b(Object.class).build());
        } else if (type instanceof Class) {
            builder.addTypeParameter(m24250b((Class) type).build());
        }
    }

    /* renamed from: e */
    public static String m24247e(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            TypeData typeData = (TypeData) it.next();
            i++;
            sb.append(typeData.getType().getSimpleName());
            if (!typeData.getTypeParameters().isEmpty()) {
                sb.append(String.format("<%s>", m24247e(typeData.getTypeParameters())));
            }
            if (i < size) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static TypeData m24246f(Field field) {
        return m24244h(field.getGenericType(), field.getType());
    }

    /* renamed from: g */
    public static TypeData m24245g(Method method) {
        if (AbstractC12926e.m24207b(method)) {
            return m24244h(method.getGenericReturnType(), method.getReturnType());
        }
        return m24244h(method.getGenericParameterTypes()[0], method.getParameterTypes()[0]);
    }

    /* renamed from: h */
    public static TypeData m24244h(Type type, Class cls) {
        Builder m24250b = m24250b(cls);
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                m24249c(m24250b, type2);
            }
        }
        return m24250b.build();
    }

    /* renamed from: a */
    public final Class m24251a(Class cls) {
        if (cls.isPrimitive()) {
            return (Class) f75911c.get(cls);
        }
        return cls;
    }

    /* renamed from: d */
    public boolean m24248d(Class cls) {
        return this.f75912a.isAssignableFrom(m24251a(cls));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeData)) {
            return false;
        }
        TypeData typeData = (TypeData) obj;
        if (getType().equals(typeData.getType()) && getTypeParameters().equals(typeData.getTypeParameters())) {
            return true;
        }
        return false;
    }

    @Override // org.bson.codecs.pojo.TypeWithTypeParameters
    public Class getType() {
        return this.f75912a;
    }

    @Override // org.bson.codecs.pojo.TypeWithTypeParameters
    public List getTypeParameters() {
        return this.f75913b;
    }

    public int hashCode() {
        return (getType().hashCode() * 31) + getTypeParameters().hashCode();
    }

    public String toString() {
        String str;
        if (this.f75913b.isEmpty()) {
            str = "";
        } else {
            str = ", typeParameters=[" + m24247e(this.f75913b) + "]";
        }
        return "TypeData{type=" + this.f75912a.getSimpleName() + str + "}";
    }

    public TypeData(Class cls, List list) {
        this.f75912a = m24251a(cls);
        this.f75913b = list;
    }
}
