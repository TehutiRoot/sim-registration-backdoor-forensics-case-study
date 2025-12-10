package th.p047co.dtac.android.dtacone.repository.mrtr_pre2post;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.otp_v3.request.RequestOtpV3Response;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/otp_v3/request/RequestOtpV3Response;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nMrtrPre2PostRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MrtrPre2PostRepository.kt\nth/co/dtac/android/dtacone/repository/mrtr_pre2post/MrtrPre2PostRepository$requestOTPPre2Post$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,747:1\n1#2:748\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.repository.mrtr_pre2post.MrtrPre2PostRepository$requestOTPPre2Post$1 */
/* loaded from: classes8.dex */
public final class MrtrPre2PostRepository$requestOTPPre2Post$1 extends Lambda implements Function1<RequestOtpV3Response, RequestOtpV3Response> {
    final /* synthetic */ MrtrPre2PostRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostRepository$requestOTPPre2Post$1(MrtrPre2PostRepository mrtrPre2PostRepository) {
        super(1);
        this.this$0 = mrtrPre2PostRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final RequestOtpV3Response invoke(@NotNull RequestOtpV3Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String href = it.getHref();
        if (href != null) {
            this.this$0.setHref(href);
        }
        return it;
    }
}