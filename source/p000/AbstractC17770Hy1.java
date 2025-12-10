package p000;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.p003ui.Modifier;

/* renamed from: Hy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC17770Hy1 {
    /* renamed from: a */
    public static /* synthetic */ Modifier m68013a(RowScope rowScope, Modifier modifier, float f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return rowScope.weight(modifier, f, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
    }
}
