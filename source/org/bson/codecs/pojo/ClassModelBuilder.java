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
    public IdGenerator f75867b;

    /* renamed from: c */
    public InstanceCreatorFactory f75868c;

    /* renamed from: d */
    public Class f75869d;

    /* renamed from: h */
    public boolean f75873h;

    /* renamed from: i */
    public String f75874i;

    /* renamed from: j */
    public String f75875j;

    /* renamed from: k */
    public String f75876k;

    /* renamed from: a */
    public final List f75866a = new ArrayList();

    /* renamed from: e */
    public Map f75870e = Collections.emptyMap();

    /* renamed from: f */
    public List f75871f = Conventions.DEFAULT_CONVENTIONS;

    /* renamed from: g */
    public List f75872g = Collections.emptyList();

    public ClassModelBuilder(Class cls) {
        AbstractC12924c.m24233b(this, (Class) Assertions.notNull("type", cls));
    }

    /* renamed from: a */
    public ClassModelBuilder m24269a(PropertyModelBuilder propertyModelBuilder) {
        this.f75866a.add(Assertions.notNull("propertyModelBuilder", propertyModelBuilder));
        return this;
    }

    public ClassModelBuilder<T> annotations(List<Annotation> list) {
        this.f75872g = (List) Assertions.notNull("annotations", list);
        return this;
    }

    /* renamed from: b */
    public final void m24268b(String str, String str2, Map map, String str3) {
        if (!map.containsKey(str2)) {
            map.put(str2, 1);
            return;
        }
        throw new CodecConfigurationException(String.format("Duplicate %s named '%s' found in %s.", str, str2, str3));
    }

    public ClassModel<T> build() {
        ArrayList arrayList = new ArrayList();
        AbstractC12924c.m24224k("type", this.f75869d);
        for (Convention convention : this.f75871f) {
            convention.apply(this);
        }
        AbstractC12924c.m24224k("instanceCreatorFactory", this.f75868c);
        if (this.f75873h) {
            AbstractC12924c.m24224k("discriminatorKey", this.f75875j);
            AbstractC12924c.m24224k("discriminator", this.f75874i);
        }
        PropertyModel<T> propertyModel = null;
        for (PropertyModelBuilder propertyModelBuilder : this.f75866a) {
            boolean equals = propertyModelBuilder.getName().equals(this.f75876k);
            if (equals) {
                propertyModelBuilder.readName("_id").writeName("_id");
            }
            PropertyModel<T> build = propertyModelBuilder.build();
            arrayList.add(build);
            if (equals) {
                propertyModel = build;
            }
        }
        m24266d(this.f75869d.getSimpleName(), arrayList);
        return new ClassModel<>(this.f75869d, this.f75870e, this.f75868c, Boolean.valueOf(this.f75873h), this.f75875j, this.f75874i, C17267Ac0.m69065a(this.f75869d, propertyModel, this.f75867b), Collections.unmodifiableList(arrayList));
    }

    /* renamed from: c */
    public ClassModelBuilder m24267c(Map map) {
        this.f75870e = Collections.unmodifiableMap(new HashMap(map));
        return this;
    }

    public ClassModelBuilder<T> conventions(List<Convention> list) {
        this.f75871f = (List) Assertions.notNull("conventions", list);
        return this;
    }

    /* renamed from: d */
    public final void m24266d(String str, List list) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PropertyModel propertyModel = (PropertyModel) it.next();
            if (!propertyModel.m24256e()) {
                m24268b("property", propertyModel.getName(), hashMap, str);
                if (propertyModel.isReadable()) {
                    m24268b("read property", propertyModel.getReadName(), hashMap2, str);
                }
                if (propertyModel.isWritable()) {
                    m24268b("write property", propertyModel.getWriteName(), hashMap3, str);
                }
            } else {
                throw new CodecConfigurationException(propertyModel.m24258c());
            }
        }
        String str2 = this.f75876k;
        if (str2 != null && !hashMap.containsKey(str2)) {
            throw new CodecConfigurationException(String.format("Invalid id property, property named '%s' can not be found.", this.f75876k));
        }
    }

    public ClassModelBuilder<T> discriminator(String str) {
        this.f75874i = str;
        return this;
    }

    public ClassModelBuilder<T> discriminatorKey(String str) {
        this.f75875j = str;
        return this;
    }

    public ClassModelBuilder<T> enableDiscriminator(boolean z) {
        this.f75873h = z;
        return this;
    }

    public List<Annotation> getAnnotations() {
        return this.f75872g;
    }

    public List<Convention> getConventions() {
        return this.f75871f;
    }

    public String getDiscriminator() {
        return this.f75874i;
    }

    public String getDiscriminatorKey() {
        return this.f75875j;
    }

    public IdGenerator<?> getIdGenerator() {
        return this.f75867b;
    }

    public String getIdPropertyName() {
        return this.f75876k;
    }

    public InstanceCreatorFactory<T> getInstanceCreatorFactory() {
        return this.f75868c;
    }

    public PropertyModelBuilder<?> getProperty(String str) {
        Assertions.notNull("propertyName", str);
        for (PropertyModelBuilder<?> propertyModelBuilder : this.f75866a) {
            if (propertyModelBuilder.getName().equals(str)) {
                return propertyModelBuilder;
            }
        }
        return null;
    }

    public List<PropertyModelBuilder<?>> getPropertyModelBuilders() {
        return Collections.unmodifiableList(this.f75866a);
    }

    public Class<T> getType() {
        return this.f75869d;
    }

    public ClassModelBuilder<T> idGenerator(IdGenerator<?> idGenerator) {
        this.f75867b = idGenerator;
        return this;
    }

    public ClassModelBuilder<T> idPropertyName(String str) {
        this.f75876k = str;
        return this;
    }

    public ClassModelBuilder<T> instanceCreatorFactory(InstanceCreatorFactory<T> instanceCreatorFactory) {
        this.f75868c = (InstanceCreatorFactory) Assertions.notNull("instanceCreatorFactory", instanceCreatorFactory);
        return this;
    }

    public boolean removeProperty(String str) {
        return this.f75866a.remove(getProperty((String) Assertions.notNull("propertyName", str)));
    }

    public String toString() {
        return String.format("ClassModelBuilder{type=%s}", this.f75869d);
    }

    public ClassModelBuilder<T> type(Class<T> cls) {
        this.f75869d = (Class) Assertions.notNull("type", cls);
        return this;
    }

    public Boolean useDiscriminator() {
        return Boolean.valueOf(this.f75873h);
    }
}
