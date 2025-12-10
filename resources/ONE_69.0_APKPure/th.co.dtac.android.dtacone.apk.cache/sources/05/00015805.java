package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.profile.GetProfileResponse;
import th.p047co.dtac.android.dtacone.model.retailer.RetailerResponse;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/retailer/RetailerResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nRetailerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetailerViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/login_mrtr/RetailerViewModel$getRetailerProfile$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.RetailerViewModel$getRetailerProfile$3 */
/* loaded from: classes9.dex */
public final class RetailerViewModel$getRetailerProfile$3 extends Lambda implements Function1<RetailerResponse, Unit> {
    final /* synthetic */ String $rtrCode;
    final /* synthetic */ RetailerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetailerViewModel$getRetailerProfile$3(RetailerViewModel retailerViewModel, String str) {
        super(1);
        this.this$0 = retailerViewModel;
        this.$rtrCode = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RetailerResponse retailerResponse) {
        invoke2(retailerResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RetailerResponse it) {
        MutableLiveData m2429d;
        LoginRepository loginRepository;
        LoginRepository loginRepository2;
        LoginRepository loginRepository3;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        m2429d = this.this$0.m2429d();
        m2429d.setValue(Resource.Companion.success(new Triple(this.$rtrCode, it.getRtrCode(), it.getRtrName())));
        loginRepository = this.this$0.f106197b;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        loginRepository.storeRetailerResponse(it);
        loginRepository2 = this.this$0.f106197b;
        GetProfileResponse profileResponse = loginRepository2.getProfileResponse();
        if (profileResponse != null) {
            profileResponse.setSimR(it.getSimR());
        }
        if (profileResponse != null) {
            loginRepository3 = this.this$0.f106197b;
            loginRepository3.storeGetProfileResponse(profileResponse);
        }
    }
}