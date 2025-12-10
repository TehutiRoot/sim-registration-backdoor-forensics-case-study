package p000;

import com.google.protobuf.GeneratedMessageLite;

/* renamed from: K50 */
/* loaded from: classes4.dex */
public class K50 implements InterfaceC21143ms0 {

    /* renamed from: a */
    public static final K50 f3105a = new K50();

    /* renamed from: c */
    public static K50 m67640c() {
        return f3105a;
    }

    @Override // p000.InterfaceC21143ms0
    /* renamed from: a */
    public InterfaceC20799ks0 mo26186a(Class cls) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC20799ks0) GeneratedMessageLite.m35825p(cls.asSubclass(GeneratedMessageLite.class)).m35833h();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // p000.InterfaceC21143ms0
    /* renamed from: b */
    public boolean mo26185b(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
