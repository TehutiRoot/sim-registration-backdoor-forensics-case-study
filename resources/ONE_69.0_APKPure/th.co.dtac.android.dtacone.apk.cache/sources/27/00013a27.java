package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneCheck1IDXDeviceResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.Check1IDXDeviceResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneCheck1IDXDeviceResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostReadSmartCardFragment$setupObserve$1$3 */
/* loaded from: classes10.dex */
public final class OnePre2PostReadSmartCardFragment$setupObserve$1$3 extends Lambda implements Function1<Resource<? extends OneCheck1IDXDeviceResponse>, Unit> {
    final /* synthetic */ OnePre2PostReadSmartCardFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostReadSmartCardFragment$setupObserve$1$3(OnePre2PostReadSmartCardFragment onePre2PostReadSmartCardFragment) {
        super(1);
        this.this$0 = onePre2PostReadSmartCardFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneCheck1IDXDeviceResponse> resource) {
        invoke2((Resource<OneCheck1IDXDeviceResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneCheck1IDXDeviceResponse> resource) {
        Resource<OneCheck1IDXDeviceResponse> resourceContentIfNotHandled;
        String warningMessage2;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OnePre2PostReadSmartCardFragment onePre2PostReadSmartCardFragment = this.this$0;
        if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
            onePre2PostReadSmartCardFragment.dismissSecondaryLoading();
            OneCheck1IDXDeviceResponse data = resourceContentIfNotHandled.getData();
            Check1IDXDeviceResponse data2 = data != null ? data.getData() : null;
            String str = "";
            String str2 = (data2 == null || (str2 = data2.getWarningMessage()) == null) ? "" : "";
            if (data2 != null && (warningMessage2 = data2.getWarningMessage2()) != null) {
                str = warningMessage2;
            }
            onePre2PostReadSmartCardFragment.m11307A(str2, str);
        }
    }
}