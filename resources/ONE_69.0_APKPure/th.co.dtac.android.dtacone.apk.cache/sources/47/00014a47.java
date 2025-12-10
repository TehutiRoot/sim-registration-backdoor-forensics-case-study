package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import android.app.Dialog;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ActivityExtKt;
import th.p047co.dtac.android.dtacone.model.customerenquiry.Offer;
import th.p047co.dtac.android.dtacone.model.customerenquiry.OffersPackage;
import th.p047co.dtac.android.dtacone.util.p052enum.SellingType;
import th.p047co.dtac.android.dtacone.viewmodel.customerenquiry.InfoAnalyticViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.customerenquiry.SubscriberInfoViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "packageGroup", "Lth/co/dtac/android/dtacone/model/customerenquiry/OffersPackage;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PostInfoAnalyticFragment$createOfferPackageAdapter$1 */
/* loaded from: classes9.dex */
public final class PostInfoAnalyticFragment$createOfferPackageAdapter$1 extends Lambda implements Function1<OffersPackage, Unit> {
    final /* synthetic */ List<Offer> $list;
    final /* synthetic */ PostInfoAnalyticFragment this$0;

    @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.PostInfoAnalyticFragment$createOfferPackageAdapter$1$1 */
    /* loaded from: classes9.dex */
    public static final class C159311 extends Lambda implements Function0<Unit> {
        final /* synthetic */ List<Offer> $list;
        final /* synthetic */ OffersPackage $packageGroup;
        final /* synthetic */ PostInfoAnalyticFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C159311(List<Offer> list, OffersPackage offersPackage, PostInfoAnalyticFragment postInfoAnalyticFragment) {
            super(0);
            this.$list = list;
            this.$packageGroup = offersPackage;
            this.this$0 = postInfoAnalyticFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InfoAnalyticViewModel infoAnalyticViewModel;
            Offer offer = this.$list.get(this.$packageGroup.getIndex());
            offer.setSellingType(SellingType.Upsell);
            infoAnalyticViewModel = this.this$0.f99439l;
            if (infoAnalyticViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("infoAnalyticViewModel");
                infoAnalyticViewModel = null;
            }
            infoAnalyticViewModel.onSelectPostpaidUpsellPackage(offer);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostInfoAnalyticFragment$createOfferPackageAdapter$1(PostInfoAnalyticFragment postInfoAnalyticFragment, List<Offer> list) {
        super(1);
        this.this$0 = postInfoAnalyticFragment;
        this.$list = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OffersPackage offersPackage) {
        invoke2(offersPackage);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull OffersPackage packageGroup) {
        InfoAnalyticViewModel infoAnalyticViewModel;
        SubscriberInfoViewModel subscriberInfoViewModel;
        Intrinsics.checkNotNullParameter(packageGroup, "packageGroup");
        infoAnalyticViewModel = this.this$0.f99439l;
        SubscriberInfoViewModel subscriberInfoViewModel2 = null;
        if (infoAnalyticViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("infoAnalyticViewModel");
            infoAnalyticViewModel = null;
        }
        infoAnalyticViewModel.callApiExpressInterestOfferUpsell(packageGroup);
        subscriberInfoViewModel = this.this$0.f99440m;
        if (subscriberInfoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscriberInfoViewModel");
        } else {
            subscriberInfoViewModel2 = subscriberInfoViewModel;
        }
        String subscriberNumberDisplay = subscriberInfoViewModel2.getSubscriberNumberDisplay();
        String marketingDescriptionThai = packageGroup.getMarketingDescriptionThai();
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            String string = this.this$0.getString(R.string.advisory_enquiry_customer_title_goto_service);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.advis…tomer_title_goto_service)");
            String string2 = this.this$0.getString(R.string.advisory_enquiry_customer_goto_service_changepack);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.advis…_goto_service_changepack)");
            Dialog createConfirmDialogHtmlText = ActivityExtKt.createConfirmDialogHtmlText(activity, string, StringExtKt.formatMessageWithSubscriberAndPackage(string2, subscriberNumberDisplay, marketingDescriptionThai), new C159311(this.$list, packageGroup, this.this$0));
            if (createConfirmDialogHtmlText != null) {
                createConfirmDialogHtmlText.show();
            }
        }
    }
}