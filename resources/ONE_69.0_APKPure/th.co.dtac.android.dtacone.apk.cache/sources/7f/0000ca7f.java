package io.fotoapparat.parameter;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, m29142d2 = {"Lio/fotoapparat/parameter/Flash;", "Lio/fotoapparat/parameter/Parameter;", "()V", "Auto", "AutoRedEye", "Off", "On", "Torch", "Lio/fotoapparat/parameter/Flash$Auto;", "Lio/fotoapparat/parameter/Flash$AutoRedEye;", "Lio/fotoapparat/parameter/Flash$Off;", "Lio/fotoapparat/parameter/Flash$On;", "Lio/fotoapparat/parameter/Flash$Torch;", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public abstract class Flash implements Parameter {

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m29142d2 = {"Lio/fotoapparat/parameter/Flash$Auto;", "Lio/fotoapparat/parameter/Flash;", "()V", "toString", "", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes5.dex */
    public static final class Auto extends Flash {
        @NotNull
        public static final Auto INSTANCE = new Auto();

        public Auto() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Flash.Auto";
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m29142d2 = {"Lio/fotoapparat/parameter/Flash$AutoRedEye;", "Lio/fotoapparat/parameter/Flash;", "()V", "toString", "", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes5.dex */
    public static final class AutoRedEye extends Flash {
        @NotNull
        public static final AutoRedEye INSTANCE = new AutoRedEye();

        public AutoRedEye() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Flash.AutoRedEye";
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m29142d2 = {"Lio/fotoapparat/parameter/Flash$Off;", "Lio/fotoapparat/parameter/Flash;", "()V", "toString", "", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes5.dex */
    public static final class Off extends Flash {
        @NotNull
        public static final Off INSTANCE = new Off();

        public Off() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Flash.Off";
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m29142d2 = {"Lio/fotoapparat/parameter/Flash$On;", "Lio/fotoapparat/parameter/Flash;", "()V", "toString", "", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: io.fotoapparat.parameter.Flash$On */
    /* loaded from: classes5.dex */
    public static final class C10483On extends Flash {
        @NotNull
        public static final C10483On INSTANCE = new C10483On();

        public C10483On() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Flash.On";
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m29142d2 = {"Lio/fotoapparat/parameter/Flash$Torch;", "Lio/fotoapparat/parameter/Flash;", "()V", "toString", "", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes5.dex */
    public static final class Torch extends Flash {
        @NotNull
        public static final Torch INSTANCE = new Torch();

        public Torch() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Flash.Torch";
        }
    }

    public /* synthetic */ Flash(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Flash() {
    }
}