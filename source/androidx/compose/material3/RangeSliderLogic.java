package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class RangeSliderLogic {

    /* renamed from: a */
    public final MutableInteractionSource f25971a;

    /* renamed from: b */
    public final MutableInteractionSource f25972b;

    /* renamed from: c */
    public final State f25973c;

    /* renamed from: d */
    public final State f25974d;

    /* renamed from: e */
    public final State f25975e;

    public RangeSliderLogic(MutableInteractionSource startInteractionSource, MutableInteractionSource endInteractionSource, State rawOffsetStart, State rawOffsetEnd, State onDrag) {
        Intrinsics.checkNotNullParameter(startInteractionSource, "startInteractionSource");
        Intrinsics.checkNotNullParameter(endInteractionSource, "endInteractionSource");
        Intrinsics.checkNotNullParameter(rawOffsetStart, "rawOffsetStart");
        Intrinsics.checkNotNullParameter(rawOffsetEnd, "rawOffsetEnd");
        Intrinsics.checkNotNullParameter(onDrag, "onDrag");
        this.f25971a = startInteractionSource;
        this.f25972b = endInteractionSource;
        this.f25973c = rawOffsetStart;
        this.f25974d = rawOffsetEnd;
        this.f25975e = onDrag;
    }

    /* renamed from: a */
    public final MutableInteractionSource m60581a(boolean z) {
        if (z) {
            return this.f25971a;
        }
        return this.f25972b;
    }

    /* renamed from: b */
    public final void m60580b(boolean z, float f, Interaction interaction, CoroutineScope scope) {
        State state;
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Function2 function2 = (Function2) this.f25975e.getValue();
        Boolean valueOf = Boolean.valueOf(z);
        if (z) {
            state = this.f25973c;
        } else {
            state = this.f25974d;
        }
        function2.invoke(valueOf, Float.valueOf(f - ((Number) state.getValue()).floatValue()));
        AbstractC1552Vc.m65753e(scope, null, null, new RangeSliderLogic$captureThumb$1(this, z, interaction, null), 3, null);
    }

    /* renamed from: c */
    public final int m60579c(float f) {
        return Float.compare(Math.abs(((Number) this.f25973c.getValue()).floatValue() - f), Math.abs(((Number) this.f25974d.getValue()).floatValue() - f));
    }
}
