package io.fotoapparat.hardware.orientation;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m28850d2 = {"Lio/fotoapparat/hardware/orientation/Orientation;", "", "", "degrees", "<init>", "(I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getDegrees", "()I", "Horizontal", "Vertical", "Lio/fotoapparat/hardware/orientation/Orientation$Horizontal;", "Lio/fotoapparat/hardware/orientation/Orientation$Vertical;", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public abstract class Orientation {

    /* renamed from: a */
    public final int f62987a;

    @Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m28850d2 = {"Lio/fotoapparat/hardware/orientation/Orientation$Horizontal;", "Lio/fotoapparat/hardware/orientation/Orientation;", "degrees", "", "(I)V", "Landscape", "ReverseLandscape", "Lio/fotoapparat/hardware/orientation/Orientation$Horizontal$Landscape;", "Lio/fotoapparat/hardware/orientation/Orientation$Horizontal$ReverseLandscape;", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Horizontal extends Orientation {

        @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/hardware/orientation/Orientation$Horizontal$Landscape;", "Lio/fotoapparat/hardware/orientation/Orientation$Horizontal;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* loaded from: classes5.dex */
        public static final class Landscape extends Horizontal {
            @NotNull
            public static final Landscape INSTANCE = new Landscape();

            public Landscape() {
                super(90, null);
            }

            @NotNull
            public String toString() {
                return "Orientation.Horizontal.Landscape";
            }
        }

        @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/hardware/orientation/Orientation$Horizontal$ReverseLandscape;", "Lio/fotoapparat/hardware/orientation/Orientation$Horizontal;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* loaded from: classes5.dex */
        public static final class ReverseLandscape extends Horizontal {
            @NotNull
            public static final ReverseLandscape INSTANCE = new ReverseLandscape();

            public ReverseLandscape() {
                super(BitmapUtil.IMAGE_270_DEGREE, null);
            }

            @NotNull
            public String toString() {
                return "Orientation.Horizontal.ReverseLandscape";
            }
        }

        public /* synthetic */ Horizontal(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        public Horizontal(int i) {
            super(i, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m28850d2 = {"Lio/fotoapparat/hardware/orientation/Orientation$Vertical;", "Lio/fotoapparat/hardware/orientation/Orientation;", "degrees", "", "(I)V", "Portrait", "ReversePortrait", "Lio/fotoapparat/hardware/orientation/Orientation$Vertical$Portrait;", "Lio/fotoapparat/hardware/orientation/Orientation$Vertical$ReversePortrait;", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Vertical extends Orientation {

        @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/hardware/orientation/Orientation$Vertical$Portrait;", "Lio/fotoapparat/hardware/orientation/Orientation$Vertical;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* loaded from: classes5.dex */
        public static final class Portrait extends Vertical {
            @NotNull
            public static final Portrait INSTANCE = new Portrait();

            public Portrait() {
                super(0, null);
            }

            @NotNull
            public String toString() {
                return "Orientation.Vertical.Portrait";
            }
        }

        @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/hardware/orientation/Orientation$Vertical$ReversePortrait;", "Lio/fotoapparat/hardware/orientation/Orientation$Vertical;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* loaded from: classes5.dex */
        public static final class ReversePortrait extends Vertical {
            @NotNull
            public static final ReversePortrait INSTANCE = new ReversePortrait();

            public ReversePortrait() {
                super(BitmapUtil.IMAGE_180_DEGREE, null);
            }

            @NotNull
            public String toString() {
                return "Orientation.Vertical.ReversePortrait";
            }
        }

        public /* synthetic */ Vertical(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        public Vertical(int i) {
            super(i, null);
        }
    }

    public /* synthetic */ Orientation(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final int getDegrees() {
        return this.f62987a;
    }

    public Orientation(int i) {
        this.f62987a = i;
    }
}
