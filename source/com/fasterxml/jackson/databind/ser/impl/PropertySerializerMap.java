package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class PropertySerializerMap {
    protected final boolean _resetWhenFull;

    /* loaded from: classes3.dex */
    public static final class SerializerAndMapResult {
        public final PropertySerializerMap map;
        public final JsonSerializer<Object> serializer;

        public SerializerAndMapResult(JsonSerializer<Object> jsonSerializer, PropertySerializerMap propertySerializerMap) {
            this.serializer = jsonSerializer;
            this.map = propertySerializerMap;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$a */
    /* loaded from: classes3.dex */
    public static final class C6125a extends PropertySerializerMap {

        /* renamed from: a */
        public final Class f43397a;

        /* renamed from: b */
        public final Class f43398b;

        /* renamed from: c */
        public final JsonSerializer f43399c;

        /* renamed from: d */
        public final JsonSerializer f43400d;

        public C6125a(PropertySerializerMap propertySerializerMap, Class cls, JsonSerializer jsonSerializer, Class cls2, JsonSerializer jsonSerializer2) {
            super(propertySerializerMap);
            this.f43397a = cls;
            this.f43399c = jsonSerializer;
            this.f43398b = cls2;
            this.f43400d = jsonSerializer2;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class cls, JsonSerializer jsonSerializer) {
            return new C6127c(this, new C6129e[]{new C6129e(this.f43397a, this.f43399c), new C6129e(this.f43398b, this.f43400d), new C6129e(cls, jsonSerializer)});
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public JsonSerializer serializerFor(Class cls) {
            if (cls == this.f43397a) {
                return this.f43399c;
            }
            if (cls == this.f43398b) {
                return this.f43400d;
            }
            return null;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$b */
    /* loaded from: classes3.dex */
    public static final class C6126b extends PropertySerializerMap {

        /* renamed from: a */
        public static final C6126b f43401a = new C6126b(false);

        /* renamed from: b */
        public static final C6126b f43402b = new C6126b(true);

        public C6126b(boolean z) {
            super(z);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class cls, JsonSerializer jsonSerializer) {
            return new C6128d(this, cls, jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public JsonSerializer serializerFor(Class cls) {
            return null;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$c */
    /* loaded from: classes3.dex */
    public static final class C6127c extends PropertySerializerMap {

        /* renamed from: a */
        public final C6129e[] f43403a;

        public C6127c(PropertySerializerMap propertySerializerMap, C6129e[] c6129eArr) {
            super(propertySerializerMap);
            this.f43403a = c6129eArr;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class cls, JsonSerializer jsonSerializer) {
            C6129e[] c6129eArr = this.f43403a;
            int length = c6129eArr.length;
            if (length == 8) {
                if (this._resetWhenFull) {
                    return new C6128d(this, cls, jsonSerializer);
                }
                return this;
            }
            C6129e[] c6129eArr2 = (C6129e[]) Arrays.copyOf(c6129eArr, length + 1);
            c6129eArr2[length] = new C6129e(cls, jsonSerializer);
            return new C6127c(this, c6129eArr2);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public JsonSerializer serializerFor(Class cls) {
            int length = this.f43403a.length;
            for (int i = 0; i < length; i++) {
                C6129e c6129e = this.f43403a[i];
                if (c6129e.f43406a == cls) {
                    return c6129e.f43407b;
                }
            }
            return null;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$d */
    /* loaded from: classes3.dex */
    public static final class C6128d extends PropertySerializerMap {

        /* renamed from: a */
        public final Class f43404a;

        /* renamed from: b */
        public final JsonSerializer f43405b;

        public C6128d(PropertySerializerMap propertySerializerMap, Class cls, JsonSerializer jsonSerializer) {
            super(propertySerializerMap);
            this.f43404a = cls;
            this.f43405b = jsonSerializer;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class cls, JsonSerializer jsonSerializer) {
            return new C6125a(this, this.f43404a, this.f43405b, cls, jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public JsonSerializer serializerFor(Class cls) {
            if (cls == this.f43404a) {
                return this.f43405b;
            }
            return null;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$e */
    /* loaded from: classes3.dex */
    public static final class C6129e {

        /* renamed from: a */
        public final Class f43406a;

        /* renamed from: b */
        public final JsonSerializer f43407b;

        public C6129e(Class cls, JsonSerializer jsonSerializer) {
            this.f43406a = cls;
            this.f43407b = jsonSerializer;
        }
    }

    public PropertySerializerMap(boolean z) {
        this._resetWhenFull = z;
    }

    public static PropertySerializerMap emptyForProperties() {
        return C6126b.f43401a;
    }

    public static PropertySerializerMap emptyForRootValues() {
        return C6126b.f43402b;
    }

    @Deprecated
    public static PropertySerializerMap emptyMap() {
        return emptyForProperties();
    }

    public final SerializerAndMapResult addSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
        return new SerializerAndMapResult(jsonSerializer, newWith(cls, jsonSerializer));
    }

    public final SerializerAndMapResult findAndAddKeySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> findKeySerializer = serializerProvider.findKeySerializer(cls, beanProperty);
        return new SerializerAndMapResult(findKeySerializer, newWith(cls, findKeySerializer));
    }

    public final SerializerAndMapResult findAndAddPrimarySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> findPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(cls, beanProperty);
        return new SerializerAndMapResult(findPrimaryPropertySerializer, newWith(cls, findPrimaryPropertySerializer));
    }

    public final SerializerAndMapResult findAndAddRootValueSerializer(Class<?> cls, SerializerProvider serializerProvider) throws JsonMappingException {
        JsonSerializer<Object> findTypedValueSerializer = serializerProvider.findTypedValueSerializer(cls, false, (BeanProperty) null);
        return new SerializerAndMapResult(findTypedValueSerializer, newWith(cls, findTypedValueSerializer));
    }

    public final SerializerAndMapResult findAndAddSecondarySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> findValueSerializer = serializerProvider.findValueSerializer(cls, beanProperty);
        return new SerializerAndMapResult(findValueSerializer, newWith(cls, findValueSerializer));
    }

    public abstract PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer);

    public abstract JsonSerializer<Object> serializerFor(Class<?> cls);

    public final SerializerAndMapResult addSerializer(JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        return new SerializerAndMapResult(jsonSerializer, newWith(javaType.getRawClass(), jsonSerializer));
    }

    public PropertySerializerMap(PropertySerializerMap propertySerializerMap) {
        this._resetWhenFull = propertySerializerMap._resetWhenFull;
    }

    public final SerializerAndMapResult findAndAddPrimarySerializer(JavaType javaType, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> findPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(javaType, beanProperty);
        return new SerializerAndMapResult(findPrimaryPropertySerializer, newWith(javaType.getRawClass(), findPrimaryPropertySerializer));
    }

    public final SerializerAndMapResult findAndAddRootValueSerializer(JavaType javaType, SerializerProvider serializerProvider) throws JsonMappingException {
        JsonSerializer<Object> findTypedValueSerializer = serializerProvider.findTypedValueSerializer(javaType, false, (BeanProperty) null);
        return new SerializerAndMapResult(findTypedValueSerializer, newWith(javaType.getRawClass(), findTypedValueSerializer));
    }

    public final SerializerAndMapResult findAndAddSecondarySerializer(JavaType javaType, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> findValueSerializer = serializerProvider.findValueSerializer(javaType, beanProperty);
        return new SerializerAndMapResult(findValueSerializer, newWith(javaType.getRawClass(), findValueSerializer));
    }
}
