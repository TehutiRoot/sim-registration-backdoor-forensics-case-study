package p000;

import com.google.protobuf.InterfaceC8961t;
import com.google.protobuf.Internal;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: Jo1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17878Jo1 {

    /* renamed from: c */
    public static final C17878Jo1 f3023c = new C17878Jo1();

    /* renamed from: b */
    public final ConcurrentMap f3025b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC22586vE1 f3024a = new C17811In0();

    /* renamed from: a */
    public static C17878Jo1 m67679a() {
        return f3023c;
    }

    /* renamed from: b */
    public InterfaceC8961t m67678b(Class cls, InterfaceC8961t interfaceC8961t) {
        Internal.m35785b(cls, "messageType");
        Internal.m35785b(interfaceC8961t, "schema");
        return (InterfaceC8961t) this.f3025b.putIfAbsent(cls, interfaceC8961t);
    }

    /* renamed from: c */
    public InterfaceC8961t m67677c(Class cls) {
        Internal.m35785b(cls, "messageType");
        InterfaceC8961t interfaceC8961t = (InterfaceC8961t) this.f3025b.get(cls);
        if (interfaceC8961t == null) {
            InterfaceC8961t mo1093a = this.f3024a.mo1093a(cls);
            InterfaceC8961t m67678b = m67678b(cls, mo1093a);
            if (m67678b != null) {
                return m67678b;
            }
            return mo1093a;
        }
        return interfaceC8961t;
    }

    /* renamed from: d */
    public InterfaceC8961t m67676d(Object obj) {
        return m67677c(obj.getClass());
    }
}
