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
    public final MutableInteractionSource f26059a;

    /* renamed from: b */
    public final MutableInteractionSource f26060b;

    /* renamed from: c */
    public final State f26061c;

    /* renamed from: d */
    public final State f26062d;

    /* renamed from: e */
    public final State f26063e;

    public RangeSliderLogic(MutableInteractionSource startInteractionSource, MutableInteractionSource endInteractionSource, State rawOffsetStart, State rawOffsetEnd, State onDrag) {
        Intrinsics.checkNotNullParameter(startInteractionSource, "startInteractionSource");
        Intrinsics.checkNotNullParameter(endInteractionSource, "endInteractionSource");
        Intrinsics.checkNotNullParameter(rawOffsetStart, "rawOffsetStart");
        Intrinsics.checkNotNullParameter(rawOffsetEnd, "rawOffsetEnd");
        Intrinsics.checkNotNullParameter(onDrag, "onDrag");
        this.f26059a = startInteractionSource;
        this.f26060b = endInteractionSource;
        this.f26061c = rawOffsetStart;
        this.f26062d = rawOffsetEnd;
        this.f26063e = onDrag;
    }

    /* renamed from: a */
    public final MutableInteractionSource m60531a(boolean z) {
        if (z) {
            return this.f26059a;
        }
        return this.f26060b;
    }

    /* renamed from: b */
    public final void m60530b(boolean z, float f, Interaction interaction, CoroutineScope scope) {
        State state;
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Function2 function2 = (Function2) this.f26063e.getValue();
        Boolean valueOf = Boolean.valueOf(z);
        if (z) {
            state = this.f26061c;
        } else {
            state = this.f26062d;
        }
        function2.invoke(valueOf, Float.valueOf(f - ((Number) state.getValue()).floatValue()));
        AbstractC1539Vc.m65885e(scope, null, null, new RangeSliderLogic$captureThumb$1(this, z, interaction, null), 3, null);
    }

    /* renamed from: c */
    public final int m60529c(float f) {
        return Float.compare(Math.abs(((Number) this.f26061c.getValue()).floatValue() - f), Math.abs(((Number) this.f26062d.getValue()).floatValue() - f));
    }
}