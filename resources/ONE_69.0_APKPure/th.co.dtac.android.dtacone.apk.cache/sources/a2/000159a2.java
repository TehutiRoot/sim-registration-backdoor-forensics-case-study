package th.p047co.dtac.android.dtacone.viewmodel.mrtr_pre2post;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.otp_v3.verify.VerifyOtpTransactionResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_pre2post.MrtrPre2PostRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/otp_v3/verify/VerifyOtpTransactionResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_pre2post.MrtrPre2PostViewModel$verifyOtpTransaction$3 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostViewModel$verifyOtpTransaction$3 extends Lambda implements Function1<VerifyOtpTransactionResponse, Unit> {
    final /* synthetic */ String $mobileNumber;
    final /* synthetic */ String $otp;
    final /* synthetic */ MrtrPre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostViewModel$verifyOtpTransaction$3(MrtrPre2PostViewModel mrtrPre2PostViewModel, String str, String str2) {
        super(1);
        this.this$0 = mrtrPre2PostViewModel;
        this.$mobileNumber = str;
        this.$otp = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(VerifyOtpTransactionResponse verifyOtpTransactionResponse) {
        invoke2(verifyOtpTransactionResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(VerifyOtpTransactionResponse verifyOtpTransactionResponse) {
        MrtrPre2PostRepository mrtrPre2PostRepository;
        this.this$0.m2183N(this.$mobileNumber);
        mrtrPre2PostRepository = this.this$0.f106609c;
        mrtrPre2PostRepository.getModel().setOtpCode(this.$otp);
    }
}