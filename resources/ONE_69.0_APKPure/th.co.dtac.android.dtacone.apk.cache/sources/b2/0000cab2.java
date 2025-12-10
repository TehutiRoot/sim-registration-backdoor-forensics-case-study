package io.fotoapparat.result;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m29142d2 = {"Lio/fotoapparat/result/FocusResult;", "", "()V", "Focused", "UnableToFocus", "Lio/fotoapparat/result/FocusResult$Focused;", "Lio/fotoapparat/result/FocusResult$UnableToFocus;", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public abstract class FocusResult {

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m29142d2 = {"Lio/fotoapparat/result/FocusResult$Focused;", "Lio/fotoapparat/result/FocusResult;", "()V", "toString", "", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes5.dex */
    public static final class Focused extends FocusResult {
        @NotNull
        public static final Focused INSTANCE = new Focused();

        public Focused() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "FocusResult.Focused";
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m29142d2 = {"Lio/fotoapparat/result/FocusResult$UnableToFocus;", "Lio/fotoapparat/result/FocusResult;", "()V", "toString", "", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes5.dex */
    public static final class UnableToFocus extends FocusResult {
        @NotNull
        public static final UnableToFocus INSTANCE = new UnableToFocus();

        public UnableToFocus() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "FocusResult.UnableToFocus";
        }
    }

    public /* synthetic */ FocusResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public FocusResult() {
    }
}