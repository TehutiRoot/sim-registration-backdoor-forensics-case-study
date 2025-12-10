package io.fotoapparat.parameter;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m28850d2 = {"Lio/fotoapparat/parameter/FocusMode;", "Lio/fotoapparat/parameter/Parameter;", "()V", "Auto", "ContinuousFocusPicture", "ContinuousFocusVideo", "Edof", "Fixed", "Infinity", "Macro", "Lio/fotoapparat/parameter/FocusMode$Auto;", "Lio/fotoapparat/parameter/FocusMode$ContinuousFocusPicture;", "Lio/fotoapparat/parameter/FocusMode$ContinuousFocusVideo;", "Lio/fotoapparat/parameter/FocusMode$Edof;", "Lio/fotoapparat/parameter/FocusMode$Fixed;", "Lio/fotoapparat/parameter/FocusMode$Infinity;", "Lio/fotoapparat/parameter/FocusMode$Macro;", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public abstract class FocusMode implements Parameter {

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/parameter/FocusMode$Auto;", "Lio/fotoapparat/parameter/FocusMode;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class Auto extends FocusMode {
        @NotNull
        public static final Auto INSTANCE = new Auto();

        public Auto() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "FocusMode.Auto";
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/parameter/FocusMode$ContinuousFocusPicture;", "Lio/fotoapparat/parameter/FocusMode;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class ContinuousFocusPicture extends FocusMode {
        @NotNull
        public static final ContinuousFocusPicture INSTANCE = new ContinuousFocusPicture();

        public ContinuousFocusPicture() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "FocusMode.ContinuousFocusPicture";
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/parameter/FocusMode$ContinuousFocusVideo;", "Lio/fotoapparat/parameter/FocusMode;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class ContinuousFocusVideo extends FocusMode {
        @NotNull
        public static final ContinuousFocusVideo INSTANCE = new ContinuousFocusVideo();

        public ContinuousFocusVideo() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "FocusMode.ContinuousFocusVideo";
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/parameter/FocusMode$Edof;", "Lio/fotoapparat/parameter/FocusMode;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class Edof extends FocusMode {
        @NotNull
        public static final Edof INSTANCE = new Edof();

        public Edof() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "FocusMode.Edof";
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/parameter/FocusMode$Fixed;", "Lio/fotoapparat/parameter/FocusMode;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class Fixed extends FocusMode {
        @NotNull
        public static final Fixed INSTANCE = new Fixed();

        public Fixed() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "FocusMode.Fixed";
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/parameter/FocusMode$Infinity;", "Lio/fotoapparat/parameter/FocusMode;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class Infinity extends FocusMode {
        @NotNull
        public static final Infinity INSTANCE = new Infinity();

        public Infinity() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "FocusMode.Infinity";
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/parameter/FocusMode$Macro;", "Lio/fotoapparat/parameter/FocusMode;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class Macro extends FocusMode {
        @NotNull
        public static final Macro INSTANCE = new Macro();

        public Macro() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "FocusMode.Macro";
        }
    }

    public /* synthetic */ FocusMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public FocusMode() {
    }
}
