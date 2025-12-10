package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.GetProfileViewModel$callApiGetChannelTopic$1 */
/* loaded from: classes9.dex */
public final class GetProfileViewModel$callApiGetChannelTopic$1 extends Lambda implements Function1<List<? extends String>, List<? extends String>> {
    final /* synthetic */ GetProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProfileViewModel$callApiGetChannelTopic$1(GetProfileViewModel getProfileViewModel) {
        super(1);
        this.this$0 = getProfileViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ List<? extends String> invoke(List<? extends String> list) {
        return invoke2((List<String>) list);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final List<String> invoke2(@NotNull List<String> it) {
        LoginRepository loginRepository;
        Intrinsics.checkNotNullParameter(it, "it");
        loginRepository = this.this$0.f106079b;
        loginRepository.resetHeaderApplication();
        this.this$0.m2519Q(it);
        this.this$0.m2518R();
        return it;
    }
}