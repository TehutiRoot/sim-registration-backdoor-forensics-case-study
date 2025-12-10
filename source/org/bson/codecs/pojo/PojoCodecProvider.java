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
    public static final Logger f75877g = Loggers.getLogger("codecs.pojo");

    /* renamed from: a */
    public final boolean f75878a;

    /* renamed from: b */
    public final Map f75879b;

    /* renamed from: c */
    public final Set f75880c;

    /* renamed from: d */
    public final List f75881d;

    /* renamed from: e */
    public final C10217fJ f75882e;

    /* renamed from: f */
    public final List f75883f;

    /* loaded from: classes6.dex */
    public static final class Builder {

        /* renamed from: a */
        public final Set f75884a;

        /* renamed from: b */
        public final Map f75885b;

        /* renamed from: c */
        public final List f75886c;

        /* renamed from: d */
        public List f75887d;

        /* renamed from: e */
        public final List f75888e;

        /* renamed from: f */
        public boolean f75889f;

        public Builder automatic(boolean z) {
            this.f75889f = z;
            return this;
        }

        public PojoCodecProvider build() {
            List list;
            if (this.f75887d != null) {
                list = Collections.unmodifiableList(new ArrayList(this.f75887d));
            } else {
                list = null;
            }
            List list2 = list;
            for (Class cls : this.f75886c) {
                if (!this.f75885b.containsKey(cls)) {
                    register(PojoCodecProvider.m24262b(cls, list2));
                }
            }
            return new PojoCodecProvider(this.f75889f, this.f75885b, this.f75884a, list2, this.f75888e);
        }

        public Builder conventions(List<Convention> list) {
            this.f75887d = (List) Assertions.notNull("conventions", list);
            return this;
        }

        public Builder register(Class<?>... clsArr) {
            this.f75886c.addAll(Arrays.asList(clsArr));
            return this;
        }

        public Builder() {
            this.f75884a = new HashSet();
            this.f75885b = new HashMap();
            this.f75886c = new ArrayList();
            this.f75887d = null;
            this.f75888e = new ArrayList();
        }

        public Builder register(ClassModel<?>... classModelArr) {
            Assertions.notNull("classModels", classModelArr);
            for (ClassModel<?> classModel : classModelArr) {
                this.f75885b.put(classModel.getType(), classModel);
            }
            return this;
        }

        public Builder register(String... strArr) {
            this.f75884a.addAll(Arrays.asList((Object[]) Assertions.notNull("packageNames", strArr)));
            return this;
        }

        public Builder register(PropertyCodecProvider... propertyCodecProviderArr) {
            this.f75888e.addAll(Arrays.asList((Object[]) Assertions.notNull("providers", propertyCodecProviderArr)));
            return this;
        }
    }

    /* renamed from: b */
    public static ClassModel m24262b(Class cls, List list) {
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
    public final AbstractC18316Qk1 m24261c(Class cls, CodecRegistry codecRegistry) {
        ClassModel classModel = (ClassModel) this.f75879b.get(cls);
        if (classModel != null) {
            return new C12925d(classModel, codecRegistry, this.f75883f, this.f75882e);
        }
        if (this.f75878a || (cls.getPackage() != null && this.f75880c.contains(cls.getPackage().getName()))) {
            try {
                ClassModel m24262b = m24262b(cls, this.f75881d);
                if (!cls.isInterface()) {
                    if (!m24262b.getPropertyModels().isEmpty()) {
                    }
                }
                this.f75882e.m31324a(m24262b);
                return new C0995O9(new C12925d(m24262b, codecRegistry, this.f75883f, this.f75882e));
            } catch (Exception e) {
                f75877g.warn(String.format("Cannot use '%s' with the PojoCodec.", cls.getSimpleName()), e);
                return null;
            }
        }
        return null;
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> Codec<T> get(Class<T> cls, CodecRegistry codecRegistry) {
        return m24261c(cls, codecRegistry);
    }

    public PojoCodecProvider(boolean z, Map map, Set set, List list, List list2) {
        this.f75878a = z;
        this.f75879b = map;
        this.f75880c = set;
        this.f75881d = list;
        this.f75882e = new C10217fJ(map, set);
        this.f75883f = list2;
    }
}
