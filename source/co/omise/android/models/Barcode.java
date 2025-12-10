package co.omise.android.models;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Parcelize
@Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0002\u0010\u000eJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003Je\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001J\u0013\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020.HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020.HÖ\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\r\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018¨\u00069"}, m28850d2 = {"Lco/omise/android/models/Barcode;", "Lco/omise/android/models/Model;", "type", "", ResponseProcessor.CONTENT_TYPE_IMAGE, "Lco/omise/android/models/Document;", "modelObject", "id", "livemode", "", FirebaseAnalytics.Param.LOCATION, "created", "Lorg/joda/time/DateTime;", "deleted", "(Ljava/lang/String;Lco/omise/android/models/Document;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lorg/joda/time/DateTime;Z)V", "getCreated", "()Lorg/joda/time/DateTime;", "setCreated", "(Lorg/joda/time/DateTime;)V", "getDeleted", "()Z", "setDeleted", "(Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getImage", "()Lco/omise/android/models/Document;", "getLivemode", "setLivemode", "getLocation", "setLocation", "getModelObject", "setModelObject", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class Barcode implements Model {
    @NotNull
    public static final Parcelable.Creator<Barcode> CREATOR = new Creator();
    @Nullable
    private DateTime created;
    private boolean deleted;
    @Nullable

    /* renamed from: id */
    private String f40255id;
    @Nullable
    private final Document image;
    private boolean livemode;
    @Nullable
    private String location;
    @Nullable
    private String modelObject;
    @Nullable
    private final String type;

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Barcode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Barcode createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Barcode(parcel.readString(), parcel.readInt() == 0 ? null : Document.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Barcode[] newArray(int i) {
            return new Barcode[i];
        }
    }

    public Barcode() {
        this(null, null, null, null, false, null, null, false, 255, null);
    }

    @Nullable
    public final String component1() {
        return this.type;
    }

    @Nullable
    public final Document component2() {
        return this.image;
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
    public final Barcode copy(@Nullable String str, @Nullable Document document, @Nullable String str2, @Nullable String str3, boolean z, @Nullable String str4, @Nullable DateTime dateTime, boolean z2) {
        return new Barcode(str, document, str2, str3, z, str4, dateTime, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Barcode) {
            Barcode barcode = (Barcode) obj;
            return Intrinsics.areEqual(this.type, barcode.type) && Intrinsics.areEqual(this.image, barcode.image) && Intrinsics.areEqual(getModelObject(), barcode.getModelObject()) && Intrinsics.areEqual(getId(), barcode.getId()) && getLivemode() == barcode.getLivemode() && Intrinsics.areEqual(getLocation(), barcode.getLocation()) && Intrinsics.areEqual(getCreated(), barcode.getCreated()) && getDeleted() == barcode.getDeleted();
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

    @Override // co.omise.android.models.Model
    @Nullable
    public String getId() {
        return this.f40255id;
    }

    @Nullable
    public final Document getImage() {
        return this.image;
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

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Document document = this.image;
        int hashCode2 = (((((hashCode + (document == null ? 0 : document.hashCode())) * 31) + (getModelObject() == null ? 0 : getModelObject().hashCode())) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31;
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
        this.f40255id = str;
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
        return "Barcode(type=" + this.type + ", image=" + this.image + ", modelObject=" + getModelObject() + ", id=" + getId() + ", livemode=" + getLivemode() + ", location=" + getLocation() + ", created=" + getCreated() + ", deleted=" + getDeleted() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.type);
        Document document = this.image;
        if (document == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            document.writeToParcel(out, i);
        }
        out.writeString(this.modelObject);
        out.writeString(this.f40255id);
        out.writeInt(this.livemode ? 1 : 0);
        out.writeString(this.location);
        out.writeSerializable(this.created);
        out.writeInt(this.deleted ? 1 : 0);
    }

    public Barcode(@Nullable String str, @Nullable Document document, @Nullable String str2, @Nullable String str3, boolean z, @Nullable String str4, @Nullable DateTime dateTime, boolean z2) {
        this.type = str;
        this.image = document;
        this.modelObject = str2;
        this.f40255id = str3;
        this.livemode = z;
        this.location = str4;
        this.created = dateTime;
        this.deleted = z2;
    }

    public /* synthetic */ Barcode(String str, Document document, String str2, String str3, boolean z, String str4, DateTime dateTime, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : document, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str4, (i & 64) == 0 ? dateTime : null, (i & 128) == 0 ? z2 : false);
    }
}
