package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSizeKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ClickablePointerInputNode extends AbstractClickablePointerInputNode {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickablePointerInputNode(boolean z, MutableInteractionSource interactionSource, Function0 onClick, AbstractClickableNode.InteractionData interactionData) {
        super(z, interactionSource, onClick, interactionData, null);
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(interactionData, "interactionData");
    }

    @Override // androidx.compose.foundation.AbstractClickablePointerInputNode
    /* renamed from: g */
    public Object mo61595g(PointerInputScope pointerInputScope, Continuation continuation) {
        AbstractClickableNode.InteractionData m61638d = m61638d();
        long m73824getCenterozmzZPI = IntSizeKt.m73824getCenterozmzZPI(pointerInputScope.mo72735getSizeYbymL2g());
        m61638d.m69312setCentreOffsetk4lQ0M(OffsetKt.Offset(IntOffset.m73776getXimpl(m73824getCenterozmzZPI), IntOffset.m73777getYimpl(m73824getCenterozmzZPI)));
        Object detectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new ClickablePointerInputNode$pointerInput$2(this, null), new ClickablePointerInputNode$pointerInput$3(this), continuation);
        if (detectTapAndPress == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return detectTapAndPress;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public final void m61605k(boolean z, MutableInteractionSource interactionSource, Function0 onClick) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        m61635h(z);
        m61633j(onClick);
        m61634i(interactionSource);
    }
}
