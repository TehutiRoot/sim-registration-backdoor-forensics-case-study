package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.model.channel.OneChannelTopicResponse;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/app_one/model/channel/OneChannelTopicResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.GetProfileViewModel$callApiGetChannelTopic$2 */
/* loaded from: classes9.dex */
public final class GetProfileViewModel$callApiGetChannelTopic$2 extends Lambda implements Function1<OneChannelTopicResponse, List<? extends String>> {
    final /* synthetic */ GetProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProfileViewModel$callApiGetChannelTopic$2(GetProfileViewModel getProfileViewModel) {
        super(1);
        this.this$0 = getProfileViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<String> invoke(@NotNull OneChannelTopicResponse it) {
        LoginRepository loginRepository;
        Intrinsics.checkNotNullParameter(it, "it");
        loginRepository = this.this$0.f106079b;
        loginRepository.resetHeaderApplication();
        this.this$0.m2519Q(it.getDataList());
        this.this$0.m2518R();
        return it.getDataList();
    }
}