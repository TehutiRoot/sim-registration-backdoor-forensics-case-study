package p000;

import com.google.protobuf.GeneratedMessageLite;

/* renamed from: O50 */
/* loaded from: classes4.dex */
public class O50 implements InterfaceC22240ss0 {

    /* renamed from: a */
    public static final O50 f4364a = new O50();

    /* renamed from: c */
    public static O50 m67150c() {
        return f4364a;
    }

    @Override // p000.InterfaceC22240ss0
    /* renamed from: a */
    public InterfaceC21894qs0 mo22770a(Class cls) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC21894qs0) GeneratedMessageLite.m35817p(cls.asSubclass(GeneratedMessageLite.class)).m35825h();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // p000.InterfaceC22240ss0
    /* renamed from: b */
    public boolean mo22769b(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}