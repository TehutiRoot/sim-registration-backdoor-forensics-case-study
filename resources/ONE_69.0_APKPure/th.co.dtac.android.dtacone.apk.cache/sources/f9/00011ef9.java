package th.p047co.dtac.android.dtacone.model.mrtr_online_registration.bank;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m29142d2 = {"getBankImage", "", "", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_online_registration.bank.BankExtKt */
/* loaded from: classes8.dex */
public final class BankExtKt {
    public static final int getBankImage(@Nullable String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 1072356658:
                    if (str.equals("0020000")) {
                        return R.drawable.ic_bkk_bank;
                    }
                    break;
                case 1074203700:
                    if (str.equals("0040000")) {
                        return R.drawable.ic_k_bank;
                    }
                    break;
                case 1076050742:
                    if (str.equals("0060000")) {
                        return R.drawable.ic_ktb;
                    }
                    break;
                case 1102832851:
                    if (str.equals("0140000")) {
                        return R.drawable.ic_scb_bank;
                    }
                    break;
                case 1132385523:
                    if (str.equals("0250000")) {
                        return R.drawable.ic_bay_bank;
                    }
                    break;
            }
        }
        return R.drawable.image_default;
    }
}