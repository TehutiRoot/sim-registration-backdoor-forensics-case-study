package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006R+\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m28850d2 = {"Landroidx/compose/material3/PlainTooltipState;", "Landroidx/compose/material3/TooltipState;", "<init>", "()V", "", "show", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "", "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/MutableState;", "isVisible", "()Z", "setVisible$material3_release", "(Z)V", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/PlainTooltipState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,770:1\n76#2:771\n102#2,2:772\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/PlainTooltipState\n*L\n493#1:771\n493#1:772,2\n*E\n"})
/* loaded from: classes2.dex */
public final class PlainTooltipState implements TooltipState {
    public static final int $stable = 0;

    /* renamed from: a */
    public final MutableState f25950a;

    public PlainTooltipState() {
        MutableState m31891g;
        m31891g = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f25950a = m31891g;
    }

    @Override // androidx.compose.material3.TooltipState
    @Nullable
    public Object dismiss(@NotNull Continuation<? super Unit> continuation) {
        Object m60408a = TooltipSync.f26495a.m60408a(this, continuation);
        if (m60408a == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m60408a;
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.TooltipState
    public boolean isVisible() {
        return ((Boolean) this.f25950a.getValue()).booleanValue();
    }

    public void setVisible$material3_release(boolean z) {
        this.f25950a.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.material3.TooltipState
    @Nullable
    public Object show(@NotNull Continuation<? super Unit> continuation) {
        Object m60406c = TooltipSync.f26495a.m60406c(this, false, continuation);
        if (m60406c == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m60406c;
        }
        return Unit.INSTANCE;
    }
}
