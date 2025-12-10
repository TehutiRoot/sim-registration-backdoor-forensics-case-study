package p000;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* renamed from: P50 */
/* loaded from: classes2.dex */
public class P50 implements InterfaceC22413ts0 {

    /* renamed from: a */
    public static final P50 f4671a = new P50();

    /* renamed from: c */
    public static P50 m67012c() {
        return f4671a;
    }

    @Override // p000.InterfaceC22413ts0
    /* renamed from: a */
    public InterfaceC22067rs0 mo1302a(Class cls) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC22067rs0) GeneratedMessageLite.m55713k(cls.asSubclass(GeneratedMessageLite.class)).m55717g();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // p000.InterfaceC22413ts0
    /* renamed from: b */
    public boolean mo1301b(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}