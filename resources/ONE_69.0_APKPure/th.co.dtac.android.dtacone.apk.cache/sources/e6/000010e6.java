package p000;

import androidx.datastore.preferences.protobuf.C4428o;
import androidx.datastore.preferences.protobuf.InterfaceC4427n;

/* renamed from: Rn0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC18428Rn0 {

    /* renamed from: a */
    public static final InterfaceC4427n f5639a = m66590c();

    /* renamed from: b */
    public static final InterfaceC4427n f5640b = new C4428o();

    /* renamed from: a */
    public static InterfaceC4427n m66592a() {
        return f5639a;
    }

    /* renamed from: b */
    public static InterfaceC4427n m66591b() {
        return f5640b;
    }

    /* renamed from: c */
    public static InterfaceC4427n m66590c() {
        try {
            return (InterfaceC4427n) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}