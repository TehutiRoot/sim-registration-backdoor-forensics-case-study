package com.chuckerteam.chucker.api;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.internal.data.repository.RepositoryProvider;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0002\u0014(B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m28850d2 = {"Lcom/chuckerteam/chucker/api/RetentionManager;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/chuckerteam/chucker/api/RetentionManager$Period;", "retentionPeriod", "<init>", "(Landroid/content/Context;Lcom/chuckerteam/chucker/api/RetentionManager$Period;)V", "", "doMaintenance$com_github_ChuckerTeam_Chucker_library", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doMaintenance", "", "fallback", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(J)J", "time", OperatorName.NON_STROKING_GRAY, "(J)V", "threshold", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "now", "", "e", "(J)Z", "d", TypedValues.CycleType.S_WAVE_PERIOD, OperatorName.FILL_NON_ZERO, "(Lcom/chuckerteam/chucker/api/RetentionManager$Period;)J", OperatorName.SET_LINE_CAPSTYLE, "cleanupFrequency", "Landroid/content/SharedPreferences;", OperatorName.CURVE_TO, "Lkotlin/Lazy;", "()Landroid/content/SharedPreferences;", "prefs", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "maintenanceMutex", "Period", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRetentionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetentionManager.kt\ncom/chuckerteam/chucker/api/RetentionManager\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,107:1\n120#2,10:108\n39#3,12:118\n*S KotlinDebug\n*F\n+ 1 RetentionManager.kt\ncom/chuckerteam/chucker/api/RetentionManager\n*L\n47#1:108,10\n67#1:118,12\n*E\n"})
/* loaded from: classes3.dex */
public final class RetentionManager {

    /* renamed from: e */
    public static final C5958a f42774e = new C5958a(null);

    /* renamed from: f */
    public static long f42775f;

    /* renamed from: a */
    public final long f42776a;

    /* renamed from: b */
    public final long f42777b;

    /* renamed from: c */
    public final Lazy f42778c;

    /* renamed from: d */
    public final Mutex f42779d;

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28850d2 = {"Lcom/chuckerteam/chucker/api/RetentionManager$Period;", "", "(Ljava/lang/String;I)V", "ONE_HOUR", "ONE_DAY", "ONE_WEEK", "FOREVER", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public enum Period {
        ONE_HOUR,
        ONE_DAY,
        ONE_WEEK,
        FOREVER
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Period.values().length];
            try {
                iArr[Period.ONE_HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Period.ONE_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Period.ONE_WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Period.FOREVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.chuckerteam.chucker.api.RetentionManager$a */
    /* loaded from: classes3.dex */
    public static final class C5958a {
        public /* synthetic */ C5958a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C5958a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RetentionManager(@NotNull Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final Object m49972a(long j, Continuation continuation) {
        Object deleteOldTransactions = RepositoryProvider.INSTANCE.transaction().deleteOldTransactions(j, continuation);
        if (deleteOldTransactions == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return deleteOldTransactions;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final long m49971b(long j) {
        if (f42775f == 0) {
            f42775f = m49970c().getLong("last_cleanup", j);
        }
        return f42775f;
    }

    /* renamed from: c */
    public final SharedPreferences m49970c() {
        Object value = this.f42778c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-prefs>(...)");
        return (SharedPreferences) value;
    }

    /* renamed from: d */
    public final long m49969d(long j) {
        long j2 = this.f42776a;
        if (j2 != 0) {
            return j - j2;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:24:0x0062, B:26:0x006a, B:28:0x0074), top: B:41:0x0062 }] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doMaintenance$com_github_ChuckerTeam_Chucker_library(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.chuckerteam.chucker.api.RetentionManager$doMaintenance$1
            if (r0 == 0) goto L13
            r0 = r11
            com.chuckerteam.chucker.api.RetentionManager$doMaintenance$1 r0 = (com.chuckerteam.chucker.api.RetentionManager$doMaintenance$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.chuckerteam.chucker.api.RetentionManager$doMaintenance$1 r0 = new com.chuckerteam.chucker.api.RetentionManager$doMaintenance$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L4f
            if (r2 == r3) goto L42
            if (r2 != r4) goto L3a
            long r1 = r0.J$0
            java.lang.Object r3 = r0.L$1
            kotlinx.coroutines.sync.Mutex r3 = (kotlinx.coroutines.sync.Mutex) r3
            java.lang.Object r0 = r0.L$0
            com.chuckerteam.chucker.api.RetentionManager r0 = (com.chuckerteam.chucker.api.RetentionManager) r0
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L37
            goto L91
        L37:
            r11 = move-exception
            goto La2
        L3a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L42:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r3 = r0.L$0
            com.chuckerteam.chucker.api.RetentionManager r3 = (com.chuckerteam.chucker.api.RetentionManager) r3
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r2
            goto L62
        L4f:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlinx.coroutines.sync.Mutex r11 = r10.f42779d
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r3
            java.lang.Object r2 = r11.lock(r5, r0)
            if (r2 != r1) goto L61
            return r1
        L61:
            r3 = r10
        L62:
            long r6 = r3.f42776a     // Catch: java.lang.Throwable -> L95
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L99
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L95
            boolean r2 = r3.m49968e(r6)     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L99
            com.chuckerteam.chucker.internal.support.Logger$Companion r2 = com.chuckerteam.chucker.internal.support.Logger.Companion     // Catch: java.lang.Throwable -> L95
            java.lang.String r8 = "Performing data retention maintenance..."
            com.chuckerteam.chucker.internal.support.Logger.DefaultImpls.info$default(r2, r8, r5, r4, r5)     // Catch: java.lang.Throwable -> L95
            long r8 = r3.m49969d(r6)     // Catch: java.lang.Throwable -> L95
            r0.L$0 = r3     // Catch: java.lang.Throwable -> L95
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L95
            r0.J$0 = r6     // Catch: java.lang.Throwable -> L95
            r0.label = r4     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = r3.m49972a(r8, r0)     // Catch: java.lang.Throwable -> L95
            if (r0 != r1) goto L8e
            return r1
        L8e:
            r0 = r3
            r1 = r6
            r3 = r11
        L91:
            r0.m49966g(r1)     // Catch: java.lang.Throwable -> L37
            goto L9a
        L95:
            r0 = move-exception
            r3 = r11
            r11 = r0
            goto La2
        L99:
            r3 = r11
        L9a:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L37
            r3.unlock(r5)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        La2:
            r3.unlock(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.api.RetentionManager.doMaintenance$com_github_ChuckerTeam_Chucker_library(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: e */
    public final boolean m49968e(long j) {
        if (j - m49971b(j) > this.f42777b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final long m49967f(Period period) {
        int i = WhenMappings.$EnumSwitchMapping$0[period.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return 0L;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return TimeUnit.DAYS.toMillis(7L);
            }
            return TimeUnit.DAYS.toMillis(1L);
        }
        return TimeUnit.HOURS.toMillis(1L);
    }

    /* renamed from: g */
    public final void m49966g(long j) {
        f42775f = j;
        SharedPreferences.Editor editor = m49970c().edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putLong("last_cleanup", j);
        editor.apply();
    }

    @JvmOverloads
    public RetentionManager(@NotNull Context context, @NotNull Period retentionPeriod) {
        long millis;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(retentionPeriod, "retentionPeriod");
        this.f42776a = m49967f(retentionPeriod);
        this.f42778c = LazyKt__LazyJVMKt.lazy(new RetentionManager$prefs$2(context));
        this.f42779d = MutexKt.Mutex$default(false, 1, null);
        if (retentionPeriod == Period.ONE_HOUR) {
            millis = TimeUnit.MINUTES.toMillis(30L);
        } else {
            millis = TimeUnit.HOURS.toMillis(2L);
        }
        this.f42777b = millis;
    }

    public /* synthetic */ RetentionManager(Context context, Period period, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? Period.ONE_WEEK : period);
    }
}
