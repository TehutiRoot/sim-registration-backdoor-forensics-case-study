package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public abstract class DescriptorKindExclude {

    /* loaded from: classes6.dex */
    public static final class NonExtensions extends DescriptorKindExclude {
        @NotNull
        public static final NonExtensions INSTANCE = new NonExtensions();

        /* renamed from: a */
        public static final int f69933a;

        static {
            DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
            f69933a = (~(companion.getVARIABLES_MASK() | companion.getFUNCTIONS_MASK())) & companion.getALL_KINDS_MASK();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int getFullyExcludedDescriptorKinds() {
            return f69933a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class TopLevelPackages extends DescriptorKindExclude {
        @NotNull
        public static final TopLevelPackages INSTANCE = new TopLevelPackages();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int getFullyExcludedDescriptorKinds() {
            return 0;
        }
    }

    public abstract int getFullyExcludedDescriptorKinds();

    public String toString() {
        return getClass().getSimpleName();
    }
}
