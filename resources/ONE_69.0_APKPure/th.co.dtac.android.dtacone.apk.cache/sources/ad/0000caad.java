package io.fotoapparat.preview;

import androidx.constraintlayout.motion.widget.Key;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.parameter.Resolution;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006#"}, m29142d2 = {"Lio/fotoapparat/preview/Frame;", "", "Lio/fotoapparat/parameter/Resolution;", "size", "", ResponseProcessor.CONTENT_TYPE_IMAGE, "", Key.ROTATION, "<init>", "(Lio/fotoapparat/parameter/Resolution;[BI)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Lio/fotoapparat/parameter/Resolution;", "component2", "()[B", "component3", "copy", "(Lio/fotoapparat/parameter/Resolution;[BI)Lio/fotoapparat/preview/Frame;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/parameter/Resolution;", "getSize", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "[B", "getImage", OperatorName.CURVE_TO, "I", "getRotation", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class Frame {

    /* renamed from: a */
    public final Resolution f63092a;

    /* renamed from: b */
    public final byte[] f63093b;

    /* renamed from: c */
    public final int f63094c;

    public Frame(@NotNull Resolution size, @NotNull byte[] image, int i) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f63092a = size;
        this.f63093b = image;
        this.f63094c = i;
    }

    public static /* synthetic */ Frame copy$default(Frame frame, Resolution resolution, byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            resolution = frame.f63092a;
        }
        if ((i2 & 2) != 0) {
            bArr = frame.f63093b;
        }
        if ((i2 & 4) != 0) {
            i = frame.f63094c;
        }
        return frame.copy(resolution, bArr, i);
    }

    @NotNull
    public final Resolution component1() {
        return this.f63092a;
    }

    @NotNull
    public final byte[] component2() {
        return this.f63093b;
    }

    public final int component3() {
        return this.f63094c;
    }

    @NotNull
    public final Frame copy(@NotNull Resolution size, @NotNull byte[] image, int i) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(image, "image");
        return new Frame(size, image, i);
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(Frame.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.fotoapparat.preview.Frame");
        Frame frame = (Frame) obj;
        if (Intrinsics.areEqual(this.f63092a, frame.f63092a) && Arrays.equals(this.f63093b, frame.f63093b) && this.f63094c == frame.f63094c) {
            return true;
        }
        return false;
    }

    @NotNull
    public final byte[] getImage() {
        return this.f63093b;
    }

    public final int getRotation() {
        return this.f63094c;
    }

    @NotNull
    public final Resolution getSize() {
        return this.f63092a;
    }

    public int hashCode() {
        return (((this.f63092a.hashCode() * 31) + Arrays.hashCode(this.f63093b)) * 31) + this.f63094c;
    }

    @NotNull
    public String toString() {
        Resolution resolution = this.f63092a;
        int length = this.f63093b.length;
        int i = this.f63094c;
        return "Frame{size=" + resolution + ", image= array(" + length + "), rotation=" + i + "}";
    }
}