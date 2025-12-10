package co.omise.android.extensions;

import android.view.View;
import co.omise.android.extensions.ViewExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0005"}, m29142d2 = {"setOnClickListener", "", "Landroid/view/View;", "action", "Lkotlin/Function0;", "sdk_productionRelease"}, m29141k = 2, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes.dex */
public final class ViewExtensionsKt {
    /* renamed from: a */
    public static /* synthetic */ void m51290a(Function0 function0, View view) {
        m74102setOnClickListener$lambda0(function0, view);
    }

    public static final void setOnClickListener(@NotNull View view, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        view.setOnClickListener(new View.OnClickListener() { // from class: r32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewExtensionsKt.m51290a(Function0.this, view2);
            }
        });
    }

    /* renamed from: setOnClickListener$lambda-0 */
    public static final void m74102setOnClickListener$lambda0(Function0 action, View view) {
        Intrinsics.checkNotNullParameter(action, "$action");
        action.invoke();
    }
}