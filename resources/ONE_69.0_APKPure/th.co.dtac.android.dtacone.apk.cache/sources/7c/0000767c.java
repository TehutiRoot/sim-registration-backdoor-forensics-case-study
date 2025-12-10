package androidx.work.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.utils.EnqueueRunnable;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.workers.CombineContinuationsWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class WorkContinuationImpl extends WorkContinuation {

    /* renamed from: j */
    public static final String f38406j = Logger.tagWithPrefix("WorkContinuationImpl");

    /* renamed from: a */
    public final WorkManagerImpl f38407a;

    /* renamed from: b */
    public final String f38408b;

    /* renamed from: c */
    public final ExistingWorkPolicy f38409c;

    /* renamed from: d */
    public final List f38410d;

    /* renamed from: e */
    public final List f38411e;

    /* renamed from: f */
    public final List f38412f;

    /* renamed from: g */
    public final List f38413g;

    /* renamed from: h */
    public boolean f38414h;

    /* renamed from: i */
    public Operation f38415i;

    public WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl, @NonNull List<? extends WorkRequest> list) {
        this(workManagerImpl, null, ExistingWorkPolicy.KEEP, list, null);
    }

    /* renamed from: a */
    public static boolean m52285a(WorkContinuationImpl workContinuationImpl, Set set) {
        set.addAll(workContinuationImpl.getIds());
        Set<String> prerequisitesFor = prerequisitesFor(workContinuationImpl);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (prerequisitesFor.contains((String) it.next())) {
                return true;
            }
        }
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        if (parents != null && !parents.isEmpty()) {
            for (WorkContinuationImpl workContinuationImpl2 : parents) {
                if (m52285a(workContinuationImpl2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(workContinuationImpl.getIds());
        return false;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Set<String> prerequisitesFor(@NonNull WorkContinuationImpl workContinuationImpl) {
        HashSet hashSet = new HashSet();
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        if (parents != null && !parents.isEmpty()) {
            for (WorkContinuationImpl workContinuationImpl2 : parents) {
                hashSet.addAll(workContinuationImpl2.getIds());
            }
        }
        return hashSet;
    }

    @Override // androidx.work.WorkContinuation
    @NonNull
    public WorkContinuation combineInternal(@NonNull List<WorkContinuation> list) {
        OneTimeWorkRequest build = new OneTimeWorkRequest.Builder(CombineContinuationsWorker.class).setInputMerger(ArrayCreatingInputMerger.class).build();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<WorkContinuation> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((WorkContinuationImpl) it.next());
        }
        return new WorkContinuationImpl(this.f38407a, null, ExistingWorkPolicy.KEEP, Collections.singletonList(build), arrayList);
    }

    @Override // androidx.work.WorkContinuation
    @NonNull
    public Operation enqueue() {
        if (!this.f38414h) {
            EnqueueRunnable enqueueRunnable = new EnqueueRunnable(this);
            this.f38407a.getWorkTaskExecutor().executeOnTaskThread(enqueueRunnable);
            this.f38415i = enqueueRunnable.getOperation();
        } else {
            Logger logger = Logger.get();
            String str = f38406j;
            logger.warning(str, "Already enqueued work ids (" + TextUtils.join(", ", this.f38411e) + ")");
        }
        return this.f38415i;
    }

    @NonNull
    public List<String> getAllIds() {
        return this.f38412f;
    }

    @NonNull
    public ExistingWorkPolicy getExistingWorkPolicy() {
        return this.f38409c;
    }

    @NonNull
    public List<String> getIds() {
        return this.f38411e;
    }

    @Nullable
    public String getName() {
        return this.f38408b;
    }

    @Nullable
    public List<WorkContinuationImpl> getParents() {
        return this.f38413g;
    }

    @NonNull
    public List<? extends WorkRequest> getWork() {
        return this.f38410d;
    }

    @Override // androidx.work.WorkContinuation
    @NonNull
    public ListenableFuture<List<WorkInfo>> getWorkInfos() {
        StatusRunnable<List<WorkInfo>> forStringIds = StatusRunnable.forStringIds(this.f38407a, this.f38412f);
        this.f38407a.getWorkTaskExecutor().executeOnTaskThread(forStringIds);
        return forStringIds.getFuture();
    }

    @Override // androidx.work.WorkContinuation
    @NonNull
    public LiveData<List<WorkInfo>> getWorkInfosLiveData() {
        return this.f38407a.m52270a(this.f38412f);
    }

    @NonNull
    public WorkManagerImpl getWorkManagerImpl() {
        return this.f38407a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean hasCycles() {
        return m52285a(this, new HashSet());
    }

    public boolean isEnqueued() {
        return this.f38414h;
    }

    public void markEnqueued() {
        this.f38414h = true;
    }

    @Override // androidx.work.WorkContinuation
    @NonNull
    public WorkContinuation then(@NonNull List<OneTimeWorkRequest> list) {
        if (list.isEmpty()) {
            return this;
        }
        return new WorkContinuationImpl(this.f38407a, this.f38408b, ExistingWorkPolicy.KEEP, list, Collections.singletonList(this));
    }

    public WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl, @Nullable String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<? extends WorkRequest> list) {
        this(workManagerImpl, str, existingWorkPolicy, list, null);
    }

    public WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl, @Nullable String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<? extends WorkRequest> list, @Nullable List<WorkContinuationImpl> list2) {
        this.f38407a = workManagerImpl;
        this.f38408b = str;
        this.f38409c = existingWorkPolicy;
        this.f38410d = list;
        this.f38413g = list2;
        this.f38411e = new ArrayList(list.size());
        this.f38412f = new ArrayList();
        if (list2 != null) {
            for (WorkContinuationImpl workContinuationImpl : list2) {
                this.f38412f.addAll(workContinuationImpl.f38412f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (existingWorkPolicy == ExistingWorkPolicy.REPLACE && list.get(i).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String stringId = list.get(i).getStringId();
            this.f38411e.add(stringId);
            this.f38412f.add(stringId);
        }
    }
}