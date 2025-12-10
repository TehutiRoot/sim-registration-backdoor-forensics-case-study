package androidx.work.impl.model;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\bI\b\u0087\b\u0018\u0000 o2\u00020\u0001:\u0003opqBé\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010%B\u0019\b\u0016\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010(J\u0015\u0010*\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020)2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b,\u0010+J\u001d\u0010,\u001a\u00020)2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u000b¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0019¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0002H\u0016¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u00103J\u0010\u00105\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u00103J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u00103J\u0010\u00109\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b;\u0010:J\u0010\u0010<\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b<\u0010/J\u0010\u0010=\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b=\u0010/J\u0010\u0010>\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b>\u0010/J\u0010\u0010?\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bE\u0010/J\u0010\u0010F\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bF\u0010/J\u0010\u0010G\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bG\u0010/J\u0010\u0010H\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bH\u0010/J\u0010\u0010I\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bI\u00101J\u0010\u0010J\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bL\u0010BJ\u0010\u0010M\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bM\u0010BJ\u0010\u0010N\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bN\u0010/J\u0010\u0010O\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bO\u0010BJ\u0010\u0010P\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\bP\u0010BJö\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bS\u0010BJ\u001a\u0010T\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010VR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010WR\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010VR\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010VR\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010XR\u0016\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010XR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010YR\u0016\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010YR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010YR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010ZR\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010[R\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\\R\u0016\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010YR\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010YR\u0016\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010YR\u0016\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010YR\u0016\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010]R\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010^R\"\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010[\u001a\u0004\b`\u0010B\"\u0004\ba\u0010bR\u001a\u0010\u001e\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010[\u001a\u0004\bd\u0010BR\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\be\u0010Y\u001a\u0004\bf\u0010/\"\u0004\bg\u0010+R\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010[\u001a\u0004\bi\u0010B\"\u0004\bj\u0010bR\u001a\u0010!\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010[\u001a\u0004\bl\u0010BR\u0011\u0010m\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bm\u00101R\u0011\u0010n\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bn\u00101¨\u0006r"}, m28850d2 = {"Landroidx/work/impl/model/WorkSpec;", "", "", "id", "Landroidx/work/WorkInfo$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "workerClassName", "inputMergerClassName", "Landroidx/work/Data;", "input", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Landroidx/work/Constraints;", "constraints", "", "runAttemptCount", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "", "expedited", "Landroidx/work/OutOfQuotaPolicy;", "outOfQuotaPolicy", "periodCount", "generation", "nextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "stopReason", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJII)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Landroidx/work/impl/model/WorkSpec;)V", "", "setBackoffDelayDuration", "(J)V", "setPeriodic", "(JJ)V", "calculateNextRunTime", "()J", "hasConstraints", "()Z", "toString", "()Ljava/lang/String;", "component1", "component2", "()Landroidx/work/WorkInfo$State;", "component3", "component4", "component5", "()Landroidx/work/Data;", "component6", "component7", "component8", "component9", "component10", "()Landroidx/work/Constraints;", "component11", "()I", "component12", "()Landroidx/work/BackoffPolicy;", "component13", "component14", "component15", "component16", "component17", "component18", "()Landroidx/work/OutOfQuotaPolicy;", "component19", "component20", "component21", "component22", "component23", "copy", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJII)Landroidx/work/impl/model/WorkSpec;", "hashCode", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "Landroidx/work/WorkInfo$State;", "Landroidx/work/Data;", OperatorName.SET_LINE_CAPSTYLE, "Landroidx/work/Constraints;", "I", "Landroidx/work/BackoffPolicy;", "Z", "Landroidx/work/OutOfQuotaPolicy;", PDPageLabelRange.STYLE_LETTERS_LOWER, "getPeriodCount", "setPeriodCount", "(I)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getGeneration", OperatorName.CURVE_TO, "getNextScheduleTimeOverride", "setNextScheduleTimeOverride", "d", "getNextScheduleTimeOverrideGeneration", "setNextScheduleTimeOverrideGeneration", "e", "getStopReason", "isPeriodic", "isBackedOff", "Companion", "IdAndState", "WorkInfoPojo", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"last_enqueue_time"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nWorkSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkSpec.kt\nandroidx/work/impl/model/WorkSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,544:1\n1549#2:545\n1620#2,3:546\n*S KotlinDebug\n*F\n+ 1 WorkSpec.kt\nandroidx/work/impl/model/WorkSpec\n*L\n482#1:545\n482#1:546,3\n*E\n"})
/* loaded from: classes.dex */
public final class WorkSpec {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    @JvmField
    @NotNull
    public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER;

