package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration.Package;
import th.p047co.dtac.android.dtacone.model.mrtr_pre2post.ValidatePackageGroupCodeResponse;
import th.p047co.dtac.android.dtacone.model.postpaid.recommend_package.PackagesItem;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/mrtr_pre2post/ValidatePackageGroupCodeResponse;", "kotlin.jvm.PlatformType", "packageData", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel$validatePackageGroupCode$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModel$validatePackageGroupCode$1 extends Lambda implements Function1<ValidatePackageGroupCodeResponse, ValidatePackageGroupCodeResponse> {
    final /* synthetic */ boolean $isRecommend;
    final /* synthetic */ PackagesItem $recommendPackage;
    final /* synthetic */ OnePre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostViewModel$validatePackageGroupCode$1(PackagesItem packagesItem, boolean z, OnePre2PostViewModel onePre2PostViewModel) {
        super(1);
        this.$recommendPackage = packagesItem;
        this.$isRecommend = z;
        this.this$0 = onePre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ValidatePackageGroupCodeResponse invoke(@NotNull ValidatePackageGroupCodeResponse packageData) {
        String requesterLocation;
        String offerPOID;
        String campaignID;
        Intrinsics.checkNotNullParameter(packageData, "packageData");
        String packageGroupCode = packageData.getPackageGroupCode();
        String packageGroupDescription = packageData.getPackageGroupDescription();
        String packageGroupDescription2 = packageData.getPackageGroupDescription();
        String switchOnReasonCode = packageData.getSwitchOnReasonCode();
        PackagesItem packagesItem = this.$recommendPackage;
        String str = (packagesItem == null || (campaignID = packagesItem.getCampaignID()) == null) ? "" : campaignID;
        PackagesItem packagesItem2 = this.$recommendPackage;
        String str2 = (packagesItem2 == null || (offerPOID = packagesItem2.getOfferPOID()) == null) ? "" : offerPOID;
        PackagesItem packagesItem3 = this.$recommendPackage;
        Package r0 = new Package(packageGroupCode, packageGroupDescription, packageGroupDescription2, switchOnReasonCode, str, str2, (packagesItem3 == null || (requesterLocation = packagesItem3.getRequesterLocation()) == null) ? "" : requesterLocation);
        if (this.$isRecommend) {
            this.this$0.getOneModel().setRecommendPackage(r0);
            this.this$0.getOneModel().setMPackage(null);
        } else {
            this.this$0.getOneModel().setMPackage(r0);
            this.this$0.getOneModel().setRecommendPackage(null);
        }
        return packageData;
    }
}