package p000;

import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;
import androidx.datastore.preferences.protobuf.InterfaceC4453u;
import androidx.datastore.preferences.protobuf.InterfaceC4454v;
import androidx.datastore.preferences.protobuf.Internal;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: Ko1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17942Ko1 {

    /* renamed from: c */
    public static final C17942Ko1 f3281c = new C17942Ko1();

    /* renamed from: b */
    public final ConcurrentMap f3283b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC22758wE1 f3282a = new C17747Hn0();

    /* renamed from: a */
    public static C17942Ko1 m67586a() {
        return f3281c;
    }

    /* renamed from: b */
    public void m67585b(Object obj, InterfaceC4453u interfaceC4453u, ExtensionRegistryLite extensionRegistryLite) {
        m67582e(obj).mo55015h(obj, interfaceC4453u, extensionRegistryLite);
    }

    /* renamed from: c */
    public InterfaceC4454v m67584c(Class cls, InterfaceC4454v interfaceC4454v) {
        Internal.m55729b(cls, "messageType");
        Internal.m55729b(interfaceC4454v, "schema");
        return (InterfaceC4454v) this.f3283b.putIfAbsent(cls, interfaceC4454v);
    }

    /* renamed from: d */
    public InterfaceC4454v m67583d(Class cls) {
        Internal.m55729b(cls, "messageType");
        InterfaceC4454v interfaceC4454v = (InterfaceC4454v) this.f3283b.get(cls);
        if (interfaceC4454v == null) {
            InterfaceC4454v mo895a = this.f3282a.mo895a(cls);
            InterfaceC4454v m67584c = m67584c(cls, mo895a);
            if (m67584c != null) {
                return m67584c;
            }
            return mo895a;
        }
        return interfaceC4454v;
    }

    /* renamed from: e */
    public InterfaceC4454v m67582e(Object obj) {
        return m67583d(obj.getClass());
    }
}
