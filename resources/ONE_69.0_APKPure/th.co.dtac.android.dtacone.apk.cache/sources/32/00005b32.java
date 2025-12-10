package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\b\u0005*\u0002\u0000\u0011\b\n\u0018\u00002\u00020\u0001JD\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m29142d2 = {"androidx/compose/material3/SwipeableV2State$swipeDraggableState$1", "Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "(F)V", "androidx/compose/material3/SwipeableV2State$swipeDraggableState$1$dragScope$1", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/SwipeableV2State$swipeDraggableState$1$dragScope$1;", "dragScope", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SwipeableV2State$swipeDraggableState$1 implements DraggableState {

    /* renamed from: a */
    public final SwipeableV2State$swipeDraggableState$1$dragScope$1 f26351a;

    /* renamed from: b */
    public final /* synthetic */ SwipeableV2State f26352b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.SwipeableV2State$swipeDraggableState$1$dragScope$1] */
    public SwipeableV2State$swipeDraggableState$1(final SwipeableV2State swipeableV2State) {
        this.f26352b = swipeableV2State;
        this.f26351a = new DragScope() { // from class: androidx.compose.material3.SwipeableV2State$swipeDraggableState$1$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f) {
                SwipeableV2State.this.dispatchRawDelta(f);
            }
        };
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f) {
        this.f26352b.dispatchRawDelta(f);
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    @Nullable
    public Object drag(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object m60435i;
        m60435i = this.f26352b.m60435i(mutatePriority, new SwipeableV2State$swipeDraggableState$1$drag$2(function2, this, null), continuation);
        if (m60435i == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return m60435i;
        }
        return Unit.INSTANCE;
    }
}