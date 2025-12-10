package p000;

import androidx.datastore.preferences.protobuf.AbstractC4417h;
import androidx.datastore.preferences.protobuf.C4418i;

/* renamed from: bU */
/* loaded from: classes2.dex */
public abstract class AbstractC5356bU {

    /* renamed from: a */
    public static final AbstractC4417h f39109a = new C4418i();

    /* renamed from: b */
    public static final AbstractC4417h f39110b = m51931c();

    /* renamed from: a */
    public static AbstractC4417h m51933a() {
        AbstractC4417h abstractC4417h = f39110b;
        if (abstractC4417h != null) {
            return abstractC4417h;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC4417h m51932b() {
        return f39109a;
    }

    /* renamed from: c */
    public static AbstractC4417h m51931c() {
        try {
            return (AbstractC4417h) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}