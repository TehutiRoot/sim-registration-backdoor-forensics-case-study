package p000;

import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathMeasure;

/* renamed from: Ti1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC18544Ti1 {
    /* renamed from: a */
    public static /* synthetic */ boolean m66320a(PathMeasure pathMeasure, float f, float f2, Path path, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                z = true;
            }
            return pathMeasure.getSegment(f, f2, path, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
    }
}