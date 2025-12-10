package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.common.OnePrepaidNavigateToCommonFragment$dialogError$1$1 */
/* loaded from: classes10.dex */
public final class OnePrepaidNavigateToCommonFragment$dialogError$1$1 extends Lambda implements Function1<ErrorCollection, Unit> {
    final /* synthetic */ OnePrepaidNavigateToCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidNavigateToCommonFragment$dialogError$1$1(OnePrepaidNavigateToCommonFragment onePrepaidNavigateToCommonFragment) {
        super(1);
        this.this$0 = onePrepaidNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ErrorCollection errorCollection) {
        invoke2(errorCollection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ErrorCollection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.m10647y();
    }
}