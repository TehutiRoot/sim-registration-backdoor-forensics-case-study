package th.p047co.dtac.android.dtacone.model.online_register.additional_image;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/online_register/additional_image/AdditionalImageItem;", "", "imageKey", "", "imageName", "imageNameTitle", "isHavePhoto", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getImageKey", "()Ljava/lang/String;", "getImageName", "getImageNameTitle", "()Z", "setHavePhoto", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.online_register.additional_image.AdditionalImageItem */
/* loaded from: classes8.dex */
public final class AdditionalImageItem {
    public static final int $stable = 8;
    @Nullable
    private final String imageKey;
    @Nullable
    private final String imageName;
    @Nullable
    private final String imageNameTitle;
    private boolean isHavePhoto;

    public AdditionalImageItem() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ AdditionalImageItem copy$default(AdditionalImageItem additionalImageItem, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = additionalImageItem.imageKey;
        }
        if ((i & 2) != 0) {
            str2 = additionalImageItem.imageName;
        }
        if ((i & 4) != 0) {
            str3 = additionalImageItem.imageNameTitle;
        }
        if ((i & 8) != 0) {
            z = additionalImageItem.isHavePhoto;
        }
        return additionalImageItem.copy(str, str2, str3, z);
    }

    @Nullable
    public final String component1() {
        return this.imageKey;
    }

    @Nullable
    public final String component2() {
        return this.imageName;
    }

    @Nullable
    public final String component3() {
        return this.imageNameTitle;
    }

    public final boolean component4() {
        return this.isHavePhoto;
    }

    @NotNull
    public final AdditionalImageItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z) {
        return new AdditionalImageItem(str, str2, str3, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdditionalImageItem) {
            AdditionalImageItem additionalImageItem = (AdditionalImageItem) obj;
            return Intrinsics.areEqual(this.imageKey, additionalImageItem.imageKey) && Intrinsics.areEqual(this.imageName, additionalImageItem.imageName) && Intrinsics.areEqual(this.imageNameTitle, additionalImageItem.imageNameTitle) && this.isHavePhoto == additionalImageItem.isHavePhoto;
        }
        return false;
    }

    @Nullable
    public final String getImageKey() {
        return this.imageKey;
    }

    @Nullable
    public final String getImageName() {
        return this.imageName;
    }

    @Nullable
    public final String getImageNameTitle() {
        return this.imageNameTitle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.imageKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageNameTitle;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.isHavePhoto;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final boolean isHavePhoto() {
        return this.isHavePhoto;
    }

    public final void setHavePhoto(boolean z) {
        this.isHavePhoto = z;
    }

    @NotNull
    public String toString() {
        String str = this.imageKey;
        String str2 = this.imageName;
        String str3 = this.imageNameTitle;
        boolean z = this.isHavePhoto;
        return "AdditionalImageItem(imageKey=" + str + ", imageName=" + str2 + ", imageNameTitle=" + str3 + ", isHavePhoto=" + z + ")";
    }

    public AdditionalImageItem(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z) {
        this.imageKey = str;
        this.imageName = str2;
        this.imageNameTitle = str3;
        this.isHavePhoto = z;
    }

    public /* synthetic */ AdditionalImageItem(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z);
    }
}