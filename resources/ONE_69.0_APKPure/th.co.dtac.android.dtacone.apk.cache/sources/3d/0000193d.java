package p000;

import com.google.protobuf.AbstractC8932g;
import com.google.protobuf.C8933h;

/* renamed from: aU */
/* loaded from: classes4.dex */
public abstract class AbstractC1879aU {

    /* renamed from: a */
    public static final AbstractC8932g f8436a = new C8933h();

    /* renamed from: b */
    public static final AbstractC8932g f8437b = m65120c();

    /* renamed from: a */
    public static AbstractC8932g m65122a() {
        AbstractC8932g abstractC8932g = f8437b;
        if (abstractC8932g != null) {
            return abstractC8932g;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC8932g m65121b() {
        return f8436a;
    }

    /* renamed from: c */
    public static AbstractC8932g m65120c() {
        try {
            return (AbstractC8932g) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}