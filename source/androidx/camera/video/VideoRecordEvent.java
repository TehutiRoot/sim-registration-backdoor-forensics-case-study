package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class VideoRecordEvent {

    /* renamed from: a */
    public final OutputOptions f11796a;

    /* renamed from: b */
    public final RecordingStats f11797b;

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class Finalize extends VideoRecordEvent {
        public static final int ERROR_DURATION_LIMIT_REACHED = 9;
        public static final int ERROR_ENCODING_FAILED = 6;
        public static final int ERROR_FILE_SIZE_LIMIT_REACHED = 2;
        public static final int ERROR_INSUFFICIENT_STORAGE = 3;
        public static final int ERROR_INVALID_OUTPUT_OPTIONS = 5;
        public static final int ERROR_NONE = 0;
        public static final int ERROR_NO_VALID_DATA = 8;
        public static final int ERROR_RECORDER_ERROR = 7;
        public static final int ERROR_RECORDING_GARBAGE_COLLECTED = 10;
        public static final int ERROR_SOURCE_INACTIVE = 4;
        public static final int ERROR_UNKNOWN = 1;

        /* renamed from: c */
        public final OutputResults f11798c;

        /* renamed from: d */
        public final int f11799d;

        /* renamed from: e */
        public final Throwable f11800e;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* loaded from: classes.dex */
        public @interface VideoRecordError {
        }

        public Finalize(OutputOptions outputOptions, RecordingStats recordingStats, OutputResults outputResults, int i, Throwable th2) {
            super(outputOptions, recordingStats);
            this.f11798c = outputResults;
            this.f11799d = i;
            this.f11800e = th2;
        }

        /* renamed from: g */
        public static String m62269g(int i) {
            switch (i) {
                case 0:
                    return "ERROR_NONE";
                case 1:
                    return "ERROR_UNKNOWN";
                case 2:
                    return "ERROR_FILE_SIZE_LIMIT_REACHED";
                case 3:
                    return "ERROR_INSUFFICIENT_STORAGE";
                case 4:
                    return "ERROR_SOURCE_INACTIVE";
                case 5:
                    return "ERROR_INVALID_OUTPUT_OPTIONS";
                case 6:
                    return "ERROR_ENCODING_FAILED";
                case 7:
                    return "ERROR_RECORDER_ERROR";
                case 8:
                    return "ERROR_NO_VALID_DATA";
                case 9:
                    return "ERROR_DURATION_LIMIT_REACHED";
                case 10:
                    return "ERROR_RECORDING_GARBAGE_COLLECTED";
                default:
                    return "Unknown(" + i + ")";
            }
        }

        @Nullable
        public Throwable getCause() {
            return this.f11800e;
        }

        public int getError() {
            return this.f11799d;
        }

        @NonNull
        public OutputResults getOutputResults() {
            return this.f11798c;
        }

        public boolean hasError() {
            if (this.f11799d != 0) {
                return true;
            }
            return false;
        }
    }

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class Pause extends VideoRecordEvent {
        public Pause(OutputOptions outputOptions, RecordingStats recordingStats) {
            super(outputOptions, recordingStats);
        }
    }

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class Resume extends VideoRecordEvent {
        public Resume(OutputOptions outputOptions, RecordingStats recordingStats) {
            super(outputOptions, recordingStats);
        }
    }

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class Start extends VideoRecordEvent {
        public Start(OutputOptions outputOptions, RecordingStats recordingStats) {
            super(outputOptions, recordingStats);
        }
    }

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class Status extends VideoRecordEvent {
        public Status(OutputOptions outputOptions, RecordingStats recordingStats) {
            super(outputOptions, recordingStats);
        }
    }

    public VideoRecordEvent(OutputOptions outputOptions, RecordingStats recordingStats) {
        this.f11796a = (OutputOptions) Preconditions.checkNotNull(outputOptions);
        this.f11797b = (RecordingStats) Preconditions.checkNotNull(recordingStats);
    }

    /* renamed from: a */
    public static Finalize m62275a(OutputOptions outputOptions, RecordingStats recordingStats, OutputResults outputResults) {
        return new Finalize(outputOptions, recordingStats, outputResults, 0, null);
    }

    /* renamed from: b */
    public static Finalize m62274b(OutputOptions outputOptions, RecordingStats recordingStats, OutputResults outputResults, int i, Throwable th2) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "An error type is required.");
        return new Finalize(outputOptions, recordingStats, outputResults, i, th2);
    }

    /* renamed from: c */
    public static Pause m62273c(OutputOptions outputOptions, RecordingStats recordingStats) {
        return new Pause(outputOptions, recordingStats);
    }

    /* renamed from: d */
    public static Resume m62272d(OutputOptions outputOptions, RecordingStats recordingStats) {
        return new Resume(outputOptions, recordingStats);
    }

    /* renamed from: e */
    public static Start m62271e(OutputOptions outputOptions, RecordingStats recordingStats) {
        return new Start(outputOptions, recordingStats);
    }

    /* renamed from: f */
    public static Status m62270f(OutputOptions outputOptions, RecordingStats recordingStats) {
        return new Status(outputOptions, recordingStats);
    }

    @NonNull
    public OutputOptions getOutputOptions() {
        return this.f11796a;
    }

    @NonNull
    public RecordingStats getRecordingStats() {
        return this.f11797b;
    }
}
