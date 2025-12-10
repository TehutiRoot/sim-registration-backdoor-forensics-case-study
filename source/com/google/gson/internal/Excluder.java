package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder DEFAULT = new Excluder();

    /* renamed from: d */
    public boolean f56722d;

    /* renamed from: a */
    public double f56719a = -1.0d;

    /* renamed from: b */
    public int f56720b = 136;

    /* renamed from: c */
    public boolean f56721c = true;

    /* renamed from: e */
    public List f56723e = Collections.emptyList();

    /* renamed from: f */
    public List f56724f = Collections.emptyList();

    /* renamed from: a */
    public static boolean m37556a(Class cls) {
        if (cls.isMemberClass() && !ReflectionHelper.isStatic(cls)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m37555b(Since since) {
        if (since == null) {
            return true;
        }
        if (this.f56719a >= since.value()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m37554c(Until until) {
        if (until == null) {
            return true;
        }
        if (this.f56719a < until.value()) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        final boolean excludeClass = excludeClass(rawType, true);
        final boolean excludeClass2 = excludeClass(rawType, false);
        if (!excludeClass && !excludeClass2) {
            return null;
        }
        return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1
            private volatile TypeAdapter<T> delegate;

            private TypeAdapter<T> delegate() {
                TypeAdapter<T> typeAdapter = this.delegate;
                if (typeAdapter == 0) {
                    TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(Excluder.this, typeToken);
                    this.delegate = delegateAdapter;
                    return delegateAdapter;
                }
                return typeAdapter;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
            @Override // com.google.gson.TypeAdapter
            public T read(JsonReader jsonReader) throws IOException {
                if (excludeClass2) {
                    jsonReader.skipValue();
                    return null;
                }
                return delegate().read(jsonReader);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, T t) throws IOException {
                if (excludeClass) {
                    jsonWriter.nullValue();
                } else {
                    delegate().write(jsonWriter, t);
                }
            }
        };
    }

    /* renamed from: d */
    public final boolean m37553d(Since since, Until until) {
        if (m37555b(since) && m37554c(until)) {
            return true;
        }
        return false;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder m74056clone = m74056clone();
        m74056clone.f56721c = false;
        return m74056clone;
    }

    public boolean excludeClass(Class<?> cls, boolean z) {
        List<ExclusionStrategy> list;
        if (this.f56719a != -1.0d && !m37553d((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return true;
        }
        if (!this.f56721c && m37556a(cls)) {
            return true;
        }
        if (!z && !Enum.class.isAssignableFrom(cls) && ReflectionHelper.isAnonymousOrNonStaticLocal(cls)) {
            return true;
        }
        if (z) {
            list = this.f56723e;
        } else {
            list = this.f56724f;
        }
        for (ExclusionStrategy exclusionStrategy : list) {
            if (exclusionStrategy.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean excludeField(Field field, boolean z) {
        List<ExclusionStrategy> list;
        Expose expose;
        if ((this.f56720b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f56719a != -1.0d && !m37553d((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f56722d && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z ? !expose.deserialize() : !expose.serialize()))) || excludeClass(field.getType(), z)) {
            return true;
        }
        if (z) {
            list = this.f56723e;
        } else {
            list = this.f56724f;
        }
        if (!list.isEmpty()) {
            FieldAttributes fieldAttributes = new FieldAttributes(field);
            for (ExclusionStrategy exclusionStrategy : list) {
                if (exclusionStrategy.shouldSkipField(fieldAttributes)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder m74056clone = m74056clone();
        m74056clone.f56722d = true;
        return m74056clone;
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean z, boolean z2) {
        Excluder m74056clone = m74056clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.f56723e);
            m74056clone.f56723e = arrayList;
            arrayList.add(exclusionStrategy);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.f56724f);
            m74056clone.f56724f = arrayList2;
            arrayList2.add(exclusionStrategy);
        }
        return m74056clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder m74056clone = m74056clone();
        m74056clone.f56720b = 0;
        for (int i : iArr) {
            m74056clone.f56720b = i | m74056clone.f56720b;
        }
        return m74056clone;
    }

    public Excluder withVersion(double d) {
        Excluder m74056clone = m74056clone();
        m74056clone.f56719a = d;
        return m74056clone;
    }

    /* renamed from: clone */
    public Excluder m74056clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
