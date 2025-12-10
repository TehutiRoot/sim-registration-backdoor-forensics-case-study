package androidx.compose.p003ui.tooling.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\f\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00008V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005¨\u0006\r"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/ToolingState;", "T", "Landroidx/compose/runtime/State;", "default", "<init>", "(Ljava/lang/Object;)V", "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue", "value", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nToolingState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolingState.kt\nandroidx/compose/ui/tooling/animation/ToolingState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,39:1\n81#2:40\n107#2,2:41\n*S KotlinDebug\n*F\n+ 1 ToolingState.kt\nandroidx/compose/ui/tooling/animation/ToolingState\n*L\n38#1:40\n38#1:41,2\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.animation.ToolingState */
/* loaded from: classes2.dex */
public final class ToolingState<T> implements State<T> {
    public static final int $stable = 0;

    /* renamed from: a */
    public final MutableState f31679a;

    public ToolingState(T t) {
        MutableState m31891g;
        m31891g = AbstractC19508dK1.m31891g(t, null, 2, null);
        this.f31679a = m31891g;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return this.f31679a.getValue();
    }

    public void setValue(T t) {
        this.f31679a.setValue(t);
    }
}
