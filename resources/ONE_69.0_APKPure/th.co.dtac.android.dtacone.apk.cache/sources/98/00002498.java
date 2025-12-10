package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ScrollDraggableState implements DraggableState, DragScope {

    /* renamed from: a */
    public final State f13091a;

    /* renamed from: b */
    public ScrollScope f13092b;

    public ScrollDraggableState(State scrollLogic) {
        ScrollScope scrollScope;
        Intrinsics.checkNotNullParameter(scrollLogic, "scrollLogic");
        this.f13091a = scrollLogic;
        scrollScope = ScrollableKt.f13094b;
        this.f13092b = scrollScope;
    }

    /* renamed from: a */
    public final void m61432a(ScrollScope scrollScope) {
        Intrinsics.checkNotNullParameter(scrollScope, "<set-?>");
        this.f13092b = scrollScope;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f) {
        ScrollingLogic scrollingLogic = (ScrollingLogic) this.f13091a.getValue();
        scrollingLogic.m61421h(scrollingLogic.m61412q(f));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object scroll = ((ScrollingLogic) this.f13091a.getValue()).m61424e().scroll(mutatePriority, new ScrollDraggableState$drag$2(this, function2, null), continuation);
        if (scroll == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return scroll;
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragScope
    public void dragBy(float f) {
        ScrollingLogic scrollingLogic = (ScrollingLogic) this.f13091a.getValue();
        scrollingLogic.m61428a(this.f13092b, scrollingLogic.m61412q(f), NestedScrollSource.Companion.m72812getDragWNlRxjI());
    }
}