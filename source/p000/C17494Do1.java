package p000;

import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.PropertyAccessor;

/* renamed from: Do1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17494Do1 implements PropertyAccessor {

    /* renamed from: a */
    public final C17686Go1 f1114a;

    public C17494Do1(C17686Go1 c17686Go1) {
        this.f1114a = c17686Go1;
    }

    /* renamed from: a */
    public final CodecConfigurationException m68588a(Exception exc) {
        return new CodecConfigurationException(String.format("Unable to get value for property '%s' in %s", this.f1114a.m68171h(), this.f1114a.m68175d()), exc);
    }

    /* renamed from: b */
    public C17686Go1 m68587b() {
        return this.f1114a;
    }

    /* renamed from: c */
    public final CodecConfigurationException m68586c(Exception exc) {
        return new CodecConfigurationException(String.format("Unable to set value for property '%s' in %s", this.f1114a.m68171h(), this.f1114a.m68175d()), exc);
    }

    @Override // org.bson.codecs.pojo.PropertyAccessor
    public Object get(Object obj) {
        try {
            if (this.f1114a.m68162q()) {
                if (this.f1114a.m68172g() != null) {
                    return this.f1114a.m68172g().invoke(obj, null);
                }
                return this.f1114a.m68173f().get(obj);
            }
            throw m68588a(null);
        } catch (Exception e) {
            throw m68588a(e);
        }
    }

    @Override // org.bson.codecs.pojo.PropertyAccessor
    public void set(Object obj, Object obj2) {
        try {
            if (this.f1114a.m68164o()) {
                if (this.f1114a.m68169j() != null) {
                    this.f1114a.m68169j().invoke(obj, obj2);
                } else {
                    this.f1114a.m68173f().set(obj, obj2);
                }
            }
        } catch (Exception e) {
            throw m68586c(e);
        }
    }
}
