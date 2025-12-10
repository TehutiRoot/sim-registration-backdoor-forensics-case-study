package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* loaded from: classes6.dex */
public class ExtensionRegistryLite {

    /* renamed from: b */
    public static final ExtensionRegistryLite f69718b = new ExtensionRegistryLite(true);

    /* renamed from: a */
    public final Map f69719a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite$a */
    /* loaded from: classes6.dex */
    public static final class C11902a {

        /* renamed from: a */
        public final Object f69720a;

        /* renamed from: b */
        public final int f69721b;

        public C11902a(Object obj, int i) {
            this.f69720a = obj;
            this.f69721b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C11902a)) {
                return false;
            }
            C11902a c11902a = (C11902a) obj;
            if (this.f69720a != c11902a.f69720a || this.f69721b != c11902a.f69721b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f69720a) * 65535) + this.f69721b;
        }
    }

    public ExtensionRegistryLite() {
        this.f69719a = new HashMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        return f69718b;
    }

    public static ExtensionRegistryLite newInstance() {
        return new ExtensionRegistryLite();
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.f69719a.put(new C11902a(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.GeneratedExtension) this.f69719a.get(new C11902a(containingtype, i));
    }

    public ExtensionRegistryLite(boolean z) {
        this.f69719a = Collections.emptyMap();
    }
}
