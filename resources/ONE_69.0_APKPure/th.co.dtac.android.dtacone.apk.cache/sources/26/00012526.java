package th.p047co.dtac.android.dtacone.presenter.sellerID;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.getProfile.OneGetProfileResponse;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/appOne/getProfile/OneGetProfileResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.sellerID.ChangeTokenForPromoterPresenter$getPermissionAndDolStatus$2 */
/* loaded from: classes8.dex */
public final class ChangeTokenForPromoterPresenter$getPermissionAndDolStatus$2 extends Lambda implements Function1<OneGetProfileResponse, OneGetProfileResponse> {
    final /* synthetic */ ChangeTokenForPromoterPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeTokenForPromoterPresenter$getPermissionAndDolStatus$2(ChangeTokenForPromoterPresenter changeTokenForPromoterPresenter) {
        super(1);
        this.this$0 = changeTokenForPromoterPresenter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r0.contains(th.p047co.dtac.android.dtacone.util.constant.PermissionConstant.M_CAMPAIGN) != false) goto L8;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final th.p047co.dtac.android.dtacone.model.appOne.getProfile.OneGetProfileResponse invoke(@org.jetbrains.annotations.NotNull th.p047co.dtac.android.dtacone.model.appOne.getProfile.OneGetProfileResponse r3) {
        /*
            r2 = this;
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            th.co.dtac.android.dtacone.presenter.sellerID.ChangeTokenForPromoterPresenter r0 = r2.this$0
            java.util.List r0 = th.p047co.dtac.android.dtacone.presenter.sellerID.ChangeTokenForPromoterPresenter.access$getPermissions$p(r0)
            java.lang.String r1 = "M_MISSION"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L21
            th.co.dtac.android.dtacone.presenter.sellerID.ChangeTokenForPromoterPresenter r0 = r2.this$0
            java.util.List r0 = th.p047co.dtac.android.dtacone.presenter.sellerID.ChangeTokenForPromoterPresenter.access$getPermissions$p(r0)
            java.lang.String r1 = "M_CAMPAIGN"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L26
        L21:
            th.co.dtac.android.dtacone.presenter.sellerID.ChangeTokenForPromoterPresenter r0 = r2.this$0
            th.p047co.dtac.android.dtacone.presenter.sellerID.ChangeTokenForPromoterPresenter.access$callCampaignCount(r0)
        L26:
            th.co.dtac.android.dtacone.presenter.sellerID.ChangeTokenForPromoterPresenter r0 = r2.this$0
            th.p047co.dtac.android.dtacone.presenter.sellerID.ChangeTokenForPromoterPresenter.access$getChannelTopic(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.presenter.sellerID.ChangeTokenForPromoterPresenter$getPermissionAndDolStatus$2.invoke(th.co.dtac.android.dtacone.model.appOne.getProfile.OneGetProfileResponse):th.co.dtac.android.dtacone.model.appOne.getProfile.OneGetProfileResponse");
    }
}