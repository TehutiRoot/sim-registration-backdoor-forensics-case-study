package androidx.activity;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "Landroidx/activity/FullyDrawnReporterOwner;", "it", "Landroid/view/View;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2 */
/* loaded from: classes.dex */
public final class C2036x54146af extends Lambda implements Function1<View, FullyDrawnReporterOwner> {
    public static final C2036x54146af INSTANCE = new C2036x54146af();

    public C2036x54146af() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final FullyDrawnReporterOwner invoke(@NotNull View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object tag = it.getTag(R.id.report_drawn);
        if (tag instanceof FullyDrawnReporterOwner) {
            return (FullyDrawnReporterOwner) tag;
        }
        return null;
    }
}
