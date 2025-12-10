package th.p047co.dtac.android.dtacone.view.appOne.registration.fragment;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.repository.model.SimData;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModel;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012:\u0010\u0002\u001a6\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006 \u0007*\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.fragment.OneInputOTPFragment$initViewModel$1$2 */
/* loaded from: classes10.dex */
public final class OneInputOTPFragment$initViewModel$1$2 extends Lambda implements Function1<Resource<? extends ArrayList<SimData>>, Unit> {
    final /* synthetic */ OneRegistrationViewModel $this_with;
    final /* synthetic */ OneInputOTPFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneInputOTPFragment$initViewModel$1$2(OneInputOTPFragment oneInputOTPFragment, OneRegistrationViewModel oneRegistrationViewModel) {
        super(1);
        this.this$0 = oneInputOTPFragment;
        this.$this_with = oneRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends ArrayList<SimData>> resource) {
        invoke2(resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends ArrayList<SimData>> resource) {
        Resource<? extends ArrayList<SimData>> resourceContentIfNotHandled;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneInputOTPFragment oneInputOTPFragment = this.this$0;
        OneRegistrationViewModel oneRegistrationViewModel = this.$this_with;
        if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
            oneInputOTPFragment.navigateNext(resourceContentIfNotHandled.getData());
            oneRegistrationViewModel.clearNavigateVerifyOtp();
        }
    }
}