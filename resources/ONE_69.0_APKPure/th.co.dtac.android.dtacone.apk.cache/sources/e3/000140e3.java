package th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/installation/InstallAppointmentTimeRange;", "", "label", "", "desc", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getLabel", "MORNING", "AFTERNOON", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallAppointmentTimeRange */
/* loaded from: classes10.dex */
public enum InstallAppointmentTimeRange {
    MORNING("เช้า", "9:00-12:00"),
    AFTERNOON("บ่าย", "13:00-18:00");
    
    @NotNull
    private final String desc;
    @NotNull
    private final String label;

    InstallAppointmentTimeRange(String str, String str2) {
        this.label = str;
        this.desc = str2;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }
}