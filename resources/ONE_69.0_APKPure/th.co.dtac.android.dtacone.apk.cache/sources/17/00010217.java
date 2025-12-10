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
    public static final Map f75995c;

    /* renamed from: a */
    public final Class f75996a;

    /* renamed from: b */
    public final List f75997b;

    /* loaded from: classes6.dex */
    public static final class Builder<T> {

        /* renamed from: a */
        public final Class f75998a;

        /* renamed from: b */
        public final List f75999b;

        public <S> Builder<T> addTypeParameter(TypeData typeData) {
            this.f75999b.add(Assertions.notNull("typeParameter", typeData));
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
            return new TypeData(this.f75998a, Collections.unmodifiableList(this.f75999b));
        }

        public Builder(Class cls) {
            this.f75999b = new ArrayList();
            this.f75998a = cls;
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
        f75995c = hashMap;
    }

    /* renamed from: b */
    public static Builder m24440b(Class cls) {
        return new Builder((Class) Assertions.notNull("type", cls));
    }

    /* renamed from: c */
    public static void m24439c(Builder builder, Type type) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Builder m24440b = m24440b((Class) parameterizedType.getRawType());
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                m24439c(m24440b, type2);
            }
            builder.addTypeParameter(m24440b.build());
        } else if (type instanceof WildcardType) {
            builder.addTypeParameter(m24440b((Class) ((WildcardType) type).getUpperBounds()[0]).build());
        } else if (type instanceof TypeVariable) {
            builder.addTypeParameter(m24440b(Object.class).build());
        } else if (type instanceof Class) {
            builder.addTypeParameter(m24440b((Class) type).build());
        }
    }

    /* renamed from: e */
    public static String m24437e(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            TypeData typeData = (TypeData) it.next();
            i++;
            sb.append(typeData.getType().getSimpleName());
            if (!typeData.getTypeParameters().isEmpty()) {
                sb.append(String.format("<%s>", m24437e(typeData.getTypeParameters())));
            }
            if (i < size) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static TypeData m24436f(Field field) {
        return m24434h(field.getGenericType(), field.getType());
    }

    /* renamed from: g */
    public static TypeData m24435g(Method method) {
        if (AbstractC12926e.m24396b(method)) {
            return m24434h(method.getGenericReturnType(), method.getReturnType());
        }
        return m24434h(method.getGenericParameterTypes()[0], method.getParameterTypes()[0]);
    }

    /* renamed from: h */
    public static TypeData m24434h(Type type, Class cls) {
        Builder m24440b = m24440b(cls);
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                m24439c(m24440b, type2);
            }
        }
        return m24440b.build();
    }

    /* renamed from: a */
    public final Class m24441a(Class cls) {
        if (cls.isPrimitive()) {
            return (Class) f75995c.get(cls);
        }
        return cls;
    }

    /* renamed from: d */
    public boolean m24438d(Class cls) {
        return this.f75996a.isAssignableFrom(m24441a(cls));
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
        return this.f75996a;
    }

    @Override // org.bson.codecs.pojo.TypeWithTypeParameters
    public List getTypeParameters() {
        return this.f75997b;
    }

    public int hashCode() {
        return (getType().hashCode() * 31) + getTypeParameters().hashCode();
    }

    public String toString() {
        String str;
        if (this.f75997b.isEmpty()) {
            str = "";
        } else {
            str = ", typeParameters=[" + m24437e(this.f75997b) + "]";
        }
        return "TypeData{type=" + this.f75996a.getSimpleName() + str + "}";
    }

    public TypeData(Class cls, List list) {
        this.f75996a = m24441a(cls);
        this.f75997b = list;
    }
}