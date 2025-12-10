package com.google.protobuf;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ExtensionRegistryLite {

    /* renamed from: b */
    public static volatile boolean f57293b = false;

    /* renamed from: c */
    public static boolean f57294c = true;

    /* renamed from: d */
    public static volatile ExtensionRegistryLite f57295d;

    /* renamed from: e */
    public static final ExtensionRegistryLite f57296e = new ExtensionRegistryLite(true);

    /* renamed from: a */
    public final Map f57297a;

    /* renamed from: com.google.protobuf.ExtensionRegistryLite$a */
    /* loaded from: classes4.dex */
    public static class C8870a {

        /* renamed from: a */
        public static final Class f57298a = m35980a();

        /* renamed from: a */
        public static Class m35980a() {
            try {
                return Class.forName("com.google.protobuf.Extension");
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    /* renamed from: com.google.protobuf.ExtensionRegistryLite$b */
    /* loaded from: classes4.dex */
    public static final class C8871b {

        /* renamed from: a */
        public final Object f57299a;

        /* renamed from: b */
        public final int f57300b;

        public C8871b(Object obj, int i) {
            this.f57299a = obj;
            this.f57300b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8871b)) {
                return false;
            }
            C8871b c8871b = (C8871b) obj;
            if (this.f57299a != c8871b.f57299a || this.f57300b != c8871b.f57300b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f57299a) * 65535) + this.f57300b;
        }
    }

    public ExtensionRegistryLite() {
        this.f57297a = new HashMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        ExtensionRegistryLite extensionRegistryLite = f57295d;
        if (extensionRegistryLite == null) {
            synchronized (ExtensionRegistryLite.class) {
                try {
                    extensionRegistryLite = f57295d;
                    if (extensionRegistryLite == null) {
                        if (f57294c) {
                            extensionRegistryLite = AbstractC1466UT.m66032b();
                        } else {
                            extensionRegistryLite = f57296e;
                        }
                        f57295d = extensionRegistryLite;
                    }
                } finally {
                }
            }
        }
        return extensionRegistryLite;
    }

    public static boolean isEagerlyParseMessageSets() {
        return f57293b;
    }

    public static ExtensionRegistryLite newInstance() {
        if (f57294c) {
            return AbstractC1466UT.m66033a();
        }
        return new ExtensionRegistryLite();
    }

    public static void setEagerlyParseMessageSets(boolean z) {
        f57293b = z;
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.f57297a.put(new C8871b(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.GeneratedExtension) this.f57297a.get(new C8871b(containingtype, i));
    }

    public ExtensionRegistryLite getUnmodifiable() {
        return new ExtensionRegistryLite(this);
    }

    public ExtensionRegistryLite(ExtensionRegistryLite extensionRegistryLite) {
        if (extensionRegistryLite == f57296e) {
            this.f57297a = Collections.emptyMap();
        } else {
            this.f57297a = Collections.unmodifiableMap(extensionRegistryLite.f57297a);
        }
    }

    public final void add(ExtensionLite<?, ?> extensionLite) {
        if (GeneratedMessageLite.GeneratedExtension.class.isAssignableFrom(extensionLite.getClass())) {
            add((GeneratedMessageLite.GeneratedExtension) extensionLite);
        }
        if (f57294c && AbstractC1466UT.m66030d(this)) {
            try {
                getClass().getMethod(ProductAction.ACTION_ADD, C8870a.f57298a).invoke(this, extensionLite);
            } catch (Exception e) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extensionLite), e);
            }
        }
    }

    public ExtensionRegistryLite(boolean z) {
        this.f57297a = Collections.emptyMap();
    }
}
