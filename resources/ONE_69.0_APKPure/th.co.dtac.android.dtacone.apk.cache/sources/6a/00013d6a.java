package th.p047co.dtac.android.dtacone.view.appOne.registration.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "booleanResource", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.activity.OneRegistrationActivity$initViewModelLogin$9 */
/* loaded from: classes10.dex */
public final class OneRegistrationActivity$initViewModelLogin$9 extends Lambda implements Function1<Resource<? extends Boolean>, Unit> {
    final /* synthetic */ OneRegistrationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegistrationActivity$initViewModelLogin$9(OneRegistrationActivity oneRegistrationActivity) {
        super(1);
        this.this$0 = oneRegistrationActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Boolean> resource) {
        invoke2((Resource<Boolean>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Boolean> resource) {
        Boolean data;
        Resource<Boolean> resourceContentIfNotHandled = resource.getResourceContentIfNotHandled();
        if (StatusResource.SUCCESS != (resourceContentIfNotHandled != null ? resourceContentIfNotHandled.getStatus() : null) || (data = resourceContentIfNotHandled.getData()) == null) {
            return;
        }
        OneRegistrationActivity oneRegistrationActivity = this.this$0;
        if (data.booleanValue()) {
            oneRegistrationActivity.showSecondaryLoading();
        } else {
            oneRegistrationActivity.dismissSecondaryLoading();
        }
    }
}