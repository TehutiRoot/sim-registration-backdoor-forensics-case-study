package th.p047co.dtac.android.dtacone.model.take_photo;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.joran.action.Action;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003Ju\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001e\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014¨\u0006<"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/take_photo/TakePhotoModel;", "", "userLan", "", "id", Action.KEY_ATTRIBUTE, "screenCode", "idNumberDisplay", "createdDate", "Ljava/util/Date;", "createdBy", "lastUpdatedDate", "lastUpdatedBy", "photos", "", "Lth/co/dtac/android/dtacone/model/take_photo/PhotosModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;)V", "getCreatedBy", "()Ljava/lang/String;", "setCreatedBy", "(Ljava/lang/String;)V", "getCreatedDate", "()Ljava/util/Date;", "setCreatedDate", "(Ljava/util/Date;)V", "getId", "setId", "getIdNumberDisplay", "setIdNumberDisplay", "getKey", "setKey", "getLastUpdatedBy", "setLastUpdatedBy", "getLastUpdatedDate", "setLastUpdatedDate", "getPhotos", "()Ljava/util/List;", "setPhotos", "(Ljava/util/List;)V", "getScreenCode", "setScreenCode", "getUserLan", "setUserLan", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.take_photo.TakePhotoModel */
/* loaded from: classes8.dex */
public final class TakePhotoModel {
    public static final int $stable = 8;
    @SerializedName("createdBy")
    @NotNull
    private String createdBy;
    @SerializedName("createdDate")
    @Nullable
    private Date createdDate;
    @SerializedName("id")
    @NotNull

    /* renamed from: id */
    private String f85190id;
    @SerializedName("idNumberDisplay")
    @NotNull
    private String idNumberDisplay;
    @SerializedName(Action.KEY_ATTRIBUTE)
    @NotNull
    private String key;
    @SerializedName("lastUpdatedBy")
    @NotNull
    private String lastUpdatedBy;
    @SerializedName("lastUpdatedDate")
    @NotNull
    private Date lastUpdatedDate;
    @SerializedName("photos")
    @NotNull
    private List<PhotosModel> photos;
    @SerializedName("screenCode")
    @NotNull
    private String screenCode;
    @SerializedName("userLan")
    @NotNull
    private String userLan;

    public TakePhotoModel() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @NotNull
    public final String component1() {
        return this.userLan;
    }

    @NotNull
    public final List<PhotosModel> component10() {
        return this.photos;
    }

    @NotNull
    public final String component2() {
        return this.f85190id;
    }

    @NotNull
    public final String component3() {
        return this.key;
    }

    @NotNull
    public final String component4() {
        return this.screenCode;
    }

    @NotNull
    public final String component5() {
        return this.idNumberDisplay;
    }

    @Nullable
    public final Date component6() {
        return this.createdDate;
    }

    @NotNull
    public final String component7() {
        return this.createdBy;
    }

    @NotNull
    public final Date component8() {
        return this.lastUpdatedDate;
    }

    @NotNull
    public final String component9() {
        return this.lastUpdatedBy;
    }

