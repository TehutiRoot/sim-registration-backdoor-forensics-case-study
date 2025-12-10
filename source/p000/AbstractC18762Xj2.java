package p000;

import com.google.android.gms.internal.clearcut.C6401i;

/* renamed from: Xj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18762Xj2 {

    /* renamed from: a */
    public static final InterfaceC18186Oj2 f7566a = m65435c();

    /* renamed from: b */
    public static final InterfaceC18186Oj2 f7567b = new C6401i();

    /* renamed from: a */
    public static InterfaceC18186Oj2 m65437a() {
        return f7566a;
    }

    /* renamed from: b */
    public static InterfaceC18186Oj2 m65436b() {
        return f7567b;
    }

    /* renamed from: c */
    public static InterfaceC18186Oj2 m65435c() {
        try {
            return (InterfaceC18186Oj2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
