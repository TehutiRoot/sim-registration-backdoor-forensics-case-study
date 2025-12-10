package th.p047co.dtac.android.dtacone.repository.mrtr_pre2post;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration.Package;
import th.p047co.dtac.android.dtacone.model.mrtr_pre2post.ValidatePackageGroupCodeResponse;
import th.p047co.dtac.android.dtacone.model.postpaid.recommend_package.PackagesItem;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/mrtr_pre2post/ValidatePackageGroupCodeResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.repository.mrtr_pre2post.MrtrPre2PostRepository$validatePackageGroupCode$1 */
/* loaded from: classes8.dex */
public final class MrtrPre2PostRepository$validatePackageGroupCode$1 extends Lambda implements Function1<ValidatePackageGroupCodeResponse, ValidatePackageGroupCodeResponse> {
    final /* synthetic */ PackagesItem $recommendPackage;
    final /* synthetic */ MrtrPre2PostRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostRepository$validatePackageGroupCode$1(MrtrPre2PostRepository mrtrPre2PostRepository, PackagesItem packagesItem) {
        super(1);
        this.this$0 = mrtrPre2PostRepository;
        this.$recommendPackage = packagesItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ValidatePackageGroupCodeResponse invoke(@NotNull ValidatePackageGroupCodeResponse it) {
        String requesterLocation;
        String offerPOID;
        String campaignID;
        Intrinsics.checkNotNullParameter(it, "it");
        MrtrPre2PostRepository mrtrPre2PostRepository = this.this$0;
        String packageGroupCode = it.getPackageGroupCode();
        String packageGroupDescription = it.getPackageGroupDescription();
        String packageGroupDescription2 = it.getPackageGroupDescription();
        String switchOnReasonCode = it.getSwitchOnReasonCode();
        PackagesItem packagesItem = this.$recommendPackage;
        String str = (packagesItem == null || (campaignID = packagesItem.getCampaignID()) == null) ? "" : campaignID;
        PackagesItem packagesItem2 = this.$recommendPackage;
        String str2 = (packagesItem2 == null || (offerPOID = packagesItem2.getOfferPOID()) == null) ? "" : offerPOID;
        PackagesItem packagesItem3 = this.$recommendPackage;
        mrtrPre2PostRepository.storePackage(new Package(packageGroupCode, packageGroupDescription, packageGroupDescription2, switchOnReasonCode, str, str2, (packagesItem3 == null || (requesterLocation = packagesItem3.getRequesterLocation()) == null) ? "" : requesterLocation));
        return it;
    }
}