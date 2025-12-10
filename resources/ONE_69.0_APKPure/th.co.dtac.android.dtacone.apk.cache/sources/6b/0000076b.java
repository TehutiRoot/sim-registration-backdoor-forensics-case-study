package p000;

import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;
import androidx.datastore.preferences.protobuf.InterfaceC4435u;
import androidx.datastore.preferences.protobuf.InterfaceC4436v;
import androidx.datastore.preferences.protobuf.Internal;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: Hp1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17783Hp1 {

    /* renamed from: c */
    public static final C17783Hp1 f2486c = new C17783Hp1();

    /* renamed from: b */
    public final ConcurrentMap f2488b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC22310tF1 f2487a = new C18168Nn0();

    /* renamed from: a */
    public static C17783Hp1 m68094a() {
        return f2486c;
    }

    /* renamed from: b */
    public void m68093b(Object obj, InterfaceC4435u interfaceC4435u, ExtensionRegistryLite extensionRegistryLite) {
        m68090e(obj).mo54965h(obj, interfaceC4435u, extensionRegistryLite);
    }

    /* renamed from: c */
    public InterfaceC4436v m68092c(Class cls, InterfaceC4436v interfaceC4436v) {
        Internal.m55679b(cls, "messageType");
        Internal.m55679b(interfaceC4436v, "schema");
        return (InterfaceC4436v) this.f2488b.putIfAbsent(cls, interfaceC4436v);
    }

    /* renamed from: d */
    public InterfaceC4436v m68091d(Class cls) {
        Internal.m55679b(cls, "messageType");
        InterfaceC4436v interfaceC4436v = (InterfaceC4436v) this.f2488b.get(cls);
        if (interfaceC4436v == null) {
            InterfaceC4436v mo22721a = this.f2487a.mo22721a(cls);
            InterfaceC4436v m68092c = m68092c(cls, mo22721a);
            if (m68092c != null) {
                return m68092c;
            }
            return mo22721a;
        }
        return interfaceC4436v;
    }

    /* renamed from: e */
    public InterfaceC4436v m68090e(Object obj) {
        return m68091d(obj.getClass());
    }
}