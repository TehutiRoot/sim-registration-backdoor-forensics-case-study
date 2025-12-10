package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.trueCompany;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.activity.OnePre2PostActivity;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "item", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.trueCompany.OnePre2PostSelectPackageFragment$initView$3$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostSelectPackageFragment$initView$3$1 extends Lambda implements Function1<PriceplanListItem, Unit> {
    final /* synthetic */ OnePre2PostSelectPackageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostSelectPackageFragment$initView$3$1(OnePre2PostSelectPackageFragment onePre2PostSelectPackageFragment) {
        super(1);
        this.this$0 = onePre2PostSelectPackageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PriceplanListItem priceplanListItem) {
        invoke2(priceplanListItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull PriceplanListItem item) {
        OnePre2PostViewModel m11055s;
        OnePre2PostActivity m11056r;
        OneCustomClearableEditText oneCustomClearableEditText;
        Intrinsics.checkNotNullParameter(item, "item");
        m11055s = this.this$0.m11055s();
        m11055s.getOneModel().setPackageTrueItem(item);
        m11056r = this.this$0.m11056r();
        OneCustomClearableEditText oneCustomClearableEditText2 = null;
        m11056r.replaceFragment(OnePre2PostTrueMailingFragment.Companion.newInstance(), null);
        oneCustomClearableEditText = this.this$0.f95299l;
        if (oneCustomClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtSearch");
        } else {
            oneCustomClearableEditText2 = oneCustomClearableEditText;
        }
        oneCustomClearableEditText2.setText("");
    }
}