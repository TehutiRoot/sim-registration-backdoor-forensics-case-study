package p000;

import androidx.datastore.preferences.protobuf.AbstractC4435h;
import androidx.datastore.preferences.protobuf.C4436i;

/* renamed from: XT */
/* loaded from: classes2.dex */
public abstract class AbstractC1682XT {

    /* renamed from: a */
    public static final AbstractC4435h f7493a = new C4436i();

    /* renamed from: b */
    public static final AbstractC4435h f7494b = m65493c();

    /* renamed from: a */
    public static AbstractC4435h m65495a() {
        AbstractC4435h abstractC4435h = f7494b;
        if (abstractC4435h != null) {
            return abstractC4435h;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC4435h m65494b() {
        return f7493a;
    }

    /* renamed from: c */
    public static AbstractC4435h m65493c() {
        try {
            return (AbstractC4435h) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
