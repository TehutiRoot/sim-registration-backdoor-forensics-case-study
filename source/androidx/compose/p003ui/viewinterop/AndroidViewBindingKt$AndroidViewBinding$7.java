package androidx.compose.p003ui.viewinterop;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBinding;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m28850d2 = {"<anonymous>", "", "T", "Landroidx/viewbinding/ViewBinding;", Promotion.ACTION_VIEW, "Landroid/view/View;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$7 */
/* loaded from: classes2.dex */
public final class AndroidViewBindingKt$AndroidViewBinding$7 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ Context $localContext;
    final /* synthetic */ Function1<T, Unit> $onRelease;
    final /* synthetic */ Fragment $parentFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidViewBindingKt$AndroidViewBinding$7(Function1<? super T, Unit> function1, Fragment fragment, Context context) {
        super(1);
        this.$onRelease = function1;
        this.$parentFragment = fragment;
        this.$localContext = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull View view) {
        ViewBinding m58869b;
        FragmentManager childFragmentManager;
        Intrinsics.checkNotNullParameter(view, "view");
        Function1<T, Unit> function1 = this.$onRelease;
        m58869b = AndroidViewBindingKt.m58869b(view);
        function1.invoke(m58869b);
        FragmentManager fragmentManager = null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            Fragment fragment = this.$parentFragment;
            Context context = this.$localContext;
            if (fragment == null || (childFragmentManager = fragment.getChildFragmentManager()) == null) {
                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                if (fragmentActivity != null) {
                    fragmentManager = fragmentActivity.getSupportFragmentManager();
                }
            } else {
                fragmentManager = childFragmentManager;
            }
            AndroidViewBindingKt.m58870a(viewGroup, new AndroidViewBindingKt$AndroidViewBinding$7$1$1(fragmentManager));
        }
    }
}
