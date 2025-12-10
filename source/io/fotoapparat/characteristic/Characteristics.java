package io.fotoapparat.characteristic;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.hardware.orientation.Orientation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\t\u0010\u0013¨\u0006("}, m28850d2 = {"Lio/fotoapparat/characteristic/Characteristics;", "", "", "cameraId", "Lio/fotoapparat/characteristic/LensPosition;", "lensPosition", "Lio/fotoapparat/hardware/orientation/Orientation;", "cameraOrientation", "", "isMirrored", "<init>", "(ILio/fotoapparat/characteristic/LensPosition;Lio/fotoapparat/hardware/orientation/Orientation;Z)V", "component1", "()I", "component2", "()Lio/fotoapparat/characteristic/LensPosition;", "component3", "()Lio/fotoapparat/hardware/orientation/Orientation;", "component4", "()Z", "copy", "(ILio/fotoapparat/characteristic/LensPosition;Lio/fotoapparat/hardware/orientation/Orientation;Z)Lio/fotoapparat/characteristic/Characteristics;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getCameraId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lio/fotoapparat/characteristic/LensPosition;", "getLensPosition", OperatorName.CURVE_TO, "Lio/fotoapparat/hardware/orientation/Orientation;", "getCameraOrientation", "d", "Z", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class Characteristics {

    /* renamed from: a */
    public final int f62925a;

    /* renamed from: b */
    public final LensPosition f62926b;

    /* renamed from: c */
    public final Orientation f62927c;

    /* renamed from: d */
    public final boolean f62928d;

    public Characteristics(int i, @NotNull LensPosition lensPosition, @NotNull Orientation cameraOrientation, boolean z) {
        Intrinsics.checkNotNullParameter(lensPosition, "lensPosition");
        Intrinsics.checkNotNullParameter(cameraOrientation, "cameraOrientation");
        this.f62925a = i;
        this.f62926b = lensPosition;
        this.f62927c = cameraOrientation;
        this.f62928d = z;
    }

    public static /* synthetic */ Characteristics copy$default(Characteristics characteristics, int i, LensPosition lensPosition, Orientation orientation, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = characteristics.f62925a;
        }
        if ((i2 & 2) != 0) {
            lensPosition = characteristics.f62926b;
        }
        if ((i2 & 4) != 0) {
            orientation = characteristics.f62927c;
        }
        if ((i2 & 8) != 0) {
            z = characteristics.f62928d;
        }
        return characteristics.copy(i, lensPosition, orientation, z);
    }

    public final int component1() {
        return this.f62925a;
    }

    @NotNull
    public final LensPosition component2() {
        return this.f62926b;
    }

    @NotNull
    public final Orientation component3() {
        return this.f62927c;
    }

    public final boolean component4() {
        return this.f62928d;
    }

    @NotNull
    public final Characteristics copy(int i, @NotNull LensPosition lensPosition, @NotNull Orientation cameraOrientation, boolean z) {
        Intrinsics.checkNotNullParameter(lensPosition, "lensPosition");
        Intrinsics.checkNotNullParameter(cameraOrientation, "cameraOrientation");
        return new Characteristics(i, lensPosition, cameraOrientation, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Characteristics) {
            Characteristics characteristics = (Characteristics) obj;
            return this.f62925a == characteristics.f62925a && Intrinsics.areEqual(this.f62926b, characteristics.f62926b) && Intrinsics.areEqual(this.f62927c, characteristics.f62927c) && this.f62928d == characteristics.f62928d;
        }
        return false;
    }

    public final int getCameraId() {
        return this.f62925a;
    }

    @NotNull
    public final Orientation getCameraOrientation() {
        return this.f62927c;
    }

    @NotNull
    public final LensPosition getLensPosition() {
        return this.f62926b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f62925a * 31) + this.f62926b.hashCode()) * 31) + this.f62927c.hashCode()) * 31;
        boolean z = this.f62928d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isMirrored() {
        return this.f62928d;
    }

    @NotNull
    public String toString() {
        int i = this.f62925a;
        LensPosition lensPosition = this.f62926b;
        Orientation orientation = this.f62927c;
        boolean z = this.f62928d;
        return "Characteristics(cameraId=" + i + ", lensPosition=" + lensPosition + ", cameraOrientation=" + orientation + ", isMirrored=" + z + ")";
    }
}
