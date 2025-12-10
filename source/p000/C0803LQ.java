package p000;

import android.view.View;
import android.view.Window;
import androidx.activity.SystemBarStyle;
import androidx.annotation.DoNotInline;
import androidx.core.view.WindowCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: LQ */
/* loaded from: classes.dex */
public final class C0803LQ implements InterfaceC1241RQ {
    @Override // p000.InterfaceC1241RQ
    @DoNotInline
    /* renamed from: a */
    public void mo66456a(@NotNull SystemBarStyle statusBarStyle, @NotNull SystemBarStyle navigationBarStyle, @NotNull Window window, @NotNull View view, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.addFlags(67108864);
        window.addFlags(134217728);
    }
}
