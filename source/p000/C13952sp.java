package p000;

import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecRegistry;

/* renamed from: sp */
/* loaded from: classes6.dex */
public class C13952sp implements CodecRegistry {

    /* renamed from: a */
    public final C13952sp f79903a;

    /* renamed from: b */
    public final InterfaceC16951wB f79904b;

    /* renamed from: c */
    public final Class f79905c;

    public C13952sp(InterfaceC16951wB interfaceC16951wB, Class cls) {
        this.f79905c = cls;
        this.f79903a = null;
        this.f79904b = interfaceC16951wB;
    }

    /* renamed from: a */
    public Class m22553a() {
        return this.f79905c;
    }

    /* renamed from: b */
    public final Boolean m22552b(Class cls) {
        for (C13952sp c13952sp = this; c13952sp != null; c13952sp = c13952sp.f79903a) {
            if (c13952sp.f79905c.equals(cls)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13952sp c13952sp = (C13952sp) obj;
        if (!this.f79905c.equals(c13952sp.f79905c)) {
            return false;
        }
        C13952sp c13952sp2 = this.f79903a;
        if (c13952sp2 == null ? c13952sp.f79903a != null : !c13952sp2.equals(c13952sp.f79903a)) {
            return false;
        }
        if (this.f79904b.equals(c13952sp.f79904b)) {
            return true;
        }
        return false;
    }

    @Override // org.bson.codecs.configuration.CodecRegistry
    public Codec get(Class cls) {
        if (m22552b(cls).booleanValue()) {
            return new C20941li0(this.f79904b, cls);
        }
        return this.f79904b.get(new C13952sp(this, cls));
    }

    public int hashCode() {
        int i;
        C13952sp c13952sp = this.f79903a;
        if (c13952sp != null) {
            i = c13952sp.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + this.f79904b.hashCode()) * 31) + this.f79905c.hashCode();
    }

    public C13952sp(C13952sp c13952sp, Class cls) {
        this.f79903a = c13952sp;
        this.f79905c = cls;
        this.f79904b = c13952sp.f79904b;
    }
}
