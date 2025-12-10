package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.ProvinceItem;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "province", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/ProvinceItem;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpMailingFragment$getAddressFromOCRUpPassForTrueCompany$1 */
/* loaded from: classes10.dex */
public final class OneMnpMailingFragment$getAddressFromOCRUpPassForTrueCompany$1 extends Lambda implements Function1<ProvinceItem, Unit> {
    final /* synthetic */ OneMnpMailingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpMailingFragment$getAddressFromOCRUpPassForTrueCompany$1(OneMnpMailingFragment oneMnpMailingFragment) {
        super(1);
        this.this$0 = oneMnpMailingFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProvinceItem provinceItem) {
        invoke2(provinceItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ProvinceItem province) {
        OneFontTextView oneFontTextView;
        OneFontTextView oneFontTextView2;
        Intrinsics.checkNotNullParameter(province, "province");
        oneFontTextView = this.this$0.f91527E;
        OneFontTextView oneFontTextView3 = null;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProvince");
            oneFontTextView = null;
        }
        oneFontTextView.setOneTag(province);
        oneFontTextView2 = this.this$0.f91527E;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvProvince");
        } else {
            oneFontTextView3 = oneFontTextView2;
        }
        oneFontTextView3.setText(province.getTh());
    }
}