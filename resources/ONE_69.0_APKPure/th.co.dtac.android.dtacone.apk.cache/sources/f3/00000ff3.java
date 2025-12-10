package p000;

import com.google.protobuf.C8943n;
import com.google.protobuf.InterfaceC8942m;

/* renamed from: Qn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC18363Qn0 {

    /* renamed from: a */
    public static final InterfaceC8942m f5317a = m66728c();

    /* renamed from: b */
    public static final InterfaceC8942m f5318b = new C8943n();

    /* renamed from: a */
    public static InterfaceC8942m m66730a() {
        return f5317a;
    }

    /* renamed from: b */
    public static InterfaceC8942m m66729b() {
        return f5318b;
    }

    /* renamed from: c */
    public static InterfaceC8942m m66728c() {
        try {
            return (InterfaceC8942m) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}