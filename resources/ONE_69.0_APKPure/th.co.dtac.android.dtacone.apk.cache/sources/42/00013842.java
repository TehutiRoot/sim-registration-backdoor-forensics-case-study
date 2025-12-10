package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.SubDistrictItem;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "subDistrict", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/SubDistrictItem;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidTrueMailingFragment$getAddressFromOCRUpPassForTrueCompany$3 */
/* loaded from: classes10.dex */
public final class C14970xdb6e4c0e extends Lambda implements Function1<SubDistrictItem, Unit> {
    final /* synthetic */ OnePostpaidTrueMailingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14970xdb6e4c0e(OnePostpaidTrueMailingFragment onePostpaidTrueMailingFragment) {
        super(1);
        this.this$0 = onePostpaidTrueMailingFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SubDistrictItem subDistrictItem) {
        invoke2(subDistrictItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SubDistrictItem subDistrict) {
        OneFontTextView oneFontTextView;
        OneFontTextView oneFontTextView2;
        Intrinsics.checkNotNullParameter(subDistrict, "subDistrict");
        oneFontTextView = this.this$0.f94358D;
        OneFontTextView oneFontTextView3 = null;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSubDistrict");
            oneFontTextView = null;
        }
        oneFontTextView.setOneTag(subDistrict);
        oneFontTextView2 = this.this$0.f94358D;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSubDistrict");
        } else {
            oneFontTextView3 = oneFontTextView2;
        }
        oneFontTextView3.setText(subDistrict.getTh());
    }
}