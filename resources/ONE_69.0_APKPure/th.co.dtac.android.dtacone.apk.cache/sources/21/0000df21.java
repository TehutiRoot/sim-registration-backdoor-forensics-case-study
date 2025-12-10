package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class JavaTypeQualifiers {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    public static final JavaTypeQualifiers f69250e = new JavaTypeQualifiers(null, null, false, false, 8, null);

    /* renamed from: a */
    public final NullabilityQualifier f69251a;

    /* renamed from: b */
    public final MutabilityQualifier f69252b;

    /* renamed from: c */
    public final boolean f69253c;

    /* renamed from: d */
    public final boolean f69254d;

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JavaTypeQualifiers getNONE() {
            return JavaTypeQualifiers.f69250e;
        }

        public Companion() {
        }
    }

    public JavaTypeQualifiers(@Nullable NullabilityQualifier nullabilityQualifier, @Nullable MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        this.f69251a = nullabilityQualifier;
        this.f69252b = mutabilityQualifier;
        this.f69253c = z;
        this.f69254d = z2;
    }

    public final boolean getDefinitelyNotNull() {
        return this.f69253c;
    }

    @Nullable
    public final MutabilityQualifier getMutability() {
        return this.f69252b;
    }

    @Nullable
    public final NullabilityQualifier getNullability() {
        return this.f69251a;
    }

    public final boolean isNullabilityQualifierForWarning() {
        return this.f69254d;
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z, (i & 8) != 0 ? false : z2);
    }
}