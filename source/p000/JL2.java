package p000;

import com.google.android.gms.internal.firebase_ml.C6443J0;

/* renamed from: JL2 */
/* loaded from: classes3.dex */
public abstract class JL2 {

    /* renamed from: a */
    public static final IL2 f2777a = m67761c();

    /* renamed from: b */
    public static final IL2 f2778b = new C6443J0();

    /* renamed from: a */
    public static IL2 m67763a() {
        return f2777a;
    }

    /* renamed from: b */
    public static IL2 m67762b() {
        return f2778b;
    }

    /* renamed from: c */
    public static IL2 m67761c() {
        try {
            return (IL2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
