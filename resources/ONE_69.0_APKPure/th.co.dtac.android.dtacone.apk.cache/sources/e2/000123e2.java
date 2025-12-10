package th.p047co.dtac.android.dtacone.presenter.login;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", OperatorName.MOVE_TO, "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.login.NewRequestOtpPresenter$requestOtp$1 */
/* loaded from: classes8.dex */
public final class NewRequestOtpPresenter$requestOtp$1 extends Lambda implements Function1<String, String> {
    public static final NewRequestOtpPresenter$requestOtp$1 INSTANCE = new NewRequestOtpPresenter$requestOtp$1();

    public NewRequestOtpPresenter$requestOtp$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(@NotNull String m) {
        Intrinsics.checkNotNullParameter(m, "m");
        return PhoneNumberFormat.toInternationalNumberFormat(m, PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND);
    }
}