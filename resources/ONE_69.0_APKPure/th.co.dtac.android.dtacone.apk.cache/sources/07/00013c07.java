package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.mrtr_pre2post.ValidatePackageGroupCodeResponse;
import th.p047co.dtac.android.dtacone.model.postpaid.recommend_package.PackagesItem;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/mrtr_pre2post/ValidatePackageGroupCodeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel$validatePackageGroupCode$4 */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModel$validatePackageGroupCode$4 extends Lambda implements Function1<ValidatePackageGroupCodeResponse, Unit> {
    final /* synthetic */ Boolean $isAutoSelectPackage;
    final /* synthetic */ boolean $isRecommend;
    final /* synthetic */ PackagesItem $recommendPackage;
    final /* synthetic */ OnePre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostViewModel$validatePackageGroupCode$4(boolean z, Boolean bool, OnePre2PostViewModel onePre2PostViewModel, PackagesItem packagesItem) {
        super(1);
        this.$isRecommend = z;
        this.$isAutoSelectPackage = bool;
        this.this$0 = onePre2PostViewModel;
        this.$recommendPackage = packagesItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ValidatePackageGroupCodeResponse validatePackageGroupCodeResponse) {
        invoke2(validatePackageGroupCodeResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ValidatePackageGroupCodeResponse validatePackageGroupCodeResponse) {
        MutableLiveData m10774y1;
        MutableLiveData m10774y12;
        if (this.$isRecommend & Intrinsics.areEqual(this.$isAutoSelectPackage, Boolean.FALSE)) {
            this.this$0.m10840g0(this.$recommendPackage);
        }
        m10774y1 = this.this$0.m10774y1();
        m10774y1.setValue(Resource.Companion.success(validatePackageGroupCodeResponse));
        m10774y12 = this.this$0.m10774y1();
        m10774y12.setValue(null);
    }
}