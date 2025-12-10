package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.activity.OneOnlineRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/StatusResource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationRetailerInfoFragment$setUpViewModel$1$2 */
/* loaded from: classes10.dex */
public final class OneOnlineRegistrationRetailerInfoFragment$setUpViewModel$1$2 extends Lambda implements Function1<Resource<? extends Pair<? extends StatusResource, ? extends String>>, Unit> {
    final /* synthetic */ OneOnlineRegisterViewModel $this_apply;
    final /* synthetic */ OneOnlineRegistrationRetailerInfoFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationRetailerInfoFragment$setUpViewModel$1$2$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegistrationRetailerInfoFragment$setUpViewModel$1$2(OneOnlineRegistrationRetailerInfoFragment oneOnlineRegistrationRetailerInfoFragment, OneOnlineRegisterViewModel oneOnlineRegisterViewModel) {
        super(1);
        this.this$0 = oneOnlineRegistrationRetailerInfoFragment;
        this.$this_apply = oneOnlineRegisterViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends StatusResource, ? extends String>> resource) {
        invoke2((Resource<? extends Pair<? extends StatusResource, String>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends Pair<? extends StatusResource, String>> resource) {
        Resource<? extends Pair<? extends StatusResource, String>> resourceContentIfNotHandled;
        String m12960z;
        OneOnlineRegistrationActivity m12993A;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneOnlineRegistrationRetailerInfoFragment oneOnlineRegistrationRetailerInfoFragment = this.this$0;
        OneOnlineRegisterViewModel oneOnlineRegisterViewModel = this.$this_apply;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i == 1) {
            oneOnlineRegistrationRetailerInfoFragment.showLoading();
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            oneOnlineRegistrationRetailerInfoFragment.dismissLoading();
        } else {
            oneOnlineRegistrationRetailerInfoFragment.dismissLoading();
            Pair<? extends StatusResource, String> data = resourceContentIfNotHandled.getData();
            if (data != null) {
                oneOnlineRegistrationRetailerInfoFragment.f92789j = false;
                m12960z = oneOnlineRegistrationRetailerInfoFragment.m12960z(data.getSecond());
                oneOnlineRegisterViewModel.setTrueOnlinePhone(m12960z);
                m12993A = oneOnlineRegistrationRetailerInfoFragment.m12993A();
                m12993A.replaceFragmentByStackName(OneOnlineRegistrationCommissionInfoFragment.Companion.newInstance(), null);
            }
        }
    }
}