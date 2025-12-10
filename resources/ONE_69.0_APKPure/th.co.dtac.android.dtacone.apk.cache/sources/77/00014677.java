package th.p047co.dtac.android.dtacone.view.appOne.topup.fragment;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupPriceListFragment$autoStrechRefill$2 */
/* loaded from: classes10.dex */
public final class OneTopupPriceListFragment$autoStrechRefill$2 extends Lambda implements Function1<String, String> {
    public static final OneTopupPriceListFragment$autoStrechRefill$2 INSTANCE = new OneTopupPriceListFragment$autoStrechRefill$2();

    public OneTopupPriceListFragment$autoStrechRefill$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(@Nullable String str) {
        return PhoneNumberFormat.toInternationalNumberFormat(str, PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND);
    }
}