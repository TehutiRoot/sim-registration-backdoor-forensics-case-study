package p000;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Uw1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18598Uw1 {

    /* renamed from: a */
    public static final C18598Uw1 f6492a = new C18598Uw1();

    @DoNotInline
    /* renamed from: a */
    public final int m65958a(@NotNull RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    @DoNotInline
    /* renamed from: b */
    public final int m65957b(@NotNull RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    @DoNotInline
    /* renamed from: c */
    public final void m65956c(@NotNull RenderNode renderNode, int i) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i);
    }

    @DoNotInline
    /* renamed from: d */
    public final void m65955d(@NotNull RenderNode renderNode, int i) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i);
    }
}
