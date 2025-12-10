package th.p047co.dtac.android.dtacone.model.staff;

import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.staff.StaffCreditResetCollection */
/* loaded from: classes8.dex */
public class StaffCreditResetCollection {
    @SerializedName("id")

    /* renamed from: id */
    private Long f85187id;
    @SerializedName("soldAmount")
    private long soldAmount;

    public StaffCreditResetCollection(Long l, long j) {
        this.f85187id = l;
        this.soldAmount = j;
    }

    public Long getId() {
        return this.f85187id;
    }

    public long getSoldAmount() {
        return this.soldAmount;
    }
}