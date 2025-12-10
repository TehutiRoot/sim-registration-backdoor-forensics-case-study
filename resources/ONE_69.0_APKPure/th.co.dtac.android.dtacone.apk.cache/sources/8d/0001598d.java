package th.p047co.dtac.android.dtacone.viewmodel.mrtr_pre2post;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.postpaid_registration.PostpaidSearchPackage;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_pre2post.MrtrPre2PostViewModel$searchPackageGroupRetailerPre2PostByRefAPI$3 */
/* loaded from: classes9.dex */
public final class C16639xf348bdff extends Lambda implements Function1<PostpaidSearchPackage, Unit> {
    final /* synthetic */ MrtrPre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16639xf348bdff(MrtrPre2PostViewModel mrtrPre2PostViewModel) {
        super(1);
        this.this$0 = mrtrPre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PostpaidSearchPackage postpaidSearchPackage) {
        invoke2(postpaidSearchPackage);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PostpaidSearchPackage postpaidSearchPackage) {
        MutableLiveData m2149k0;
        m2149k0 = this.this$0.m2149k0();
        m2149k0.setValue(Resource.Companion.success(postpaidSearchPackage));
    }
}