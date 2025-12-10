package p000;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.graphics.DegreesKt;
import androidx.compose.p003ui.graphics.Path;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Oi1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC18219Oi1 {
    static {
        Path.Companion companion = Path.Companion;
    }

    /* renamed from: a */
    public static void m67094a(Path path, Rect rect, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        path.arcTo(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z);
    }

    /* renamed from: b */
    public static void m67093b(Path path) {
        path.reset();
    }

    /* renamed from: c */
    public static void m67092c(Path path, float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
    }

    /* renamed from: g */
    public static /* synthetic */ void m67088g(Path path, Path path2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m71702getZeroF1C5BW0();
            }
            path.mo71818addPathUv8p0NA(path2, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
    }
}