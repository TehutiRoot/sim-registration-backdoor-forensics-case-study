package p000;

import com.google.android.gms.internal.firebase_ml.C6432J0;

/* renamed from: GM2 */
/* loaded from: classes3.dex */
public abstract class GM2 {

    /* renamed from: a */
    public static final FM2 f1959a = m68285c();

    /* renamed from: b */
    public static final FM2 f1960b = new C6432J0();

    /* renamed from: a */
    public static FM2 m68287a() {
        return f1959a;
    }

    /* renamed from: b */
    public static FM2 m68286b() {
        return f1960b;
    }

    /* renamed from: c */
    public static FM2 m68285c() {
        try {
            return (FM2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}