package p000;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: X3 */
/* loaded from: classes2.dex */
public final class C1642X3 {

    /* renamed from: a */
    public static final C1642X3 f7458a = new C1642X3();

    @DoNotInline
    @RequiresApi(26)
    /* renamed from: a */
    public final void m65637a(@NotNull View view, int i, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFocusable(i);
        view.setDefaultFocusHighlightEnabled(z);
    }
}