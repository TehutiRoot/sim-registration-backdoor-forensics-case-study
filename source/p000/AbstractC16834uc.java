package p000;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.p003ui.geometry.Rect;
import kotlin.coroutines.Continuation;

/* renamed from: uc */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC16834uc {
    /* renamed from: a */
    public static /* synthetic */ Object m1247a(BringIntoViewRequester bringIntoViewRequester, Rect rect, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                rect = null;
            }
            return bringIntoViewRequester.bringIntoView(rect, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
    }
}
