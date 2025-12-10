package androidx.compose.p003ui.viewinterop;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m28850d2 = {"<anonymous>", "", "T", "Landroidx/viewbinding/ViewBinding;", "container", "Landroidx/fragment/app/FragmentContainerView;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nAndroidViewBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$7$1$1\n+ 2 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,230:1\n27#2,11:231\n*S KotlinDebug\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$7$1$1\n*L\n198#1:231,11\n*E\n"})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$7$1$1 */
/* loaded from: classes2.dex */
public final class AndroidViewBindingKt$AndroidViewBinding$7$1$1 extends Lambda implements Function1<FragmentContainerView, Unit> {
    final /* synthetic */ FragmentManager $fragmentManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewBindingKt$AndroidViewBinding$7$1$1(FragmentManager fragmentManager) {
        super(1);
        this.$fragmentManager = fragmentManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentContainerView fragmentContainerView) {
        invoke2(fragmentContainerView);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FragmentContainerView container) {
        Intrinsics.checkNotNullParameter(container, "container");
        FragmentManager fragmentManager = this.$fragmentManager;
        Fragment findFragmentById = fragmentManager != null ? fragmentManager.findFragmentById(container.getId()) : null;
        if (findFragmentById == null || this.$fragmentManager.isStateSaved()) {
            return;
        }
        FragmentTransaction beginTransaction = this.$fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction()");
        beginTransaction.remove(findFragmentById);
        beginTransaction.commit();
    }
}
