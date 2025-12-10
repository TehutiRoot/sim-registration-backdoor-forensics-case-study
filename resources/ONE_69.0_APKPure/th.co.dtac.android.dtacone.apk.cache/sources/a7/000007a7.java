package p000;

import android.view.View;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: I32 */
/* loaded from: classes2.dex */
public final class I32 {

    /* renamed from: a */
    public static final I32 f2564a = new I32();

    @DoNotInline
    /* renamed from: a */
    public final void m68073a(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOutlineAmbientShadowColor(i);
    }

    @DoNotInline
    /* renamed from: b */
    public final void m68072b(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOutlineSpotShadowColor(i);
    }
}