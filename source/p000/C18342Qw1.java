package p000;

import android.graphics.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.compose.p003ui.graphics.RenderEffect;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: Qw1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18342Qw1 {

    /* renamed from: a */
    public static final C18342Qw1 f5219a = new C18342Qw1();

    @DoNotInline
    /* renamed from: a */
    public final void m66514a(@NotNull RenderNode renderNode, @Nullable RenderEffect renderEffect) {
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
