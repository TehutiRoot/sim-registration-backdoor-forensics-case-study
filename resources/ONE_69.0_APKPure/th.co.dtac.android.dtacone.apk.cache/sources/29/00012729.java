package th.p047co.dtac.android.dtacone.util.p052enum;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.constant.mixpanel.top_up.TopUpMixpanel;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/enum/SellingType;", "", "typeName", "", "requesterZoneName", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getRequesterZoneName", "()Ljava/lang/String;", "getTypeName", TopUpMixpanel.OFFER_NONE, "Upsell", "Downsell", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.enum.SellingType */
/* loaded from: classes8.dex */
public enum SellingType {
    NONE("", ""),
    Upsell("Upselling", "UPSELL"),
    Downsell("Downsell", "DOWNSELL");
    
    @NotNull
    private final String requesterZoneName;
    @NotNull
    private final String typeName;

    SellingType(String str, String str2) {
        this.typeName = str;
        this.requesterZoneName = str2;
    }

    @NotNull
    public final String getRequesterZoneName() {
        return this.requesterZoneName;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }
}