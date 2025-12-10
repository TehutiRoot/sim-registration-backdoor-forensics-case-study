package org.bson.codecs.pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class ClassModel<T> {

    /* renamed from: a */
    public final String f75856a;

    /* renamed from: b */
    public final Class f75857b;

    /* renamed from: c */
    public final boolean f75858c;

    /* renamed from: d */
    public final InstanceCreatorFactory f75859d;

    /* renamed from: e */
    public final boolean f75860e;

    /* renamed from: f */
    public final String f75861f;

    /* renamed from: g */
    public final String f75862g;

    /* renamed from: h */
    public final C17267Ac0 f75863h;

    /* renamed from: i */
    public final List f75864i;

    /* renamed from: j */
    public final Map f75865j;

    public ClassModel(Class cls, Map map, InstanceCreatorFactory instanceCreatorFactory, Boolean bool, String str, String str2, C17267Ac0 c17267Ac0, List list) {
        boolean z;
        this.f75856a = cls.getSimpleName();
        this.f75857b = cls;
        if (cls.getTypeParameters().length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f75858c = z;
        this.f75865j = Collections.unmodifiableMap(new HashMap(map));
        this.f75859d = instanceCreatorFactory;
        this.f75860e = bool.booleanValue();
        this.f75861f = str;
        this.f75862g = str2;
        this.f75863h = c17267Ac0;
        this.f75864i = Collections.unmodifiableList(new ArrayList(list));
    }

    public static <S> ClassModelBuilder<S> builder(Class<S> cls) {
        return new ClassModelBuilder<>(cls);
    }

    /* renamed from: a */
    public C17267Ac0 m24273a() {
        return this.f75863h;
    }

    /* renamed from: b */
    public InstanceCreator m24272b() {
        return this.f75859d.create();
    }

    /* renamed from: c */
    public InstanceCreatorFactory m24271c() {
        return this.f75859d;
    }

    /* renamed from: d */
    public Map m24270d() {
        return this.f75865j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClassModel.class != obj.getClass()) {
            return false;
        }
        ClassModel classModel = (ClassModel) obj;
        if (this.f75860e != classModel.f75860e || !getType().equals(classModel.getType()) || !m24271c().equals(classModel.m24271c())) {
            return false;
        }
        if (getDiscriminatorKey() == null ? classModel.getDiscriminatorKey() != null : !getDiscriminatorKey().equals(classModel.getDiscriminatorKey())) {
            return false;
        }
        if (getDiscriminator() == null ? classModel.getDiscriminator() != null : !getDiscriminator().equals(classModel.getDiscriminator())) {
            return false;
        }
        C17267Ac0 c17267Ac0 = this.f75863h;
        if (c17267Ac0 == null ? classModel.f75863h != null : !c17267Ac0.equals(classModel.f75863h)) {
            return false;
        }
        if (getPropertyModels().equals(classModel.getPropertyModels()) && m24270d().equals(classModel.m24270d())) {
            return true;
        }
        return false;
    }

    public String getDiscriminator() {
        return this.f75862g;
    }

    public String getDiscriminatorKey() {
        return this.f75861f;
    }

    public PropertyModel<?> getIdPropertyModel() {
        C17267Ac0 c17267Ac0 = this.f75863h;
        if (c17267Ac0 != null) {
            return c17267Ac0.m69062d();
        }
        return null;
    }

    public String getName() {
        return this.f75856a;
    }

    public PropertyModel<?> getPropertyModel(String str) {
        for (PropertyModel<?> propertyModel : this.f75864i) {
            if (propertyModel.getName().equals(str)) {
                return propertyModel;
            }
        }
        return null;
    }

    public List<PropertyModel<?>> getPropertyModels() {
        return this.f75864i;
    }

    public Class<T> getType() {
        return this.f75857b;
    }

    public boolean hasTypeParameters() {
        return this.f75858c;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = ((((getType().hashCode() * 31) + m24271c().hashCode()) * 31) + (this.f75860e ? 1 : 0)) * 31;
        int i3 = 0;
        if (getDiscriminatorKey() != null) {
            i = getDiscriminatorKey().hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        if (getDiscriminator() != null) {
            i2 = getDiscriminator().hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        if (m24273a() != null) {
            i3 = m24273a().hashCode();
        }
        return ((((i5 + i3) * 31) + getPropertyModels().hashCode()) * 31) + m24270d().hashCode();
    }

    public String toString() {
        return "ClassModel{type=" + this.f75857b + "}";
    }

    public boolean useDiscriminator() {
        return this.f75860e;
    }
}
