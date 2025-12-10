package io.fotoapparat.parameter;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m28850d2 = {"Lio/fotoapparat/parameter/Zoom;", "", "()V", "FixedZoom", "VariableZoom", "Lio/fotoapparat/parameter/Zoom$FixedZoom;", "Lio/fotoapparat/parameter/Zoom$VariableZoom;", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public abstract class Zoom {

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/parameter/Zoom$FixedZoom;", "Lio/fotoapparat/parameter/Zoom;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class FixedZoom extends Zoom {
        @NotNull
        public static final FixedZoom INSTANCE = new FixedZoom();

        public FixedZoom() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Zoom.FixedZoom";
        }
    }

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, m28850d2 = {"Lio/fotoapparat/parameter/Zoom$VariableZoom;", "Lio/fotoapparat/parameter/Zoom;", "", "maxZoom", "", "zoomRatios", "<init>", "(ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lio/fotoapparat/parameter/Zoom$VariableZoom;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getMaxZoom", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getZoomRatios", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final class VariableZoom extends Zoom {

        /* renamed from: a */
        public final int f63017a;

        /* renamed from: b */
        public final List f63018b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VariableZoom(int i, @NotNull List<Integer> zoomRatios) {
            super(null);
            Intrinsics.checkNotNullParameter(zoomRatios, "zoomRatios");
            this.f63017a = i;
            this.f63018b = zoomRatios;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VariableZoom copy$default(VariableZoom variableZoom, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = variableZoom.f63017a;
            }
            if ((i2 & 2) != 0) {
                list = variableZoom.f63018b;
            }
            return variableZoom.copy(i, list);
        }

        public final int component1() {
            return this.f63017a;
        }

        @NotNull
        public final List<Integer> component2() {
            return this.f63018b;
        }

        @NotNull
        public final VariableZoom copy(int i, @NotNull List<Integer> zoomRatios) {
            Intrinsics.checkNotNullParameter(zoomRatios, "zoomRatios");
            return new VariableZoom(i, zoomRatios);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof VariableZoom) {
                VariableZoom variableZoom = (VariableZoom) obj;
                return this.f63017a == variableZoom.f63017a && Intrinsics.areEqual(this.f63018b, variableZoom.f63018b);
            }
            return false;
        }

        public final int getMaxZoom() {
            return this.f63017a;
        }

        @NotNull
        public final List<Integer> getZoomRatios() {
            return this.f63018b;
        }

        public int hashCode() {
            return (this.f63017a * 31) + this.f63018b.hashCode();
        }

        @NotNull
        public String toString() {
            int i = this.f63017a;
            List list = this.f63018b;
            return "Zoom.VariableZoom(maxZoom=" + i + ", zoomRatios=" + list + ")";
        }
    }

    public /* synthetic */ Zoom(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Zoom() {
    }
}
