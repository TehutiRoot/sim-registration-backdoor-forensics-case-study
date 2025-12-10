package p000;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: iV1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC20392iV1 {
    /* renamed from: a */
    public static boolean m30637a(Transition.Segment segment, Object obj, Object obj2) {
        if (Intrinsics.areEqual(obj, segment.getInitialState()) && Intrinsics.areEqual(obj2, segment.getTargetState())) {
            return true;
        }
        return false;
    }
}
