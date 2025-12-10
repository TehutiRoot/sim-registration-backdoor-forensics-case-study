package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class JavaTypeQualifiers {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    public static final JavaTypeQualifiers f69216e = new JavaTypeQualifiers(null, null, false, false, 8, null);

    /* renamed from: a */
    public final NullabilityQualifier f69217a;

    /* renamed from: b */
    public final MutabilityQualifier f69218b;

    /* renamed from: c */
    public final boolean f69219c;

    /* renamed from: d */
    public final boolean f69220d;

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JavaTypeQualifiers getNONE() {
            return JavaTypeQualifiers.f69216e;
        }

        public Companion() {
        }
    }

    public JavaTypeQualifiers(@Nullable NullabilityQualifier nullabilityQualifier, @Nullable MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        this.f69217a = nullabilityQualifier;
        this.f69218b = mutabilityQualifier;
        this.f69219c = z;
        this.f69220d = z2;
    }

    public final boolean getDefinitelyNotNull() {
        return this.f69219c;
    }

    @Nullable
    public final MutabilityQualifier getMutability() {
        return this.f69218b;
    }

    @Nullable
    public final NullabilityQualifier getNullability() {
        return this.f69217a;
    }

    public final boolean isNullabilityQualifierForWarning() {
        return this.f69220d;
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z, (i & 8) != 0 ? false : z2);
    }
}
