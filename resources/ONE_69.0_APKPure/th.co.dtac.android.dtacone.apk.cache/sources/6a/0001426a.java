package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus.OneRegisterTrueOnlineFlpPackageScreenKt$OneRegisterTrueOnlineFlpPackageScreen$1$1$1$1 */
/* loaded from: classes10.dex */
public final class C15392x1b8dc7fd extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ MutableState<String> $filterText$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15392x1b8dc7fd(MutableState<String> mutableState) {
        super(1);
        this.$filterText$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OneRegisterTrueOnlineFlpPackageScreenKt.m9553c(this.$filterText$delegate, it);
    }
}