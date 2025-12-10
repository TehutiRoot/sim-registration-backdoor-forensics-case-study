package p000;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Px1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18319Px1 {

    /* renamed from: a */
    public static final C18319Px1 f5075a = new C18319Px1();

    @DoNotInline
    /* renamed from: a */
    public final void m66864a(@NotNull RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.destroyDisplayListData();
    }
}