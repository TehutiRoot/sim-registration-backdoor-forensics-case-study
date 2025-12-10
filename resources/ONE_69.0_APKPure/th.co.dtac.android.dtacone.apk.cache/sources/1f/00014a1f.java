package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.view.ActivityExtKt;
import th.p047co.dtac.android.dtacone.model.customerenquiry.OffersPackage;
import th.p047co.dtac.android.dtacone.viewmodel.customerenquiry.SubscriberInfoViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "packageGroup", "Lth/co/dtac/android/dtacone/model/customerenquiry/OffersPackage;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.InfoAnalyticFragment$createOfferPackageAdapter$1 */
/* loaded from: classes9.dex */
public final class InfoAnalyticFragment$createOfferPackageAdapter$1 extends Lambda implements Function1<OffersPackage, Unit> {
    final /* synthetic */ InfoAnalyticFragment this$0;

    @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.InfoAnalyticFragment$createOfferPackageAdapter$1$1 */
    /* loaded from: classes9.dex */
    public static final class C159271 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OffersPackage $packageGroup;
        final /* synthetic */ InfoAnalyticFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C159271(InfoAnalyticFragment infoAnalyticFragment, OffersPackage offersPackage) {
            super(0);
            this.this$0 = infoAnalyticFragment;
            this.$packageGroup = offersPackage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.f99353k = this.$packageGroup;
            this.this$0.m8403s(this.$packageGroup);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoAnalyticFragment$createOfferPackageAdapter$1(InfoAnalyticFragment infoAnalyticFragment) {
        super(1);
        this.this$0 = infoAnalyticFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OffersPackage offersPackage) {
        invoke2(offersPackage);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull OffersPackage packageGroup) {
        SubscriberInfoViewModel subscriberInfoViewModel;
        Intrinsics.checkNotNullParameter(packageGroup, "packageGroup");
        subscriberInfoViewModel = this.this$0.f99354l;
        if (subscriberInfoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subscriberInfoViewModel");
            subscriberInfoViewModel = null;
        }
        String subscriberNumberDisplay = subscriberInfoViewModel.getSubscriberNumberDisplay();
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            String string = this.this$0.getString(R.string.advisory_enquiry_customer_title_goto_service);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.advis…tomer_title_goto_service)");
            int i = R.drawable.advisory_icon_mobile_dialog_confirm;
            String string2 = this.this$0.getString(R.string.advisory_enquiry_customer_goto_service_pre2post);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.advis…er_goto_service_pre2post)");
            String replace$default = AbstractC19741eO1.replace$default(string2, "{{subr}}", "<font color=#00ACE7>" + subscriberNumberDisplay + "</font>", false, 4, (Object) null);
            String marketingDescriptionThai = packageGroup.getMarketingDescriptionThai();
            ActivityExtKt.createConfirmDialogWithImage(activity, string, i, AbstractC19741eO1.replace$default(replace$default, "{{package}}", "<font color=#00ACE7>" + marketingDescriptionThai + "</font>", false, 4, (Object) null), new C159271(this.this$0, packageGroup));
        }
    }
}