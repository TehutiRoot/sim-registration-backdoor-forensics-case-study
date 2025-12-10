package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001cR$\u0010(\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010'¨\u0006)"}, m28850d2 = {"Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "T", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "Landroidx/work/impl/constraints/ConstraintListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addListener", "(Landroidx/work/impl/constraints/ConstraintListener;)V", "removeListener", "readSystemState", "()Ljava/lang/Object;", "startTracking", "()V", "stopTracking", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "appContext", OperatorName.CURVE_TO, "Ljava/lang/Object;", "lock", "Ljava/util/LinkedHashSet;", "d", "Ljava/util/LinkedHashSet;", "listeners", "e", "currentState", "newState", "getState", "setState", "(Ljava/lang/Object;)V", RemoteConfigConstants.ResponseFieldKey.STATE, "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nConstraintTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTracker.kt\nandroidx/work/impl/constraints/trackers/ConstraintTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1855#2,2:125\n*S KotlinDebug\n*F\n+ 1 ConstraintTracker.kt\nandroidx/work/impl/constraints/trackers/ConstraintTracker\n*L\n96#1:125,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class ConstraintTracker<T> {

    /* renamed from: a */
    public final TaskExecutor f38516a;

    /* renamed from: b */
    public final Context f38517b;

    /* renamed from: c */
    public final Object f38518c;

    /* renamed from: d */
    public final LinkedHashSet f38519d;

    /* renamed from: e */
    public Object f38520e;

    public ConstraintTracker(@NotNull Context context, @NotNull TaskExecutor taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f38516a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f38517b = applicationContext;
        this.f38518c = new Object();
        this.f38519d = new LinkedHashSet();
    }

    /* renamed from: a */
    public static /* synthetic */ void m52231a(List list, ConstraintTracker constraintTracker) {
        m52230b(list, constraintTracker);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final void m52230b(List listenersList, ConstraintTracker this$0) {
        Intrinsics.checkNotNullParameter(listenersList, "$listenersList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = listenersList.iterator();
        while (it.hasNext()) {
            ((ConstraintListener) it.next()).onConstraintChanged(this$0.f38520e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addListener(@NotNull ConstraintListener<T> listener) {
        String str;
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f38518c) {
            try {
                if (this.f38519d.add(listener)) {
                    if (this.f38519d.size() == 1) {
                        this.f38520e = readSystemState();
                        Logger logger = Logger.get();
                        str = ConstraintTrackerKt.f38521a;
                        logger.debug(str, getClass().getSimpleName() + ": initial state = " + this.f38520e);
                        startTracking();
                    }
                    listener.onConstraintChanged(this.f38520e);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final Context getAppContext() {
        return this.f38517b;
    }

    public final T getState() {
        T t = (T) this.f38520e;
        if (t == null) {
            return readSystemState();
        }
        return t;
    }

    public abstract T readSystemState();

    public final void removeListener(@NotNull ConstraintListener<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f38518c) {
            try {
                if (this.f38519d.remove(listener) && this.f38519d.isEmpty()) {
                    stopTracking();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setState(T t) {
        synchronized (this.f38518c) {
            Object obj = this.f38520e;
            if (obj != null && Intrinsics.areEqual(obj, t)) {
                return;
            }
            this.f38520e = t;
            final List list = CollectionsKt___CollectionsKt.toList(this.f38519d);
            this.f38516a.getMainThreadExecutor().execute(new Runnable() { // from class: nx
                @Override // java.lang.Runnable
                public final void run() {
                    ConstraintTracker.m52231a(list, this);
                }
            });
            Unit unit = Unit.INSTANCE;
        }
    }

    public abstract void startTracking();

    public abstract void stopTracking();
}
