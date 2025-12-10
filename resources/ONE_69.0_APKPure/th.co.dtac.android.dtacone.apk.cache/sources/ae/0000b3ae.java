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
    public static final TypeAdapterFactory f56769c = new DummyTypeAdapterFactory();

    /* renamed from: d */
    public static final TypeAdapterFactory f56770d = new DummyTypeAdapterFactory();

    /* renamed from: a */
    public final ConstructorConstructor f56771a;

    /* renamed from: b */
    public final ConcurrentMap f56772b = new ConcurrentHashMap();

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
        this.f56771a = constructorConstructor;
    }

    /* renamed from: a */
    public static Object m37523a(ConstructorConstructor constructorConstructor, Class cls) {
        return constructorConstructor.get(TypeToken.get(cls)).construct();
    }

    /* renamed from: b */
    public static JsonAdapter m37522b(Class cls) {
        return (JsonAdapter) cls.getAnnotation(JsonAdapter.class);
    }

    /* renamed from: c */
    public TypeAdapter m37521c(ConstructorConstructor constructorConstructor, Gson gson, TypeToken typeToken, JsonAdapter jsonAdapter, boolean z) {
        JsonSerializer jsonSerializer;
        JsonDeserializer jsonDeserializer;
        TypeAdapterFactory typeAdapterFactory;
        TypeAdapter treeTypeAdapter;
        Object m37523a = m37523a(constructorConstructor, jsonAdapter.value());
        boolean nullSafe = jsonAdapter.nullSafe();
        if (m37523a instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) m37523a;
        } else if (m37523a instanceof TypeAdapterFactory) {
            TypeAdapterFactory typeAdapterFactory2 = (TypeAdapterFactory) m37523a;
            if (z) {
                typeAdapterFactory2 = m37520d(typeToken.getRawType(), typeAdapterFactory2);
            }
            treeTypeAdapter = typeAdapterFactory2.create(gson, typeToken);
        } else {
            boolean z2 = m37523a instanceof JsonSerializer;
            if (!z2 && !(m37523a instanceof JsonDeserializer)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + m37523a.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            if (z2) {
                jsonSerializer = (JsonSerializer) m37523a;
            } else {
                jsonSerializer = null;
            }
            if (m37523a instanceof JsonDeserializer) {
                jsonDeserializer = (JsonDeserializer) m37523a;
            } else {
                jsonDeserializer = null;
            }
            if (z) {
                typeAdapterFactory = f56769c;
            } else {
                typeAdapterFactory = f56770d;
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
        JsonAdapter m37522b = m37522b(typeToken.getRawType());
        if (m37522b == null) {
            return null;
        }
        return m37521c(this.f56771a, gson, typeToken, m37522b, true);
    }

    /* renamed from: d */
    public final TypeAdapterFactory m37520d(Class cls, TypeAdapterFactory typeAdapterFactory) {
        TypeAdapterFactory typeAdapterFactory2 = (TypeAdapterFactory) this.f56772b.putIfAbsent(cls, typeAdapterFactory);
        if (typeAdapterFactory2 != null) {
            return typeAdapterFactory2;
        }
        return typeAdapterFactory;
    }

    public boolean isClassJsonAdapterFactory(TypeToken<?> typeToken, TypeAdapterFactory typeAdapterFactory) {
        Objects.requireNonNull(typeToken);
        Objects.requireNonNull(typeAdapterFactory);
        if (typeAdapterFactory == f56769c) {
            return true;
        }
        Class<? super Object> rawType = typeToken.getRawType();
        TypeAdapterFactory typeAdapterFactory2 = (TypeAdapterFactory) this.f56772b.get(rawType);
        if (typeAdapterFactory2 != null) {
            if (typeAdapterFactory2 == typeAdapterFactory) {
                return true;
            }
            return false;
        }
        JsonAdapter m37522b = m37522b(rawType);
        if (m37522b == null) {
            return false;
        }
        Class<?> value = m37522b.value();
        if (TypeAdapterFactory.class.isAssignableFrom(value) && m37520d(rawType, (TypeAdapterFactory) m37523a(this.f56771a, value)) == typeAdapterFactory) {
            return true;
        }
        return false;
    }
}