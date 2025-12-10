package th.p047co.dtac.android.dtacone.extension.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, m29142d2 = {"toDisable", "", "Landroid/view/View;", "toEnable", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.view.ViewEnableKt */
/* loaded from: classes7.dex */
public final class ViewEnableKt {
    public static final void toDisable(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setEnabled(false);
    }

    public static final void toEnable(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setEnabled(true);
    }
}