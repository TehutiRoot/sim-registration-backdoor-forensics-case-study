package androidx.compose.material;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class RangeSliderLogic {

    /* renamed from: a */
    public final MutableInteractionSource f14570a;

    /* renamed from: b */
    public final MutableInteractionSource f14571b;

    /* renamed from: c */
    public final State f14572c;

    /* renamed from: d */
    public final State f14573d;

    /* renamed from: e */
    public final State f14574e;

    public RangeSliderLogic(MutableInteractionSource startInteractionSource, MutableInteractionSource endInteractionSource, State rawOffsetStart, State rawOffsetEnd, State onDrag) {
        Intrinsics.checkNotNullParameter(startInteractionSource, "startInteractionSource");
        Intrinsics.checkNotNullParameter(endInteractionSource, "endInteractionSource");
        Intrinsics.checkNotNullParameter(rawOffsetStart, "rawOffsetStart");
        Intrinsics.checkNotNullParameter(rawOffsetEnd, "rawOffsetEnd");
        Intrinsics.checkNotNullParameter(onDrag, "onDrag");
        this.f14570a = startInteractionSource;
        this.f14571b = endInteractionSource;
        this.f14572c = rawOffsetStart;
        this.f14573d = rawOffsetEnd;
        this.f14574e = onDrag;
    }

    /* renamed from: a */
    public final MutableInteractionSource m60842a(boolean z) {
        if (z) {
            return this.f14570a;
        }
        return this.f14571b;
    }

    /* renamed from: b */
    public final void m60841b(boolean z, float f, Interaction interaction, CoroutineScope scope) {
        State state;
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Function2 function2 = (Function2) this.f14574e.getValue();
        Boolean valueOf = Boolean.valueOf(z);
        if (z) {
            state = this.f14572c;
        } else {
            state = this.f14573d;
        }
        function2.invoke(valueOf, Float.valueOf(f - ((Number) state.getValue()).floatValue()));
        AbstractC1552Vc.m65753e(scope, null, null, new RangeSliderLogic$captureThumb$1(this, z, interaction, null), 3, null);
    }

    /* renamed from: c */
    public final int m60840c(float f) {
        return Float.compare(Math.abs(((Number) this.f14572c.getValue()).floatValue() - f), Math.abs(((Number) this.f14573d.getValue()).floatValue() - f));
    }
}
