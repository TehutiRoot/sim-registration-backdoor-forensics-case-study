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
public final class C13879ry implements Convention {

    /* renamed from: ry$b */
    /* loaded from: classes6.dex */
    public static final class C13881b implements PropertyAccessor {

        /* renamed from: a */
        public final C17494Do1 f79525a;

        /* renamed from: a */
        public final void m22728a(Object obj, Collection collection) {
            Collection collection2 = (Collection) get(obj);
            if (collection2 == null) {
                m22726c("The getter returned null.", null);
            } else if (!collection2.isEmpty()) {
                m22726c("The getter returned a non empty collection.", null);
            } else {
                try {
                    collection2.addAll(collection);
                } catch (Exception e) {
                    m22726c("collection#addAll failed.", e);
                }
            }
        }

        /* renamed from: b */
        public final void m22727b(Object obj, Map map) {
            Map map2 = (Map) get(obj);
            if (map2 == null) {
                m22726c("The getter returned null.", null);
            } else if (!map2.isEmpty()) {
                m22726c("The getter returned a non empty map.", null);
            } else {
                try {
                    map2.putAll(map);
                } catch (Exception e) {
                    m22726c("map#putAll failed.", e);
                }
            }
        }

        /* renamed from: c */
        public final void m22726c(String str, Exception exc) {
            throw new CodecConfigurationException(String.format("Cannot use getter in '%s' to set '%s'. %s", this.f79525a.m68587b().m68175d(), this.f79525a.m68587b().m68171h(), str), exc);
        }

        @Override // org.bson.codecs.pojo.PropertyAccessor
        public Object get(Object obj) {
            return this.f79525a.get(obj);
        }

        @Override // org.bson.codecs.pojo.PropertyAccessor
        public void set(Object obj, Object obj2) {
            if (obj2 instanceof Collection) {
                m22728a(obj, (Collection) obj2);
            } else if (obj2 instanceof Map) {
                m22727b(obj, (Map) obj2);
            } else {
                m22726c(String.format("Unexpected type: '%s'", obj2.getClass()), null);
            }
        }

        public C13881b(C17494Do1 c17494Do1) {
            this.f79525a = c17494Do1;
        }
    }

    /* renamed from: b */
    private void m22729b(PropertyModelBuilder propertyModelBuilder) {
        propertyModelBuilder.propertyAccessor(new C13881b((C17494Do1) propertyModelBuilder.getPropertyAccessor()));
    }

    /* renamed from: a */
    public final boolean m22730a(Class cls) {
        if (!Collection.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    @Override // org.bson.codecs.pojo.Convention
    public void apply(ClassModelBuilder classModelBuilder) {
        for (PropertyModelBuilder<?> propertyModelBuilder : classModelBuilder.getPropertyModelBuilders()) {
            if (propertyModelBuilder.getPropertyAccessor() instanceof C17494Do1) {
                C17686Go1 m68587b = ((C17494Do1) propertyModelBuilder.getPropertyAccessor()).m68587b();
                if (!m68587b.m68164o() && m68587b.m68162q() && m22730a(m68587b.m68168k().getType())) {
                    m22729b(propertyModelBuilder);
                }
            } else {
                throw new CodecConfigurationException(String.format("The USE_GETTER_AS_SETTER_CONVENTION is not compatible with propertyModelBuilder instance that have custom implementations of org.bson.codecs.pojo.PropertyAccessor: %s", propertyModelBuilder.getPropertyAccessor().getClass().getName()));
            }
        }
    }
}
