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
    public Function0 f12925v;

    /* renamed from: w */
    public Function0 f12926w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickablePointerInputNode(boolean z, MutableInteractionSource interactionSource, Function0 onClick, AbstractClickableNode.InteractionData interactionData, Function0 function0, Function0 function02) {
        super(z, interactionSource, onClick, interactionData, null);
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        this.f12925v = function0;
        this.f12926w = function02;
    }

    @Override // androidx.compose.foundation.AbstractClickablePointerInputNode
    /* renamed from: g */
    public Object mo61545g(PointerInputScope pointerInputScope, Continuation continuation) {
        CombinedClickablePointerInputNode$pointerInput$2 combinedClickablePointerInputNode$pointerInput$2;
        CombinedClickablePointerInputNode$pointerInput$3 combinedClickablePointerInputNode$pointerInput$3;
        AbstractClickableNode.InteractionData m61588d = m61588d();
        long m74008getCenterozmzZPI = IntSizeKt.m74008getCenterozmzZPI(pointerInputScope.mo72919getSizeYbymL2g());
        m61588d.m69498setCentreOffsetk4lQ0M(OffsetKt.Offset(IntOffset.m73960getXimpl(m74008getCenterozmzZPI), IntOffset.m73961getYimpl(m74008getCenterozmzZPI)));
        if (m61589c() && this.f12926w != null) {
            combinedClickablePointerInputNode$pointerInput$2 = new CombinedClickablePointerInputNode$pointerInput$2(this);
        } else {
            combinedClickablePointerInputNode$pointerInput$2 = null;
        }
        if (m61589c() && this.f12925v != null) {
            combinedClickablePointerInputNode$pointerInput$3 = new CombinedClickablePointerInputNode$pointerInput$3(this);
        } else {
            combinedClickablePointerInputNode$pointerInput$3 = null;
        }
        Object detectTapGestures = TapGestureDetectorKt.detectTapGestures(pointerInputScope, combinedClickablePointerInputNode$pointerInput$2, combinedClickablePointerInputNode$pointerInput$3, new CombinedClickablePointerInputNode$pointerInput$4(this, null), new CombinedClickablePointerInputNode$pointerInput$5(this), continuation);
        if (detectTapGestures == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return detectTapGestures;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public final void m61542m(boolean z, MutableInteractionSource interactionSource, Function0 onClick, Function0 function0, Function0 function02) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        m61583j(onClick);
        m61584i(interactionSource);
        boolean z6 = true;
        boolean z7 = false;
        if (m61589c() != z) {
            m61585h(z);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f12925v == null) {
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
        this.f12925v = function0;
        if (this.f12926w == null) {
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
        this.f12926w = function02;
        if (z6) {
            resetPointerInputHandler();
        }
    }
}