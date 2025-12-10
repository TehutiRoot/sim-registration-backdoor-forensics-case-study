package p000;

import com.google.android.gms.internal.clearcut.C6390i;

/* renamed from: Uk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18616Uk2 {

    /* renamed from: a */
    public static final InterfaceC18031Lk2 f6712a = m66093c();

    /* renamed from: b */
    public static final InterfaceC18031Lk2 f6713b = new C6390i();

    /* renamed from: a */
    public static InterfaceC18031Lk2 m66095a() {
        return f6712a;
    }

    /* renamed from: b */
    public static InterfaceC18031Lk2 m66094b() {
        return f6713b;
    }

    /* renamed from: c */
    public static InterfaceC18031Lk2 m66093c() {
        try {
            return (InterfaceC18031Lk2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}