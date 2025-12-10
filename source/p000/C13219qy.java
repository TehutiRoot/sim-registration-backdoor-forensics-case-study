package p000;

import java.lang.reflect.Modifier;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.ClassModelBuilder;
import org.bson.codecs.pojo.Convention;
import org.bson.codecs.pojo.PropertyAccessor;
import org.bson.codecs.pojo.PropertyModelBuilder;

/* renamed from: qy */
/* loaded from: classes6.dex */
public final class C13219qy implements Convention {

    /* renamed from: qy$b */
    /* loaded from: classes6.dex */
    public static final class C13221b implements PropertyAccessor {

        /* renamed from: a */
        public final C17494Do1 f77134a;

        @Override // org.bson.codecs.pojo.PropertyAccessor
        public Object get(Object obj) {
            return this.f77134a.get(obj);
        }

        @Override // org.bson.codecs.pojo.PropertyAccessor
        public void set(Object obj, Object obj2) {
            try {
                this.f77134a.m68587b().m68173f().set(obj, obj2);
            } catch (Exception e) {
                throw new CodecConfigurationException(String.format("Unable to set value for property '%s' in %s", this.f77134a.m68587b().m68171h(), this.f77134a.m68587b().m68175d()), e);
            }
        }

        public C13221b(C17494Do1 c17494Do1) {
            this.f77134a = c17494Do1;
            try {
                c17494Do1.m68587b().m68173f().setAccessible(true);
            } catch (Exception e) {
                throw new CodecConfigurationException(String.format("Unable to make private field accessible '%s' in %s", c17494Do1.m68587b().m68171h(), c17494Do1.m68587b().m68175d()), e);
            }
        }
    }

    /* renamed from: a */
    public final void m23389a(PropertyModelBuilder propertyModelBuilder) {
        propertyModelBuilder.propertyAccessor(new C13221b((C17494Do1) propertyModelBuilder.getPropertyAccessor()));
    }

    @Override // org.bson.codecs.pojo.Convention
    public void apply(ClassModelBuilder classModelBuilder) {
        for (PropertyModelBuilder<?> propertyModelBuilder : classModelBuilder.getPropertyModelBuilders()) {
            if (propertyModelBuilder.getPropertyAccessor() instanceof C17494Do1) {
                C17686Go1 m68587b = ((C17494Do1) propertyModelBuilder.getPropertyAccessor()).m68587b();
                if (!m68587b.m68164o() && m68587b.m68173f() != null && Modifier.isPrivate(m68587b.m68173f().getModifiers())) {
                    m23389a(propertyModelBuilder);
                }
            } else {
                throw new CodecConfigurationException(String.format("The SET_PRIVATE_FIELDS_CONVENTION is not compatible with propertyModelBuilder instance that have custom implementations of org.bson.codecs.pojo.PropertyAccessor: %s", propertyModelBuilder.getPropertyAccessor().getClass().getName()));
            }
        }
    }
}
