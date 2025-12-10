package th.p047co.dtac.android.dtacone.model.take_photo;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/take_photo/CameraEvent;", "", "cameraMode", "Lth/co/dtac/android/dtacone/model/take_photo/CameraMode;", "caption", "", "subCaption", "(Lth/co/dtac/android/dtacone/model/take_photo/CameraMode;Ljava/lang/String;Ljava/lang/String;)V", "getCameraMode", "()Lth/co/dtac/android/dtacone/model/take_photo/CameraMode;", "getCaption", "()Ljava/lang/String;", "getSubCaption", "setSubCaption", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.take_photo.CameraEvent */
/* loaded from: classes8.dex */
public final class CameraEvent {
    public static final int $stable = 8;
    @NotNull
    private final CameraMode cameraMode;
    @NotNull
    private final String caption;
    @NotNull
    private String subCaption;

    public CameraEvent(@NotNull CameraMode cameraMode, @NotNull String caption, @NotNull String subCaption) {
        Intrinsics.checkNotNullParameter(cameraMode, "cameraMode");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(subCaption, "subCaption");
        this.cameraMode = cameraMode;
        this.caption = caption;
        this.subCaption = subCaption;
    }

    public static /* synthetic */ CameraEvent copy$default(CameraEvent cameraEvent, CameraMode cameraMode, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            cameraMode = cameraEvent.cameraMode;
        }
        if ((i & 2) != 0) {
            str = cameraEvent.caption;
        }
        if ((i & 4) != 0) {
            str2 = cameraEvent.subCaption;
        }
        return cameraEvent.copy(cameraMode, str, str2);
    }

    @NotNull
    public final CameraMode component1() {
        return this.cameraMode;
    }

    @NotNull
    public final String component2() {
        return this.caption;
    }

    @NotNull
    public final String component3() {
        return this.subCaption;
    }

    @NotNull
    public final CameraEvent copy(@NotNull CameraMode cameraMode, @NotNull String caption, @NotNull String subCaption) {
        Intrinsics.checkNotNullParameter(cameraMode, "cameraMode");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(subCaption, "subCaption");
        return new CameraEvent(cameraMode, caption, subCaption);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CameraEvent) {
            CameraEvent cameraEvent = (CameraEvent) obj;
            return Intrinsics.areEqual(this.cameraMode, cameraEvent.cameraMode) && Intrinsics.areEqual(this.caption, cameraEvent.caption) && Intrinsics.areEqual(this.subCaption, cameraEvent.subCaption);
        }
        return false;
    }

    @NotNull
    public final CameraMode getCameraMode() {
        return this.cameraMode;
    }

    @NotNull
    public final String getCaption() {
        return this.caption;
    }

    @NotNull
    public final String getSubCaption() {
        return this.subCaption;
    }

    public int hashCode() {
        return (((this.cameraMode.hashCode() * 31) + this.caption.hashCode()) * 31) + this.subCaption.hashCode();
    }

    public final void setSubCaption(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subCaption = str;
    }

    @NotNull
    public String toString() {
        CameraMode cameraMode = this.cameraMode;
        String str = this.caption;
        String str2 = this.subCaption;
        return "CameraEvent(cameraMode=" + cameraMode + ", caption=" + str + ", subCaption=" + str2 + ")";
    }

    public /* synthetic */ CameraEvent(CameraMode cameraMode, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraMode, str, (i & 4) != 0 ? "" : str2);
    }
}