package org.bson.codecs.pojo;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;
import org.bson.assertions.Assertions;
import org.bson.codecs.Codec;

/* loaded from: classes6.dex */
public final class PropertyModelBuilder<T> {

    /* renamed from: a */
    public String f75900a;

    /* renamed from: b */
    public String f75901b;

    /* renamed from: c */
    public String f75902c;

    /* renamed from: d */
    public TypeData f75903d;

    /* renamed from: e */
    public PropertySerialization f75904e;

    /* renamed from: f */
    public Codec f75905f;

    /* renamed from: g */
    public PropertyAccessor f75906g;

    /* renamed from: h */
    public List f75907h = Collections.emptyList();

    /* renamed from: i */
    public List f75908i = Collections.emptyList();

    /* renamed from: j */
    public Boolean f75909j;

    /* renamed from: k */
    public String f75910k;

    /* renamed from: a */
    public TypeData m24255a() {
        return this.f75903d;
    }

    /* renamed from: b */
    public PropertyModelBuilder m24254b(String str) {
        this.f75900a = (String) Assertions.notNull("propertyName", str);
        return this;
    }

    public PropertyModel<T> build() {
        if (!isReadable() && !isWritable()) {
            throw new IllegalStateException(String.format("Invalid PropertyModel '%s', neither readable or writable,", this.f75900a));
        }
        return new PropertyModel<>((String) AbstractC12924c.m24224k("propertyName", this.f75900a), this.f75901b, this.f75902c, (TypeData) AbstractC12924c.m24224k("typeData", this.f75903d), this.f75905f, (PropertySerialization) AbstractC12924c.m24224k("propertySerialization", this.f75904e), this.f75909j, (PropertyAccessor) AbstractC12924c.m24224k("propertyAccessor", this.f75906g), this.f75910k);
    }

    /* renamed from: c */
    public PropertyModelBuilder m24253c(String str) {
        this.f75910k = str;
        return this;
    }

    public PropertyModelBuilder<T> codec(Codec<T> codec) {
        this.f75905f = codec;
        return this;
    }

    /* renamed from: d */
    public PropertyModelBuilder m24252d(TypeData typeData) {
        this.f75903d = (TypeData) Assertions.notNull("typeData", typeData);
        return this;
    }

    public PropertyModelBuilder<T> discriminatorEnabled(boolean z) {
        this.f75909j = Boolean.valueOf(z);
        return this;
    }

    public String getName() {
        return this.f75900a;
    }

    public PropertyAccessor<T> getPropertyAccessor() {
        return this.f75906g;
    }

    public PropertySerialization<T> getPropertySerialization() {
        return this.f75904e;
    }

    public List<Annotation> getReadAnnotations() {
        return this.f75907h;
    }

    public String getReadName() {
        return this.f75901b;
    }

    public List<Annotation> getWriteAnnotations() {
        return this.f75908i;
    }

    public String getWriteName() {
        return this.f75902c;
    }

    public Boolean isDiscriminatorEnabled() {
        return this.f75909j;
    }

    public boolean isReadable() {
        if (this.f75901b != null) {
            return true;
        }
        return false;
    }

    public boolean isWritable() {
        if (this.f75902c != null) {
            return true;
        }
        return false;
    }

    public PropertyModelBuilder<T> propertyAccessor(PropertyAccessor<T> propertyAccessor) {
        this.f75906g = propertyAccessor;
        return this;
    }

    public PropertyModelBuilder<T> propertySerialization(PropertySerialization<T> propertySerialization) {
        this.f75904e = (PropertySerialization) Assertions.notNull("propertySerialization", propertySerialization);
        return this;
    }

    public PropertyModelBuilder<T> readAnnotations(List<Annotation> list) {
        this.f75907h = Collections.unmodifiableList((List) Assertions.notNull("annotations", list));
        return this;
    }

    public PropertyModelBuilder<T> readName(String str) {
        this.f75901b = str;
        return this;
    }

    public String toString() {
        return String.format("PropertyModelBuilder{propertyName=%s, typeData=%s}", this.f75900a, this.f75903d);
    }

    public PropertyModelBuilder<T> writeAnnotations(List<Annotation> list) {
        this.f75908i = list;
        return this;
    }

    public PropertyModelBuilder<T> writeName(String str) {
        this.f75902c = str;
        return this;
    }
}
