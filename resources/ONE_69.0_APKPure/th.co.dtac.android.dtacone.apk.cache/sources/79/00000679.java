package p000;

import com.google.protobuf.InterfaceC8950t;
import com.google.protobuf.Internal;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: Gp1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17718Gp1 {

    /* renamed from: c */
    public static final C17718Gp1 f2197c = new C17718Gp1();

    /* renamed from: b */
    public final ConcurrentMap f2199b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC22137sF1 f2198a = new C18233On0();

    /* renamed from: a */
    public static C17718Gp1 m68203a() {
        return f2197c;
    }

    /* renamed from: b */
    public InterfaceC8950t m68202b(Class cls, InterfaceC8950t interfaceC8950t) {
        Internal.m35777b(cls, "messageType");
        Internal.m35777b(interfaceC8950t, "schema");
        return (InterfaceC8950t) this.f2199b.putIfAbsent(cls, interfaceC8950t);
    }

    /* renamed from: c */
    public InterfaceC8950t m68201c(Class cls) {
        Internal.m35777b(cls, "messageType");
        InterfaceC8950t interfaceC8950t = (InterfaceC8950t) this.f2199b.get(cls);
        if (interfaceC8950t == null) {
            InterfaceC8950t mo22855a = this.f2198a.mo22855a(cls);
            InterfaceC8950t m68202b = m68202b(cls, mo22855a);
            if (m68202b != null) {
                return m68202b;
            }
            return mo22855a;
        }
        return interfaceC8950t;
    }

    /* renamed from: d */
    public InterfaceC8950t m68200d(Object obj) {
        return m68201c(obj.getClass());
    }
}