package co.omise.android.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import ch.qos.logback.core.CoreConstants;
import co.omise.android.api.RequestBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import okhttp3.HttpUrl;
import okhttp3.RequestBody;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;
import th.p047co.dtac.android.dtacone.util.Constant;

@Parcelize
@Metadata(m29143d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004789:Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003Jo\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J\u0013\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\tHÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0010\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\r\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006;"}, m29142d2 = {"Lco/omise/android/models/Authentication;", "Lco/omise/android/models/Model;", NotificationCompat.CATEGORY_STATUS, "Lco/omise/android/models/Authentication$AuthenticationStatus;", "areq", "Lco/omise/android/models/Authentication$AReq;", "ares", "Lco/omise/android/models/Authentication$ARes;", "modelObject", "", "id", "livemode", "", FirebaseAnalytics.Param.LOCATION, "created", "Lorg/joda/time/DateTime;", "deleted", "(Lco/omise/android/models/Authentication$AuthenticationStatus;Lco/omise/android/models/Authentication$AReq;Lco/omise/android/models/Authentication$ARes;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lorg/joda/time/DateTime;Z)V", "getAreq", "()Lco/omise/android/models/Authentication$AReq;", "getAres", "()Lco/omise/android/models/Authentication$ARes;", "getCreated", "()Lorg/joda/time/DateTime;", "getDeleted", "()Z", "getId", "()Ljava/lang/String;", "getLivemode", "getLocation", "getModelObject", "getStatus", "()Lco/omise/android/models/Authentication$AuthenticationStatus;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "AReq", "ARes", "AuthenticationRequestBuilder", "AuthenticationStatus", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class Authentication implements Model {
    @NotNull
    public static final Parcelable.Creator<Authentication> CREATOR = new Creator();
    @Nullable
    private final AReq areq;
    @Nullable
    private final ARes ares;
    @Nullable
    private final DateTime created;
    private final boolean deleted;
    @Nullable

    /* renamed from: id */
    private final String f40262id;
    private final boolean livemode;
    @Nullable
    private final String location;
    @Nullable
    private final String modelObject;
    @NotNull
    private final AuthenticationStatus status;

    @Parcelize
    @Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, m29142d2 = {"Lco/omise/android/models/Authentication$AReq;", "Landroid/os/Parcelable;", "sdkReferenceNumber", "", "(Ljava/lang/String;)V", "getSdkReferenceNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class AReq implements Parcelable {
        @NotNull
        public static final Parcelable.Creator<AReq> CREATOR = new Creator();
        @Nullable
        private final String sdkReferenceNumber;

        @Metadata(m29141k = 3, m29140mv = {1, 7, 1}, m29138xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<AReq> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final AReq createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AReq(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final AReq[] newArray(int i) {
                return new AReq[i];
            }
        }

        public AReq() {
            this(null, 1, null);
        }

        public static /* synthetic */ AReq copy$default(AReq aReq, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aReq.sdkReferenceNumber;
            }
            return aReq.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.sdkReferenceNumber;
        }

        @NotNull
        public final AReq copy(@Nullable String str) {
            return new AReq(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AReq) && Intrinsics.areEqual(this.sdkReferenceNumber, ((AReq) obj).sdkReferenceNumber);
        }

        @Nullable
        public final String getSdkReferenceNumber() {
            return this.sdkReferenceNumber;
        }

        public int hashCode() {
            String str = this.sdkReferenceNumber;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "AReq(sdkReferenceNumber=" + this.sdkReferenceNumber + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.sdkReferenceNumber);
        }

        public AReq(@Nullable String str) {
            this.sdkReferenceNumber = str;
        }

        public /* synthetic */ AReq(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @Parcelize
    @Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006%"}, m29142d2 = {"Lco/omise/android/models/Authentication$ARes;", "Landroid/os/Parcelable;", "messageVersion", "", "threeDSServerTransID", "acsTransID", "sdkTransID", "acsSignedContent", "acsReferenceNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcsReferenceNumber", "()Ljava/lang/String;", "getAcsSignedContent", "getAcsTransID", "getMessageVersion", "getSdkTransID", "getThreeDSServerTransID", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class ARes implements Parcelable {
        @NotNull
        public static final Parcelable.Creator<ARes> CREATOR = new Creator();
        @Nullable
        private final String acsReferenceNumber;
        @Nullable
        private final String acsSignedContent;
        @Nullable
        private final String acsTransID;
        @Nullable
        private final String messageVersion;
        @Nullable
        private final String sdkTransID;
        @Nullable
        private final String threeDSServerTransID;

        @Metadata(m29141k = 3, m29140mv = {1, 7, 1}, m29138xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<ARes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ARes createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ARes(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ARes[] newArray(int i) {
                return new ARes[i];
            }
        }

        public ARes() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ ARes copy$default(ARes aRes, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aRes.messageVersion;
            }
            if ((i & 2) != 0) {
                str2 = aRes.threeDSServerTransID;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = aRes.acsTransID;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = aRes.sdkTransID;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = aRes.acsSignedContent;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = aRes.acsReferenceNumber;
            }
            return aRes.copy(str, str7, str8, str9, str10, str6);
        }

        @Nullable
        public final String component1() {
            return this.messageVersion;
        }

        @Nullable
        public final String component2() {
            return this.threeDSServerTransID;
        }

        @Nullable
        public final String component3() {
            return this.acsTransID;
        }

        @Nullable
        public final String component4() {
            return this.sdkTransID;
        }

        @Nullable
        public final String component5() {
            return this.acsSignedContent;
        }

        @Nullable
        public final String component6() {
            return this.acsReferenceNumber;
        }

        @NotNull
        public final ARes copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            return new ARes(str, str2, str3, str4, str5, str6);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ARes) {
                ARes aRes = (ARes) obj;
                return Intrinsics.areEqual(this.messageVersion, aRes.messageVersion) && Intrinsics.areEqual(this.threeDSServerTransID, aRes.threeDSServerTransID) && Intrinsics.areEqual(this.acsTransID, aRes.acsTransID) && Intrinsics.areEqual(this.sdkTransID, aRes.sdkTransID) && Intrinsics.areEqual(this.acsSignedContent, aRes.acsSignedContent) && Intrinsics.areEqual(this.acsReferenceNumber, aRes.acsReferenceNumber);
            }
            return false;
        }

        @Nullable
        public final String getAcsReferenceNumber() {
            return this.acsReferenceNumber;
        }

        @Nullable
        public final String getAcsSignedContent() {
            return this.acsSignedContent;
        }

        @Nullable
        public final String getAcsTransID() {
            return this.acsTransID;
        }

        @Nullable
        public final String getMessageVersion() {
            return this.messageVersion;
        }

        @Nullable
        public final String getSdkTransID() {
            return this.sdkTransID;
        }

        @Nullable
        public final String getThreeDSServerTransID() {
            return this.threeDSServerTransID;
        }

        public int hashCode() {
            String str = this.messageVersion;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.threeDSServerTransID;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.acsTransID;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sdkTransID;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.acsSignedContent;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.acsReferenceNumber;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ARes(messageVersion=" + this.messageVersion + ", threeDSServerTransID=" + this.threeDSServerTransID + ", acsTransID=" + this.acsTransID + ", sdkTransID=" + this.sdkTransID + ", acsSignedContent=" + this.acsSignedContent + ", acsReferenceNumber=" + this.acsReferenceNumber + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.messageVersion);
            out.writeString(this.threeDSServerTransID);
            out.writeString(this.acsTransID);
            out.writeString(this.sdkTransID);
            out.writeString(this.acsSignedContent);
            out.writeString(this.acsReferenceNumber);
        }

        public ARes(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this.messageVersion = str;
            this.threeDSServerTransID = str2;
            this.acsTransID = str3;
            this.sdkTransID = str4;
            this.acsSignedContent = str5;
            this.acsReferenceNumber = str6;
        }

        public /* synthetic */ ARes(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
        }
    }

    @Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007J\u0012\u0010\u000b\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\fH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0014R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0083D¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m29142d2 = {"Lco/omise/android/models/Authentication$AuthenticationRequestBuilder;", "Lco/omise/android/api/RequestBuilder;", "Lco/omise/android/models/Authentication;", "()V", "areq", "Lco/omise/android/models/Authentication$AuthenticationRequestBuilder$AReq;", "authorizeUrl", "", "deviceType", "getDeviceType$annotations", "encryptedDeviceInfo", "errorType", "Ljava/lang/Class;", "Ljava/lang/Error;", "Lkotlin/Error;", FirebaseAnalytics.Param.METHOD, ClientCookie.PATH_ATTR, "Lokhttp3/HttpUrl;", "payload", "Lokhttp3/RequestBody;", "type", "AReq", "SdkEphemPubKey", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class AuthenticationRequestBuilder extends RequestBuilder<Authentication> {
        @JsonProperty("areq")
        @Nullable
        private AReq areq;
        @JsonIgnore
        @Nullable
        private String authorizeUrl;
        @JsonProperty("device_type")
        @NotNull
        private final String deviceType = "Android";
        @JsonProperty("encrypted_device_info")
        @Nullable
        private String encryptedDeviceInfo;

        @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, m29142d2 = {"Lco/omise/android/models/Authentication$AuthenticationRequestBuilder$AReq;", "", "sdkAppID", "", "sdkEphemPubKey", "Lco/omise/android/models/Authentication$AuthenticationRequestBuilder$SdkEphemPubKey;", "sdkTransID", "sdkMaxTimeout", "", "(Ljava/lang/String;Lco/omise/android/models/Authentication$AuthenticationRequestBuilder$SdkEphemPubKey;Ljava/lang/String;I)V", "getSdkAppID", "()Ljava/lang/String;", "getSdkEphemPubKey", "()Lco/omise/android/models/Authentication$AuthenticationRequestBuilder$SdkEphemPubKey;", "getSdkMaxTimeout", "()I", "getSdkTransID", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
        /* loaded from: classes3.dex */
        public static final class AReq {
            @NotNull
            private final String sdkAppID;
            @NotNull
            private final SdkEphemPubKey sdkEphemPubKey;
            private final int sdkMaxTimeout;
            @NotNull
            private final String sdkTransID;

            public AReq(@NotNull String sdkAppID, @NotNull SdkEphemPubKey sdkEphemPubKey, @NotNull String sdkTransID, int i) {
                Intrinsics.checkNotNullParameter(sdkAppID, "sdkAppID");
                Intrinsics.checkNotNullParameter(sdkEphemPubKey, "sdkEphemPubKey");
                Intrinsics.checkNotNullParameter(sdkTransID, "sdkTransID");
                this.sdkAppID = sdkAppID;
                this.sdkEphemPubKey = sdkEphemPubKey;
                this.sdkTransID = sdkTransID;
                this.sdkMaxTimeout = i;
            }

            public static /* synthetic */ AReq copy$default(AReq aReq, String str, SdkEphemPubKey sdkEphemPubKey, String str2, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = aReq.sdkAppID;
                }
                if ((i2 & 2) != 0) {
                    sdkEphemPubKey = aReq.sdkEphemPubKey;
                }
                if ((i2 & 4) != 0) {
                    str2 = aReq.sdkTransID;
                }
                if ((i2 & 8) != 0) {
                    i = aReq.sdkMaxTimeout;
                }
                return aReq.copy(str, sdkEphemPubKey, str2, i);
            }

            @NotNull
            public final String component1() {
                return this.sdkAppID;
            }

            @NotNull
            public final SdkEphemPubKey component2() {
                return this.sdkEphemPubKey;
            }

            @NotNull
            public final String component3() {
                return this.sdkTransID;
            }

            public final int component4() {
                return this.sdkMaxTimeout;
            }

            @NotNull
            public final AReq copy(@NotNull String sdkAppID, @NotNull SdkEphemPubKey sdkEphemPubKey, @NotNull String sdkTransID, int i) {
                Intrinsics.checkNotNullParameter(sdkAppID, "sdkAppID");
                Intrinsics.checkNotNullParameter(sdkEphemPubKey, "sdkEphemPubKey");
                Intrinsics.checkNotNullParameter(sdkTransID, "sdkTransID");
                return new AReq(sdkAppID, sdkEphemPubKey, sdkTransID, i);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AReq) {
                    AReq aReq = (AReq) obj;
                    return Intrinsics.areEqual(this.sdkAppID, aReq.sdkAppID) && Intrinsics.areEqual(this.sdkEphemPubKey, aReq.sdkEphemPubKey) && Intrinsics.areEqual(this.sdkTransID, aReq.sdkTransID) && this.sdkMaxTimeout == aReq.sdkMaxTimeout;
                }
                return false;
            }

            @NotNull
            public final String getSdkAppID() {
                return this.sdkAppID;
            }

            @NotNull
            public final SdkEphemPubKey getSdkEphemPubKey() {
                return this.sdkEphemPubKey;
            }

            public final int getSdkMaxTimeout() {
                return this.sdkMaxTimeout;
            }

            @NotNull
            public final String getSdkTransID() {
                return this.sdkTransID;
            }

            public int hashCode() {
                return (((((this.sdkAppID.hashCode() * 31) + this.sdkEphemPubKey.hashCode()) * 31) + this.sdkTransID.hashCode()) * 31) + this.sdkMaxTimeout;
            }

            @NotNull
            public String toString() {
                return "AReq(sdkAppID=" + this.sdkAppID + ", sdkEphemPubKey=" + this.sdkEphemPubKey + ", sdkTransID=" + this.sdkTransID + ", sdkMaxTimeout=" + this.sdkMaxTimeout + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m29142d2 = {"Lco/omise/android/models/Authentication$AuthenticationRequestBuilder$SdkEphemPubKey;", "", "kty", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "crv", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCrv", "()Ljava/lang/String;", "getKty", "getX", "getY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
        /* loaded from: classes3.dex */
        public static final class SdkEphemPubKey {
            @Nullable
            private final String crv;
            @Nullable
            private final String kty;
            @Nullable

            /* renamed from: x */
            private final String f40263x;
            @Nullable

            /* renamed from: y */
            private final String f40264y;

            public SdkEphemPubKey() {
                this(null, null, null, null, 15, null);
            }

            public static /* synthetic */ SdkEphemPubKey copy$default(SdkEphemPubKey sdkEphemPubKey, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sdkEphemPubKey.kty;
                }
                if ((i & 2) != 0) {
                    str2 = sdkEphemPubKey.f40263x;
                }
                if ((i & 4) != 0) {
                    str3 = sdkEphemPubKey.f40264y;
                }
                if ((i & 8) != 0) {
                    str4 = sdkEphemPubKey.crv;
                }
                return sdkEphemPubKey.copy(str, str2, str3, str4);
            }

            @Nullable
            public final String component1() {
                return this.kty;
            }

            @Nullable
            public final String component2() {
                return this.f40263x;
            }

            @Nullable
            public final String component3() {
                return this.f40264y;
            }

            @Nullable
            public final String component4() {
                return this.crv;
            }

            @NotNull
            public final SdkEphemPubKey copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
                return new SdkEphemPubKey(str, str2, str3, str4);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof SdkEphemPubKey) {
                    SdkEphemPubKey sdkEphemPubKey = (SdkEphemPubKey) obj;
                    return Intrinsics.areEqual(this.kty, sdkEphemPubKey.kty) && Intrinsics.areEqual(this.f40263x, sdkEphemPubKey.f40263x) && Intrinsics.areEqual(this.f40264y, sdkEphemPubKey.f40264y) && Intrinsics.areEqual(this.crv, sdkEphemPubKey.crv);
                }
                return false;
            }

            @Nullable
            public final String getCrv() {
                return this.crv;
            }

            @Nullable
            public final String getKty() {
                return this.kty;
            }

            @Nullable
            public final String getX() {
                return this.f40263x;
            }

            @Nullable
            public final String getY() {
                return this.f40264y;
            }

            public int hashCode() {
                String str = this.kty;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f40263x;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f40264y;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.crv;
                return hashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "SdkEphemPubKey(kty=" + this.kty + ", x=" + this.f40263x + ", y=" + this.f40264y + ", crv=" + this.crv + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            public SdkEphemPubKey(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
                this.kty = str;
                this.f40263x = str2;
                this.f40264y = str3;
                this.crv = str4;
            }

            public /* synthetic */ SdkEphemPubKey(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
            }
        }

        private static /* synthetic */ void getDeviceType$annotations() {
        }

        @NotNull
        public final AuthenticationRequestBuilder areq(@NotNull AReq areq) {
            Intrinsics.checkNotNullParameter(areq, "areq");
            this.areq = areq;
            return this;
        }

        @NotNull
        public final AuthenticationRequestBuilder authorizeUrl(@NotNull String authorizeUrl) {
            Intrinsics.checkNotNullParameter(authorizeUrl, "authorizeUrl");
            this.authorizeUrl = authorizeUrl;
            return this;
        }

        @NotNull
        public final AuthenticationRequestBuilder encryptedDeviceInfo(@NotNull String encryptedDeviceInfo) {
            Intrinsics.checkNotNullParameter(encryptedDeviceInfo, "encryptedDeviceInfo");
            this.encryptedDeviceInfo = encryptedDeviceInfo;
            return this;
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public Class<Error> errorType() {
            return AuthenticationAPIError.class;
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public String method() {
            return "POST";
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public HttpUrl path() {
            HttpUrl httpUrl;
            String str = this.authorizeUrl;
            if (str != null && (httpUrl = HttpUrl.Companion.get(str)) != null) {
                return httpUrl;
            }
            throw new IllegalArgumentException("authorizeUrl is required.");
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public RequestBody payload() throws IOException {
            return serialize();
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public Class<Authentication> type() {
            return Authentication.class;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m29142d2 = {"Lco/omise/android/models/Authentication$AuthenticationStatus;", "", "value", "", "message", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getValue", "SUCCESS", Constant.QueryTransactionStatus.FAILED, "CHALLENGE_V1", "CHALLENGE", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public enum AuthenticationStatus {
        SUCCESS(FirebaseAnalytics.Param.SUCCESS, null, 2, null),
        FAILED("failed", "Authentication failed"),
        CHALLENGE_V1("challenge_v1", null, 2, null),
        CHALLENGE("challenge", null, 2, null);
        
        @Nullable
        private final String message;
        @NotNull
        private final String value;

        AuthenticationStatus(String str, String str2) {
            this.value = str;
            this.message = str2;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        /* synthetic */ AuthenticationStatus(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Authentication> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Authentication createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Authentication(AuthenticationStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : AReq.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ARes.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Authentication[] newArray(int i) {
            return new Authentication[i];
        }
    }

    public Authentication() {
        this(null, null, null, null, null, false, null, null, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @NotNull
    public final AuthenticationStatus component1() {
        return this.status;
    }

    @Nullable
    public final AReq component2() {
        return this.areq;
    }

    @Nullable
    public final ARes component3() {
        return this.ares;
    }

    @Nullable
    public final String component4() {
        return getModelObject();
    }

    @Nullable
    public final String component5() {
        return getId();
    }

    public final boolean component6() {
        return getLivemode();
    }

    @Nullable
    public final String component7() {
        return getLocation();
    }

    @Nullable
    public final DateTime component8() {
        return getCreated();
    }

    public final boolean component9() {
        return getDeleted();
    }

    @NotNull
    public final Authentication copy(@NotNull AuthenticationStatus status, @Nullable AReq aReq, @Nullable ARes aRes, @Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, @Nullable DateTime dateTime, boolean z2) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new Authentication(status, aReq, aRes, str, str2, z, str3, dateTime, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Authentication) {
            Authentication authentication = (Authentication) obj;
            return this.status == authentication.status && Intrinsics.areEqual(this.areq, authentication.areq) && Intrinsics.areEqual(this.ares, authentication.ares) && Intrinsics.areEqual(getModelObject(), authentication.getModelObject()) && Intrinsics.areEqual(getId(), authentication.getId()) && getLivemode() == authentication.getLivemode() && Intrinsics.areEqual(getLocation(), authentication.getLocation()) && Intrinsics.areEqual(getCreated(), authentication.getCreated()) && getDeleted() == authentication.getDeleted();
        }
        return false;
    }

    @Nullable
    public final AReq getAreq() {
        return this.areq;
    }

    @Nullable
    public final ARes getAres() {
        return this.ares;
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

    @Override // co.omise.android.models.Model
    @Nullable
    public String getId() {
        return this.f40262id;
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

    @Override // co.omise.android.models.Model
    @Nullable
    public String getModelObject() {
        return this.modelObject;
    }

    @NotNull
    public final AuthenticationStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        AReq aReq = this.areq;
        int hashCode2 = (hashCode + (aReq == null ? 0 : aReq.hashCode())) * 31;
        ARes aRes = this.ares;
        int hashCode3 = (((((hashCode2 + (aRes == null ? 0 : aRes.hashCode())) * 31) + (getModelObject() == null ? 0 : getModelObject().hashCode())) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31;
        boolean livemode = getLivemode();
        int i = livemode;
        if (livemode) {
            i = 1;
        }
        int hashCode4 = (((((hashCode3 + i) * 31) + (getLocation() == null ? 0 : getLocation().hashCode())) * 31) + (getCreated() != null ? getCreated().hashCode() : 0)) * 31;
        boolean deleted = getDeleted();
        return hashCode4 + (deleted ? 1 : deleted);
    }

    @NotNull
    public String toString() {
        return "Authentication(status=" + this.status + ", areq=" + this.areq + ", ares=" + this.ares + ", modelObject=" + getModelObject() + ", id=" + getId() + ", livemode=" + getLivemode() + ", location=" + getLocation() + ", created=" + getCreated() + ", deleted=" + getDeleted() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.status.name());
        AReq aReq = this.areq;
        if (aReq == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aReq.writeToParcel(out, i);
        }
        ARes aRes = this.ares;
        if (aRes == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aRes.writeToParcel(out, i);
        }
        out.writeString(this.modelObject);
        out.writeString(this.f40262id);
        out.writeInt(this.livemode ? 1 : 0);
        out.writeString(this.location);
        out.writeSerializable(this.created);
        out.writeInt(this.deleted ? 1 : 0);
    }

    public Authentication(@NotNull AuthenticationStatus status, @Nullable AReq aReq, @Nullable ARes aRes, @Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, @Nullable DateTime dateTime, boolean z2) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.areq = aReq;
        this.ares = aRes;
        this.modelObject = str;
        this.f40262id = str2;
        this.livemode = z;
        this.location = str3;
        this.created = dateTime;
        this.deleted = z2;
    }

    public /* synthetic */ Authentication(AuthenticationStatus authenticationStatus, AReq aReq, ARes aRes, String str, String str2, boolean z, String str3, DateTime dateTime, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AuthenticationStatus.FAILED : authenticationStatus, (i & 2) != 0 ? null : aReq, (i & 4) != 0 ? null : aRes, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str3, (i & 128) == 0 ? dateTime : null, (i & 256) == 0 ? z2 : false);
    }
}