package io.fotoapparat.parameter;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m28850d2 = {"Lio/fotoapparat/parameter/AntiBandingMode;", "Lio/fotoapparat/parameter/Parameter;", "()V", "Auto", "HZ50", "HZ60", "None", "Lio/fotoapparat/parameter/AntiBandingMode$Auto;", "Lio/fotoapparat/parameter/AntiBandingMode$HZ50;", "Lio/fotoapparat/parameter/AntiBandingMode$HZ60;", "Lio/fotoapparat/parameter/AntiBandingMode$None;", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public abstract class AntiBandingMode implements Parameter {

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/parameter/AntiBandingMode$Auto;", "Lio/fotoapparat/parameter/AntiBandingMode;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class Auto extends AntiBandingMode {
        @NotNull
        public static final Auto INSTANCE = new Auto();

        public Auto() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "AntiBandingMode.Auto";
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/parameter/AntiBandingMode$HZ50;", "Lio/fotoapparat/parameter/AntiBandingMode;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class HZ50 extends AntiBandingMode {
        @NotNull
        public static final HZ50 INSTANCE = new HZ50();

        public HZ50() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "AntiBandingMode.HZ50";
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/parameter/AntiBandingMode$HZ60;", "Lio/fotoapparat/parameter/AntiBandingMode;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class HZ60 extends AntiBandingMode {
        @NotNull
        public static final HZ60 INSTANCE = new HZ60();

        public HZ60() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "AntiBandingMode.HZ60";
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28850d2 = {"Lio/fotoapparat/parameter/AntiBandingMode$None;", "Lio/fotoapparat/parameter/AntiBandingMode;", "()V", "toString", "", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class None extends AntiBandingMode {
        @NotNull
        public static final None INSTANCE = new None();

        public None() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "AntiBandingMode.None";
        }
    }

    public /* synthetic */ AntiBandingMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AntiBandingMode() {
    }
}
