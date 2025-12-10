package androidx.compose.p003ui.tooling.animation.states;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, m29142d2 = {"Landroidx/compose/ui/tooling/animation/states/TargetState;", "T", "Landroidx/compose/ui/tooling/animation/states/ComposeAnimationState;", "initial", TypedValues.AttributesType.S_TARGET, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/ui/tooling/animation/states/TargetState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Object;", "getInitial", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTarget", "ui-tooling_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.tooling.animation.states.TargetState */
/* loaded from: classes2.dex */
public final class TargetState<T> implements ComposeAnimationState {

    /* renamed from: a */
    public final Object f31793a;

    /* renamed from: b */
    public final Object f31794b;

    public TargetState(T t, T t2) {
        this.f31793a = t;
        this.f31794b = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TargetState copy$default(TargetState targetState, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = targetState.f31793a;
        }
        if ((i & 2) != 0) {
            obj2 = targetState.f31794b;
        }
        return targetState.copy(obj, obj2);
    }

    public final T component1() {
        return (T) this.f31793a;
    }

    public final T component2() {
        return (T) this.f31794b;
    }

    @NotNull
    public final TargetState<T> copy(T t, T t2) {
        return new TargetState<>(t, t2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TargetState) {
            TargetState targetState = (TargetState) obj;
            return Intrinsics.areEqual(this.f31793a, targetState.f31793a) && Intrinsics.areEqual(this.f31794b, targetState.f31794b);
        }
        return false;
    }

    public final T getInitial() {
        return (T) this.f31793a;
    }

    public final T getTarget() {
        return (T) this.f31794b;
    }

    public int hashCode() {
        Object obj = this.f31793a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f31794b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TargetState(initial=" + this.f31793a + ", target=" + this.f31794b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}