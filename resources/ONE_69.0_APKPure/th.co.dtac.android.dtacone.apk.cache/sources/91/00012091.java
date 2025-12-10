package th.p047co.dtac.android.dtacone.model.staff;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: th.co.dtac.android.dtacone.model.staff.PermissionCollection */
/* loaded from: classes8.dex */
public class PermissionCollection {
    @SerializedName("permissions")
    private List<String> permissions;
    @SerializedName("id")
    private Long staffId;

    public PermissionCollection(Long l, List<String> list) {
        this.staffId = l;
        this.permissions = list;
    }

    public List<String> getPermissions() {
        return this.permissions;
    }
}