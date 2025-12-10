package co.omise.android.models;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Parcelize
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003Je\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J\u0013\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,HÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\f\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0017\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u001b¨\u00067"}, m28850d2 = {"Lco/omise/android/models/Document;", "Lco/omise/android/models/Model;", "filename", "", "downloadUri", "modelObject", "id", "livemode", "", FirebaseAnalytics.Param.LOCATION, "created", "Lorg/joda/time/DateTime;", "deleted", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lorg/joda/time/DateTime;Z)V", "getCreated", "()Lorg/joda/time/DateTime;", "setCreated", "(Lorg/joda/time/DateTime;)V", "getDeleted", "()Z", "setDeleted", "(Z)V", "getDownloadUri", "()Ljava/lang/String;", "getFilename", "getId", "setId", "(Ljava/lang/String;)V", "getLivemode", "setLivemode", "getLocation", "setLocation", "getModelObject", "setModelObject", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class Document implements Model {
    @NotNull
    public static final Parcelable.Creator<Document> CREATOR = new Creator();
    @Nullable
    private DateTime created;
    private boolean deleted;
    @JsonProperty("download_uri")
    @Nullable
    private final String downloadUri;
    @JsonProperty("filename")
    @Nullable
    private final String filename;
    @Nullable

    /* renamed from: id */
    private String f40258id;
    private boolean livemode;
    @Nullable
    private String location;
    @Nullable
    private String modelObject;

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Document> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Document createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Document(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Document[] newArray(int i) {
            return new Document[i];
        }
    }

    public Document() {
        this(null, null, null, null, false, null, null, false, 255, null);
    }

    @Nullable
    public final String component1() {
        return this.filename;
    }

    @Nullable
    public final String component2() {
        return this.downloadUri;
    }

    @Nullable
    public final String component3() {
        return getModelObject();
    }

    @Nullable
    public final String component4() {
        return getId();
    }

    public final boolean component5() {
        return getLivemode();
    }

    @Nullable
    public final String component6() {
        return getLocation();
    }

    @Nullable
    public final DateTime component7() {
        return getCreated();
    }

    public final boolean component8() {
        return getDeleted();
    }

    @NotNull
    public final Document copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z, @Nullable String str5, @Nullable DateTime dateTime, boolean z2) {
        return new Document(str, str2, str3, str4, z, str5, dateTime, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Document) {
            Document document = (Document) obj;
            return Intrinsics.areEqual(this.filename, document.filename) && Intrinsics.areEqual(this.downloadUri, document.downloadUri) && Intrinsics.areEqual(getModelObject(), document.getModelObject()) && Intrinsics.areEqual(getId(), document.getId()) && getLivemode() == document.getLivemode() && Intrinsics.areEqual(getLocation(), document.getLocation()) && Intrinsics.areEqual(getCreated(), document.getCreated()) && getDeleted() == document.getDeleted();
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
    public final String getDownloadUri() {
        return this.downloadUri;
    }

    @Nullable
    public final String getFilename() {
        return this.filename;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public String getId() {
        return this.f40258id;
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

    public int hashCode() {
        String str = this.filename;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.downloadUri;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + (getModelObject() == null ? 0 : getModelObject().hashCode())) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31;
        boolean livemode = getLivemode();
        int i = livemode;
        if (livemode) {
            i = 1;
        }
        int hashCode3 = (((((hashCode2 + i) * 31) + (getLocation() == null ? 0 : getLocation().hashCode())) * 31) + (getCreated() != null ? getCreated().hashCode() : 0)) * 31;
        boolean deleted = getDeleted();
        return hashCode3 + (deleted ? 1 : deleted);
    }

    public void setCreated(@Nullable DateTime dateTime) {
        this.created = dateTime;
    }

    public void setDeleted(boolean z) {
        this.deleted = z;
    }

    public void setId(@Nullable String str) {
        this.f40258id = str;
    }

    public void setLivemode(boolean z) {
        this.livemode = z;
    }

    public void setLocation(@Nullable String str) {
        this.location = str;
    }

    public void setModelObject(@Nullable String str) {
        this.modelObject = str;
    }

    @NotNull
    public String toString() {
        return "Document(filename=" + this.filename + ", downloadUri=" + this.downloadUri + ", modelObject=" + getModelObject() + ", id=" + getId() + ", livemode=" + getLivemode() + ", location=" + getLocation() + ", created=" + getCreated() + ", deleted=" + getDeleted() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.filename);
        out.writeString(this.downloadUri);
        out.writeString(this.modelObject);
        out.writeString(this.f40258id);
        out.writeInt(this.livemode ? 1 : 0);
        out.writeString(this.location);
        out.writeSerializable(this.created);
        out.writeInt(this.deleted ? 1 : 0);
    }

    public Document(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z, @Nullable String str5, @Nullable DateTime dateTime, boolean z2) {
        this.filename = str;
        this.downloadUri = str2;
        this.modelObject = str3;
        this.f40258id = str4;
        this.livemode = z;
        this.location = str5;
        this.created = dateTime;
        this.deleted = z2;
    }

    public /* synthetic */ Document(String str, String str2, String str3, String str4, boolean z, String str5, DateTime dateTime, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? dateTime : null, (i & 128) == 0 ? z2 : false);
    }
}
