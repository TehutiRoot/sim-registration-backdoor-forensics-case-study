package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import io.reactivex.SingleSource;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC11663a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "", "", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.LoginMrtrViewModel$callAPILoginMrtr$5 */
/* loaded from: classes9.dex */
public final class LoginMrtrViewModel$callAPILoginMrtr$5 extends Lambda implements Function1<Map<String, ? extends String>, SingleSource<? extends Map<String, ? extends String>>> {
    final /* synthetic */ LoginMrtrViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginMrtrViewModel$callAPILoginMrtr$5(LoginMrtrViewModel loginMrtrViewModel) {
        super(1);
        this.this$0 = loginMrtrViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ SingleSource<? extends Map<String, ? extends String>> invoke(Map<String, ? extends String> map) {
        return invoke2((Map<String, String>) map);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final SingleSource<? extends Map<String, String>> invoke2(@NotNull Map<String, String> it) {
        RtrRx2Repository rtrRx2Repository;
        Intrinsics.checkNotNullParameter(it, "it");
        rtrRx2Repository = this.this$0.f106149f;
        return rtrRx2Repository.saveMobileConfig(it).single(AbstractC11663a.emptyMap());
    }
}