package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;

/* renamed from: androidx.camera.core.impl.b */
/* loaded from: classes.dex */
public final class C2497b extends Config.Option {

    /* renamed from: a */
    public final String f11313a;

    /* renamed from: b */
    public final Class f11314b;

    /* renamed from: c */
    public final Object f11315c;

    public C2497b(String str, Class cls, Object obj) {
        if (str != null) {
            this.f11313a = str;
            if (cls != null) {
                this.f11314b = cls;
                this.f11315c = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Config.Option)) {
            return false;
        }
        Config.Option option = (Config.Option) obj;
        if (this.f11313a.equals(option.getId()) && this.f11314b.equals(option.getValueClass())) {
            Object obj2 = this.f11315c;
            if (obj2 == null) {
                if (option.getToken() == null) {
                    return true;
                }
            } else if (obj2.equals(option.getToken())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public String getId() {
        return this.f11313a;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public Object getToken() {
        return this.f11315c;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public Class getValueClass() {
        return this.f11314b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f11313a.hashCode() ^ 1000003) * 1000003) ^ this.f11314b.hashCode()) * 1000003;
        Object obj = this.f11315c;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "Option{id=" + this.f11313a + ", valueClass=" + this.f11314b + ", token=" + this.f11315c + "}";
    }
}