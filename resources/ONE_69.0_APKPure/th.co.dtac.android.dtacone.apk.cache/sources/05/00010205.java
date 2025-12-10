package org.bson.codecs.pojo;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecConfigurationException;

/* loaded from: classes6.dex */
public class ClassModelBuilder<T> {

    /* renamed from: b */
    public IdGenerator f75951b;

    /* renamed from: c */
    public InstanceCreatorFactory f75952c;

    /* renamed from: d */
    public Class f75953d;

    /* renamed from: h */
    public boolean f75957h;

    /* renamed from: i */
    public String f75958i;

    /* renamed from: j */
    public String f75959j;

    /* renamed from: k */
    public String f75960k;

    /* renamed from: a */
    public final List f75950a = new ArrayList();

    /* renamed from: e */
    public Map f75954e = Collections.emptyMap();

    /* renamed from: f */
    public List f75955f = Conventions.DEFAULT_CONVENTIONS;

    /* renamed from: g */
    public List f75956g = Collections.emptyList();

    public ClassModelBuilder(Class cls) {
        AbstractC12924c.m24423b(this, (Class) Assertions.notNull("type", cls));
    }

    /* renamed from: a */
    public ClassModelBuilder m24459a(PropertyModelBuilder propertyModelBuilder) {
        this.f75950a.add(Assertions.notNull("propertyModelBuilder", propertyModelBuilder));
        return this;
    }

    public ClassModelBuilder<T> annotations(List<Annotation> list) {
        this.f75956g = (List) Assertions.notNull("annotations", list);
        return this;
    }

    /* renamed from: b */
    public final void m24458b(String str, String str2, Map map, String str3) {
        if (!map.containsKey(str2)) {
            map.put(str2, 1);
            return;
        }
        throw new CodecConfigurationException(String.format("Duplicate %s named '%s' found in %s.", str, str2, str3));
    }

    public ClassModel<T> build() {
        ArrayList arrayList = new ArrayList();
        AbstractC12924c.m24414k("type", this.f75953d);
        for (Convention convention : this.f75955f) {
            convention.apply(this);
        }
        AbstractC12924c.m24414k("instanceCreatorFactory", this.f75952c);
        if (this.f75957h) {
            AbstractC12924c.m24414k("discriminatorKey", this.f75959j);
            AbstractC12924c.m24414k("discriminator", this.f75958i);
        }
        PropertyModel<T> propertyModel = null;
        for (PropertyModelBuilder propertyModelBuilder : this.f75950a) {
            boolean equals = propertyModelBuilder.getName().equals(this.f75960k);
            if (equals) {
                propertyModelBuilder.readName("_id").writeName("_id");
            }
            PropertyModel<T> build = propertyModelBuilder.build();
            arrayList.add(build);
            if (equals) {
                propertyModel = build;
            }
        }
        m24456d(this.f75953d.getSimpleName(), arrayList);
        return new ClassModel<>(this.f75953d, this.f75954e, this.f75952c, Boolean.valueOf(this.f75957h), this.f75959j, this.f75958i, C17680Gc0.m68268a(this.f75953d, propertyModel, this.f75951b), Collections.unmodifiableList(arrayList));
    }

    /* renamed from: c */
    public ClassModelBuilder m24457c(Map map) {
        this.f75954e = Collections.unmodifiableMap(new HashMap(map));
        return this;
    }

    public ClassModelBuilder<T> conventions(List<Convention> list) {
        this.f75955f = (List) Assertions.notNull("conventions", list);
        return this;
    }

    /* renamed from: d */
    public final void m24456d(String str, List list) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PropertyModel propertyModel = (PropertyModel) it.next();
            if (!propertyModel.m24446e()) {
                m24458b("property", propertyModel.getName(), hashMap, str);
                if (propertyModel.isReadable()) {
                    m24458b("read property", propertyModel.getReadName(), hashMap2, str);
                }
                if (propertyModel.isWritable()) {
                    m24458b("write property", propertyModel.getWriteName(), hashMap3, str);
                }
            } else {
                throw new CodecConfigurationException(propertyModel.m24448c());
            }
        }
        String str2 = this.f75960k;
        if (str2 != null && !hashMap.containsKey(str2)) {
            throw new CodecConfigurationException(String.format("Invalid id property, property named '%s' can not be found.", this.f75960k));
        }
    }

    public ClassModelBuilder<T> discriminator(String str) {
        this.f75958i = str;
        return this;
    }

    public ClassModelBuilder<T> discriminatorKey(String str) {
        this.f75959j = str;
        return this;
    }

    public ClassModelBuilder<T> enableDiscriminator(boolean z) {
        this.f75957h = z;
        return this;
    }

    public List<Annotation> getAnnotations() {
        return this.f75956g;
    }

    public List<Convention> getConventions() {
        return this.f75955f;
    }

    public String getDiscriminator() {
        return this.f75958i;
    }

    public String getDiscriminatorKey() {
        return this.f75959j;
    }

    public IdGenerator<?> getIdGenerator() {
        return this.f75951b;
    }

    public String getIdPropertyName() {
        return this.f75960k;
    }

    public InstanceCreatorFactory<T> getInstanceCreatorFactory() {
        return this.f75952c;
    }

    public PropertyModelBuilder<?> getProperty(String str) {
        Assertions.notNull("propertyName", str);
        for (PropertyModelBuilder<?> propertyModelBuilder : this.f75950a) {
            if (propertyModelBuilder.getName().equals(str)) {
                return propertyModelBuilder;
            }
        }
        return null;
    }

    public List<PropertyModelBuilder<?>> getPropertyModelBuilders() {
        return Collections.unmodifiableList(this.f75950a);
    }

    public Class<T> getType() {
        return this.f75953d;
    }

    public ClassModelBuilder<T> idGenerator(IdGenerator<?> idGenerator) {
        this.f75951b = idGenerator;
        return this;
    }

    public ClassModelBuilder<T> idPropertyName(String str) {
        this.f75960k = str;
        return this;
    }

    public ClassModelBuilder<T> instanceCreatorFactory(InstanceCreatorFactory<T> instanceCreatorFactory) {
        this.f75952c = (InstanceCreatorFactory) Assertions.notNull("instanceCreatorFactory", instanceCreatorFactory);
        return this;
    }

    public boolean removeProperty(String str) {
        return this.f75950a.remove(getProperty((String) Assertions.notNull("propertyName", str)));
    }

    public String toString() {
        return String.format("ClassModelBuilder{type=%s}", this.f75953d);
    }

    public ClassModelBuilder<T> type(Class<T> cls) {
        this.f75953d = (Class) Assertions.notNull("type", cls);
        return this;
    }

    public Boolean useDiscriminator() {
        return Boolean.valueOf(this.f75957h);
    }
}