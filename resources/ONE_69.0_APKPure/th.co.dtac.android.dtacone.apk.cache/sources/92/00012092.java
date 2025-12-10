package th.p047co.dtac.android.dtacone.model.staff;

import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.staff.RenameStaffCollection */
/* loaded from: classes8.dex */
public class RenameStaffCollection {
    @SerializedName("name")
    private String name;

    public RenameStaffCollection(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}