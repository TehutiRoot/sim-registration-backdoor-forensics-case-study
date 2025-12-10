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
        public final C17328Ap1 f77362a;

        @Override // org.bson.codecs.pojo.PropertyAccessor
        public Object get(Object obj) {
            return this.f77362a.get(obj);
        }

        @Override // org.bson.codecs.pojo.PropertyAccessor
        public void set(Object obj, Object obj2) {
            try {
                this.f77362a.m69186b().m68771f().set(obj, obj2);
            } catch (Exception e) {
                throw new CodecConfigurationException(String.format("Unable to set value for property '%s' in %s", this.f77362a.m69186b().m68769h(), this.f77362a.m69186b().m68773d()), e);
            }
        }

        public C13221b(C17328Ap1 c17328Ap1) {
            this.f77362a = c17328Ap1;
            try {
                c17328Ap1.m69186b().m68771f().setAccessible(true);
            } catch (Exception e) {
                throw new CodecConfigurationException(String.format("Unable to make private field accessible '%s' in %s", c17328Ap1.m69186b().m68769h(), c17328Ap1.m69186b().m68773d()), e);
            }
        }
    }

    /* renamed from: a */
    public final void m23556a(PropertyModelBuilder propertyModelBuilder) {
        propertyModelBuilder.propertyAccessor(new C13221b((C17328Ap1) propertyModelBuilder.getPropertyAccessor()));
    }

    @Override // org.bson.codecs.pojo.Convention
    public void apply(ClassModelBuilder classModelBuilder) {
        for (PropertyModelBuilder<?> propertyModelBuilder : classModelBuilder.getPropertyModelBuilders()) {
            if (propertyModelBuilder.getPropertyAccessor() instanceof C17328Ap1) {
                C17523Dp1 m69186b = ((C17328Ap1) propertyModelBuilder.getPropertyAccessor()).m69186b();
                if (!m69186b.m68762o() && m69186b.m68771f() != null && Modifier.isPrivate(m69186b.m68771f().getModifiers())) {
                    m23556a(propertyModelBuilder);
                }
            } else {
                throw new CodecConfigurationException(String.format("The SET_PRIVATE_FIELDS_CONVENTION is not compatible with propertyModelBuilder instance that have custom implementations of org.bson.codecs.pojo.PropertyAccessor: %s", propertyModelBuilder.getPropertyAccessor().getClass().getName()));
            }
        }
    }
}