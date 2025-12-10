package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\f\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005R+\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\u0005R+\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00118@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, m28850d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "S", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/MutableState;", "getCurrentState", "()Ljava/lang/Object;", "setCurrentState$animation_core_release", "currentState", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTargetState", "setTargetState", "targetState", "", OperatorName.CURVE_TO, "isRunning$animation_core_release", "()Z", "setRunning$animation_core_release", "(Z)V", "isRunning", "isIdle", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1156:1\n81#2:1157\n107#2,2:1158\n81#2:1160\n107#2,2:1161\n81#2:1163\n107#2,2:1164\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n*L\n104#1:1157\n104#1:1158,2\n116#1:1160\n116#1:1161,2\n128#1:1163\n128#1:1164,2\n*E\n"})
/* loaded from: classes.dex */
public final class MutableTransitionState<S> {
    public static final int $stable = 0;

    /* renamed from: a */
    public final MutableState f12557a;

    /* renamed from: b */
    public final MutableState f12558b;

    /* renamed from: c */
    public final MutableState f12559c;

    public MutableTransitionState(S s) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        m31891g = AbstractC19508dK1.m31891g(s, null, 2, null);
        this.f12557a = m31891g;
        m31891g2 = AbstractC19508dK1.m31891g(s, null, 2, null);
        this.f12558b = m31891g2;
        m31891g3 = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f12559c = m31891g3;
    }

    public final S getCurrentState() {
        return (S) this.f12557a.getValue();
    }

    public final S getTargetState() {
        return (S) this.f12558b.getValue();
    }

    public final boolean isIdle() {
        if (Intrinsics.areEqual(getCurrentState(), getTargetState()) && !isRunning$animation_core_release()) {
            return true;
        }
        return false;
    }

    public final boolean isRunning$animation_core_release() {
        return ((Boolean) this.f12559c.getValue()).booleanValue();
    }

    public final void setCurrentState$animation_core_release(S s) {
        this.f12557a.setValue(s);
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.f12559c.setValue(Boolean.valueOf(z));
    }

    public final void setTargetState(S s) {
        this.f12558b.setValue(s);
    }
}
