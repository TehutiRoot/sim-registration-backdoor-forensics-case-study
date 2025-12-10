package th.p047co.dtac.android.dtacone.viewmodel.mrtr_pre2post;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.mrtr_pre2post.ValidatePackageGroupCodeResponse;
import th.p047co.dtac.android.dtacone.model.postpaid.recommend_package.PackagesItem;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_pre2post/ValidatePackageGroupCodeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_pre2post.MrtrPre2PostViewModel$validatePackageGroupCode$3 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostViewModel$validatePackageGroupCode$3 extends Lambda implements Function1<ValidatePackageGroupCodeResponse, Unit> {
    final /* synthetic */ Boolean $isAutoSelectPackage;
    final /* synthetic */ boolean $isRecommend;
    final /* synthetic */ PackagesItem $recommendPackage;
    final /* synthetic */ MrtrPre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostViewModel$validatePackageGroupCode$3(boolean z, Boolean bool, MrtrPre2PostViewModel mrtrPre2PostViewModel, PackagesItem packagesItem) {
        super(1);
        this.$isRecommend = z;
        this.$isAutoSelectPackage = bool;
        this.this$0 = mrtrPre2PostViewModel;
        this.$recommendPackage = packagesItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ValidatePackageGroupCodeResponse validatePackageGroupCodeResponse) {
        invoke2(validatePackageGroupCodeResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ValidatePackageGroupCodeResponse validatePackageGroupCodeResponse) {
        MutableLiveData m2139p0;
        MutableLiveData m2139p02;
        if (this.$isRecommend & Intrinsics.areEqual(this.$isAutoSelectPackage, Boolean.FALSE)) {
            this.this$0.m2205C(this.$recommendPackage);
        }
        m2139p0 = this.this$0.m2139p0();
        m2139p0.setValue(Resource.Companion.success(validatePackageGroupCodeResponse));
        m2139p02 = this.this$0.m2139p0();
        m2139p02.setValue(null);
    }
}