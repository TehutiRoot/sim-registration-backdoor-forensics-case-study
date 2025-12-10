package p000;

import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.PropertyAccessor;

/* renamed from: Ap1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17328Ap1 implements PropertyAccessor {

    /* renamed from: a */
    public final C17523Dp1 f233a;

    public C17328Ap1(C17523Dp1 c17523Dp1) {
        this.f233a = c17523Dp1;
    }

    /* renamed from: a */
    public final CodecConfigurationException m69187a(Exception exc) {
        return new CodecConfigurationException(String.format("Unable to get value for property '%s' in %s", this.f233a.m68769h(), this.f233a.m68773d()), exc);
    }

    /* renamed from: b */
    public C17523Dp1 m69186b() {
        return this.f233a;
    }

    /* renamed from: c */
    public final CodecConfigurationException m69185c(Exception exc) {
        return new CodecConfigurationException(String.format("Unable to set value for property '%s' in %s", this.f233a.m68769h(), this.f233a.m68773d()), exc);
    }

    @Override // org.bson.codecs.pojo.PropertyAccessor
    public Object get(Object obj) {
        try {
            if (this.f233a.m68760q()) {
                if (this.f233a.m68770g() != null) {
                    return this.f233a.m68770g().invoke(obj, null);
                }
                return this.f233a.m68771f().get(obj);
            }
            throw m69187a(null);
        } catch (Exception e) {
            throw m69187a(e);
        }
    }

    @Override // org.bson.codecs.pojo.PropertyAccessor
    public void set(Object obj, Object obj2) {
        try {
            if (this.f233a.m68762o()) {
                if (this.f233a.m68767j() != null) {
                    this.f233a.m68767j().invoke(obj, obj2);
                } else {
                    this.f233a.m68771f().set(obj, obj2);
                }
            }
        } catch (Exception e) {
            throw m69185c(e);
        }
    }
}