package th.p047co.dtac.android.dtacone.model.staff;

import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.staff.StaffCreditUpdateCollection */
/* loaded from: classes8.dex */
public class StaffCreditUpdateCollection {
    @SerializedName("credit")
    private long credit;
    @SerializedName("id")

    /* renamed from: id */
    private Long f85188id;

    public StaffCreditUpdateCollection(Long l, long j) {
        this.f85188id = l;
        this.credit = j;
    }

    public long getCredit() {
        return this.credit;
    }

    public Long getId() {
        return this.f85188id;
    }
}