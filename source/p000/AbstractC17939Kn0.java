package p000;

import com.google.protobuf.C8954n;
import com.google.protobuf.InterfaceC8953m;

/* renamed from: Kn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17939Kn0 {

    /* renamed from: a */
    public static final InterfaceC8953m f3275a = m67588c();

    /* renamed from: b */
    public static final InterfaceC8953m f3276b = new C8954n();

    /* renamed from: a */
    public static InterfaceC8953m m67590a() {
        return f3275a;
    }

    /* renamed from: b */
    public static InterfaceC8953m m67589b() {
        return f3276b;
    }

    /* renamed from: c */
    public static InterfaceC8953m m67588c() {
        try {
            return (InterfaceC8953m) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
