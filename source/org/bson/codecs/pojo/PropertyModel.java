package org.bson.codecs.pojo;

import org.bson.codecs.Codec;

/* loaded from: classes6.dex */
public final class PropertyModel<T> {

    /* renamed from: a */
    public final String f75890a;

    /* renamed from: b */
    public final String f75891b;

    /* renamed from: c */
    public final String f75892c;

    /* renamed from: d */
    public final TypeData f75893d;

    /* renamed from: e */
    public final Codec f75894e;

    /* renamed from: f */
    public final PropertySerialization f75895f;

    /* renamed from: g */
    public final Boolean f75896g;

    /* renamed from: h */
    public final PropertyAccessor f75897h;

    /* renamed from: i */
    public final String f75898i;

    /* renamed from: j */
    public volatile Codec f75899j;

    public PropertyModel(String str, String str2, String str3, TypeData typeData, Codec codec, PropertySerialization propertySerialization, Boolean bool, PropertyAccessor propertyAccessor, String str4) {
        this.f75890a = str;
        this.f75891b = str2;
        this.f75892c = str3;
        this.f75893d = typeData;
        this.f75894e = codec;
        this.f75899j = codec;
        this.f75895f = propertySerialization;
        this.f75896g = bool;
        this.f75897h = propertyAccessor;
        this.f75898i = str4;
    }

    public static <T> PropertyModelBuilder<T> builder() {
        return new PropertyModelBuilder<>();
    }

    /* renamed from: a */
    public void m24260a(Codec codec) {
        this.f75899j = codec;
    }

    /* renamed from: b */
    public Codec m24259b() {
        return this.f75899j;
    }

    /* renamed from: c */
    public String m24258c() {
        return this.f75898i;
    }

    /* renamed from: d */
    public PropertySerialization m24257d() {
        return this.f75895f;
    }

    /* renamed from: e */
    public boolean m24256e() {
        if (this.f75898i != null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PropertyModel.class != obj.getClass()) {
            return false;
        }
        PropertyModel propertyModel = (PropertyModel) obj;
        if (getName() == null ? propertyModel.getName() != null : !getName().equals(propertyModel.getName())) {
            return false;
        }
        if (getReadName() == null ? propertyModel.getReadName() != null : !getReadName().equals(propertyModel.getReadName())) {
            return false;
        }
        if (getWriteName() == null ? propertyModel.getWriteName() != null : !getWriteName().equals(propertyModel.getWriteName())) {
            return false;
        }
        if (getTypeData() == null ? propertyModel.getTypeData() != null : !getTypeData().equals(propertyModel.getTypeData())) {
            return false;
        }
        if (getCodec() == null ? propertyModel.getCodec() != null : !getCodec().equals(propertyModel.getCodec())) {
            return false;
        }
        if (m24257d() == null ? propertyModel.m24257d() != null : !m24257d().equals(propertyModel.m24257d())) {
            return false;
        }
        Boolean bool = this.f75896g;
        if (bool == null ? propertyModel.f75896g != null : !bool.equals(propertyModel.f75896g)) {
            return false;
        }
        if (getPropertyAccessor() == null ? propertyModel.getPropertyAccessor() != null : !getPropertyAccessor().equals(propertyModel.getPropertyAccessor())) {
            return false;
        }
        if (m24258c() == null ? propertyModel.m24258c() != null : !m24258c().equals(propertyModel.m24258c())) {
            return false;
        }
        if (m24259b() == null ? propertyModel.m24259b() == null : m24259b().equals(propertyModel.m24259b())) {
            return true;
        }
        return false;
    }

    public Codec<T> getCodec() {
        return this.f75894e;
    }

    public String getName() {
        return this.f75890a;
    }

    public PropertyAccessor<T> getPropertyAccessor() {
        return this.f75897h;
    }

    public String getReadName() {
        return this.f75891b;
    }

    public TypeData getTypeData() {
        return this.f75893d;
    }

    public String getWriteName() {
        return this.f75892c;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (getName() != null) {
            i = getName().hashCode();
        } else {
            i = 0;
        }
        int i11 = i * 31;
        if (getReadName() != null) {
            i2 = getReadName().hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 31;
        if (getWriteName() != null) {
            i3 = getWriteName().hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 31;
        if (getTypeData() != null) {
            i4 = getTypeData().hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 31;
        if (getCodec() != null) {
            i5 = getCodec().hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 31;
        if (m24257d() != null) {
            i6 = m24257d().hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 31;
        Boolean bool = this.f75896g;
        if (bool != null) {
            i7 = bool.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 31;
        if (getPropertyAccessor() != null) {
            i8 = getPropertyAccessor().hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 31;
        if (m24258c() != null) {
            i9 = m24258c().hashCode();
        } else {
            i9 = 0;
        }
        int i19 = (i18 + i9) * 31;
        if (m24259b() != null) {
            i10 = m24259b().hashCode();
        }
        return i19 + i10;
    }

    public boolean isReadable() {
        if (this.f75891b != null) {
            return true;
        }
        return false;
    }

    public boolean isWritable() {
        if (this.f75892c != null) {
            return true;
        }
        return false;
    }

    public boolean shouldSerialize(T t) {
        return this.f75895f.shouldSerialize(t);
    }

    public String toString() {
        return "PropertyModel{propertyName='" + this.f75890a + "', readName='" + this.f75891b + "', writeName='" + this.f75892c + "', typeData=" + this.f75893d + "}";
    }

    public Boolean useDiscriminator() {
        return this.f75896g;
    }
}
