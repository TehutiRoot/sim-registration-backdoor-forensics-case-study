package p000;

import androidx.datastore.preferences.protobuf.C4451s;

/* renamed from: jH0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC20530jH0 {

    /* renamed from: a */
    public static final InterfaceC20014gH0 f67234a = m29221c();

    /* renamed from: b */
    public static final InterfaceC20014gH0 f67235b = new C4451s();

    /* renamed from: a */
    public static InterfaceC20014gH0 m29223a() {
        return f67234a;
    }

    /* renamed from: b */
    public static InterfaceC20014gH0 m29222b() {
        return f67235b;
    }

    /* renamed from: c */
    public static InterfaceC20014gH0 m29221c() {
        try {
            return (InterfaceC20014gH0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