    /* renamed from: f */
    public static final String f38602f;

    /* renamed from: a */
    public int f38603a;

    /* renamed from: b */
    public final int f38604b;
    @JvmField
    @ColumnInfo(name = "backoff_delay_duration")
    public long backoffDelayDuration;
    @JvmField
    @ColumnInfo(name = "backoff_policy")
    @NotNull
    public BackoffPolicy backoffPolicy;

    /* renamed from: c */
    public long f38605c;
    @Embedded
    @JvmField
    @NotNull
    public Constraints constraints;

    /* renamed from: d */
    public int f38606d;

    /* renamed from: e */
    public final int f38607e;
    @JvmField
    @ColumnInfo(name = "run_in_foreground")
    public boolean expedited;
    @JvmField
    @ColumnInfo(name = "flex_duration")
    public long flexDuration;
    @PrimaryKey
    @JvmField
    @ColumnInfo(name = "id")
    @NotNull

    /* renamed from: id */
    public final String f38608id;
    @JvmField
    @ColumnInfo(name = "initial_delay")
    public long initialDelay;
    @JvmField
    @ColumnInfo(name = "input")
    @NotNull
    public Data input;
    @JvmField
    @ColumnInfo(name = "input_merger_class_name")
    @NotNull
    public String inputMergerClassName;
    @JvmField
    @ColumnInfo(name = "interval_duration")
    public long intervalDuration;
    @JvmField
    @ColumnInfo(defaultValue = "-1", name = "last_enqueue_time")
    public long lastEnqueueTime;
    @JvmField
    @ColumnInfo(name = "minimum_retention_duration")
    public long minimumRetentionDuration;
    @JvmField
    @ColumnInfo(name = "out_of_quota_policy")
    @NotNull
    public OutOfQuotaPolicy outOfQuotaPolicy;
    @JvmField
    @ColumnInfo(name = "output")
    @NotNull
    public Data output;
    @JvmField
    @ColumnInfo(name = "run_attempt_count")
    public int runAttemptCount;
    @JvmField
    @ColumnInfo(name = "schedule_requested_at")
    public long scheduleRequestedAt;
    @JvmField
    @ColumnInfo(name = RemoteConfigConstants.ResponseFieldKey.STATE)
    @NotNull
    public WorkInfo.State state;
    @JvmField
    @ColumnInfo(name = "worker_class_name")
    @NotNull
    public String workerClassName;

