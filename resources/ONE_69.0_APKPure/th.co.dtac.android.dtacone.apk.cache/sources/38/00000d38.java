package p000;

import android.graphics.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.compose.p003ui.graphics.RenderEffect;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: Nx1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18189Nx1 {

    /* renamed from: a */
    public static final C18189Nx1 f4311a = new C18189Nx1();

    @DoNotInline
    /* renamed from: a */
    public final void m67170a(@NotNull RenderNode renderNode, @Nullable RenderEffect renderEffect) {
        android.graphics.RenderEffect renderEffect2;
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        if (renderEffect != null) {
            renderEffect2 = renderEffect.asAndroidRenderEffect();
        } else {
            renderEffect2 = null;
        }
        renderNode.setRenderEffect(renderEffect2);
    }
}