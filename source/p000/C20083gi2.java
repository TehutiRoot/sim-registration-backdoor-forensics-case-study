package p000;

import com.google.android.gms.internal.clearcut.C6399g;
import com.google.android.gms.internal.clearcut.C6400h;
import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzci;

/* renamed from: gi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20083gi2 implements InterfaceC18893Zk2 {

    /* renamed from: b */
    public static final InterfaceC19570dj2 f62237b = new C20943li2();

    /* renamed from: a */
    public final InterfaceC19570dj2 f62238a;

    public C20083gi2() {
        this(new C21803qi2(C18878Zf2.m65157a(), m31055c()));
    }

    /* renamed from: b */
    public static boolean m31056b(InterfaceC18759Xi2 interfaceC18759Xi2) {
        if (interfaceC18759Xi2.mo65441a() == zzcg.zzg.zzkl) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static InterfaceC19570dj2 m31055c() {
        try {
            return (InterfaceC19570dj2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f62237b;
        }
    }

    @Override // p000.InterfaceC18893Zk2
    /* renamed from: a */
    public final InterfaceC18637Vk2 mo31057a(Class cls) {
        AbstractC19576dl2.m31778I(cls);
        InterfaceC18759Xi2 zzb = this.f62238a.zzb(cls);
        if (zzb.mo65440b()) {
            if (zzcg.class.isAssignableFrom(cls)) {
                return C6400h.m48245h(AbstractC19576dl2.m31785B(), AbstractC19902ff2.m31272b(), zzb.mo65439c());
            }
            return C6400h.m48245h(AbstractC19576dl2.m31730z(), AbstractC19902ff2.m31271c(), zzb.mo65439c());
        } else if (zzcg.class.isAssignableFrom(cls)) {
            boolean m31056b = m31056b(zzb);
            InterfaceC18186Oj2 m65436b = AbstractC18762Xj2.m65436b();
            AbstractC20424ih2 m30601d = AbstractC20424ih2.m30601d();
            Em2 m31785B = AbstractC19576dl2.m31785B();
            if (m31056b) {
                return C6399g.m48262q(cls, zzb, m65436b, m30601d, m31785B, AbstractC19902ff2.m31272b(), AbstractC18439Si2.m66300b());
            }
            return C6399g.m48262q(cls, zzb, m65436b, m30601d, m31785B, null, AbstractC18439Si2.m66300b());
        } else {
            boolean m31056b2 = m31056b(zzb);
            InterfaceC18186Oj2 m65437a = AbstractC18762Xj2.m65437a();
            AbstractC20424ih2 m30602c = AbstractC20424ih2.m30602c();
            if (m31056b2) {
                return C6399g.m48262q(cls, zzb, m65437a, m30602c, AbstractC19576dl2.m31730z(), AbstractC19902ff2.m31271c(), AbstractC18439Si2.m66301a());
            }
            return C6399g.m48262q(cls, zzb, m65437a, m30602c, AbstractC19576dl2.m31786A(), null, AbstractC18439Si2.m66301a());
        }
    }

    public C20083gi2(InterfaceC19570dj2 interfaceC19570dj2) {
        this.f62238a = (InterfaceC19570dj2) zzci.m48157d(interfaceC19570dj2, "messageInfoFactory");
    }
}
