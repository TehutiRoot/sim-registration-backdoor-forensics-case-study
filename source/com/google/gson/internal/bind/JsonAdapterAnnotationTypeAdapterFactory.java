package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: c */
    public static final TypeAdapterFactory f56757c = new DummyTypeAdapterFactory();

    /* renamed from: d */
    public static final TypeAdapterFactory f56758d = new DummyTypeAdapterFactory();

    /* renamed from: a */
    public final ConstructorConstructor f56759a;

    /* renamed from: b */
    public final ConcurrentMap f56760b = new ConcurrentHashMap();

    /* loaded from: classes4.dex */
    public static class DummyTypeAdapterFactory implements TypeAdapterFactory {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.TypeAdapterFactory
        public TypeAdapter create(Gson gson, TypeToken typeToken) {
            throw new AssertionError("Factory should not be used");
        }
    }

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.f56759a = constructorConstructor;
    }

    /* renamed from: a */
    public static Object m37531a(ConstructorConstructor constructorConstructor, Class cls) {
        return constructorConstructor.get(TypeToken.get(cls)).construct();
    }

    /* renamed from: b */
    public static JsonAdapter m37530b(Class cls) {
        return (JsonAdapter) cls.getAnnotation(JsonAdapter.class);
    }

    /* renamed from: c */
    public TypeAdapter m37529c(ConstructorConstructor constructorConstructor, Gson gson, TypeToken typeToken, JsonAdapter jsonAdapter, boolean z) {
        JsonSerializer jsonSerializer;
        JsonDeserializer jsonDeserializer;
        TypeAdapterFactory typeAdapterFactory;
        TypeAdapter treeTypeAdapter;
        Object m37531a = m37531a(constructorConstructor, jsonAdapter.value());
        boolean nullSafe = jsonAdapter.nullSafe();
        if (m37531a instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) m37531a;
        } else if (m37531a instanceof TypeAdapterFactory) {
            TypeAdapterFactory typeAdapterFactory2 = (TypeAdapterFactory) m37531a;
            if (z) {
                typeAdapterFactory2 = m37528d(typeToken.getRawType(), typeAdapterFactory2);
            }
            treeTypeAdapter = typeAdapterFactory2.create(gson, typeToken);
        } else {
            boolean z2 = m37531a instanceof JsonSerializer;
            if (!z2 && !(m37531a instanceof JsonDeserializer)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + m37531a.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            if (z2) {
                jsonSerializer = (JsonSerializer) m37531a;
            } else {
                jsonSerializer = null;
            }
            if (m37531a instanceof JsonDeserializer) {
                jsonDeserializer = (JsonDeserializer) m37531a;
            } else {
                jsonDeserializer = null;
            }
            if (z) {
                typeAdapterFactory = f56757c;
            } else {
                typeAdapterFactory = f56758d;
            }
            treeTypeAdapter = new TreeTypeAdapter(jsonSerializer, jsonDeserializer, gson, typeToken, typeAdapterFactory, nullSafe);
            nullSafe = false;
        }
        if (treeTypeAdapter != null && nullSafe) {
            return treeTypeAdapter.nullSafe();
        }
        return treeTypeAdapter;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        JsonAdapter m37530b = m37530b(typeToken.getRawType());
        if (m37530b == null) {
            return null;
        }
        return m37529c(this.f56759a, gson, typeToken, m37530b, true);
    }

    /* renamed from: d */
    public final TypeAdapterFactory m37528d(Class cls, TypeAdapterFactory typeAdapterFactory) {
        TypeAdapterFactory typeAdapterFactory2 = (TypeAdapterFactory) this.f56760b.putIfAbsent(cls, typeAdapterFactory);
        if (typeAdapterFactory2 != null) {
            return typeAdapterFactory2;
        }
        return typeAdapterFactory;
    }

    public boolean isClassJsonAdapterFactory(TypeToken<?> typeToken, TypeAdapterFactory typeAdapterFactory) {
        Objects.requireNonNull(typeToken);
        Objects.requireNonNull(typeAdapterFactory);
        if (typeAdapterFactory == f56757c) {
            return true;
        }
        Class<? super Object> rawType = typeToken.getRawType();
        TypeAdapterFactory typeAdapterFactory2 = (TypeAdapterFactory) this.f56760b.get(rawType);
        if (typeAdapterFactory2 != null) {
            if (typeAdapterFactory2 == typeAdapterFactory) {
                return true;
            }
            return false;
        }
        JsonAdapter m37530b = m37530b(rawType);
        if (m37530b == null) {
            return false;
        }
        Class<?> value = m37530b.value();
        if (TypeAdapterFactory.class.isAssignableFrom(value) && m37528d(rawType, (TypeAdapterFactory) m37531a(this.f56759a, value)) == typeAdapterFactory) {
            return true;
        }
        return false;
    }
}