    @Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J^\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m28850d2 = {"Landroidx/work/impl/model/WorkSpec$Companion;", "", "()V", "SCHEDULE_NOT_REQUESTED_YET", "", "TAG", "", "WORK_INFO_MAPPER", "Landroidx/arch/core/util/Function;", "", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "Landroidx/work/WorkInfo;", "calculateNextRunTime", "isBackedOff", "", "runAttemptCount", "", "backoffPolicy", "Landroidx/work/BackoffPolicy;", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "isPeriodic", "initialDelay", "flexDuration", "intervalDuration", "nextScheduleTimeOverride", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long calculateNextRunTime(boolean z, int i, @NotNull BackoffPolicy backoffPolicy, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
            long j7;
            long scalb;
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            if (j6 != Long.MAX_VALUE && z2) {
                if (i2 == 0) {
                    return j6;
                }
                return AbstractC11719c.coerceAtLeast(j6, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS + j2);
            } else if (z) {
                if (backoffPolicy == BackoffPolicy.LINEAR) {
                    scalb = i * j;
                } else {
                    scalb = Math.scalb((float) j, i - 1);
                }
                return j2 + AbstractC11719c.coerceAtMost(scalb, (long) WorkRequest.MAX_BACKOFF_MILLIS);
            } else if (z2) {
                if (i2 == 0) {
                    j7 = j2 + j3;
                } else {
                    j7 = j2 + j5;
                }
                if (j4 != j5 && i2 == 0) {
                    j7 += j5 - j4;
                }
                return j7;
            } else if (j2 == -1) {
                return Long.MAX_VALUE;
            } else {
                return j2 + j3;
            }
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m28850d2 = {"Landroidx/work/impl/model/WorkSpec$IdAndState;", "", "id", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/work/WorkInfo$State;", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class IdAndState {
        @JvmField
        @ColumnInfo(name = "id")
        @NotNull

        /* renamed from: id */
        public String f38609id;
        @JvmField
        @ColumnInfo(name = RemoteConfigConstants.ResponseFieldKey.STATE)
        @NotNull
        public WorkInfo.State state;

        public IdAndState(@NotNull String id2, @NotNull WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f38609id = id2;
            this.state = state;
        }

        public static /* synthetic */ IdAndState copy$default(IdAndState idAndState, String str, WorkInfo.State state, int i, Object obj) {
            if ((i & 1) != 0) {
                str = idAndState.f38609id;
            }
            if ((i & 2) != 0) {
                state = idAndState.state;
            }
            return idAndState.copy(str, state);
        }

        @NotNull
        public final String component1() {
            return this.f38609id;
        }

        @NotNull
        public final WorkInfo.State component2() {
            return this.state;
        }

        @NotNull
        public final IdAndState copy(@NotNull String id2, @NotNull WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            return new IdAndState(id2, state);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof IdAndState) {
                IdAndState idAndState = (IdAndState) obj;
                return Intrinsics.areEqual(this.f38609id, idAndState.f38609id) && this.state == idAndState.state;
            }
            return false;
        }

        public int hashCode() {
            return (this.f38609id.hashCode() * 31) + this.state.hashCode();
        }

        @NotNull
        public String toString() {
            return "IdAndState(id=" + this.f38609id + ", state=" + this.state + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        String tagWithPrefix = Logger.tagWithPrefix("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(\"WorkSpec\")");
        f38602f = tagWithPrefix;
        WORK_INFO_MAPPER = new Function() { // from class: p62
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return WorkSpec.m52202a((List) obj);
            }
        };
    }

    public WorkSpec(@NotNull String id2, @NotNull WorkInfo.State state, @NotNull String workerClassName, @NotNull String inputMergerClassName, @NotNull Data input, @NotNull Data output, long j, long j2, long j3, @NotNull Constraints constraints, @IntRange(from = 0) int i, @NotNull BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, @NotNull OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f38608id = id2;
        this.state = state;
        this.workerClassName = workerClassName;
        this.inputMergerClassName = inputMergerClassName;
        this.input = input;
        this.output = output;
        this.initialDelay = j;
        this.intervalDuration = j2;
        this.flexDuration = j3;
        this.constraints = constraints;
        this.runAttemptCount = i;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j4;
        this.lastEnqueueTime = j5;
        this.minimumRetentionDuration = j6;
        this.scheduleRequestedAt = j7;
        this.expedited = z;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.f38603a = i2;
        this.f38604b = i3;
        this.f38605c = j8;
        this.f38606d = i4;
        this.f38607e = i5;
    }

    /* renamed from: a */
    public static /* synthetic */ List m52202a(List list) {
        return m52201b(list);
    }

    /* renamed from: b */
    public static final List m52201b(List list) {
        if (list != null) {
            List<WorkInfoPojo> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list2, 10));
            for (WorkInfoPojo workInfoPojo : list2) {
                arrayList.add(workInfoPojo.toWorkInfo());
            }
            return arrayList;
        }
        return null;
    }

    public static /* synthetic */ WorkSpec copy$default(WorkSpec workSpec, String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, int i6, Object obj) {
        String str4 = (i6 & 1) != 0 ? workSpec.f38608id : str;
        WorkInfo.State state2 = (i6 & 2) != 0 ? workSpec.state : state;
        String str5 = (i6 & 4) != 0 ? workSpec.workerClassName : str2;
        String str6 = (i6 & 8) != 0 ? workSpec.inputMergerClassName : str3;
        Data data3 = (i6 & 16) != 0 ? workSpec.input : data;
        Data data4 = (i6 & 32) != 0 ? workSpec.output : data2;
        long j9 = (i6 & 64) != 0 ? workSpec.initialDelay : j;
        long j10 = (i6 & 128) != 0 ? workSpec.intervalDuration : j2;
        long j11 = (i6 & 256) != 0 ? workSpec.flexDuration : j3;
        Constraints constraints2 = (i6 & 512) != 0 ? workSpec.constraints : constraints;
        return workSpec.copy(str4, state2, str5, str6, data3, data4, j9, j10, j11, constraints2, (i6 & 1024) != 0 ? workSpec.runAttemptCount : i, (i6 & 2048) != 0 ? workSpec.backoffPolicy : backoffPolicy, (i6 & 4096) != 0 ? workSpec.backoffDelayDuration : j4, (i6 & 8192) != 0 ? workSpec.lastEnqueueTime : j5, (i6 & 16384) != 0 ? workSpec.minimumRetentionDuration : j6, (i6 & 32768) != 0 ? workSpec.scheduleRequestedAt : j7, (i6 & 65536) != 0 ? workSpec.expedited : z, (131072 & i6) != 0 ? workSpec.outOfQuotaPolicy : outOfQuotaPolicy, (i6 & 262144) != 0 ? workSpec.f38603a : i2, (i6 & 524288) != 0 ? workSpec.f38604b : i3, (i6 & 1048576) != 0 ? workSpec.f38605c : j8, (i6 & 2097152) != 0 ? workSpec.f38606d : i4, (i6 & 4194304) != 0 ? workSpec.f38607e : i5);
    }

    public final long calculateNextRunTime() {
        return Companion.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.f38603a, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.f38605c);
    }

    @NotNull
    public final String component1() {
        return this.f38608id;
    }

    @NotNull
    public final Constraints component10() {
        return this.constraints;
    }

    public final int component11() {
        return this.runAttemptCount;
    }

    @NotNull
    public final BackoffPolicy component12() {
        return this.backoffPolicy;
    }

    public final long component13() {
        return this.backoffDelayDuration;
    }

    public final long component14() {
        return this.lastEnqueueTime;
    }

    public final long component15() {
        return this.minimumRetentionDuration;
    }

    public final long component16() {
        return this.scheduleRequestedAt;
    }

    public final boolean component17() {
        return this.expedited;
    }

    @NotNull
    public final OutOfQuotaPolicy component18() {
        return this.outOfQuotaPolicy;
    }

    public final int component19() {
        return this.f38603a;
    }

    @NotNull
    public final WorkInfo.State component2() {
        return this.state;
    }

    public final int component20() {
        return this.f38604b;
    }

    public final long component21() {
        return this.f38605c;
    }

    public final int component22() {
        return this.f38606d;
    }

    public final int component23() {
        return this.f38607e;
    }

    @NotNull
    public final String component3() {
        return this.workerClassName;
    }

    @NotNull
    public final String component4() {
        return this.inputMergerClassName;
    }

    @NotNull
    public final Data component5() {
        return this.input;
    }

    @NotNull
    public final Data component6() {
        return this.output;
    }

    public final long component7() {
        return this.initialDelay;
    }

    public final long component8() {
        return this.intervalDuration;
    }

    public final long component9() {
        return this.flexDuration;
    }

    @NotNull
    public final WorkSpec copy(@NotNull String id2, @NotNull WorkInfo.State state, @NotNull String workerClassName, @NotNull String inputMergerClassName, @NotNull Data input, @NotNull Data output, long j, long j2, long j3, @NotNull Constraints constraints, @IntRange(from = 0) int i, @NotNull BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, @NotNull OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new WorkSpec(id2, state, workerClassName, inputMergerClassName, input, output, j, j2, j3, constraints, i, backoffPolicy, j4, j5, j6, j7, z, outOfQuotaPolicy, i2, i3, j8, i4, i5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WorkSpec) {
            WorkSpec workSpec = (WorkSpec) obj;
            return Intrinsics.areEqual(this.f38608id, workSpec.f38608id) && this.state == workSpec.state && Intrinsics.areEqual(this.workerClassName, workSpec.workerClassName) && Intrinsics.areEqual(this.inputMergerClassName, workSpec.inputMergerClassName) && Intrinsics.areEqual(this.input, workSpec.input) && Intrinsics.areEqual(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && Intrinsics.areEqual(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.f38603a == workSpec.f38603a && this.f38604b == workSpec.f38604b && this.f38605c == workSpec.f38605c && this.f38606d == workSpec.f38606d && this.f38607e == workSpec.f38607e;
        }
        return false;
    }

    public final int getGeneration() {
        return this.f38604b;
    }

    public final long getNextScheduleTimeOverride() {
        return this.f38605c;
    }

    public final int getNextScheduleTimeOverrideGeneration() {
        return this.f38606d;
    }

    public final int getPeriodCount() {
        return this.f38603a;
    }

    public final int getStopReason() {
        return this.f38607e;
    }

    public final boolean hasConstraints() {
        return !Intrinsics.areEqual(Constraints.NONE, this.constraints);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((this.f38608id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31) + this.inputMergerClassName.hashCode()) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + AbstractC17792Ig1.m67882a(this.initialDelay)) * 31) + AbstractC17792Ig1.m67882a(this.intervalDuration)) * 31) + AbstractC17792Ig1.m67882a(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + this.runAttemptCount) * 31) + this.backoffPolicy.hashCode()) * 31) + AbstractC17792Ig1.m67882a(this.backoffDelayDuration)) * 31) + AbstractC17792Ig1.m67882a(this.lastEnqueueTime)) * 31) + AbstractC17792Ig1.m67882a(this.minimumRetentionDuration)) * 31) + AbstractC17792Ig1.m67882a(this.scheduleRequestedAt)) * 31;
        boolean z = this.expedited;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((((((hashCode + i) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + this.f38603a) * 31) + this.f38604b) * 31) + AbstractC17792Ig1.m67882a(this.f38605c)) * 31) + this.f38606d) * 31) + this.f38607e;
    }

    public final boolean isBackedOff() {
        if (this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0) {
            return true;
        }
        return false;
    }

    public final boolean isPeriodic() {
        if (this.intervalDuration != 0) {
            return true;
        }
        return false;
    }

    public final void setBackoffDelayDuration(long j) {
        if (j > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(f38602f, "Backoff delay duration exceeds maximum value");
        }
        if (j < 10000) {
            Logger.get().warning(f38602f, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = AbstractC11719c.coerceIn(j, 10000L, (long) WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final void setNextScheduleTimeOverride(long j) {
        this.f38605c = j;
    }

    public final void setNextScheduleTimeOverrideGeneration(int i) {
        this.f38606d = i;
    }

    public final void setPeriodCount(int i) {
        this.f38603a = i;
    }

    public final void setPeriodic(long j) {
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(f38602f, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        setPeriodic(AbstractC11719c.coerceAtLeast(j, (long) PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS), AbstractC11719c.coerceAtLeast(j, (long) PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS));
    }

    @NotNull
    public String toString() {
        return "{WorkSpec: " + this.f38608id + '}';
    }

    public final void setPeriodic(long j, long j2) {
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(f38602f, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = AbstractC11719c.coerceAtLeast(j, (long) PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        if (j2 < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            Logger.get().warning(f38602f, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.intervalDuration) {
            Logger logger = Logger.get();
            String str = f38602f;
            logger.warning(str, "Flex duration greater than interval duration; Changed to " + j);
        }
        this.flexDuration = AbstractC11719c.coerceIn(j2, (long) PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS, this.intervalDuration);
    }

    @Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b5\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b+\u0010!J\u0010\u0010,\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b,\u0010!J\u0010\u0010-\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b4\u0010!J\u0010\u00105\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b5\u0010!J\u0010\u00106\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b6\u00101J\u0010\u00107\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b7\u00101J\u0010\u00108\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b8\u0010!J\u0010\u00109\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b9\u00101J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018HÆ\u0003¢\u0006\u0004\b<\u0010;JÆ\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018HÆ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b?\u0010&J\u0010\u0010@\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b@\u00101J\u001a\u0010C\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bC\u0010DR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010E\u001a\u0004\bF\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010G\u001a\u0004\bH\u0010(R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010*R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010!R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010M\u001a\u0004\bP\u0010!R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010!R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010/R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u00101R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u00103\"\u0004\b\\\u0010]R\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b^\u0010M\u001a\u0004\b_\u0010!\"\u0004\b`\u0010aR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bb\u0010M\u001a\u0004\bc\u0010!\"\u0004\bd\u0010aR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\be\u0010W\u001a\u0004\bf\u00101\"\u0004\bg\u0010hR\u001a\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010W\u001a\u0004\bj\u00101R\u001a\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010M\u001a\u0004\bl\u0010!R\u001a\u0010\u0017\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010W\u001a\u0004\bn\u00101R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010;R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\br\u0010p\u001a\u0004\bs\u0010;R\u0011\u0010t\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0011\u0010v\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bv\u0010u¨\u0006w"}, m28850d2 = {"Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "", "", "id", "Landroidx/work/WorkInfo$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/work/Data;", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Landroidx/work/Constraints;", "constraints", "", "runAttemptCount", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "generation", "nextScheduleTimeOverride", "stopReason", "", "tags", "progress", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)V", "Landroidx/work/WorkInfo$PeriodicityInfo;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Landroidx/work/WorkInfo$PeriodicityInfo;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()J", "Landroidx/work/WorkInfo;", "toWorkInfo", "()Landroidx/work/WorkInfo;", "component1", "()Ljava/lang/String;", "component2", "()Landroidx/work/WorkInfo$State;", "component3", "()Landroidx/work/Data;", "component4", "component5", "component6", "component7", "()Landroidx/work/Constraints;", "component8", "()I", "component9", "()Landroidx/work/BackoffPolicy;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Ljava/util/List;", "component17", "copy", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Landroidx/work/WorkInfo$State;", "getState", OperatorName.CURVE_TO, "Landroidx/work/Data;", "getOutput", "d", OperatorName.SET_LINE_CAPSTYLE, "getInitialDelay", "e", "getIntervalDuration", OperatorName.FILL_NON_ZERO, "getFlexDuration", OperatorName.NON_STROKING_GRAY, "Landroidx/work/Constraints;", "getConstraints", OperatorName.CLOSE_PATH, "I", "getRunAttemptCount", "i", "Landroidx/work/BackoffPolicy;", "getBackoffPolicy", "setBackoffPolicy", "(Landroidx/work/BackoffPolicy;)V", OperatorName.SET_LINE_JOINSTYLE, "getBackoffDelayDuration", "setBackoffDelayDuration", "(J)V", OperatorName.NON_STROKING_CMYK, "getLastEnqueueTime", "setLastEnqueueTime", OperatorName.LINE_TO, "getPeriodCount", "setPeriodCount", "(I)V", OperatorName.MOVE_TO, "getGeneration", OperatorName.ENDPATH, "getNextScheduleTimeOverride", "o", "getStopReason", "p", "Ljava/util/List;", "getTags", OperatorName.SAVE, "getProgress", "isPeriodic", "()Z", "isBackedOff", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class WorkInfoPojo {

        /* renamed from: a */
        public final String f38610a;

        /* renamed from: b */
        public final WorkInfo.State f38611b;

        /* renamed from: c */
        public final Data f38612c;

        /* renamed from: d */
        public final long f38613d;

        /* renamed from: e */
        public final long f38614e;

        /* renamed from: f */
        public final long f38615f;

        /* renamed from: g */
        public final Constraints f38616g;

        /* renamed from: h */
        public final int f38617h;

        /* renamed from: i */
        public BackoffPolicy f38618i;

        /* renamed from: j */
        public long f38619j;

        /* renamed from: k */
        public long f38620k;

        /* renamed from: l */
        public int f38621l;

        /* renamed from: m */
        public final int f38622m;

        /* renamed from: n */
        public final long f38623n;

        /* renamed from: o */
        public final int f38624o;

        /* renamed from: p */
        public final List f38625p;

        /* renamed from: q */
        public final List f38626q;

        public WorkInfoPojo(@NotNull String id2, @NotNull WorkInfo.State state, @NotNull Data output, long j, long j2, long j3, @NotNull Constraints constraints, int i, @NotNull BackoffPolicy backoffPolicy, long j4, long j5, int i2, int i3, long j6, int i4, @NotNull List<String> tags, @NotNull List<Data> progress) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.f38610a = id2;
            this.f38611b = state;
            this.f38612c = output;
            this.f38613d = j;
            this.f38614e = j2;
            this.f38615f = j3;
            this.f38616g = constraints;
            this.f38617h = i;
            this.f38618i = backoffPolicy;
            this.f38619j = j4;
            this.f38620k = j5;
            this.f38621l = i2;
            this.f38622m = i3;
            this.f38623n = j6;
            this.f38624o = i4;
            this.f38625p = tags;
            this.f38626q = progress;
        }

        /* renamed from: a */
        public final long m52200a() {
            if (this.f38611b == WorkInfo.State.ENQUEUED) {
                return WorkSpec.Companion.calculateNextRunTime(isBackedOff(), this.f38617h, this.f38618i, this.f38619j, this.f38620k, this.f38621l, isPeriodic(), this.f38613d, this.f38615f, this.f38614e, this.f38623n);
            }
            return Long.MAX_VALUE;
        }

        /* renamed from: b */
        public final WorkInfo.PeriodicityInfo m52199b() {
            long j = this.f38614e;
            if (j != 0) {
                return new WorkInfo.PeriodicityInfo(j, this.f38615f);
            }
            return null;
        }

        @NotNull
        public final String component1() {
            return this.f38610a;
        }

        public final long component10() {
            return this.f38619j;
        }

        public final long component11() {
            return this.f38620k;
        }

        public final int component12() {
            return this.f38621l;
        }

        public final int component13() {
            return this.f38622m;
        }

        public final long component14() {
            return this.f38623n;
        }

        public final int component15() {
            return this.f38624o;
        }

        @NotNull
        public final List<String> component16() {
            return this.f38625p;
        }

        @NotNull
        public final List<Data> component17() {
            return this.f38626q;
        }

        @NotNull
        public final WorkInfo.State component2() {
            return this.f38611b;
        }

        @NotNull
        public final Data component3() {
            return this.f38612c;
        }

        public final long component4() {
            return this.f38613d;
        }

        public final long component5() {
            return this.f38614e;
        }

        public final long component6() {
            return this.f38615f;
        }

        @NotNull
        public final Constraints component7() {
            return this.f38616g;
        }

        public final int component8() {
            return this.f38617h;
        }

        @NotNull
        public final BackoffPolicy component9() {
            return this.f38618i;
        }

        @NotNull
        public final WorkInfoPojo copy(@NotNull String id2, @NotNull WorkInfo.State state, @NotNull Data output, long j, long j2, long j3, @NotNull Constraints constraints, int i, @NotNull BackoffPolicy backoffPolicy, long j4, long j5, int i2, int i3, long j6, int i4, @NotNull List<String> tags, @NotNull List<Data> progress) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(progress, "progress");
            return new WorkInfoPojo(id2, state, output, j, j2, j3, constraints, i, backoffPolicy, j4, j5, i2, i3, j6, i4, tags, progress);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof WorkInfoPojo) {
                WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
                return Intrinsics.areEqual(this.f38610a, workInfoPojo.f38610a) && this.f38611b == workInfoPojo.f38611b && Intrinsics.areEqual(this.f38612c, workInfoPojo.f38612c) && this.f38613d == workInfoPojo.f38613d && this.f38614e == workInfoPojo.f38614e && this.f38615f == workInfoPojo.f38615f && Intrinsics.areEqual(this.f38616g, workInfoPojo.f38616g) && this.f38617h == workInfoPojo.f38617h && this.f38618i == workInfoPojo.f38618i && this.f38619j == workInfoPojo.f38619j && this.f38620k == workInfoPojo.f38620k && this.f38621l == workInfoPojo.f38621l && this.f38622m == workInfoPojo.f38622m && this.f38623n == workInfoPojo.f38623n && this.f38624o == workInfoPojo.f38624o && Intrinsics.areEqual(this.f38625p, workInfoPojo.f38625p) && Intrinsics.areEqual(this.f38626q, workInfoPojo.f38626q);
            }
            return false;
        }

        public final long getBackoffDelayDuration() {
            return this.f38619j;
        }

        @NotNull
        public final BackoffPolicy getBackoffPolicy() {
            return this.f38618i;
        }

        @NotNull
        public final Constraints getConstraints() {
            return this.f38616g;
        }

        public final long getFlexDuration() {
            return this.f38615f;
        }

        public final int getGeneration() {
            return this.f38622m;
        }

        @NotNull
        public final String getId() {
            return this.f38610a;
        }

        public final long getInitialDelay() {
            return this.f38613d;
        }

        public final long getIntervalDuration() {
            return this.f38614e;
        }

        public final long getLastEnqueueTime() {
            return this.f38620k;
        }

        public final long getNextScheduleTimeOverride() {
            return this.f38623n;
        }

        @NotNull
        public final Data getOutput() {
            return this.f38612c;
        }

        public final int getPeriodCount() {
            return this.f38621l;
        }

        @NotNull
        public final List<Data> getProgress() {
            return this.f38626q;
        }

        public final int getRunAttemptCount() {
            return this.f38617h;
        }

        @NotNull
        public final WorkInfo.State getState() {
            return this.f38611b;
        }

        public final int getStopReason() {
            return this.f38624o;
        }

        @NotNull
        public final List<String> getTags() {
            return this.f38625p;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.f38610a.hashCode() * 31) + this.f38611b.hashCode()) * 31) + this.f38612c.hashCode()) * 31) + AbstractC17792Ig1.m67882a(this.f38613d)) * 31) + AbstractC17792Ig1.m67882a(this.f38614e)) * 31) + AbstractC17792Ig1.m67882a(this.f38615f)) * 31) + this.f38616g.hashCode()) * 31) + this.f38617h) * 31) + this.f38618i.hashCode()) * 31) + AbstractC17792Ig1.m67882a(this.f38619j)) * 31) + AbstractC17792Ig1.m67882a(this.f38620k)) * 31) + this.f38621l) * 31) + this.f38622m) * 31) + AbstractC17792Ig1.m67882a(this.f38623n)) * 31) + this.f38624o) * 31) + this.f38625p.hashCode()) * 31) + this.f38626q.hashCode();
        }

        public final boolean isBackedOff() {
            if (this.f38611b == WorkInfo.State.ENQUEUED && this.f38617h > 0) {
                return true;
            }
            return false;
        }

        public final boolean isPeriodic() {
            if (this.f38614e != 0) {
                return true;
            }
            return false;
        }

        public final void setBackoffDelayDuration(long j) {
            this.f38619j = j;
        }

        public final void setBackoffPolicy(@NotNull BackoffPolicy backoffPolicy) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "<set-?>");
            this.f38618i = backoffPolicy;
        }

        public final void setLastEnqueueTime(long j) {
            this.f38620k = j;
        }

        public final void setPeriodCount(int i) {
            this.f38621l = i;
        }

        @NotNull
        public String toString() {
            return "WorkInfoPojo(id=" + this.f38610a + ", state=" + this.f38611b + ", output=" + this.f38612c + ", initialDelay=" + this.f38613d + ", intervalDuration=" + this.f38614e + ", flexDuration=" + this.f38615f + ", constraints=" + this.f38616g + ", runAttemptCount=" + this.f38617h + ", backoffPolicy=" + this.f38618i + ", backoffDelayDuration=" + this.f38619j + ", lastEnqueueTime=" + this.f38620k + ", periodCount=" + this.f38621l + ", generation=" + this.f38622m + ", nextScheduleTimeOverride=" + this.f38623n + ", stopReason=" + this.f38624o + ", tags=" + this.f38625p + ", progress=" + this.f38626q + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @NotNull
        public final WorkInfo toWorkInfo() {
            Data data;
            if (!this.f38626q.isEmpty()) {
                data = (Data) this.f38626q.get(0);
            } else {
                data = Data.EMPTY;
            }
            Data progress = data;
            UUID fromString = UUID.fromString(this.f38610a);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(id)");
            WorkInfo.State state = this.f38611b;
            HashSet hashSet = new HashSet(this.f38625p);
            Data data2 = this.f38612c;
            Intrinsics.checkNotNullExpressionValue(progress, "progress");
            return new WorkInfo(fromString, state, hashSet, data2, progress, this.f38617h, this.f38622m, this.f38616g, this.f38613d, m52199b(), m52200a(), this.f38624o);
        }

        public /* synthetic */ WorkInfoPojo(String str, WorkInfo.State state, Data data, long j, long j2, long j3, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, state, data, (i5 & 8) != 0 ? 0L : j, (i5 & 16) != 0 ? 0L : j2, (i5 & 32) != 0 ? 0L : j3, constraints, i, (i5 & 256) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i5 & 512) != 0 ? 30000L : j4, (i5 & 1024) != 0 ? 0L : j5, (i5 & 2048) != 0 ? 0 : i2, i3, j6, i4, list, list2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ WorkSpec(java.lang.String r35, androidx.work.WorkInfo.State r36, java.lang.String r37, java.lang.String r38, androidx.work.Data r39, androidx.work.Data r40, long r41, long r43, long r45, androidx.work.Constraints r47, int r48, androidx.work.BackoffPolicy r49, long r50, long r52, long r54, long r56, boolean r58, androidx.work.OutOfQuotaPolicy r59, int r60, int r61, long r62, int r64, int r65, int r66, kotlin.jvm.internal.DefaultConstructorMarker r67) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpec.<init>(java.lang.String, androidx.work.WorkInfo$State, java.lang.String, java.lang.String, androidx.work.Data, androidx.work.Data, long, long, long, androidx.work.Constraints, int, androidx.work.BackoffPolicy, long, long, long, long, boolean, androidx.work.OutOfQuotaPolicy, int, int, long, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(@NotNull String id2, @NotNull String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 8388602, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(@NotNull String newId, @NotNull WorkSpec other) {
        this(newId, other.state, other.workerClassName, other.inputMergerClassName, new Data(other.input), new Data(other.output), other.initialDelay, other.intervalDuration, other.flexDuration, new Constraints(other.constraints), other.runAttemptCount, other.backoffPolicy, other.backoffDelayDuration, other.lastEnqueueTime, other.minimumRetentionDuration, other.scheduleRequestedAt, other.expedited, other.outOfQuotaPolicy, other.f38603a, 0, other.f38605c, other.f38606d, other.f38607e, 524288, null);
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
    }
}
