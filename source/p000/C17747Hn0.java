package p000;

import androidx.datastore.preferences.protobuf.AbstractC4440l;
import androidx.datastore.preferences.protobuf.AbstractC4455w;
import androidx.datastore.preferences.protobuf.C4448q;
import androidx.datastore.preferences.protobuf.C4450r;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InterfaceC4454v;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.ProtoSyntax;

/* renamed from: Hn0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17747Hn0 implements InterfaceC22758wE1 {

    /* renamed from: b */
    public static final InterfaceC21315ns0 f2309b = new C0551a();

    /* renamed from: a */
    public final InterfaceC21315ns0 f2310a;

    /* renamed from: Hn0$a */
    /* loaded from: classes2.dex */
    public static class C0551a implements InterfaceC21315ns0 {
        @Override // p000.InterfaceC21315ns0
        /* renamed from: a */
        public InterfaceC20971ls0 mo25996a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // p000.InterfaceC21315ns0
        /* renamed from: b */
        public boolean mo25995b(Class cls) {
            return false;
        }
    }

    /* renamed from: Hn0$b */
    /* loaded from: classes2.dex */
    public static class C0552b implements InterfaceC21315ns0 {

        /* renamed from: a */
        public InterfaceC21315ns0[] f2311a;

        public C0552b(InterfaceC21315ns0... interfaceC21315ns0Arr) {
            this.f2311a = interfaceC21315ns0Arr;
        }

        @Override // p000.InterfaceC21315ns0
        /* renamed from: a */
        public InterfaceC20971ls0 mo25996a(Class cls) {
            InterfaceC21315ns0[] interfaceC21315ns0Arr;
            for (InterfaceC21315ns0 interfaceC21315ns0 : this.f2311a) {
                if (interfaceC21315ns0.mo25995b(cls)) {
                    return interfaceC21315ns0.mo25996a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // p000.InterfaceC21315ns0
        /* renamed from: b */
        public boolean mo25995b(Class cls) {
            for (InterfaceC21315ns0 interfaceC21315ns0 : this.f2311a) {
                if (interfaceC21315ns0.mo25995b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C17747Hn0() {
        this(m68042b());
    }

    /* renamed from: b */
    public static InterfaceC21315ns0 m68042b() {
        return new C0552b(L50.m67548c(), m68041c());
    }

    /* renamed from: c */
    public static InterfaceC21315ns0 m68041c() {
        try {
            return (InterfaceC21315ns0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f2309b;
        }
    }

    /* renamed from: d */
    public static boolean m68040d(InterfaceC20971ls0 interfaceC20971ls0) {
        if (interfaceC20971ls0.getSyntax() == ProtoSyntax.PROTO2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static InterfaceC4454v m68039e(Class cls, InterfaceC20971ls0 interfaceC20971ls0) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            if (m68040d(interfaceC20971ls0)) {
                return C4448q.m55122Q(cls, interfaceC20971ls0, AbstractC20530jH0.m29222b(), AbstractC4440l.m55169b(), AbstractC4455w.m55001M(), AbstractC1682XT.m65494b(), AbstractC18003Ln0.m67460b());
            }
            return C4448q.m55122Q(cls, interfaceC20971ls0, AbstractC20530jH0.m29222b(), AbstractC4440l.m55169b(), AbstractC4455w.m55001M(), null, AbstractC18003Ln0.m67460b());
        } else if (m68040d(interfaceC20971ls0)) {
            return C4448q.m55122Q(cls, interfaceC20971ls0, AbstractC20530jH0.m29223a(), AbstractC4440l.m55170a(), AbstractC4455w.m55006H(), AbstractC1682XT.m65495a(), AbstractC18003Ln0.m67461a());
        } else {
            return C4448q.m55122Q(cls, interfaceC20971ls0, AbstractC20530jH0.m29223a(), AbstractC4440l.m55170a(), AbstractC4455w.m55005I(), null, AbstractC18003Ln0.m67461a());
        }
    }

    @Override // p000.InterfaceC22758wE1
    /* renamed from: a */
    public InterfaceC4454v mo895a(Class cls) {
        AbstractC4455w.m55004J(cls);
        InterfaceC20971ls0 mo25996a = this.f2310a.mo25996a(cls);
        if (mo25996a.mo26414a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                return C4450r.m55068l(AbstractC4455w.m55001M(), AbstractC1682XT.m65494b(), mo25996a.mo26413b());
            }
            return C4450r.m55068l(AbstractC4455w.m55006H(), AbstractC1682XT.m65495a(), mo25996a.mo26413b());
        }
        return m68039e(cls, mo25996a);
    }

    public C17747Hn0(InterfaceC21315ns0 interfaceC21315ns0) {
        this.f2310a = (InterfaceC21315ns0) Internal.m55729b(interfaceC21315ns0, "messageInfoFactory");
    }
}
