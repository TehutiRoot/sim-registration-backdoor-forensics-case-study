package p000;

import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.ClassModel;
import org.bson.codecs.pojo.IdGenerator;
import org.bson.codecs.pojo.PropertyModel;

/* renamed from: Gc0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17680Gc0 {

    /* renamed from: a */
    public final PropertyModel f2019a;

    /* renamed from: b */
    public final IdGenerator f2020b;

    public C17680Gc0(PropertyModel propertyModel, IdGenerator idGenerator) {
        this.f2019a = propertyModel;
        this.f2020b = idGenerator;
    }

    /* renamed from: a */
    public static C17680Gc0 m68268a(Class cls, PropertyModel propertyModel, IdGenerator idGenerator) {
        if (propertyModel == null && idGenerator != null) {
            throw new CodecConfigurationException(String.format("Invalid IdGenerator. There is no IdProperty set for: %s", cls));
        }
        if (idGenerator != null && !propertyModel.getTypeData().getType().isAssignableFrom(idGenerator.getType())) {
            throw new CodecConfigurationException(String.format("Invalid IdGenerator. Mismatching types, the IdProperty type is: %s but the IdGenerator type is: %s", propertyModel.getTypeData().getType(), idGenerator.getType()));
        }
        return new C17680Gc0(propertyModel, idGenerator);
    }

    /* renamed from: b */
    public static C17680Gc0 m68267b(ClassModel classModel, PropertyModel propertyModel) {
        return m68268a(classModel.getType(), propertyModel, classModel.m24463a().m68266c());
    }

    /* renamed from: c */
    public IdGenerator m68266c() {
        return this.f2020b;
    }

    /* renamed from: d */
    public PropertyModel m68265d() {
        return this.f2019a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17680Gc0.class != obj.getClass()) {
            return false;
        }
        C17680Gc0 c17680Gc0 = (C17680Gc0) obj;
        PropertyModel propertyModel = this.f2019a;
        if (propertyModel == null ? c17680Gc0.f2019a != null : !propertyModel.equals(c17680Gc0.f2019a)) {
            return false;
        }
        IdGenerator idGenerator = this.f2020b;
        IdGenerator idGenerator2 = c17680Gc0.f2020b;
        if (idGenerator != null) {
            return idGenerator.equals(idGenerator2);
        }
        if (idGenerator2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        PropertyModel propertyModel = this.f2019a;
        int i2 = 0;
        if (propertyModel != null) {
            i = propertyModel.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        IdGenerator idGenerator = this.f2020b;
        if (idGenerator != null) {
            i2 = idGenerator.hashCode();
        }
        return i3 + i2;
    }
}