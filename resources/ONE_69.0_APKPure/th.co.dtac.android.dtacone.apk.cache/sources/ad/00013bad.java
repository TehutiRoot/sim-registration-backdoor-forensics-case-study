package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostGetFormsResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostGetFormsResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel$getForms$3 */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModel$getForms$3 extends Lambda implements Function1<OnePre2PostGetFormsResponse, Unit> {
    final /* synthetic */ OnePre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostViewModel$getForms$3(OnePre2PostViewModel onePre2PostViewModel) {
        super(1);
        this.this$0 = onePre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePre2PostGetFormsResponse onePre2PostGetFormsResponse) {
        invoke2(onePre2PostGetFormsResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePre2PostGetFormsResponse onePre2PostGetFormsResponse) {
        MutableLiveData m10878V0;
        OnePre2PostViewModel onePre2PostViewModel = this.this$0;
        String substring = onePre2PostGetFormsResponse.getData().getPdfForm().substring(28, onePre2PostGetFormsResponse.getData().getPdfForm().length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        onePre2PostViewModel.setAppForm(substring);
        m10878V0 = this.this$0.m10878V0();
        m10878V0.setValue(Resource.Companion.success(onePre2PostGetFormsResponse));
    }
}