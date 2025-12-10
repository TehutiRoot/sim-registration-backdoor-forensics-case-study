package th.p047co.dtac.android.dtacone.model.consent;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u00060"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelco;", "Landroid/os/Parcelable;", "language", "", "mrtrConsentId", "consent", "consentVersionLabel", "consentTitle", "consentAgree", "consentDecline", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConsent", "()Ljava/lang/String;", "setConsent", "(Ljava/lang/String;)V", "getConsentAgree", "setConsentAgree", "getConsentDecline", "setConsentDecline", "getConsentTitle", "setConsentTitle", "getConsentVersionLabel", "setConsentVersionLabel", "getLanguage", "setLanguage", "getMrtrConsentId", "setMrtrConsentId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.consent.ConsentNonTelco */
/* loaded from: classes8.dex */
public final class ConsentNonTelco implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<ConsentNonTelco> CREATOR = new Creator();
    @SerializedName("consent")
    @NotNull
    private String consent;
    @SerializedName("consentAgree")
    @NotNull
    private String consentAgree;
    @SerializedName("consentDecline")
    @NotNull
    private String consentDecline;
    @SerializedName("consentTitle")
    @NotNull
    private String consentTitle;
    @SerializedName("consentVersionLabel")
    @NotNull
    private String consentVersionLabel;
    @SerializedName("language")
    @NotNull
    private String language;
    @SerializedName("mrtrConsentId")
    @NotNull
    private String mrtrConsentId;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.consent.ConsentNonTelco$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<ConsentNonTelco> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ConsentNonTelco createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsentNonTelco(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ConsentNonTelco[] newArray(int i) {
            return new ConsentNonTelco[i];
        }
    }

    public ConsentNonTelco(@NotNull String language, @NotNull String mrtrConsentId, @NotNull String consent, @NotNull String consentVersionLabel, @NotNull String consentTitle, @NotNull String consentAgree, @NotNull String consentDecline) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(mrtrConsentId, "mrtrConsentId");
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(consentVersionLabel, "consentVersionLabel");
        Intrinsics.checkNotNullParameter(consentTitle, "consentTitle");
        Intrinsics.checkNotNullParameter(consentAgree, "consentAgree");
        Intrinsics.checkNotNullParameter(consentDecline, "consentDecline");
        this.language = language;
        this.mrtrConsentId = mrtrConsentId;
        this.consent = consent;
        this.consentVersionLabel = consentVersionLabel;
        this.consentTitle = consentTitle;
        this.consentAgree = consentAgree;
        this.consentDecline = consentDecline;
    }

    public static /* synthetic */ ConsentNonTelco copy$default(ConsentNonTelco consentNonTelco, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = consentNonTelco.language;
        }
        if ((i & 2) != 0) {
            str2 = consentNonTelco.mrtrConsentId;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = consentNonTelco.consent;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = consentNonTelco.consentVersionLabel;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = consentNonTelco.consentTitle;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = consentNonTelco.consentAgree;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = consentNonTelco.consentDecline;
        }
        return consentNonTelco.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    public final String component1() {
        return this.language;
    }

    @NotNull
    public final String component2() {
        return this.mrtrConsentId;
    }

    @NotNull
    public final String component3() {
        return this.consent;
    }

    @NotNull
    public final String component4() {
        return this.consentVersionLabel;
    }

    @NotNull
    public final String component5() {
        return this.consentTitle;
    }

    @NotNull
    public final String component6() {
        return this.consentAgree;
    }

    @NotNull
    public final String component7() {
        return this.consentDecline;
    }

    @NotNull
    public final ConsentNonTelco copy(@NotNull String language, @NotNull String mrtrConsentId, @NotNull String consent, @NotNull String consentVersionLabel, @NotNull String consentTitle, @NotNull String consentAgree, @NotNull String consentDecline) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(mrtrConsentId, "mrtrConsentId");
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(consentVersionLabel, "consentVersionLabel");
        Intrinsics.checkNotNullParameter(consentTitle, "consentTitle");
        Intrinsics.checkNotNullParameter(consentAgree, "consentAgree");
        Intrinsics.checkNotNullParameter(consentDecline, "consentDecline");
        return new ConsentNonTelco(language, mrtrConsentId, consent, consentVersionLabel, consentTitle, consentAgree, consentDecline);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentNonTelco) {
            ConsentNonTelco consentNonTelco = (ConsentNonTelco) obj;
            return Intrinsics.areEqual(this.language, consentNonTelco.language) && Intrinsics.areEqual(this.mrtrConsentId, consentNonTelco.mrtrConsentId) && Intrinsics.areEqual(this.consent, consentNonTelco.consent) && Intrinsics.areEqual(this.consentVersionLabel, consentNonTelco.consentVersionLabel) && Intrinsics.areEqual(this.consentTitle, consentNonTelco.consentTitle) && Intrinsics.areEqual(this.consentAgree, consentNonTelco.consentAgree) && Intrinsics.areEqual(this.consentDecline, consentNonTelco.consentDecline);
        }
        return false;
    }

    @NotNull
    public final String getConsent() {
        return this.consent;
    }

    @NotNull
    public final String getConsentAgree() {
        return this.consentAgree;
    }

    @NotNull
    public final String getConsentDecline() {
        return this.consentDecline;
    }

    @NotNull
    public final String getConsentTitle() {
        return this.consentTitle;
    }

    @NotNull
    public final String getConsentVersionLabel() {
        return this.consentVersionLabel;
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }

    @NotNull
    public final String getMrtrConsentId() {
        return this.mrtrConsentId;
    }

    public int hashCode() {
        return (((((((((((this.language.hashCode() * 31) + this.mrtrConsentId.hashCode()) * 31) + this.consent.hashCode()) * 31) + this.consentVersionLabel.hashCode()) * 31) + this.consentTitle.hashCode()) * 31) + this.consentAgree.hashCode()) * 31) + this.consentDecline.hashCode();
    }

    public final void setConsent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consent = str;
    }

    public final void setConsentAgree(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentAgree = str;
    }

    public final void setConsentDecline(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentDecline = str;
    }

    public final void setConsentTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentTitle = str;
    }

    public final void setConsentVersionLabel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentVersionLabel = str;
    }

    public final void setLanguage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.language = str;
    }

    public final void setMrtrConsentId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mrtrConsentId = str;
    }

    @NotNull
    public String toString() {
        String str = this.language;
        String str2 = this.mrtrConsentId;
        String str3 = this.consent;
        String str4 = this.consentVersionLabel;
        String str5 = this.consentTitle;
        String str6 = this.consentAgree;
        String str7 = this.consentDecline;
        return "ConsentNonTelco(language=" + str + ", mrtrConsentId=" + str2 + ", consent=" + str3 + ", consentVersionLabel=" + str4 + ", consentTitle=" + str5 + ", consentAgree=" + str6 + ", consentDecline=" + str7 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.language);
        out.writeString(this.mrtrConsentId);
        out.writeString(this.consent);
        out.writeString(this.consentVersionLabel);
        out.writeString(this.consentTitle);
        out.writeString(this.consentAgree);
        out.writeString(this.consentDecline);
    }
}
