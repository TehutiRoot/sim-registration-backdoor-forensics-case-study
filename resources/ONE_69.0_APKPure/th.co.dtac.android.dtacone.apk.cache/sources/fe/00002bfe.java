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
    public final MutableInteractionSource f14658a;

    /* renamed from: b */
    public final MutableInteractionSource f14659b;

    /* renamed from: c */
    public final State f14660c;

    /* renamed from: d */
    public final State f14661d;

    /* renamed from: e */
    public final State f14662e;

    public RangeSliderLogic(MutableInteractionSource startInteractionSource, MutableInteractionSource endInteractionSource, State rawOffsetStart, State rawOffsetEnd, State onDrag) {
        Intrinsics.checkNotNullParameter(startInteractionSource, "startInteractionSource");
        Intrinsics.checkNotNullParameter(endInteractionSource, "endInteractionSource");
        Intrinsics.checkNotNullParameter(rawOffsetStart, "rawOffsetStart");
        Intrinsics.checkNotNullParameter(rawOffsetEnd, "rawOffsetEnd");
        Intrinsics.checkNotNullParameter(onDrag, "onDrag");
        this.f14658a = startInteractionSource;
        this.f14659b = endInteractionSource;
        this.f14660c = rawOffsetStart;
        this.f14661d = rawOffsetEnd;
        this.f14662e = onDrag;
    }

    /* renamed from: a */
    public final MutableInteractionSource m60792a(boolean z) {
        if (z) {
            return this.f14658a;
        }
        return this.f14659b;
    }

    /* renamed from: b */
    public final void m60791b(boolean z, float f, Interaction interaction, CoroutineScope scope) {
        State state;
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Function2 function2 = (Function2) this.f14662e.getValue();
        Boolean valueOf = Boolean.valueOf(z);
        if (z) {
            state = this.f14660c;
        } else {
            state = this.f14661d;
        }
        function2.invoke(valueOf, Float.valueOf(f - ((Number) state.getValue()).floatValue()));
        AbstractC1539Vc.m65885e(scope, null, null, new RangeSliderLogic$captureThumb$1(this, z, interaction, null), 3, null);
    }

    /* renamed from: c */
    public final int m60790c(float f) {
        return Float.compare(Math.abs(((Number) this.f14660c.getValue()).floatValue() - f), Math.abs(((Number) this.f14661d.getValue()).floatValue() - f));
    }
}