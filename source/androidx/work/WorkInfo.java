package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b1\u0018\u0000 H2\u00020\u0001:\u0003HIJB\u0083\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010?R\u0017\u0010\u0016\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\bF\u00104\u001a\u0004\bG\u0010\u001e¨\u0006K"}, m28850d2 = {"Landroidx/work/WorkInfo;", "", "Ljava/util/UUID;", "id", "Landroidx/work/WorkInfo$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "", "tags", "Landroidx/work/Data;", "outputData", "progress", "", "runAttemptCount", "generation", "Landroidx/work/Constraints;", "constraints", "", "initialDelayMillis", "Landroidx/work/WorkInfo$PeriodicityInfo;", "periodicityInfo", "nextScheduleTimeMillis", "stopReason", "<init>", "(Ljava/util/UUID;Landroidx/work/WorkInfo$State;Ljava/util/Set;Landroidx/work/Data;Landroidx/work/Data;IILandroidx/work/Constraints;JLandroidx/work/WorkInfo$PeriodicityInfo;JI)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/work/WorkInfo$State;", "getState", "()Landroidx/work/WorkInfo$State;", OperatorName.CURVE_TO, "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", "d", "Landroidx/work/Data;", "getOutputData", "()Landroidx/work/Data;", "e", "getProgress", OperatorName.FILL_NON_ZERO, "I", "getRunAttemptCount", OperatorName.NON_STROKING_GRAY, "getGeneration", OperatorName.CLOSE_PATH, "Landroidx/work/Constraints;", "getConstraints", "()Landroidx/work/Constraints;", "i", OperatorName.SET_LINE_CAPSTYLE, "getInitialDelayMillis", "()J", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/work/WorkInfo$PeriodicityInfo;", "getPeriodicityInfo", "()Landroidx/work/WorkInfo$PeriodicityInfo;", OperatorName.NON_STROKING_CMYK, "getNextScheduleTimeMillis", OperatorName.LINE_TO, "getStopReason", "Companion", "PeriodicityInfo", "State", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class WorkInfo {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public static final int STOP_REASON_NOT_STOPPED = -256;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_UNKNOWN = -512;
    public static final int STOP_REASON_USER = 13;

    /* renamed from: a */
    public final UUID f38250a;

    /* renamed from: b */
    public final State f38251b;

    /* renamed from: c */
    public final Set f38252c;

    /* renamed from: d */
    public final Data f38253d;

    /* renamed from: e */
    public final Data f38254e;

    /* renamed from: f */
    public final int f38255f;

    /* renamed from: g */
    public final int f38256g;

    /* renamed from: h */
    public final Constraints f38257h;

    /* renamed from: i */
    public final long f38258i;

    /* renamed from: j */
    public final PeriodicityInfo f38259j;

    /* renamed from: k */
    public final long f38260k;

    /* renamed from: l */
    public final int f38261l;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m28850d2 = {"Landroidx/work/WorkInfo$Companion;", "", "()V", "STOP_REASON_APP_STANDBY", "", "STOP_REASON_BACKGROUND_RESTRICTION", "STOP_REASON_CANCELLED_BY_APP", "STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW", "STOP_REASON_CONSTRAINT_CHARGING", "STOP_REASON_CONSTRAINT_CONNECTIVITY", "STOP_REASON_CONSTRAINT_DEVICE_IDLE", "STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW", "STOP_REASON_DEVICE_STATE", "STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED", "STOP_REASON_NOT_STOPPED", "STOP_REASON_PREEMPT", "STOP_REASON_QUOTA", "STOP_REASON_SYSTEM_PROCESSING", "STOP_REASON_TIMEOUT", "STOP_REASON_UNKNOWN", "STOP_REASON_USER", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m28850d2 = {"Landroidx/work/WorkInfo$PeriodicityInfo;", "", "", "repeatIntervalMillis", "flexIntervalMillis", "<init>", "(JJ)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getRepeatIntervalMillis", "()J", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFlexIntervalMillis", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class PeriodicityInfo {

        /* renamed from: a */
        public final long f38262a;

        /* renamed from: b */
        public final long f38263b;

        public PeriodicityInfo(long j, long j2) {
            this.f38262a = j;
            this.f38263b = j2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Intrinsics.areEqual(PeriodicityInfo.class, obj.getClass())) {
                return false;
            }
            PeriodicityInfo periodicityInfo = (PeriodicityInfo) obj;
            if (periodicityInfo.f38262a == this.f38262a && periodicityInfo.f38263b == this.f38263b) {
                return true;
            }
            return false;
        }

        public final long getFlexIntervalMillis() {
            return this.f38263b;
        }

        public final long getRepeatIntervalMillis() {
            return this.f38262a;
        }

        public int hashCode() {
            return (AbstractC17792Ig1.m67882a(this.f38262a) * 31) + AbstractC17792Ig1.m67882a(this.f38263b);
        }

        @NotNull
        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.f38262a + ", flexIntervalMillis=" + this.f38263b + '}';
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m28850d2 = {"Landroidx/work/WorkInfo$State;", "", "(Ljava/lang/String;I)V", "isFinished", "", "()Z", "ENQUEUED", DebugCoroutineInfoImplKt.RUNNING, "SUCCEEDED", Constant.QueryTransactionStatus.FAILED, "BLOCKED", Constant.QueryTransactionStatus.CANCELLED, "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            if (this != SUCCEEDED && this != FAILED && this != CANCELLED) {
                return false;
            }
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags) {
        this(id2, state, tags, null, null, 0, 0, null, 0L, null, 0L, 0, 4088, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(WorkInfo.class, obj.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f38255f != workInfo.f38255f || this.f38256g != workInfo.f38256g || !Intrinsics.areEqual(this.f38250a, workInfo.f38250a) || this.f38251b != workInfo.f38251b || !Intrinsics.areEqual(this.f38253d, workInfo.f38253d) || !Intrinsics.areEqual(this.f38257h, workInfo.f38257h) || this.f38258i != workInfo.f38258i || !Intrinsics.areEqual(this.f38259j, workInfo.f38259j) || this.f38260k != workInfo.f38260k || this.f38261l != workInfo.f38261l || !Intrinsics.areEqual(this.f38252c, workInfo.f38252c)) {
            return false;
        }
        return Intrinsics.areEqual(this.f38254e, workInfo.f38254e);
    }

    @NotNull
    public final Constraints getConstraints() {
        return this.f38257h;
    }

    public final int getGeneration() {
        return this.f38256g;
    }

    @NotNull
    public final UUID getId() {
        return this.f38250a;
    }

    public final long getInitialDelayMillis() {
        return this.f38258i;
    }

    public final long getNextScheduleTimeMillis() {
        return this.f38260k;
    }

    @NotNull
    public final Data getOutputData() {
        return this.f38253d;
    }

    @Nullable
    public final PeriodicityInfo getPeriodicityInfo() {
        return this.f38259j;
    }

    @NotNull
    public final Data getProgress() {
        return this.f38254e;
    }

    @IntRange(from = 0)
    public final int getRunAttemptCount() {
        return this.f38255f;
    }

    @NotNull
    public final State getState() {
        return this.f38251b;
    }

    @RequiresApi(31)
    public final int getStopReason() {
        return this.f38261l;
    }

    @NotNull
    public final Set<String> getTags() {
        return this.f38252c;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((((((((((((((this.f38250a.hashCode() * 31) + this.f38251b.hashCode()) * 31) + this.f38253d.hashCode()) * 31) + this.f38252c.hashCode()) * 31) + this.f38254e.hashCode()) * 31) + this.f38255f) * 31) + this.f38256g) * 31) + this.f38257h.hashCode()) * 31) + AbstractC17792Ig1.m67882a(this.f38258i)) * 31;
        PeriodicityInfo periodicityInfo = this.f38259j;
        if (periodicityInfo != null) {
            i = periodicityInfo.hashCode();
        } else {
            i = 0;
        }
        return ((((hashCode + i) * 31) + AbstractC17792Ig1.m67882a(this.f38260k)) * 31) + this.f38261l;
    }

    @NotNull
    public String toString() {
        return "WorkInfo{id='" + this.f38250a + "', state=" + this.f38251b + ", outputData=" + this.f38253d + ", tags=" + this.f38252c + ", progress=" + this.f38254e + ", runAttemptCount=" + this.f38255f + ", generation=" + this.f38256g + ", constraints=" + this.f38257h + ", initialDelayMillis=" + this.f38258i + ", periodicityInfo=" + this.f38259j + ", nextScheduleTimeMillis=" + this.f38260k + "}, stopReason=" + this.f38261l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData) {
        this(id2, state, tags, outputData, null, 0, 0, null, 0L, null, 0L, 0, 4080, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress) {
        this(id2, state, tags, outputData, progress, 0, 0, null, 0L, null, 0L, 0, 4064, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress, int i) {
        this(id2, state, tags, outputData, progress, i, 0, null, 0L, null, 0L, 0, 4032, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress, int i, int i2) {
        this(id2, state, tags, outputData, progress, i, i2, null, 0L, null, 0L, 0, Utf8.MASK_2BYTES, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress, int i, int i2, @NotNull Constraints constraints) {
        this(id2, state, tags, outputData, progress, i, i2, constraints, 0L, null, 0L, 0, 3840, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress, int i, int i2, @NotNull Constraints constraints, long j) {
        this(id2, state, tags, outputData, progress, i, i2, constraints, j, null, 0L, 0, 3584, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress, int i, int i2, @NotNull Constraints constraints, long j, @Nullable PeriodicityInfo periodicityInfo) {
        this(id2, state, tags, outputData, progress, i, i2, constraints, j, periodicityInfo, 0L, 0, 3072, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress, int i, int i2, @NotNull Constraints constraints, long j, @Nullable PeriodicityInfo periodicityInfo, long j2) {
        this(id2, state, tags, outputData, progress, i, i2, constraints, j, periodicityInfo, j2, 0, 2048, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
    }

    @JvmOverloads
    public WorkInfo(@NotNull UUID id2, @NotNull State state, @NotNull Set<String> tags, @NotNull Data outputData, @NotNull Data progress, int i, int i2, @NotNull Constraints constraints, long j, @Nullable PeriodicityInfo periodicityInfo, long j2, int i3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        this.f38250a = id2;
        this.f38251b = state;
        this.f38252c = tags;
        this.f38253d = outputData;
        this.f38254e = progress;
        this.f38255f = i;
        this.f38256g = i2;
        this.f38257h = constraints;
        this.f38258i = j;
        this.f38259j = periodicityInfo;
        this.f38260k = j2;
        this.f38261l = i3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ WorkInfo(java.util.UUID r19, androidx.work.WorkInfo.State r20, java.util.Set r21, androidx.work.Data r22, androidx.work.Data r23, int r24, int r25, androidx.work.Constraints r26, long r27, androidx.work.WorkInfo.PeriodicityInfo r29, long r30, int r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 8
            java.lang.String r2 = "EMPTY"
            if (r1 == 0) goto Lf
            androidx.work.Data r1 = androidx.work.Data.EMPTY
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r7 = r1
            goto L11
        Lf:
            r7 = r22
        L11:
            r1 = r0 & 16
            if (r1 == 0) goto L1c
            androidx.work.Data r1 = androidx.work.Data.EMPTY
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r8 = r1
            goto L1e
        L1c:
            r8 = r23
        L1e:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L25
            r9 = 0
            goto L27
        L25:
            r9 = r24
        L27:
            r1 = r0 & 64
            if (r1 == 0) goto L2d
            r10 = 0
            goto L2f
        L2d:
            r10 = r25
        L2f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L37
            androidx.work.Constraints r1 = androidx.work.Constraints.NONE
            r11 = r1
            goto L39
        L37:
            r11 = r26
        L39:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L41
            r1 = 0
            r12 = r1
            goto L43
        L41:
            r12 = r27
        L43:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L4a
            r1 = 0
            r14 = r1
            goto L4c
        L4a:
            r14 = r29
        L4c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L57
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = r1
            goto L59
        L57:
            r15 = r30
        L59:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L62
            r0 = -256(0xffffffffffffff00, float:NaN)
            r17 = -256(0xffffffffffffff00, float:NaN)
            goto L64
        L62:
            r17 = r32
        L64:
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.WorkInfo.<init>(java.util.UUID, androidx.work.WorkInfo$State, java.util.Set, androidx.work.Data, androidx.work.Data, int, int, androidx.work.Constraints, long, androidx.work.WorkInfo$PeriodicityInfo, long, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
