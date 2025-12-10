package th.p047co.dtac.android.dtacone.repository.mrtr_pre2post;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lokhttp3/ResponseBody;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.repository.mrtr_pre2post.MrtrPre2PostRepository$verifyPre2PostIDNumber$1 */
/* loaded from: classes8.dex */
public final class MrtrPre2PostRepository$verifyPre2PostIDNumber$1 extends Lambda implements Function1<ResponseBody, ResponseBody> {
    final /* synthetic */ String $idNumber;
    final /* synthetic */ MrtrPre2PostRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostRepository$verifyPre2PostIDNumber$1(MrtrPre2PostRepository mrtrPre2PostRepository, String str) {
        super(1);
        this.this$0 = mrtrPre2PostRepository;
        this.$idNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ResponseBody invoke(@NotNull ResponseBody it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.getModel().setIdNumber(this.this$0.encryptCBC(this.$idNumber));
        return it;
    }
}