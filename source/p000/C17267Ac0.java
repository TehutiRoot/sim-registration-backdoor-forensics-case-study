package p000;

import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.ClassModel;
import org.bson.codecs.pojo.IdGenerator;
import org.bson.codecs.pojo.PropertyModel;

/* renamed from: Ac0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17267Ac0 {

    /* renamed from: a */
    public final PropertyModel f148a;

    /* renamed from: b */
    public final IdGenerator f149b;

    public C17267Ac0(PropertyModel propertyModel, IdGenerator idGenerator) {
        this.f148a = propertyModel;
        this.f149b = idGenerator;
    }

    /* renamed from: a */
    public static C17267Ac0 m69065a(Class cls, PropertyModel propertyModel, IdGenerator idGenerator) {
        if (propertyModel == null && idGenerator != null) {
            throw new CodecConfigurationException(String.format("Invalid IdGenerator. There is no IdProperty set for: %s", cls));
        }
        if (idGenerator != null && !propertyModel.getTypeData().getType().isAssignableFrom(idGenerator.getType())) {
            throw new CodecConfigurationException(String.format("Invalid IdGenerator. Mismatching types, the IdProperty type is: %s but the IdGenerator type is: %s", propertyModel.getTypeData().getType(), idGenerator.getType()));
        }
        return new C17267Ac0(propertyModel, idGenerator);
    }

    /* renamed from: b */
    public static C17267Ac0 m69064b(ClassModel classModel, PropertyModel propertyModel) {
        return m69065a(classModel.getType(), propertyModel, classModel.m24273a().m69063c());
    }

    /* renamed from: c */
    public IdGenerator m69063c() {
        return this.f149b;
    }

    /* renamed from: d */
    public PropertyModel m69062d() {
        return this.f148a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17267Ac0.class != obj.getClass()) {
            return false;
        }
        C17267Ac0 c17267Ac0 = (C17267Ac0) obj;
        PropertyModel propertyModel = this.f148a;
        if (propertyModel == null ? c17267Ac0.f148a != null : !propertyModel.equals(c17267Ac0.f148a)) {
            return false;
        }
        IdGenerator idGenerator = this.f149b;
        IdGenerator idGenerator2 = c17267Ac0.f149b;
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
        PropertyModel propertyModel = this.f148a;
        int i2 = 0;
        if (propertyModel != null) {
            i = propertyModel.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        IdGenerator idGenerator = this.f149b;
        if (idGenerator != null) {
            i2 = idGenerator.hashCode();
        }
        return i3 + i2;
    }
}
