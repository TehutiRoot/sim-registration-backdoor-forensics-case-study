package io.fotoapparat.hardware.metering;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.parameter.Resolution;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, m28850d2 = {"Lio/fotoapparat/hardware/metering/FocalRequest;", "", "Lio/fotoapparat/hardware/metering/PointF;", "point", "Lio/fotoapparat/parameter/Resolution;", "previewResolution", "<init>", "(Lio/fotoapparat/hardware/metering/PointF;Lio/fotoapparat/parameter/Resolution;)V", "component1", "()Lio/fotoapparat/hardware/metering/PointF;", "component2", "()Lio/fotoapparat/parameter/Resolution;", "copy", "(Lio/fotoapparat/hardware/metering/PointF;Lio/fotoapparat/parameter/Resolution;)Lio/fotoapparat/hardware/metering/FocalRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/hardware/metering/PointF;", "getPoint", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lio/fotoapparat/parameter/Resolution;", "getPreviewResolution", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class FocalRequest {

    /* renamed from: a */
    public final PointF f62983a;

    /* renamed from: b */
    public final Resolution f62984b;

    public FocalRequest(@NotNull PointF point, @NotNull Resolution previewResolution) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
        this.f62983a = point;
        this.f62984b = previewResolution;
    }

    public static /* synthetic */ FocalRequest copy$default(FocalRequest focalRequest, PointF pointF, Resolution resolution, int i, Object obj) {
        if ((i & 1) != 0) {
            pointF = focalRequest.f62983a;
        }
        if ((i & 2) != 0) {
            resolution = focalRequest.f62984b;
        }
        return focalRequest.copy(pointF, resolution);
    }

    @NotNull
    public final PointF component1() {
        return this.f62983a;
    }

    @NotNull
    public final Resolution component2() {
        return this.f62984b;
    }

    @NotNull
    public final FocalRequest copy(@NotNull PointF point, @NotNull Resolution previewResolution) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
        return new FocalRequest(point, previewResolution);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocalRequest) {
            FocalRequest focalRequest = (FocalRequest) obj;
            return Intrinsics.areEqual(this.f62983a, focalRequest.f62983a) && Intrinsics.areEqual(this.f62984b, focalRequest.f62984b);
        }
        return false;
    }

    @NotNull
    public final PointF getPoint() {
        return this.f62983a;
    }

    @NotNull
    public final Resolution getPreviewResolution() {
        return this.f62984b;
    }

    public int hashCode() {
        return (this.f62983a.hashCode() * 31) + this.f62984b.hashCode();
    }

    @NotNull
    public String toString() {
        PointF pointF = this.f62983a;
        Resolution resolution = this.f62984b;
        return "FocalRequest(point=" + pointF + ", previewResolution=" + resolution + ")";
    }
}
