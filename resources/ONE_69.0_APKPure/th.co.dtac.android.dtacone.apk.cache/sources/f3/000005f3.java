package p000;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* renamed from: GF1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class GF1 {
    /* renamed from: a */
    public static boolean m68304a(ScrollableState scrollableState) {
        return true;
    }

    /* renamed from: b */
    public static boolean m68303b(ScrollableState scrollableState) {
        return true;
    }

    /* renamed from: e */
    public static /* synthetic */ Object m68300e(ScrollableState scrollableState, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return scrollableState.scroll(mutatePriority, function2, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
    }
}