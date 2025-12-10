package p000;

import java.util.Collection;
import java.util.Map;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.ClassModelBuilder;
import org.bson.codecs.pojo.Convention;
import org.bson.codecs.pojo.PropertyAccessor;
import org.bson.codecs.pojo.PropertyModelBuilder;

/* renamed from: ry */
/* loaded from: classes6.dex */
public final class C13880ry implements Convention {

    /* renamed from: ry$b */
    /* loaded from: classes6.dex */
    public static final class C13882b implements PropertyAccessor {

        /* renamed from: a */
        public final C17328Ap1 f79730a;

        /* renamed from: a */
        public final void m22915a(Object obj, Collection collection) {
            Collection collection2 = (Collection) get(obj);
            if (collection2 == null) {
                m22913c("The getter returned null.", null);
            } else if (!collection2.isEmpty()) {
                m22913c("The getter returned a non empty collection.", null);
            } else {
                try {
                    collection2.addAll(collection);
                } catch (Exception e) {
                    m22913c("collection#addAll failed.", e);
                }
            }
        }

        /* renamed from: b */
        public final void m22914b(Object obj, Map map) {
            Map map2 = (Map) get(obj);
            if (map2 == null) {
                m22913c("The getter returned null.", null);
            } else if (!map2.isEmpty()) {
                m22913c("The getter returned a non empty map.", null);
            } else {
                try {
                    map2.putAll(map);
                } catch (Exception e) {
                    m22913c("map#putAll failed.", e);
                }
            }
        }

        /* renamed from: c */
        public final void m22913c(String str, Exception exc) {
            throw new CodecConfigurationException(String.format("Cannot use getter in '%s' to set '%s'. %s", this.f79730a.m69186b().m68773d(), this.f79730a.m69186b().m68769h(), str), exc);
        }

        @Override // org.bson.codecs.pojo.PropertyAccessor
        public Object get(Object obj) {
            return this.f79730a.get(obj);
        }

        @Override // org.bson.codecs.pojo.PropertyAccessor
        public void set(Object obj, Object obj2) {
            if (obj2 instanceof Collection) {
                m22915a(obj, (Collection) obj2);
            } else if (obj2 instanceof Map) {
                m22914b(obj, (Map) obj2);
            } else {
                m22913c(String.format("Unexpected type: '%s'", obj2.getClass()), null);
            }
        }

        public C13882b(C17328Ap1 c17328Ap1) {
            this.f79730a = c17328Ap1;
        }
    }

    /* renamed from: b */
    private void m22916b(PropertyModelBuilder propertyModelBuilder) {
        propertyModelBuilder.propertyAccessor(new C13882b((C17328Ap1) propertyModelBuilder.getPropertyAccessor()));
    }

    /* renamed from: a */
    public final boolean m22917a(Class cls) {
        if (!Collection.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    @Override // org.bson.codecs.pojo.Convention
    public void apply(ClassModelBuilder classModelBuilder) {
        for (PropertyModelBuilder<?> propertyModelBuilder : classModelBuilder.getPropertyModelBuilders()) {
            if (propertyModelBuilder.getPropertyAccessor() instanceof C17328Ap1) {
                C17523Dp1 m69186b = ((C17328Ap1) propertyModelBuilder.getPropertyAccessor()).m69186b();
                if (!m69186b.m68762o() && m69186b.m68760q() && m22917a(m69186b.m68766k().getType())) {
                    m22916b(propertyModelBuilder);
                }
            } else {
                throw new CodecConfigurationException(String.format("The USE_GETTER_AS_SETTER_CONVENTION is not compatible with propertyModelBuilder instance that have custom implementations of org.bson.codecs.pojo.PropertyAccessor: %s", propertyModelBuilder.getPropertyAccessor().getClass().getName()));
            }
        }
    }
}