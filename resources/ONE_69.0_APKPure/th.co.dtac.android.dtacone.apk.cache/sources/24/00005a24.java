package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006R+\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m29142d2 = {"Landroidx/compose/material3/RichTooltipState;", "Landroidx/compose/material3/TooltipState;", "<init>", "()V", "", "show", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "", "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/MutableState;", "isVisible", "()Z", "setVisible$material3_release", "(Z)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "isPersistent$material3_release", "setPersistent$material3_release", "isPersistent", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/RichTooltipState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,770:1\n76#2:771\n102#2,2:772\n76#2:774\n102#2,2:775\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/RichTooltipState\n*L\n449#1:771\n449#1:772,2\n459#1:774\n459#1:775,2\n*E\n"})
/* loaded from: classes2.dex */
public final class RichTooltipState implements TooltipState {
    public static final int $stable = 0;

    /* renamed from: a */
    public final MutableState f26071a;

    /* renamed from: b */
    public final MutableState f26072b;

    public RichTooltipState() {
        MutableState m65148g;
        MutableState m65148g2;
        Boolean bool = Boolean.FALSE;
        m65148g = AbstractC19036aL1.m65148g(bool, null, 2, null);
        this.f26071a = m65148g;
        m65148g2 = AbstractC19036aL1.m65148g(bool, null, 2, null);
        this.f26072b = m65148g2;
    }

    @Override // androidx.compose.material3.TooltipState
    @Nullable
    public Object dismiss(@NotNull Continuation<? super Unit> continuation) {
        Object m60358a = TooltipSync.f26583a.m60358a(this, continuation);
        if (m60358a == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return m60358a;
        }
        return Unit.INSTANCE;
    }

    public final boolean isPersistent$material3_release() {
        return ((Boolean) this.f26072b.getValue()).booleanValue();
    }

    @Override // androidx.compose.material3.TooltipState
    public boolean isVisible() {
        return ((Boolean) this.f26071a.getValue()).booleanValue();
    }

    public final void setPersistent$material3_release(boolean z) {
        this.f26072b.setValue(Boolean.valueOf(z));
    }

    public void setVisible$material3_release(boolean z) {
        this.f26071a.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.material3.TooltipState
    @Nullable
    public Object show(@NotNull Continuation<? super Unit> continuation) {
        Object m60356c = TooltipSync.f26583a.m60356c(this, isPersistent$material3_release(), continuation);
        if (m60356c == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return m60356c;
        }
        return Unit.INSTANCE;
    }
}