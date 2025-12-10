package p000;

import android.graphics.Rect;
import android.view.View;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Wk1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18700Wk1 extends C18764Xk1 {
    @Override // p000.C18764Xk1, androidx.compose.p003ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(View composeView, int i, int i2) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        composeView.setSystemGestureExclusionRects(CollectionsKt__CollectionsKt.mutableListOf(new Rect(0, 0, i, i2)));
    }
}
