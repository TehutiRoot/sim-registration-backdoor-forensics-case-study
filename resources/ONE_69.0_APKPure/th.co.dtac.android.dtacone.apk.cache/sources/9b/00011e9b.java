package th.p047co.dtac.android.dtacone.model.login;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.login.TokenCollection */
/* loaded from: classes8.dex */
public class TokenCollection {
    @SerializedName("channel")
    private String channel;
    @SerializedName("dolStatus")
    private String dolStatus;
    @SerializedName("dtrCode")
    private String dtrCode;
    @SerializedName("id")

    /* renamed from: id */
    private Long f85176id;
    @SerializedName("locationCode")
    private String locationCode;
    @SerializedName("locationName")
    private String locationName;
    @SerializedName("retailerSubType")
    private String retailerSubType;
    @SerializedName("retailerType")
    private String retailerType;
    @SerializedName("rtrCode")
    private String rtrCode;
    @SerializedName("rtrName")
    private String rtrName;
    @SerializedName("simR")
    private String simR;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private String status;
    @SerializedName("subChannel")
    private String subChannel;
    @SerializedName("token")
    private String token;
    @SerializedName("userCode")
    private String userCode;
    @SerializedName("userLan")
    private String userLan;
    @SerializedName("userName")
    private String userName;
    @SerializedName("userType")
    private String userType;
    @SerializedName("userTypeFormat")
    private String userTypeFormat;

    public TokenCollection() {
        this.userTypeFormat = "TELEPHONE_NUMBER";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenCollection)) {
            return false;
        }
        TokenCollection tokenCollection = (TokenCollection) obj;
        Long l = this.f85176id;
        if (l == null ? tokenCollection.f85176id != null : !l.equals(tokenCollection.f85176id)) {
            return false;
        }
        String str = this.token;
        String str2 = tokenCollection.token;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getDolStatus() {
        return this.dolStatus;
    }

    public String getDtrCode() {
        return this.dtrCode;
    }

    public Long getId() {
        return this.f85176id;
    }

    public String getLocationCode() {
        String str = this.locationCode;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getLocationName() {
        return this.locationName;
    }

    public String getRetailerSubType() {
        return this.retailerSubType;
    }

    public String getRetailerType() {
        return this.retailerType;
    }

    public String getRtrCode() {
        return this.rtrCode;
    }

    public String getRtrName() {
        return this.rtrName;
    }

    public String getSimR() {
        return this.simR;
    }

    public String getStatus() {
        return this.status;
    }

    public String getSubChannel() {
        return this.subChannel;
    }

    public String getToken() {
        return this.token;
    }

    public String getUserCode() {
        String str = this.userCode;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getUserLan() {
        String str = this.userLan;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getUserName() {
        String str = this.userName;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getUserType() {
        return this.userType;
    }

    public String getUserTypeFormat() {
        String str = this.userTypeFormat;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int hashCode() {
        int i;
        Long l = this.f85176id;
        int i2 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str = this.token;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    public void setSimR(String str) {
        this.simR = str;
    }

    public TokenCollection(String str) {
        this(null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public TokenCollection(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.userTypeFormat = "TELEPHONE_NUMBER";
        this.f85176id = l;
        this.token = str;
        this.rtrName = str2;
        this.simR = str3;
        this.rtrCode = str4;
        this.dtrCode = str5;
        this.status = str6;
        this.userType = str7;
        this.channel = str8;
        this.subChannel = str9;
        this.retailerType = str10;
        this.retailerSubType = str11;
        this.userLan = str12;
        this.userCode = str13;
        this.locationCode = str14;
        this.locationName = str15;
        if (str16 != null && !str16.isEmpty()) {
            this.userTypeFormat = str16;
        }
        this.userName = str17;
    }
}