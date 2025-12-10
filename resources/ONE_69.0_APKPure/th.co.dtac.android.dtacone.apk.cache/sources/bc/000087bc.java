package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SerializerCache {

    /* renamed from: a */
    public final HashMap f43406a = new HashMap(64);

    /* renamed from: b */
    public final AtomicReference f43407b = new AtomicReference();

    /* renamed from: a */
    public final synchronized ReadOnlyClassToSerializerMap m49400a() {
        ReadOnlyClassToSerializerMap readOnlyClassToSerializerMap;
        readOnlyClassToSerializerMap = (ReadOnlyClassToSerializerMap) this.f43407b.get();
        if (readOnlyClassToSerializerMap == null) {
            readOnlyClassToSerializerMap = ReadOnlyClassToSerializerMap.from(this.f43406a);
            this.f43407b.set(readOnlyClassToSerializerMap);
        }
        return readOnlyClassToSerializerMap;
    }

    public void addAndResolveNonTypedSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer, SerializerProvider serializerProvider) throws JsonMappingException {
        synchronized (this) {
            try {
                if (this.f43406a.put(new TypeKey(cls, false), jsonSerializer) == null) {
                    this.f43407b.set(null);
                }
                if (jsonSerializer instanceof ResolvableSerializer) {
                    ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addTypedSerializer(JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        synchronized (this) {
            try {
                if (this.f43406a.put(new TypeKey(javaType, true), jsonSerializer) == null) {
                    this.f43407b.set(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void flush() {
        this.f43406a.clear();
    }

    public ReadOnlyClassToSerializerMap getReadOnlyLookupMap() {
        ReadOnlyClassToSerializerMap readOnlyClassToSerializerMap = (ReadOnlyClassToSerializerMap) this.f43407b.get();
        if (readOnlyClassToSerializerMap != null) {
            return readOnlyClassToSerializerMap;
        }
        return m49400a();
    }

    public synchronized int size() {
        return this.f43406a.size();
    }

    public JsonSerializer<Object> typedValueSerializer(JavaType javaType) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = (JsonSerializer) this.f43406a.get(new TypeKey(javaType, true));
        }
        return jsonSerializer;
    }

    public JsonSerializer<Object> untypedValueSerializer(Class<?> cls) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = (JsonSerializer) this.f43406a.get(new TypeKey(cls, false));
        }
        return jsonSerializer;
    }

    public JsonSerializer<Object> typedValueSerializer(Class<?> cls) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = (JsonSerializer) this.f43406a.get(new TypeKey(cls, true));
        }
        return jsonSerializer;
    }

    public JsonSerializer<Object> untypedValueSerializer(JavaType javaType) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = (JsonSerializer) this.f43406a.get(new TypeKey(javaType, false));
        }
        return jsonSerializer;
    }

    public void addTypedSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
        synchronized (this) {
            try {
                if (this.f43406a.put(new TypeKey(cls, true), jsonSerializer) == null) {
                    this.f43407b.set(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addAndResolveNonTypedSerializer(JavaType javaType, JsonSerializer<Object> jsonSerializer, SerializerProvider serializerProvider) throws JsonMappingException {
        synchronized (this) {
            try {
                if (this.f43406a.put(new TypeKey(javaType, false), jsonSerializer) == null) {
                    this.f43407b.set(null);
                }
                if (jsonSerializer instanceof ResolvableSerializer) {
                    ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addAndResolveNonTypedSerializer(Class<?> cls, JavaType javaType, JsonSerializer<Object> jsonSerializer, SerializerProvider serializerProvider) throws JsonMappingException {
        synchronized (this) {
            try {
                Object put = this.f43406a.put(new TypeKey(cls, false), jsonSerializer);
                Object put2 = this.f43406a.put(new TypeKey(javaType, false), jsonSerializer);
                if (put == null || put2 == null) {
                    this.f43407b.set(null);
                }
                if (jsonSerializer instanceof ResolvableSerializer) {
                    ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}