package th.p047co.dtac.android.dtacone.model.mixpanel.prepaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B=\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\b\u0010\u001b\u001a\u00020\nH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\nH\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mixpanel/prepaid/PrepaidMixpanelData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "subscribeNumber", "", "simType", "idCaptureType", "msisdnPower", "", "faceRecognitionState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getFaceRecognitionState", "()Ljava/lang/String;", "setFaceRecognitionState", "(Ljava/lang/String;)V", "getIdCaptureType", "setIdCaptureType", "getMsisdnPower", "()Ljava/lang/Integer;", "setMsisdnPower", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSimType", "getSubscribeNumber", "setSubscribeNumber", "describeContents", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mixpanel.prepaid.PrepaidMixpanelData */
/* loaded from: classes8.dex */
public final class PrepaidMixpanelData implements Parcelable {
    @Nullable
    private String faceRecognitionState;
    @Nullable
    private String idCaptureType;
    @Nullable
    private Integer msisdnPower;
    @Nullable
    private final String simType;
    @Nullable
    private String subscribeNumber;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mixpanel/prepaid/PrepaidMixpanelData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/mixpanel/prepaid/PrepaidMixpanelData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/mixpanel/prepaid/PrepaidMixpanelData;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.mixpanel.prepaid.PrepaidMixpanelData$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<PrepaidMixpanelData> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PrepaidMixpanelData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PrepaidMixpanelData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PrepaidMixpanelData[] newArray(int i) {
            return new PrepaidMixpanelData[i];
        }
    }

    public PrepaidMixpanelData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4) {
        this.subscribeNumber = str;
        this.simType = str2;
        this.idCaptureType = str3;
        this.msisdnPower = num;
        this.faceRecognitionState = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getFaceRecognitionState() {
        return this.faceRecognitionState;
    }

    @Nullable
    public final String getIdCaptureType() {
        return this.idCaptureType;
    }

    @Nullable
    public final Integer getMsisdnPower() {
        return this.msisdnPower;
    }

    @Nullable
    public final String getSimType() {
        return this.simType;
    }

    @Nullable
    public final String getSubscribeNumber() {
        return this.subscribeNumber;
    }

    public final void setFaceRecognitionState(@Nullable String str) {
        this.faceRecognitionState = str;
    }

    public final void setIdCaptureType(@Nullable String str) {
        this.idCaptureType = str;
    }

    public final void setMsisdnPower(@Nullable Integer num) {
        this.msisdnPower = num;
    }

    public final void setSubscribeNumber(@Nullable String str) {
        this.subscribeNumber = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.subscribeNumber);
        parcel.writeString(this.simType);
        parcel.writeString(this.idCaptureType);
        parcel.writeValue(this.msisdnPower);
        parcel.writeString(this.faceRecognitionState);
    }

    public /* synthetic */ PrepaidMixpanelData(String str, String str2, String str3, Integer num, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? "" : str4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PrepaidMixpanelData(@org.jetbrains.annotations.NotNull android.os.Parcel r8) {
        /*
            r7 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r2 = r8.readString()
            java.lang.String r3 = r8.readString()
            java.lang.String r4 = r8.readString()
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r8.readValue(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L23
            java.lang.Integer r0 = (java.lang.Integer) r0
        L21:
            r5 = r0
            goto L25
        L23:
            r0 = 0
            goto L21
        L25:
            java.lang.String r6 = r8.readString()
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.mixpanel.prepaid.PrepaidMixpanelData.<init>(android.os.Parcel):void");
    }
}