package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class ApproximationBounds<T> {

    /* renamed from: a */
    public final Object f70350a;

    /* renamed from: b */
    public final Object f70351b;

    public ApproximationBounds(T t, T t2) {
        this.f70350a = t;
        this.f70351b = t2;
    }

    public final T component1() {
        return (T) this.f70350a;
    }

    public final T component2() {
        return (T) this.f70351b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApproximationBounds) {
            ApproximationBounds approximationBounds = (ApproximationBounds) obj;
            return Intrinsics.areEqual(this.f70350a, approximationBounds.f70350a) && Intrinsics.areEqual(this.f70351b, approximationBounds.f70351b);
        }
        return false;
    }

    public final T getLower() {
        return (T) this.f70350a;
    }

    public final T getUpper() {
        return (T) this.f70351b;
    }

    public int hashCode() {
        Object obj = this.f70350a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f70351b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ApproximationBounds(lower=" + this.f70350a + ", upper=" + this.f70351b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
