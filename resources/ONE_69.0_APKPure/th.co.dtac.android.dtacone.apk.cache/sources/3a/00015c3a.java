package th.p047co.dtac.android.dtacone.widget.compose.consent;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/compose/consent/ConsentType;", "", "type", "", "imageT", "", "imageD", "iconT", "iconD", "(Ljava/lang/String;ILjava/lang/String;IIII)V", "getIconD", "()I", "getIconT", "getImageD", "getImageT", "getType", "()Ljava/lang/String;", "TELCO", Constant.ConsentDomain.PDPA, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.ConsentType */
/* loaded from: classes9.dex */
public enum ConsentType {
    TELCO("telco", R.drawable.ic_consent_telco_true, R.drawable.ic_consent_telco_dtac, R.drawable.icon_true_consent, R.drawable.ic_dtaclogo),
    PDPA("pdpa", R.drawable.ic_consent_non_telco_true, R.drawable.ic_consent_non_telco_dtac, R.drawable.icon_true_consent, R.drawable.ic_dtaclogo);
    
    private final int iconD;
    private final int iconT;
    private final int imageD;
    private final int imageT;
    @NotNull
    private final String type;

    ConsentType(String str, int i, int i2, int i3, int i4) {
        this.type = str;
        this.imageT = i;
        this.imageD = i2;
        this.iconT = i3;
        this.iconD = i4;
    }

    public final int getIconD() {
        return this.iconD;
    }

    public final int getIconT() {
        return this.iconT;
    }

    public final int getImageD() {
        return this.imageD;
    }

    public final int getImageT() {
        return this.imageT;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}