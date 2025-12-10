package co.omise.android.models;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import co.omise.android.api.RequestBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import okhttp3.HttpUrl;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Parcelize
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001=B\u009d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¡\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\rHÆ\u0001J\t\u00101\u001a\u000202HÖ\u0001J\u0013\u00103\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000202HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000202HÖ\u0001R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0011\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018¨\u0006>"}, m28850d2 = {"Lco/omise/android/models/NetceteraConfig;", "Lco/omise/android/models/Model;", "identifier", "", "deviceInfoEncryptionAlg", "deviceInfoEncryptionEnc", "deviceInfoEncryptionCertPem", "directoryServerId", Action.KEY_ATTRIBUTE, "messageVersion", "modelObject", "id", "livemode", "", FirebaseAnalytics.Param.LOCATION, "created", "Lorg/joda/time/DateTime;", "deleted", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lorg/joda/time/DateTime;Z)V", "getCreated", "()Lorg/joda/time/DateTime;", "getDeleted", "()Z", "getDeviceInfoEncryptionAlg", "()Ljava/lang/String;", "getDeviceInfoEncryptionCertPem", "getDeviceInfoEncryptionEnc", "getDirectoryServerId", "getId", "getIdentifier", "getKey", "getLivemode", "getLocation", "getMessageVersion", "getModelObject", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "NetceteraConfigRequestBuilder", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class NetceteraConfig implements Model {
    @NotNull
    public static final Parcelable.Creator<NetceteraConfig> CREATOR = new Creator();
    @Nullable
    private final DateTime created;
    private final boolean deleted;
    @JsonProperty("device_info_encryption_alg")
    @Nullable
    private final String deviceInfoEncryptionAlg;
    @JsonProperty("device_info_encryption_cert_pem")
    @Nullable
    private final String deviceInfoEncryptionCertPem;
    @JsonProperty("device_info_encryption_enc")
    @Nullable
    private final String deviceInfoEncryptionEnc;
    @JsonProperty("directory_server_id")
    @Nullable
    private final String directoryServerId;
    @Nullable

    /* renamed from: id */
    private final String f40259id;
    @JsonProperty("identifier")
    @Nullable
    private final String identifier;
    @JsonProperty(Action.KEY_ATTRIBUTE)
    @Nullable
    private final String key;
    private final boolean livemode;
    @Nullable
    private final String location;
    @JsonProperty("message_version")
    @Nullable
    private final String messageVersion;
    @Nullable
    private final String modelObject;

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<NetceteraConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NetceteraConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NetceteraConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NetceteraConfig[] newArray(int i) {
            return new NetceteraConfig[i];
        }
    }

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0014J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28850d2 = {"Lco/omise/android/models/NetceteraConfig$NetceteraConfigRequestBuilder;", "Lco/omise/android/api/RequestBuilder;", "Lco/omise/android/models/NetceteraConfig;", "()V", "configUrl", "", FirebaseAnalytics.Param.METHOD, ClientCookie.PATH_ATTR, "Lokhttp3/HttpUrl;", "type", "Ljava/lang/Class;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class NetceteraConfigRequestBuilder extends RequestBuilder<NetceteraConfig> {
        @Nullable
        private String configUrl;

        @NotNull
        public final NetceteraConfigRequestBuilder configUrl(@NotNull String configUrl) {
            Intrinsics.checkNotNullParameter(configUrl, "configUrl");
            this.configUrl = configUrl;
            return this;
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public String method() {
            return "GET";
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public HttpUrl path() {
            HttpUrl httpUrl;
            String str = this.configUrl;
            if (str != null && (httpUrl = HttpUrl.Companion.get(str)) != null) {
                return httpUrl;
            }
            throw new IllegalArgumentException("configUrl is required.");
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public Class<NetceteraConfig> type() {
            return NetceteraConfig.class;
        }
    }

    public NetceteraConfig() {
        this(null, null, null, null, null, null, null, null, null, false, null, null, false, 8191, null);
    }

    @Nullable
    public final String component1() {
        return this.identifier;
    }

    public final boolean component10() {
        return getLivemode();
    }

    @Nullable
    public final String component11() {
        return getLocation();
    }

    @Nullable
    public final DateTime component12() {
        return getCreated();
    }

    public final boolean component13() {
        return getDeleted();
    }

    @Nullable
    public final String component2() {
        return this.deviceInfoEncryptionAlg;
    }

    @Nullable
    public final String component3() {
        return this.deviceInfoEncryptionEnc;
    }

    @Nullable
    public final String component4() {
        return this.deviceInfoEncryptionCertPem;
    }

    @Nullable
    public final String component5() {
        return this.directoryServerId;
    }

    @Nullable
    public final String component6() {
        return this.key;
    }

    @Nullable
    public final String component7() {
        return this.messageVersion;
    }

    @Nullable
    public final String component8() {
        return getModelObject();
    }

    @Nullable
    public final String component9() {
        return getId();
    }

    @NotNull
    public final NetceteraConfig copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, boolean z, @Nullable String str10, @Nullable DateTime dateTime, boolean z2) {
        return new NetceteraConfig(str, str2, str3, str4, str5, str6, str7, str8, str9, z, str10, dateTime, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NetceteraConfig) {
            NetceteraConfig netceteraConfig = (NetceteraConfig) obj;
            return Intrinsics.areEqual(this.identifier, netceteraConfig.identifier) && Intrinsics.areEqual(this.deviceInfoEncryptionAlg, netceteraConfig.deviceInfoEncryptionAlg) && Intrinsics.areEqual(this.deviceInfoEncryptionEnc, netceteraConfig.deviceInfoEncryptionEnc) && Intrinsics.areEqual(this.deviceInfoEncryptionCertPem, netceteraConfig.deviceInfoEncryptionCertPem) && Intrinsics.areEqual(this.directoryServerId, netceteraConfig.directoryServerId) && Intrinsics.areEqual(this.key, netceteraConfig.key) && Intrinsics.areEqual(this.messageVersion, netceteraConfig.messageVersion) && Intrinsics.areEqual(getModelObject(), netceteraConfig.getModelObject()) && Intrinsics.areEqual(getId(), netceteraConfig.getId()) && getLivemode() == netceteraConfig.getLivemode() && Intrinsics.areEqual(getLocation(), netceteraConfig.getLocation()) && Intrinsics.areEqual(getCreated(), netceteraConfig.getCreated()) && getDeleted() == netceteraConfig.getDeleted();
        }
        return false;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public DateTime getCreated() {
        return this.created;
    }

    @Override // co.omise.android.models.Model
    public boolean getDeleted() {
        return this.deleted;
    }

    @Nullable
    public final String getDeviceInfoEncryptionAlg() {
        return this.deviceInfoEncryptionAlg;
    }

    @Nullable
    public final String getDeviceInfoEncryptionCertPem() {
        return this.deviceInfoEncryptionCertPem;
    }

    @Nullable
    public final String getDeviceInfoEncryptionEnc() {
        return this.deviceInfoEncryptionEnc;
    }

    @Nullable
    public final String getDirectoryServerId() {
        return this.directoryServerId;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public String getId() {
        return this.f40259id;
    }

    @Nullable
    public final String getIdentifier() {
        return this.identifier;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Override // co.omise.android.models.Model
    public boolean getLivemode() {
        return this.livemode;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public String getLocation() {
        return this.location;
    }

    @Nullable
    public final String getMessageVersion() {
        return this.messageVersion;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public String getModelObject() {
        return this.modelObject;
    }

    public int hashCode() {
        String str = this.identifier;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deviceInfoEncryptionAlg;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceInfoEncryptionEnc;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceInfoEncryptionCertPem;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.directoryServerId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.key;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.messageVersion;
        int hashCode7 = (((((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + (getModelObject() == null ? 0 : getModelObject().hashCode())) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31;
        boolean livemode = getLivemode();
        int i = livemode;
        if (livemode) {
            i = 1;
        }
        int hashCode8 = (((((hashCode7 + i) * 31) + (getLocation() == null ? 0 : getLocation().hashCode())) * 31) + (getCreated() != null ? getCreated().hashCode() : 0)) * 31;
        boolean deleted = getDeleted();
        return hashCode8 + (deleted ? 1 : deleted);
    }

    @NotNull
    public String toString() {
        return "NetceteraConfig(identifier=" + this.identifier + ", deviceInfoEncryptionAlg=" + this.deviceInfoEncryptionAlg + ", deviceInfoEncryptionEnc=" + this.deviceInfoEncryptionEnc + ", deviceInfoEncryptionCertPem=" + this.deviceInfoEncryptionCertPem + ", directoryServerId=" + this.directoryServerId + ", key=" + this.key + ", messageVersion=" + this.messageVersion + ", modelObject=" + getModelObject() + ", id=" + getId() + ", livemode=" + getLivemode() + ", location=" + getLocation() + ", created=" + getCreated() + ", deleted=" + getDeleted() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.identifier);
        out.writeString(this.deviceInfoEncryptionAlg);
        out.writeString(this.deviceInfoEncryptionEnc);
        out.writeString(this.deviceInfoEncryptionCertPem);
        out.writeString(this.directoryServerId);
        out.writeString(this.key);
        out.writeString(this.messageVersion);
        out.writeString(this.modelObject);
        out.writeString(this.f40259id);
        out.writeInt(this.livemode ? 1 : 0);
        out.writeString(this.location);
        out.writeSerializable(this.created);
        out.writeInt(this.deleted ? 1 : 0);
    }

    public NetceteraConfig(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, boolean z, @Nullable String str10, @Nullable DateTime dateTime, boolean z2) {
        this.identifier = str;
        this.deviceInfoEncryptionAlg = str2;
        this.deviceInfoEncryptionEnc = str3;
        this.deviceInfoEncryptionCertPem = str4;
        this.directoryServerId = str5;
        this.key = str6;
        this.messageVersion = str7;
        this.modelObject = str8;
        this.f40259id = str9;
        this.livemode = z;
        this.location = str10;
        this.created = dateTime;
        this.deleted = z2;
    }

    public /* synthetic */ NetceteraConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, DateTime dateTime, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? null : str10, (i & 2048) == 0 ? dateTime : null, (i & 4096) == 0 ? z2 : false);
    }
}
