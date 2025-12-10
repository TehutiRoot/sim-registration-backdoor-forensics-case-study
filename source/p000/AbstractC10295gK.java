package p000;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* renamed from: gK */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC10295gK {
    /* renamed from: a */
    public static /* synthetic */ Object m31148a(DraggableState draggableState, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return draggableState.drag(mutatePriority, function2, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
    }
}
