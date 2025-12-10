package p000;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Rx1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18449Rx1 {

    /* renamed from: a */
    public static final C18449Rx1 f5687a = new C18449Rx1();

    @DoNotInline
    /* renamed from: a */
    public final int m66577a(@NotNull RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    @DoNotInline
    /* renamed from: b */
    public final int m66576b(@NotNull RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    @DoNotInline
    /* renamed from: c */
    public final void m66575c(@NotNull RenderNode renderNode, int i) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i);
    }

    @DoNotInline
    /* renamed from: d */
    public final void m66574d(@NotNull RenderNode renderNode, int i) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i);
    }
}