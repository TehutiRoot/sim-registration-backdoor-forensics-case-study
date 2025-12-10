package p000;

import androidx.datastore.preferences.protobuf.C4433s;

/* renamed from: pH0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC21623pH0 {

    /* renamed from: a */
    public static final InterfaceC21104mH0 f76763a = m23872c();

    /* renamed from: b */
    public static final InterfaceC21104mH0 f76764b = new C4433s();

    /* renamed from: a */
    public static InterfaceC21104mH0 m23874a() {
        return f76763a;
    }

    /* renamed from: b */
    public static InterfaceC21104mH0 m23873b() {
        return f76764b;
    }

    /* renamed from: c */
    public static InterfaceC21104mH0 m23872c() {
        try {
            return (InterfaceC21104mH0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}