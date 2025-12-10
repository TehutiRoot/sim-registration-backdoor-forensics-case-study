package p000;

import com.google.protobuf.AbstractC8948k;
import com.google.protobuf.AbstractC8962u;
import com.google.protobuf.C8956p;
import com.google.protobuf.C8958q;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC8961t;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtoSyntax;

/* renamed from: In0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17811In0 implements InterfaceC22586vE1 {

    /* renamed from: b */
    public static final InterfaceC21143ms0 f2597b = new C0622a();

    /* renamed from: a */
    public final InterfaceC21143ms0 f2598a;

    /* renamed from: In0$a */
    /* loaded from: classes4.dex */
    public class C0622a implements InterfaceC21143ms0 {
        @Override // p000.InterfaceC21143ms0
        /* renamed from: a */
        public InterfaceC20799ks0 mo26186a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // p000.InterfaceC21143ms0
        /* renamed from: b */
        public boolean mo26185b(Class cls) {
            return false;
        }
    }

    /* renamed from: In0$b */
    /* loaded from: classes4.dex */
    public static class C0623b implements InterfaceC21143ms0 {

        /* renamed from: a */
        public InterfaceC21143ms0[] f2599a;

        public C0623b(InterfaceC21143ms0... interfaceC21143ms0Arr) {
            this.f2599a = interfaceC21143ms0Arr;
        }

        @Override // p000.InterfaceC21143ms0
        /* renamed from: a */
        public InterfaceC20799ks0 mo26186a(Class cls) {
            InterfaceC21143ms0[] interfaceC21143ms0Arr;
            for (InterfaceC21143ms0 interfaceC21143ms0 : this.f2599a) {
                if (interfaceC21143ms0.mo26185b(cls)) {
                    return interfaceC21143ms0.mo26186a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // p000.InterfaceC21143ms0
        /* renamed from: b */
        public boolean mo26185b(Class cls) {
            for (InterfaceC21143ms0 interfaceC21143ms0 : this.f2599a) {
                if (interfaceC21143ms0.mo26185b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C17811In0() {
        this(m67870b());
    }

    /* renamed from: b */
    public static InterfaceC21143ms0 m67870b() {
        return new C0623b(K50.m67640c(), m67869c());
    }

    /* renamed from: c */
    public static InterfaceC21143ms0 m67869c() {
        try {
            return (InterfaceC21143ms0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f2597b;
        }
    }

    /* renamed from: d */
    public static boolean m67868d(InterfaceC20799ks0 interfaceC20799ks0) {
        if (interfaceC20799ks0.getSyntax() == ProtoSyntax.PROTO2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static InterfaceC8961t m67867e(Class cls, InterfaceC20799ks0 interfaceC20799ks0) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            if (m67868d(interfaceC20799ks0)) {
                return C8956p.m35218U(cls, interfaceC20799ks0, AbstractC20358iH0.m30655b(), AbstractC8948k.m35275b(), AbstractC8962u.m35100M(), AbstractC1612WT.m65623b(), AbstractC17939Kn0.m67589b());
            }
            return C8956p.m35218U(cls, interfaceC20799ks0, AbstractC20358iH0.m30655b(), AbstractC8948k.m35275b(), AbstractC8962u.m35100M(), null, AbstractC17939Kn0.m67589b());
        } else if (m67868d(interfaceC20799ks0)) {
            return C8956p.m35218U(cls, interfaceC20799ks0, AbstractC20358iH0.m30656a(), AbstractC8948k.m35276a(), AbstractC8962u.m35105H(), AbstractC1612WT.m65624a(), AbstractC17939Kn0.m67590a());
        } else {
            return C8956p.m35218U(cls, interfaceC20799ks0, AbstractC20358iH0.m30656a(), AbstractC8948k.m35276a(), AbstractC8962u.m35104I(), null, AbstractC17939Kn0.m67590a());
        }
    }

    @Override // p000.InterfaceC22586vE1
    /* renamed from: a */
    public InterfaceC8961t mo1093a(Class cls) {
        AbstractC8962u.m35103J(cls);
        InterfaceC20799ks0 mo26186a = this.f2598a.mo26186a(cls);
        if (mo26186a.mo26594a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                return C8958q.m35167l(AbstractC8962u.m35100M(), AbstractC1612WT.m65623b(), mo26186a.mo26593b());
            }
            return C8958q.m35167l(AbstractC8962u.m35105H(), AbstractC1612WT.m65624a(), mo26186a.mo26593b());
        }
        return m67867e(cls, mo26186a);
    }

    public C17811In0(InterfaceC21143ms0 interfaceC21143ms0) {
        this.f2598a = (InterfaceC21143ms0) Internal.m35785b(interfaceC21143ms0, "messageInfoFactory");
    }
}
