package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ExtensionRegistryLite {

    /* renamed from: b */
    public static volatile boolean f34753b = false;

    /* renamed from: c */
    public static boolean f34754c = true;

    /* renamed from: e */
    public static volatile ExtensionRegistryLite f34756e;

    /* renamed from: a */
    public final Map f34758a;

    /* renamed from: d */
    public static final Class f34755d = m55916a();

    /* renamed from: f */
    public static final ExtensionRegistryLite f34757f = new ExtensionRegistryLite(true);

    /* renamed from: androidx.datastore.preferences.protobuf.ExtensionRegistryLite$a */
    /* loaded from: classes2.dex */
    public static final class C4360a {

        /* renamed from: a */
        public final Object f34759a;

        /* renamed from: b */
        public final int f34760b;

        public C4360a(Object obj, int i) {
            this.f34759a = obj;
            this.f34760b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4360a)) {
                return false;
            }
            C4360a c4360a = (C4360a) obj;
            if (this.f34759a != c4360a.f34759a || this.f34760b != c4360a.f34760b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f34759a) * 65535) + this.f34760b;
        }
    }

    public ExtensionRegistryLite() {
        this.f34758a = new HashMap();
    }

    /* renamed from: a */
    public static Class m55916a() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        ExtensionRegistryLite extensionRegistryLite = f34756e;
        if (extensionRegistryLite == null) {
            synchronized (ExtensionRegistryLite.class) {
                try {
                    extensionRegistryLite = f34756e;
                    if (extensionRegistryLite == null) {
                        if (f34754c) {
                            extensionRegistryLite = AbstractC1537VT.m65848b();
                        } else {
                            extensionRegistryLite = f34757f;
                        }
                        f34756e = extensionRegistryLite;
                    }
                } finally {
                }
            }
        }
        return extensionRegistryLite;
    }

    public static boolean isEagerlyParseMessageSets() {
        return f34753b;
    }

    public static ExtensionRegistryLite newInstance() {
        if (f34754c) {
            return AbstractC1537VT.m65849a();
        }
        return new ExtensionRegistryLite();
    }

    public static void setEagerlyParseMessageSets(boolean z) {
        f34753b = z;
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.f34758a.put(new C4360a(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.GeneratedExtension) this.f34758a.get(new C4360a(containingtype, i));
    }

    public ExtensionRegistryLite getUnmodifiable() {
        return new ExtensionRegistryLite(this);
    }

    public ExtensionRegistryLite(ExtensionRegistryLite extensionRegistryLite) {
        if (extensionRegistryLite == f34757f) {
            this.f34758a = Collections.emptyMap();
        } else {
            this.f34758a = Collections.unmodifiableMap(extensionRegistryLite.f34758a);
        }
    }

    public final void add(ExtensionLite<?, ?> extensionLite) {
        if (GeneratedMessageLite.GeneratedExtension.class.isAssignableFrom(extensionLite.getClass())) {
            add((GeneratedMessageLite.GeneratedExtension) extensionLite);
        }
        if (f34754c && AbstractC1537VT.m65846d(this)) {
            try {
                getClass().getMethod(ProductAction.ACTION_ADD, f34755d).invoke(this, extensionLite);
            } catch (Exception e) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extensionLite), e);
            }
        }
    }

    public ExtensionRegistryLite(boolean z) {
        this.f34758a = Collections.emptyMap();
    }
}
