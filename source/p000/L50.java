package p000;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* renamed from: L50 */
/* loaded from: classes2.dex */
public class L50 implements InterfaceC21315ns0 {

    /* renamed from: a */
    public static final L50 f3381a = new L50();

    /* renamed from: c */
    public static L50 m67548c() {
        return f3381a;
    }

    @Override // p000.InterfaceC21315ns0
    /* renamed from: a */
    public InterfaceC20971ls0 mo25996a(Class cls) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC20971ls0) GeneratedMessageLite.m55763k(cls.asSubclass(GeneratedMessageLite.class)).m55767g();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // p000.InterfaceC21315ns0
    /* renamed from: b */
    public boolean mo25995b(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
