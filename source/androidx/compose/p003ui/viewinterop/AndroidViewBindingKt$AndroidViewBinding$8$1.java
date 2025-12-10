package androidx.compose.p003ui.viewinterop;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m28850d2 = {"<anonymous>", "", "T", "Landroidx/viewbinding/ViewBinding;", Promotion.ACTION_VIEW, "Landroid/view/View;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$8$1 */
/* loaded from: classes2.dex */
public final class AndroidViewBindingKt$AndroidViewBinding$8$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ Function1<T, Unit> $update;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidViewBindingKt$AndroidViewBinding$8$1(Function1<? super T, Unit> function1) {
        super(1);
        this.$update = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull View view) {
        ViewBinding m58869b;
        Intrinsics.checkNotNullParameter(view, "view");
        Function1<T, Unit> function1 = this.$update;
        m58869b = AndroidViewBindingKt.m58869b(view);
        function1.invoke(m58869b);
    }
}
