package p000;

import com.google.android.gms.internal.clearcut.zzci;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: xk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23013xk2 {

    /* renamed from: c */
    public static final C23013xk2 f108488c = new C23013xk2();

    /* renamed from: a */
    public final InterfaceC18893Zk2 f108489a;

    /* renamed from: b */
    public final ConcurrentMap f108490b = new ConcurrentHashMap();

    public C23013xk2() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        InterfaceC18893Zk2 interfaceC18893Zk2 = null;
        for (int i = 0; i <= 0; i++) {
            interfaceC18893Zk2 = m398c(strArr[0]);
            if (interfaceC18893Zk2 != null) {
                break;
            }
        }
        this.f108489a = interfaceC18893Zk2 == null ? new C20083gi2() : interfaceC18893Zk2;
    }

    /* renamed from: a */
    public static C23013xk2 m400a() {
        return f108488c;
    }

    /* renamed from: c */
    public static InterfaceC18893Zk2 m398c(String str) {
        try {
            return (InterfaceC18893Zk2) Class.forName(str).getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final InterfaceC18637Vk2 m399b(Class cls) {
        zzci.m48157d(cls, "messageType");
        InterfaceC18637Vk2 interfaceC18637Vk2 = (InterfaceC18637Vk2) this.f108490b.get(cls);
        if (interfaceC18637Vk2 == null) {
            InterfaceC18637Vk2 mo31057a = this.f108489a.mo31057a(cls);
            zzci.m48157d(cls, "messageType");
            zzci.m48157d(mo31057a, "schema");
            InterfaceC18637Vk2 interfaceC18637Vk22 = (InterfaceC18637Vk2) this.f108490b.putIfAbsent(cls, mo31057a);
            if (interfaceC18637Vk22 != null) {
                return interfaceC18637Vk22;
            }
            return mo31057a;
        }
        return interfaceC18637Vk2;
    }

    /* renamed from: d */
    public final InterfaceC18637Vk2 m397d(Object obj) {
        return m399b(obj.getClass());
    }
}
