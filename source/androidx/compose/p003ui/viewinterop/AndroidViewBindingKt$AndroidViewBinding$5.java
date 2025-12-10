package androidx.compose.p003ui.viewinterop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m28850d2 = {"<anonymous>", "Landroid/view/View;", "T", "Landroidx/viewbinding/ViewBinding;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$5 */
/* loaded from: classes2.dex */
public final class AndroidViewBindingKt$AndroidViewBinding$5 extends Lambda implements Function1<Context, View> {
    final /* synthetic */ Function3<LayoutInflater, ViewGroup, Boolean, T> $factory;
    final /* synthetic */ Fragment $parentFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidViewBindingKt$AndroidViewBinding$5(Fragment fragment, Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function3) {
        super(1);
        this.$parentFragment = fragment;
        this.$factory = function3;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final View invoke(@NotNull Context context) {
        LayoutInflater inflater;
        Intrinsics.checkNotNullParameter(context, "context");
        Fragment fragment = this.$parentFragment;
        if (fragment == null || (inflater = fragment.getLayoutInflater()) == null) {
            inflater = LayoutInflater.from(context);
        }
        Function3<LayoutInflater, ViewGroup, Boolean, T> function3 = this.$factory;
        Intrinsics.checkNotNullExpressionValue(inflater, "inflater");
        ViewBinding viewBinding = (ViewBinding) function3.invoke(inflater, new FrameLayout(context), Boolean.FALSE);
        View invoke$lambda$0 = viewBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(invoke$lambda$0, "invoke$lambda$0");
        AndroidViewBindingKt.m58868c(invoke$lambda$0, viewBinding);
        return invoke$lambda$0;
    }
}
