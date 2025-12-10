package org.bson.codecs.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bson.assertions.Assertions;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.diagnostics.Logger;
import org.bson.diagnostics.Loggers;

/* loaded from: classes6.dex */
public final class PojoCodecProvider implements CodecProvider {

    /* renamed from: g */
    public static final Logger f75961g = Loggers.getLogger("codecs.pojo");

    /* renamed from: a */
    public final boolean f75962a;

    /* renamed from: b */
    public final Map f75963b;

    /* renamed from: c */
    public final Set f75964c;

    /* renamed from: d */
    public final List f75965d;

    /* renamed from: e */
    public final C10283gJ f75966e;

    /* renamed from: f */
    public final List f75967f;

    /* loaded from: classes6.dex */
    public static final class Builder {

        /* renamed from: a */
        public final Set f75968a;

        /* renamed from: b */
        public final Map f75969b;

        /* renamed from: c */
        public final List f75970c;

        /* renamed from: d */
        public List f75971d;

        /* renamed from: e */
        public final List f75972e;

        /* renamed from: f */
        public boolean f75973f;

        public Builder automatic(boolean z) {
            this.f75973f = z;
            return this;
        }

        public PojoCodecProvider build() {
            List list;
            if (this.f75971d != null) {
                list = Collections.unmodifiableList(new ArrayList(this.f75971d));
            } else {
                list = null;
            }
            List list2 = list;
            for (Class cls : this.f75970c) {
                if (!this.f75969b.containsKey(cls)) {
                    register(PojoCodecProvider.m24452b(cls, list2));
                }
            }
            return new PojoCodecProvider(this.f75973f, this.f75969b, this.f75968a, list2, this.f75972e);
        }

        public Builder conventions(List<Convention> list) {
            this.f75971d = (List) Assertions.notNull("conventions", list);
            return this;
        }

        public Builder register(Class<?>... clsArr) {
            this.f75970c.addAll(Arrays.asList(clsArr));
            return this;
        }

        public Builder() {
            this.f75968a = new HashSet();
            this.f75969b = new HashMap();
            this.f75970c = new ArrayList();
            this.f75971d = null;
            this.f75972e = new ArrayList();
        }

        public Builder register(ClassModel<?>... classModelArr) {
            Assertions.notNull("classModels", classModelArr);
            for (ClassModel<?> classModel : classModelArr) {
                this.f75969b.put(classModel.getType(), classModel);
            }
            return this;
        }

        public Builder register(String... strArr) {
            this.f75968a.addAll(Arrays.asList((Object[]) Assertions.notNull("packageNames", strArr)));
            return this;
        }

        public Builder register(PropertyCodecProvider... propertyCodecProviderArr) {
            this.f75972e.addAll(Arrays.asList((Object[]) Assertions.notNull("providers", propertyCodecProviderArr)));
            return this;
        }
    }

    /* renamed from: b */
    public static ClassModel m24452b(Class cls, List list) {
        ClassModelBuilder builder = ClassModel.builder(cls);
        if (list != null) {
            builder.conventions(list);
        }
        return builder.build();
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: c */
    public final AbstractC18163Nl1 m24451c(Class cls, CodecRegistry codecRegistry) {
        ClassModel classModel = (ClassModel) this.f75963b.get(cls);
        if (classModel != null) {
            return new C12925d(classModel, codecRegistry, this.f75967f, this.f75966e);
        }
        if (this.f75962a || (cls.getPackage() != null && this.f75964c.contains(cls.getPackage().getName()))) {
            try {
                ClassModel m24452b = m24452b(cls, this.f75965d);
                if (!cls.isInterface()) {
                    if (!m24452b.getPropertyModels().isEmpty()) {
                    }
                }
                this.f75966e.m31394a(m24452b);
                return new C0984O9(new C12925d(m24452b, codecRegistry, this.f75967f, this.f75966e));
            } catch (Exception e) {
                f75961g.warn(String.format("Cannot use '%s' with the PojoCodec.", cls.getSimpleName()), e);
                return null;
            }
        }
        return null;
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> Codec<T> get(Class<T> cls, CodecRegistry codecRegistry) {
        return m24451c(cls, codecRegistry);
    }

    public PojoCodecProvider(boolean z, Map map, Set set, List list, List list2) {
        this.f75962a = z;
        this.f75963b = map;
        this.f75964c = set;
        this.f75965d = list;
        this.f75966e = new C10283gJ(map, set);
        this.f75967f = list2;
    }
}