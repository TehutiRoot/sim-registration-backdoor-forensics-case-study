package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class ApproximationBounds<T> {

    /* renamed from: a */
    public final Object f70384a;

    /* renamed from: b */
    public final Object f70385b;

    public ApproximationBounds(T t, T t2) {
        this.f70384a = t;
        this.f70385b = t2;
    }

    public final T component1() {
        return (T) this.f70384a;
    }

    public final T component2() {
        return (T) this.f70385b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApproximationBounds) {
            ApproximationBounds approximationBounds = (ApproximationBounds) obj;
            return Intrinsics.areEqual(this.f70384a, approximationBounds.f70384a) && Intrinsics.areEqual(this.f70385b, approximationBounds.f70385b);
        }
        return false;
    }

    public final T getLower() {
        return (T) this.f70384a;
    }

    public final T getUpper() {
        return (T) this.f70385b;
    }

    public int hashCode() {
        Object obj = this.f70384a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f70385b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ApproximationBounds(lower=" + this.f70384a + ", upper=" + this.f70385b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}