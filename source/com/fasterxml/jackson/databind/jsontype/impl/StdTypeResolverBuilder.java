package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.Collection;

/* loaded from: classes3.dex */
public class StdTypeResolverBuilder implements TypeResolverBuilder<StdTypeResolverBuilder> {
    protected TypeIdResolver _customIdResolver;
    protected Class<?> _defaultImpl;
    protected JsonTypeInfo.EnumC6075Id _idType;
    protected JsonTypeInfo.EnumC6074As _includeAs;
    protected boolean _typeIdVisible = false;
    protected String _typeProperty;

    /* renamed from: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C6120a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43372a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f43373b;

        static {
            int[] iArr = new int[JsonTypeInfo.EnumC6075Id.values().length];
            f43373b = iArr;
            try {
                iArr[JsonTypeInfo.EnumC6075Id.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43373b[JsonTypeInfo.EnumC6075Id.MINIMAL_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43373b[JsonTypeInfo.EnumC6075Id.NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43373b[JsonTypeInfo.EnumC6075Id.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43373b[JsonTypeInfo.EnumC6075Id.CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[JsonTypeInfo.EnumC6074As.values().length];
            f43372a = iArr2;
            try {
                iArr2[JsonTypeInfo.EnumC6074As.WRAPPER_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43372a[JsonTypeInfo.EnumC6074As.PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f43372a[JsonTypeInfo.EnumC6074As.WRAPPER_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f43372a[JsonTypeInfo.EnumC6074As.EXTERNAL_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f43372a[JsonTypeInfo.EnumC6074As.EXISTING_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public StdTypeResolverBuilder() {
    }

    public static StdTypeResolverBuilder noTypeInfoBuilder() {
        return new StdTypeResolverBuilder().init(JsonTypeInfo.EnumC6075Id.NONE, (TypeIdResolver) null);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
        JavaType javaType2 = null;
        if (this._idType == JsonTypeInfo.EnumC6075Id.NONE || javaType.isPrimitive()) {
            return null;
        }
        TypeIdResolver idResolver = idResolver(deserializationConfig, javaType, collection, false, true);
        Class<?> cls = this._defaultImpl;
        if (cls != null) {
            if (cls != Void.class && cls != NoClass.class) {
                javaType2 = deserializationConfig.getTypeFactory().constructSpecializedType(javaType, this._defaultImpl);
            } else {
                javaType2 = deserializationConfig.getTypeFactory().constructType(this._defaultImpl);
            }
        }
        JavaType javaType3 = javaType2;
        int i = C6120a.f43372a[this._includeAs.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
                        }
                    } else {
                        return new AsExternalTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, javaType3);
                    }
                } else {
                    return new AsWrapperTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, javaType3);
                }
            }
            return new AsPropertyTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, javaType3, this._includeAs);
        }
        return new AsArrayTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, javaType3);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.EnumC6075Id.NONE || javaType.isPrimitive()) {
            return null;
        }
        TypeIdResolver idResolver = idResolver(serializationConfig, javaType, collection, true, false);
        int i = C6120a.f43372a[this._includeAs.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return new AsExistingPropertyTypeSerializer(idResolver, null, this._typeProperty);
                        }
                        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
                    }
                    return new AsExternalTypeSerializer(idResolver, null, this._typeProperty);
                }
                return new AsWrapperTypeSerializer(idResolver, null);
            }
            return new AsPropertyTypeSerializer(idResolver, null, this._typeProperty);
        }
        return new AsArrayTypeSerializer(idResolver, null);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public /* bridge */ /* synthetic */ StdTypeResolverBuilder defaultImpl(Class cls) {
        return defaultImpl2((Class<?>) cls);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public Class<?> getDefaultImpl() {
        return this._defaultImpl;
    }

    public String getTypeProperty() {
        return this._typeProperty;
    }

    public TypeIdResolver idResolver(MapperConfig<?> mapperConfig, JavaType javaType, Collection<NamedType> collection, boolean z, boolean z2) {
        TypeIdResolver typeIdResolver = this._customIdResolver;
        if (typeIdResolver != null) {
            return typeIdResolver;
        }
        JsonTypeInfo.EnumC6075Id enumC6075Id = this._idType;
        if (enumC6075Id != null) {
            int i = C6120a.f43373b[enumC6075Id.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return null;
                        }
                        throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this._idType);
                    }
                    return TypeNameIdResolver.construct(mapperConfig, javaType, collection, z, z2);
                }
                return new MinimalClassNameIdResolver(javaType, mapperConfig.getTypeFactory());
            }
            return new ClassNameIdResolver(javaType, mapperConfig.getTypeFactory());
        }
        throw new IllegalStateException("Cannot build, 'init()' not yet called");
    }

    public boolean isTypeIdVisible() {
        return this._typeIdVisible;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    /* renamed from: defaultImpl  reason: avoid collision after fix types in other method */
    public StdTypeResolverBuilder defaultImpl2(Class<?> cls) {
        this._defaultImpl = cls;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder inclusion(JsonTypeInfo.EnumC6074As enumC6074As) {
        if (enumC6074As != null) {
            this._includeAs = enumC6074As;
            return this;
        }
        throw new IllegalArgumentException("includeAs cannot be null");
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder init(JsonTypeInfo.EnumC6075Id enumC6075Id, TypeIdResolver typeIdResolver) {
        if (enumC6075Id != null) {
            this._idType = enumC6075Id;
            this._customIdResolver = typeIdResolver;
            this._typeProperty = enumC6075Id.getDefaultPropertyName();
            return this;
        }
        throw new IllegalArgumentException("idType cannot be null");
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder typeIdVisibility(boolean z) {
        this._typeIdVisible = z;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder typeProperty(String str) {
        if (str == null || str.length() == 0) {
            str = this._idType.getDefaultPropertyName();
        }
        this._typeProperty = str;
        return this;
    }

    public StdTypeResolverBuilder(JsonTypeInfo.EnumC6075Id enumC6075Id, JsonTypeInfo.EnumC6074As enumC6074As, String str) {
        this._idType = enumC6075Id;
        this._includeAs = enumC6074As;
        this._typeProperty = str;
    }
}
