package th.p047co.dtac.android.dtacone.view.appOne.registration.activity;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "pairResource", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "", "Lth/co/dtac/android/dtacone/model/error/ServerErrorException;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.activity.OneRegistrationActivity$initViewModelLogin$7 */
/* loaded from: classes10.dex */
public final class OneRegistrationActivity$initViewModelLogin$7 extends Lambda implements Function1<Resource<? extends Pair<? extends String, ? extends ServerErrorException>>, Unit> {
    final /* synthetic */ OneRegistrationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegistrationActivity$initViewModelLogin$7(OneRegistrationActivity oneRegistrationActivity) {
        super(1);
        this.this$0 = oneRegistrationActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends String, ? extends ServerErrorException>> resource) {
        invoke2((Resource<? extends Pair<String, ? extends ServerErrorException>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends Pair<String, ? extends ServerErrorException>> resource) {
        Resource<? extends Pair<String, ? extends ServerErrorException>> resourceContentIfNotHandled = resource.getResourceContentIfNotHandled();
        if (StatusResource.SUCCESS != (resourceContentIfNotHandled != null ? resourceContentIfNotHandled.getStatus() : null) || resourceContentIfNotHandled.getData() == null) {
            return;
        }
        OneRegistrationActivity oneRegistrationActivity = this.this$0;
        ErrorCollection error = resourceContentIfNotHandled.getData().getSecond().error();
        Intrinsics.checkNotNullExpressionValue(error, "data.data.second.error()");
        oneRegistrationActivity.m10453f0(error);
    }
}