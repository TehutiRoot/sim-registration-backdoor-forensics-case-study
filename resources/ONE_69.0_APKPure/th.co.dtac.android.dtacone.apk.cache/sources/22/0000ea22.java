package p000;

import com.google.android.gms.internal.vision.C6608D;

/* renamed from: mE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21097mE2 {

    /* renamed from: a */
    public static final InterfaceC19886fE2 f71931a = m26722c();

    /* renamed from: b */
    public static final InterfaceC19886fE2 f71932b = new C6608D();

    /* renamed from: a */
    public static InterfaceC19886fE2 m26724a() {
        return f71931a;
    }

    /* renamed from: b */
    public static InterfaceC19886fE2 m26723b() {
        return f71932b;
    }

    /* renamed from: c */
    public static InterfaceC19886fE2 m26722c() {
        try {
            return (InterfaceC19886fE2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}