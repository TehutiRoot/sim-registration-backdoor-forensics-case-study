package p000;

import android.view.View;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: L22 */
/* loaded from: classes2.dex */
public final class L22 {

    /* renamed from: a */
    public static final L22 f3367a = new L22();

    @DoNotInline
    /* renamed from: a */
    public final void m67567a(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOutlineAmbientShadowColor(i);
    }

    @DoNotInline
    /* renamed from: b */
    public final void m67566b(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOutlineSpotShadowColor(i);
    }
}
