package th.p047co.dtac.android.dtacone.app_one.util.p048enum;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/util/enum/OneCommissionType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "RETAILER_PROFILE_COMMISSION_AIR_TIME_TYPE", "RETAILER_PROFILE_COMMISSION_CASH_TYPE", "RETAILER_PROFILE_COMMISSION_OTHER_TYPE", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.util.enum.OneCommissionType */
/* loaded from: classes7.dex */
public enum OneCommissionType {
    RETAILER_PROFILE_COMMISSION_AIR_TIME_TYPE("แอร์ไทม์"),
    RETAILER_PROFILE_COMMISSION_CASH_TYPE("เงินสด"),
    RETAILER_PROFILE_COMMISSION_OTHER_TYPE("ไม่รับผลตอบแทน");
    
    @NotNull
    private final String type;

    OneCommissionType(String str) {
        this.type = str;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}