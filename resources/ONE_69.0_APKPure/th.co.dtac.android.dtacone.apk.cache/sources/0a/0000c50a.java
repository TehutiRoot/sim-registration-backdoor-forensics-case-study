package p000;

import com.google.android.gms.internal.clearcut.C6388g;
import com.google.android.gms.internal.clearcut.C6389h;
import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzci;

/* renamed from: dj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19620dj2 implements InterfaceC18749Wl2 {

    /* renamed from: b */
    public static final InterfaceC19099ak2 f61352b = new C20485ij2();

    /* renamed from: a */
    public final InterfaceC19099ak2 f61353a;

    public C19620dj2() {
        this(new C21350nj2(C18734Wg2.m65682a(), m31765c()));
    }

    /* renamed from: b */
    public static boolean m31766b(InterfaceC18613Uj2 interfaceC18613Uj2) {
        if (interfaceC18613Uj2.mo66098a() == zzcg.zzg.zzkl) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static InterfaceC19099ak2 m31765c() {
        try {
            return (InterfaceC19099ak2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f61352b;
        }
    }

    @Override // p000.InterfaceC18749Wl2
    /* renamed from: a */
    public final InterfaceC18489Sl2 mo31767a(Class cls) {
        AbstractC19105am2.m65045I(cls);
        InterfaceC18613Uj2 zzb = this.f61353a.zzb(cls);
        if (zzb.mo66097b()) {
            if (zzcg.class.isAssignableFrom(cls)) {
                return C6389h.m48242h(AbstractC19105am2.m65052B(), AbstractC19438cg2.m51659b(), zzb.mo66096c());
            }
            return C6389h.m48242h(AbstractC19105am2.m64997z(), AbstractC19438cg2.m51658c(), zzb.mo66096c());
        } else if (zzcg.class.isAssignableFrom(cls)) {
            boolean m31766b = m31766b(zzb);
            InterfaceC18031Lk2 m66094b = AbstractC18616Uk2.m66094b();
            AbstractC19963fi2 m31482d = AbstractC19963fi2.m31482d();
            Bn2 m65052B = AbstractC19105am2.m65052B();
            if (m31766b) {
                return C6388g.m48259q(cls, zzb, m66094b, m31482d, m65052B, AbstractC19438cg2.m51659b(), AbstractC18288Pj2.m66932b());
            }
            return C6388g.m48259q(cls, zzb, m66094b, m31482d, m65052B, null, AbstractC18288Pj2.m66932b());
        } else {
            boolean m31766b2 = m31766b(zzb);
            InterfaceC18031Lk2 m66095a = AbstractC18616Uk2.m66095a();
            AbstractC19963fi2 m31483c = AbstractC19963fi2.m31483c();
            if (m31766b2) {
                return C6388g.m48259q(cls, zzb, m66095a, m31483c, AbstractC19105am2.m64997z(), AbstractC19438cg2.m51658c(), AbstractC18288Pj2.m66933a());
            }
            return C6388g.m48259q(cls, zzb, m66095a, m31483c, AbstractC19105am2.m65053A(), null, AbstractC18288Pj2.m66933a());
        }
    }

    public C19620dj2(InterfaceC19099ak2 interfaceC19099ak2) {
        this.f61353a = (InterfaceC19099ak2) zzci.m48154d(interfaceC19099ak2, "messageInfoFactory");
    }
}