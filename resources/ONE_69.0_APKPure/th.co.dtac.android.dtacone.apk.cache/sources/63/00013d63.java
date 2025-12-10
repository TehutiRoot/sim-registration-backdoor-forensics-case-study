package th.p047co.dtac.android.dtacone.view.appOne.registration.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "stringResource", "Lth/co/dtac/android/dtacone/model/Resource;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.activity.OneRegistrationActivity$initViewModelLogin$2 */
/* loaded from: classes10.dex */
public final class OneRegistrationActivity$initViewModelLogin$2 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ OneRegistrationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegistrationActivity$initViewModelLogin$2(OneRegistrationActivity oneRegistrationActivity) {
        super(1);
        this.this$0 = oneRegistrationActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
        invoke2((Resource<String>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Resource<String> stringResource) {
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Resource<String> resourceContentIfNotHandled = stringResource.getResourceContentIfNotHandled();
        if ((resourceContentIfNotHandled != null ? resourceContentIfNotHandled.getStatus() : null) == null || StatusResource.SUCCESS != resourceContentIfNotHandled.getStatus()) {
            return;
        }
        if (resourceContentIfNotHandled.getData() != null) {
            this.this$0.getTracker().addOrUpdateTelNo(resourceContentIfNotHandled.getData());
        }
        this.this$0.m10448k0();
    }
}