package p000;

import android.graphics.Rect;
import android.view.View;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Tl1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18553Tl1 extends C18618Ul1 {
    @Override // p000.C18618Ul1, androidx.compose.p003ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(View composeView, int i, int i2) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        composeView.setSystemGestureExclusionRects(CollectionsKt__CollectionsKt.mutableListOf(new Rect(0, 0, i, i2)));
    }
}