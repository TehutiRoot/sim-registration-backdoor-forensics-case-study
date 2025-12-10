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
    public static final class C6114a extends PropertySerializerMap {

        /* renamed from: a */
        public final Class f43409a;

        /* renamed from: b */
        public final Class f43410b;

        /* renamed from: c */
        public final JsonSerializer f43411c;

        /* renamed from: d */
        public final JsonSerializer f43412d;

        public C6114a(PropertySerializerMap propertySerializerMap, Class cls, JsonSerializer jsonSerializer, Class cls2, JsonSerializer jsonSerializer2) {
            super(propertySerializerMap);
            this.f43409a = cls;
            this.f43411c = jsonSerializer;
            this.f43410b = cls2;
            this.f43412d = jsonSerializer2;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class cls, JsonSerializer jsonSerializer) {
            return new C6116c(this, new C6118e[]{new C6118e(this.f43409a, this.f43411c), new C6118e(this.f43410b, this.f43412d), new C6118e(cls, jsonSerializer)});
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public JsonSerializer serializerFor(Class cls) {
            if (cls == this.f43409a) {
                return this.f43411c;
            }
            if (cls == this.f43410b) {
                return this.f43412d;
            }
            return null;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$b */
    /* loaded from: classes3.dex */
    public static final class C6115b extends PropertySerializerMap {

        /* renamed from: a */
        public static final C6115b f43413a = new C6115b(false);

        /* renamed from: b */
        public static final C6115b f43414b = new C6115b(true);

        public C6115b(boolean z) {
            super(z);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class cls, JsonSerializer jsonSerializer) {
            return new C6117d(this, cls, jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public JsonSerializer serializerFor(Class cls) {
            return null;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$c */
    /* loaded from: classes3.dex */
    public static final class C6116c extends PropertySerializerMap {

        /* renamed from: a */
        public final C6118e[] f43415a;

        public C6116c(PropertySerializerMap propertySerializerMap, C6118e[] c6118eArr) {
            super(propertySerializerMap);
            this.f43415a = c6118eArr;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class cls, JsonSerializer jsonSerializer) {
            C6118e[] c6118eArr = this.f43415a;
            int length = c6118eArr.length;
            if (length == 8) {
                if (this._resetWhenFull) {
                    return new C6117d(this, cls, jsonSerializer);
                }
                return this;
            }
            C6118e[] c6118eArr2 = (C6118e[]) Arrays.copyOf(c6118eArr, length + 1);
            c6118eArr2[length] = new C6118e(cls, jsonSerializer);
            return new C6116c(this, c6118eArr2);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public JsonSerializer serializerFor(Class cls) {
            int length = this.f43415a.length;
            for (int i = 0; i < length; i++) {
                C6118e c6118e = this.f43415a[i];
                if (c6118e.f43418a == cls) {
                    return c6118e.f43419b;
                }
            }
            return null;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$d */
    /* loaded from: classes3.dex */
    public static final class C6117d extends PropertySerializerMap {

        /* renamed from: a */
        public final Class f43416a;

        /* renamed from: b */
        public final JsonSerializer f43417b;

        public C6117d(PropertySerializerMap propertySerializerMap, Class cls, JsonSerializer jsonSerializer) {
            super(propertySerializerMap);
            this.f43416a = cls;
            this.f43417b = jsonSerializer;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class cls, JsonSerializer jsonSerializer) {
            return new C6114a(this, this.f43416a, this.f43417b, cls, jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public JsonSerializer serializerFor(Class cls) {
            if (cls == this.f43416a) {
                return this.f43417b;
            }
            return null;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$e */
    /* loaded from: classes3.dex */
    public static final class C6118e {

        /* renamed from: a */
        public final Class f43418a;

        /* renamed from: b */
        public final JsonSerializer f43419b;

        public C6118e(Class cls, JsonSerializer jsonSerializer) {
            this.f43418a = cls;
            this.f43419b = jsonSerializer;
        }
    }

    public PropertySerializerMap(boolean z) {
        this._resetWhenFull = z;
    }

    public static PropertySerializerMap emptyForProperties() {
        return C6115b.f43413a;
    }

    public static PropertySerializerMap emptyForRootValues() {
        return C6115b.f43414b;
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