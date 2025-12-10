package p000;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* renamed from: mW1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC21082mW1 {
    static {
        String str = TypedValues.MotionScene.NAME;
    }

    /* renamed from: a */
    public static int m26252a(String str) {
        str.hashCode();
        if (!str.equals(TypedValues.MotionScene.S_DEFAULT_DURATION)) {
            if (!str.equals(TypedValues.MotionScene.S_LAYOUT_DURING_TRANSITION)) {
                return -1;
            }
            return 601;
        }
        return 600;
    }

    /* renamed from: b */
    public static int m26251b(int i) {
        if (i != 600) {
            if (i != 601) {
                return -1;
            }
            return 1;
        }
        return 2;
    }
}
