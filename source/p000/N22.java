package p000;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.compose.p003ui.graphics.RenderEffect;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: N22 */
/* loaded from: classes2.dex */
public final class N22 {

    /* renamed from: a */
    public static final N22 f3992a = new N22();

    @DoNotInline
    /* renamed from: a */
    public final void m67255a(@NotNull View view, @Nullable RenderEffect renderEffect) {
        android.graphics.RenderEffect renderEffect2;
        Intrinsics.checkNotNullParameter(view, "view");
        if (renderEffect != null) {
            renderEffect2 = renderEffect.asAndroidRenderEffect();
        } else {
            renderEffect2 = null;
        }
        view.setRenderEffect(renderEffect2);
    }
}
