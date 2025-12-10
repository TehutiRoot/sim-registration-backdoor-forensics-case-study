package p000;

import com.google.protobuf.AbstractC8943g;
import com.google.protobuf.C8944h;

/* renamed from: WT */
/* loaded from: classes4.dex */
public abstract class AbstractC1612WT {

    /* renamed from: a */
    public static final AbstractC8943g f7222a = new C8944h();

    /* renamed from: b */
    public static final AbstractC8943g f7223b = m65622c();

    /* renamed from: a */
    public static AbstractC8943g m65624a() {
        AbstractC8943g abstractC8943g = f7223b;
        if (abstractC8943g != null) {
            return abstractC8943g;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC8943g m65623b() {
        return f7222a;
    }

    /* renamed from: c */
    public static AbstractC8943g m65622c() {
        try {
            return (AbstractC8943g) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
