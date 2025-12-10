package io.fotoapparat.characteristic;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m29142d2 = {"Lio/fotoapparat/characteristic/LensPosition;", "Lio/fotoapparat/characteristic/Characteristic;", "()V", "Back", "External", "Front", "Lio/fotoapparat/characteristic/LensPosition$Back;", "Lio/fotoapparat/characteristic/LensPosition$External;", "Lio/fotoapparat/characteristic/LensPosition$Front;", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public abstract class LensPosition implements Characteristic {

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m29142d2 = {"Lio/fotoapparat/characteristic/LensPosition$Back;", "Lio/fotoapparat/characteristic/LensPosition;", "()V", "toString", "", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes5.dex */
    public static final class Back extends LensPosition {
        @NotNull
        public static final Back INSTANCE = new Back();

        public Back() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "LensPosition.Back";
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m29142d2 = {"Lio/fotoapparat/characteristic/LensPosition$External;", "Lio/fotoapparat/characteristic/LensPosition;", "()V", "toString", "", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes5.dex */
    public static final class External extends LensPosition {
        @NotNull
        public static final External INSTANCE = new External();

        public External() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "LensPosition.External";
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m29142d2 = {"Lio/fotoapparat/characteristic/LensPosition$Front;", "Lio/fotoapparat/characteristic/LensPosition;", "()V", "toString", "", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes5.dex */
    public static final class Front extends LensPosition {
        @NotNull
        public static final Front INSTANCE = new Front();

        public Front() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "LensPosition.Front";
        }
    }

    public /* synthetic */ LensPosition(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public LensPosition() {
    }
}