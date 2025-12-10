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
public final class CombinedClickablePointerInputNode extends AbstractClickablePointerInputNode {

    /* renamed from: v */
    public Function0 f12837v;

    /* renamed from: w */
    public Function0 f12838w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickablePointerInputNode(boolean z, MutableInteractionSource interactionSource, Function0 onClick, AbstractClickableNode.InteractionData interactionData, Function0 function0, Function0 function02) {
        super(z, interactionSource, onClick, interactionData, null);
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        this.f12837v = function0;
        this.f12838w = function02;
    }

    @Override // androidx.compose.foundation.AbstractClickablePointerInputNode
    /* renamed from: g */
    public Object mo61595g(PointerInputScope pointerInputScope, Continuation continuation) {
        CombinedClickablePointerInputNode$pointerInput$2 combinedClickablePointerInputNode$pointerInput$2;
        CombinedClickablePointerInputNode$pointerInput$3 combinedClickablePointerInputNode$pointerInput$3;
        AbstractClickableNode.InteractionData m61638d = m61638d();
        long m73824getCenterozmzZPI = IntSizeKt.m73824getCenterozmzZPI(pointerInputScope.mo72735getSizeYbymL2g());
        m61638d.m69312setCentreOffsetk4lQ0M(OffsetKt.Offset(IntOffset.m73776getXimpl(m73824getCenterozmzZPI), IntOffset.m73777getYimpl(m73824getCenterozmzZPI)));
        if (m61639c() && this.f12838w != null) {
            combinedClickablePointerInputNode$pointerInput$2 = new CombinedClickablePointerInputNode$pointerInput$2(this);
        } else {
            combinedClickablePointerInputNode$pointerInput$2 = null;
        }
        if (m61639c() && this.f12837v != null) {
            combinedClickablePointerInputNode$pointerInput$3 = new CombinedClickablePointerInputNode$pointerInput$3(this);
        } else {
            combinedClickablePointerInputNode$pointerInput$3 = null;
        }
        Object detectTapGestures = TapGestureDetectorKt.detectTapGestures(pointerInputScope, combinedClickablePointerInputNode$pointerInput$2, combinedClickablePointerInputNode$pointerInput$3, new CombinedClickablePointerInputNode$pointerInput$4(this, null), new CombinedClickablePointerInputNode$pointerInput$5(this), continuation);
        if (detectTapGestures == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return detectTapGestures;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public final void m61592m(boolean z, MutableInteractionSource interactionSource, Function0 onClick, Function0 function0, Function0 function02) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        m61633j(onClick);
        m61634i(interactionSource);
        boolean z6 = true;
        boolean z7 = false;
        if (m61639c() != z) {
            m61635h(z);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f12837v == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (function0 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            z2 = true;
        }
        this.f12837v = function0;
        if (this.f12838w == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (function02 == null) {
            z7 = true;
        }
        if (z5 == z7) {
            z6 = z2;
        }
        this.f12838w = function02;
        if (z6) {
            resetPointerInputHandler();
        }
    }
}
