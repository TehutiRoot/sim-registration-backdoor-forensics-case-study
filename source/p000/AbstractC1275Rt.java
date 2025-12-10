package p000;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.p003ui.Modifier;

/* renamed from: Rt */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1275Rt {
    /* renamed from: a */
    public static /* synthetic */ Modifier m66407a(ColumnScope columnScope, Modifier modifier, float f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return columnScope.weight(modifier, f, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
    }
}
