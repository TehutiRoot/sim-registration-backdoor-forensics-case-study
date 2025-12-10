package p000;

import androidx.compose.p003ui.CombinedModifier;
import androidx.compose.p003ui.Modifier;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ft0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC19942ft0 {
    static {
        Modifier.Companion companion = Modifier.Companion;
    }

    /* renamed from: a */
    public static Modifier m31254a(Modifier modifier, Modifier other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other != Modifier.Companion) {
            return new CombinedModifier(modifier, other);
        }
        return modifier;
    }

    /* renamed from: b */
    public static /* synthetic */ Modifier m31253b(Modifier modifier, Modifier modifier2) {
        return m31254a(modifier, modifier2);
    }
}
