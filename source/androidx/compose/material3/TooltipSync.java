package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class TooltipSync {

    /* renamed from: a */
    public static final TooltipSync f26495a = new TooltipSync();

    /* renamed from: b */
    public static final MutatorMutex f26496b = new MutatorMutex();

    /* renamed from: c */
    public static TooltipState f26497c;

    /* renamed from: a */
    public final Object m60408a(TooltipState tooltipState, Continuation continuation) {
        if (Intrinsics.areEqual(tooltipState, f26497c)) {
            Object mutate = f26496b.mutate(MutatePriority.UserInput, new TooltipSync$dismissCurrentTooltip$2(null), continuation);
            if (mutate == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                return mutate;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final void m60407b(TooltipState tooltipState) {
        f26497c = tooltipState;
    }

    /* renamed from: c */
    public final Object m60406c(TooltipState tooltipState, boolean z, Continuation continuation) {
        Function0 tooltipSync$show$5;
        Function1 function1;
        if (tooltipState instanceof PlainTooltipState) {
            function1 = new TooltipSync$show$2(tooltipState, null);
            tooltipSync$show$5 = new TooltipSync$show$3(tooltipState);
        } else if (tooltipState instanceof RichTooltipState) {
            TooltipSync$show$4 tooltipSync$show$4 = new TooltipSync$show$4(z, tooltipState, null);
            tooltipSync$show$5 = new TooltipSync$show$5(tooltipState);
            function1 = tooltipSync$show$4;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Object mutate = f26496b.mutate(MutatePriority.Default, new TooltipSync$show$6(tooltipState, function1, tooltipSync$show$5, null), continuation);
        if (mutate == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return mutate;
        }
        return Unit.INSTANCE;
    }
}
