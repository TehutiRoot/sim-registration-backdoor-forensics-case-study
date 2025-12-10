package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.DistrictsItem;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "district", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/DistrictsItem;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpMailingFragment$getAddressFromOCRUpPassForTrueCompany$2 */
/* loaded from: classes10.dex */
public final class OneMnpMailingFragment$getAddressFromOCRUpPassForTrueCompany$2 extends Lambda implements Function1<DistrictsItem, Unit> {
    final /* synthetic */ OneMnpMailingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpMailingFragment$getAddressFromOCRUpPassForTrueCompany$2(OneMnpMailingFragment oneMnpMailingFragment) {
        super(1);
        this.this$0 = oneMnpMailingFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DistrictsItem districtsItem) {
        invoke2(districtsItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DistrictsItem district) {
        OneFontTextView oneFontTextView;
        OneFontTextView oneFontTextView2;
        Intrinsics.checkNotNullParameter(district, "district");
        oneFontTextView = this.this$0.f91528F;
        OneFontTextView oneFontTextView3 = null;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvDistrict");
            oneFontTextView = null;
        }
        oneFontTextView.setOneTag(district);
        oneFontTextView2 = this.this$0.f91528F;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvDistrict");
        } else {
            oneFontTextView3 = oneFontTextView2;
        }
        oneFontTextView3.setText(district.getTh());
    }
}