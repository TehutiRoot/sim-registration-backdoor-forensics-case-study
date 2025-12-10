package p000;

import androidx.datastore.preferences.protobuf.C4446o;
import androidx.datastore.preferences.protobuf.InterfaceC4445n;

/* renamed from: Ln0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC18003Ln0 {

    /* renamed from: a */
    public static final InterfaceC4445n f3593a = m67459c();

    /* renamed from: b */
    public static final InterfaceC4445n f3594b = new C4446o();

    /* renamed from: a */
    public static InterfaceC4445n m67461a() {
        return f3593a;
    }

    /* renamed from: b */
    public static InterfaceC4445n m67460b() {
        return f3594b;
    }

    /* renamed from: c */
    public static InterfaceC4445n m67459c() {
        try {
            return (InterfaceC4445n) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
