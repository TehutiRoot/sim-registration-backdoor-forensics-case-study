package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.common;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.presenter.bitmap.DeleteBitmapPresenter;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidValidationViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.common.OnePrepaidNavigateToCommonFragment$initView$1$2 */
/* loaded from: classes10.dex */
public final class OnePrepaidNavigateToCommonFragment$initView$1$2 extends Lambda implements Function1<FragmentNavEvent, Unit> {
    final /* synthetic */ OnePrepaidNavigateToCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidNavigateToCommonFragment$initView$1$2(OnePrepaidNavigateToCommonFragment onePrepaidNavigateToCommonFragment) {
        super(1);
        this.this$0 = onePrepaidNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentNavEvent fragmentNavEvent) {
        invoke2(fragmentNavEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FragmentNavEvent it) {
        OnePrepaidViewModel m10652t;
        OnePrepaidRegistrationActivity m10654r;
        OnePrepaidValidationViewModel onePrepaidValidationViewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        DeleteBitmapPresenter deleteBitmapPresenter = this.this$0.getDeleteBitmapPresenter();
        m10652t = this.this$0.m10652t();
        List<String> optionalImages = m10652t.getOptionalImages();
        if (optionalImages == null) {
            optionalImages = CollectionsKt__CollectionsKt.emptyList();
        }
        deleteBitmapPresenter.deleteAllOptionalImage(optionalImages);
        if (Intrinsics.areEqual(it.getClazz(), UpPassFormFragment.class)) {
            onePrepaidValidationViewModel = this.this$0.f95768i;
            if (onePrepaidValidationViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prepaidValidationViewModel");
                onePrepaidValidationViewModel = null;
            }
            onePrepaidValidationViewModel.completeGate(true);
            return;
        }
        m10654r = this.this$0.m10654r();
        m10654r.replaceFragment(it.buildFragment(), it.getTag());
    }
}