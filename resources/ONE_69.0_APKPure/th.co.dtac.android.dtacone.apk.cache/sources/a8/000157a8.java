package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/login/SessionEntity;", "invoke", "(Lth/co/dtac/android/dtacone/model/login/SessionEntity;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.GetProfileViewModel$retryLoginMrtr$1 */
/* loaded from: classes9.dex */
public final class GetProfileViewModel$retryLoginMrtr$1 extends Lambda implements Function1<SessionEntity, Boolean> {
    public static final GetProfileViewModel$retryLoginMrtr$1 INSTANCE = new GetProfileViewModel$retryLoginMrtr$1();

    public GetProfileViewModel$retryLoginMrtr$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull SessionEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(StringUtil.hasText(it.getToken().getToken()));
    }
}