package th.p047co.dtac.android.dtacone.model.staff;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import th.p047co.dtac.android.dtacone.model.permission.Permission;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;

/* renamed from: th.co.dtac.android.dtacone.model.staff.StaffCollection */
/* loaded from: classes8.dex */
public class StaffCollection implements Parcelable {
    public static final Parcelable.Creator<StaffCollection> CREATOR = new C14257a();
    public static final long UNLIMIT_CREDIT = 9999999;
    @SerializedName("credit")
    private long credit;
    @SerializedName("displayDate")
    private String displayDate;
    @SerializedName("id")

    /* renamed from: id */
    private Long f85186id;
    @SerializedName("name")
    private String name;
    @SerializedName("permissions")
    private List<Permission> permissions;
    @SerializedName("userId")
    private String phoneNumber;
    @SerializedName("soldAmount")
    private int soldAmount;

    /* renamed from: th.co.dtac.android.dtacone.model.staff.StaffCollection$a */
    /* loaded from: classes8.dex */
    public class C14257a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public StaffCollection createFromParcel(Parcel parcel) {
            return new StaffCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public StaffCollection[] newArray(int i) {
            return new StaffCollection[i];
        }
    }

    public StaffCollection(String str, String str2, String str3, List<Permission> list, long j, int i, Long l) {
        this.phoneNumber = str;
        this.displayDate = str2;
        this.name = str3;
        this.permissions = list;
        this.credit = j;
        this.soldAmount = i;
        this.f85186id = l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCredit() {
        return this.credit;
    }

    public String getDisplayDate() {
        return this.displayDate;
    }

    public String getDisplayStaff() {
        String localNumberWithPrettyFormat = PhoneNumberFormat.toLocalNumberWithPrettyFormat(getPhoneNumber(), PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND);
        if (StringUtil.hasText(getName())) {
            return getName() + " : " + localNumberWithPrettyFormat;
        }
        return localNumberWithPrettyFormat;
    }

    public Long getId() {
        return this.f85186id;
    }

    public String getName() {
        return this.name;
    }

    public List<Permission> getPermissions() {
        return this.permissions;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getSoldAmount() {
        return this.soldAmount;
    }

    public boolean isMaxCredit() {
        if (this.credit == UNLIMIT_CREDIT) {
            return true;
        }
        return false;
    }

    public void setCredit(long j) {
        this.credit = j;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPermissions(List<Permission> list) {
        this.permissions = list;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setSoldAmount(int i) {
        this.soldAmount = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f85186id.longValue());
        parcel.writeString(this.name);
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.displayDate);
        parcel.writeTypedList(this.permissions);
        parcel.writeLong(this.credit);
        parcel.writeInt(this.soldAmount);
    }

    public StaffCollection() {
    }

    public StaffCollection(Long l, List<Permission> list) {
        this.permissions = list;
        this.f85186id = l;
    }

    public StaffCollection(Parcel parcel) {
        this.f85186id = Long.valueOf(parcel.readLong());
        this.name = parcel.readString();
        this.phoneNumber = parcel.readString();
        this.displayDate = parcel.readString();
        this.permissions = parcel.createTypedArrayList(Permission.CREATOR);
        this.credit = parcel.readLong();
        this.soldAmount = parcel.readInt();
    }
}