    @NotNull
    public final TakePhotoModel copy(@NotNull String userLan, @NotNull String id2, @NotNull String key, @NotNull String screenCode, @NotNull String idNumberDisplay, @Nullable Date date, @NotNull String createdBy, @NotNull Date lastUpdatedDate, @NotNull String lastUpdatedBy, @NotNull List<PhotosModel> photos) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(screenCode, "screenCode");
        Intrinsics.checkNotNullParameter(idNumberDisplay, "idNumberDisplay");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(lastUpdatedDate, "lastUpdatedDate");
        Intrinsics.checkNotNullParameter(lastUpdatedBy, "lastUpdatedBy");
        Intrinsics.checkNotNullParameter(photos, "photos");
        return new TakePhotoModel(userLan, id2, key, screenCode, idNumberDisplay, date, createdBy, lastUpdatedDate, lastUpdatedBy, photos);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TakePhotoModel) {
            TakePhotoModel takePhotoModel = (TakePhotoModel) obj;
            return Intrinsics.areEqual(this.userLan, takePhotoModel.userLan) && Intrinsics.areEqual(this.f85190id, takePhotoModel.f85190id) && Intrinsics.areEqual(this.key, takePhotoModel.key) && Intrinsics.areEqual(this.screenCode, takePhotoModel.screenCode) && Intrinsics.areEqual(this.idNumberDisplay, takePhotoModel.idNumberDisplay) && Intrinsics.areEqual(this.createdDate, takePhotoModel.createdDate) && Intrinsics.areEqual(this.createdBy, takePhotoModel.createdBy) && Intrinsics.areEqual(this.lastUpdatedDate, takePhotoModel.lastUpdatedDate) && Intrinsics.areEqual(this.lastUpdatedBy, takePhotoModel.lastUpdatedBy) && Intrinsics.areEqual(this.photos, takePhotoModel.photos);
        }
        return false;
    }

    @NotNull
    public final String getCreatedBy() {
        return this.createdBy;
    }

    @Nullable
    public final Date getCreatedDate() {
        return this.createdDate;
    }

    @NotNull
    public final String getId() {
        return this.f85190id;
    }

    @NotNull
    public final String getIdNumberDisplay() {
        return this.idNumberDisplay;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    @NotNull
    public final Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    @NotNull
    public final List<PhotosModel> getPhotos() {
        return this.photos;
    }

    @NotNull
    public final String getScreenCode() {
        return this.screenCode;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        int hashCode = ((((((((this.userLan.hashCode() * 31) + this.f85190id.hashCode()) * 31) + this.key.hashCode()) * 31) + this.screenCode.hashCode()) * 31) + this.idNumberDisplay.hashCode()) * 31;
        Date date = this.createdDate;
        return ((((((((hashCode + (date == null ? 0 : date.hashCode())) * 31) + this.createdBy.hashCode()) * 31) + this.lastUpdatedDate.hashCode()) * 31) + this.lastUpdatedBy.hashCode()) * 31) + this.photos.hashCode();
    }

    public final void setCreatedBy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.createdBy = str;
    }

    public final void setCreatedDate(@Nullable Date date) {
        this.createdDate = date;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f85190id = str;
    }

    public final void setIdNumberDisplay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idNumberDisplay = str;
    }

    public final void setKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.key = str;
    }

    public final void setLastUpdatedBy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastUpdatedBy = str;
    }

    public final void setLastUpdatedDate(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.lastUpdatedDate = date;
    }

    public final void setPhotos(@NotNull List<PhotosModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.photos = list;
    }

    public final void setScreenCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.screenCode = str;
    }

    public final void setUserLan(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userLan = str;
    }

    @NotNull
    public String toString() {
        String str = this.userLan;
        String str2 = this.f85190id;
        String str3 = this.key;
        String str4 = this.screenCode;
        String str5 = this.idNumberDisplay;
        Date date = this.createdDate;
        String str6 = this.createdBy;
        Date date2 = this.lastUpdatedDate;
        String str7 = this.lastUpdatedBy;
        List<PhotosModel> list = this.photos;
        return "TakePhotoModel(userLan=" + str + ", id=" + str2 + ", key=" + str3 + ", screenCode=" + str4 + ", idNumberDisplay=" + str5 + ", createdDate=" + date + ", createdBy=" + str6 + ", lastUpdatedDate=" + date2 + ", lastUpdatedBy=" + str7 + ", photos=" + list + ")";
    }

    public TakePhotoModel(@NotNull String userLan, @NotNull String id2, @NotNull String key, @NotNull String screenCode, @NotNull String idNumberDisplay, @Nullable Date date, @NotNull String createdBy, @NotNull Date lastUpdatedDate, @NotNull String lastUpdatedBy, @NotNull List<PhotosModel> photos) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(screenCode, "screenCode");
        Intrinsics.checkNotNullParameter(idNumberDisplay, "idNumberDisplay");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(lastUpdatedDate, "lastUpdatedDate");
        Intrinsics.checkNotNullParameter(lastUpdatedBy, "lastUpdatedBy");
        Intrinsics.checkNotNullParameter(photos, "photos");
        this.userLan = userLan;
        this.f85190id = id2;
        this.key = key;
        this.screenCode = screenCode;
        this.idNumberDisplay = idNumberDisplay;
        this.createdDate = date;
        this.createdBy = createdBy;
        this.lastUpdatedDate = lastUpdatedDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.photos = photos;
    }

    public /* synthetic */ TakePhotoModel(String str, String str2, String str3, String str4, String str5, Date date, String str6, Date date2, String str7, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : date, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? new Date() : date2, (i & 256) == 0 ? str7 : "", (i & 512) != 0 ? new ArrayList() : list);
    }
}