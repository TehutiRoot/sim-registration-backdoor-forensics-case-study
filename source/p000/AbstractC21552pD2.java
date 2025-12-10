package p000;

import com.google.android.gms.internal.vision.C6619D;

/* renamed from: pD2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21552pD2 {

    /* renamed from: a */
    public static final InterfaceC20348iD2 f76512a = m23718c();

    /* renamed from: b */
    public static final InterfaceC20348iD2 f76513b = new C6619D();

    /* renamed from: a */
    public static InterfaceC20348iD2 m23720a() {
        return f76512a;
    }

    /* renamed from: b */
    public static InterfaceC20348iD2 m23719b() {
        return f76513b;
    }

    /* renamed from: c */
    public static InterfaceC20348iD2 m23718c() {
        try {
            return (InterfaceC20348iD2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
