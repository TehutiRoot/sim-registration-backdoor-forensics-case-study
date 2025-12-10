package th.p047co.dtac.android.dtacone.model.staff;

import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.staff.StaffLimitCollection */
/* loaded from: classes8.dex */
public class StaffLimitCollection {
    @SerializedName("limit")
    private int limit;
    @SerializedName("message")
    private String message;

    public StaffLimitCollection() {
    }

    public int getLimit() {
        return this.limit;
    }

    public String getMessage() {
        return this.message;
    }

    public StaffLimitCollection(int i, String str) {
        this.limit = i;
        this.message = str;
    }
}