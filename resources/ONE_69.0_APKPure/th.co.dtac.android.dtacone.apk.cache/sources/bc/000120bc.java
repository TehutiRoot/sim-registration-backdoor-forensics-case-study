package th.p047co.dtac.android.dtacone.model.take_photo;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003Je\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\u0013\u0010-\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016¨\u00062"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/take_photo/PhotoItem;", "", "position", "", MessageBundle.TITLE_ENTRY, "frameType", "isRequired", "", "isFaceDetection", "IsSmartCard", "src", "Landroid/graphics/Bitmap;", "isActive", "isIdentity", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLandroid/graphics/Bitmap;ZZ)V", "getIsSmartCard", "()Z", "setIsSmartCard", "(Z)V", "getFrameType", "()Ljava/lang/String;", "setFrameType", "(Ljava/lang/String;)V", "setActive", "setFaceDetection", "setIdentity", "setRequired", "getPosition", "setPosition", "getSrc", "()Landroid/graphics/Bitmap;", "setSrc", "(Landroid/graphics/Bitmap;)V", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.take_photo.PhotoItem */
/* loaded from: classes8.dex */
public final class PhotoItem {
    public static final int $stable = 8;
    private boolean IsSmartCard;
    @NotNull
    private String frameType;
    private boolean isActive;
    private boolean isFaceDetection;
    private boolean isIdentity;
    private boolean isRequired;
    @NotNull
    private String position;
    @Nullable
    private Bitmap src;
    @NotNull
    private String title;

    public PhotoItem() {
        this(null, null, null, false, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @NotNull
    public final String component1() {
        return this.position;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final String component3() {
        return this.frameType;
    }

    public final boolean component4() {
        return this.isRequired;
    }

    public final boolean component5() {
        return this.isFaceDetection;
    }

    public final boolean component6() {
        return this.IsSmartCard;
    }

    @Nullable
    public final Bitmap component7() {
        return this.src;
    }

    public final boolean component8() {
        return this.isActive;
    }

    public final boolean component9() {
        return this.isIdentity;
    }

    @NotNull
    public final PhotoItem copy(@NotNull String position, @NotNull String title, @NotNull String frameType, boolean z, boolean z2, boolean z3, @Nullable Bitmap bitmap, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(frameType, "frameType");
        return new PhotoItem(position, title, frameType, z, z2, z3, bitmap, z4, z5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhotoItem) {
            PhotoItem photoItem = (PhotoItem) obj;
            return Intrinsics.areEqual(this.position, photoItem.position) && Intrinsics.areEqual(this.title, photoItem.title) && Intrinsics.areEqual(this.frameType, photoItem.frameType) && this.isRequired == photoItem.isRequired && this.isFaceDetection == photoItem.isFaceDetection && this.IsSmartCard == photoItem.IsSmartCard && Intrinsics.areEqual(this.src, photoItem.src) && this.isActive == photoItem.isActive && this.isIdentity == photoItem.isIdentity;
        }
        return false;
    }

    @NotNull
    public final String getFrameType() {
        return this.frameType;
    }

    public final boolean getIsSmartCard() {
        return this.IsSmartCard;
    }

    @NotNull
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    public final Bitmap getSrc() {
        return this.src;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.position.hashCode() * 31) + this.title.hashCode()) * 31) + this.frameType.hashCode()) * 31;
        boolean z = this.isRequired;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isFaceDetection;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.IsSmartCard;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        Bitmap bitmap = this.src;
        int hashCode2 = (i6 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        boolean z4 = this.isActive;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode2 + i7) * 31;
        boolean z5 = this.isIdentity;
        return i8 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isFaceDetection() {
        return this.isFaceDetection;
    }

    public final boolean isIdentity() {
        return this.isIdentity;
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final void setFaceDetection(boolean z) {
        this.isFaceDetection = z;
    }

    public final void setFrameType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.frameType = str;
    }

    public final void setIdentity(boolean z) {
        this.isIdentity = z;
    }

    public final void setIsSmartCard(boolean z) {
        this.IsSmartCard = z;
    }

    public final void setPosition(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.position = str;
    }

    public final void setRequired(boolean z) {
        this.isRequired = z;
    }

    public final void setSrc(@Nullable Bitmap bitmap) {
        this.src = bitmap;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        String str = this.position;
        String str2 = this.title;
        String str3 = this.frameType;
        boolean z = this.isRequired;
        boolean z2 = this.isFaceDetection;
        boolean z3 = this.IsSmartCard;
        Bitmap bitmap = this.src;
        boolean z4 = this.isActive;
        boolean z5 = this.isIdentity;
        return "PhotoItem(position=" + str + ", title=" + str2 + ", frameType=" + str3 + ", isRequired=" + z + ", isFaceDetection=" + z2 + ", IsSmartCard=" + z3 + ", src=" + bitmap + ", isActive=" + z4 + ", isIdentity=" + z5 + ")";
    }

    public PhotoItem(@NotNull String position, @NotNull String title, @NotNull String frameType, boolean z, boolean z2, boolean z3, @Nullable Bitmap bitmap, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(frameType, "frameType");
        this.position = position;
        this.title = title;
        this.frameType = frameType;
        this.isRequired = z;
        this.isFaceDetection = z2;
        this.IsSmartCard = z3;
        this.src = bitmap;
        this.isActive = z4;
        this.isIdentity = z5;
    }

    public /* synthetic */ PhotoItem(String str, String str2, String str3, boolean z, boolean z2, boolean z3, Bitmap bitmap, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? null : bitmap, (i & 128) != 0 ? false : z4, (i & 256) == 0 ? z5 : false);
    }
}