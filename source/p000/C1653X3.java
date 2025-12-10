package p000;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: X3 */
/* loaded from: classes2.dex */
public final class C1653X3 {

    /* renamed from: a */
    public static final C1653X3 f7373a = new C1653X3();

    @DoNotInline
    @RequiresApi(26)
    /* renamed from: a */
    public final void m65541a(@NotNull View view, int i, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFocusable(i);
        view.setDefaultFocusHighlightEnabled(z);
    }
}
