package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class StatusRunnable<T> implements Runnable {

    /* renamed from: a */
    public final SettableFuture f38730a = SettableFuture.create();

    /* renamed from: androidx.work.impl.utils.StatusRunnable$a */
    /* loaded from: classes.dex */
    public class C5303a extends StatusRunnable {

        /* renamed from: b */
        public final /* synthetic */ WorkManagerImpl f38731b;

        /* renamed from: c */
        public final /* synthetic */ List f38732c;

        public C5303a(WorkManagerImpl workManagerImpl, List list) {
            this.f38731b = workManagerImpl;
            this.f38732c = list;
        }

        @Override // androidx.work.impl.utils.StatusRunnable
        /* renamed from: b */
        public List mo52154a() {
            return WorkSpec.WORK_INFO_MAPPER.apply(this.f38731b.getWorkDatabase().workSpecDao().getWorkStatusPojoForIds(this.f38732c));
        }
    }

    /* renamed from: androidx.work.impl.utils.StatusRunnable$b */
    /* loaded from: classes.dex */
    public class C5304b extends StatusRunnable {

        /* renamed from: b */
        public final /* synthetic */ WorkManagerImpl f38733b;

        /* renamed from: c */
        public final /* synthetic */ UUID f38734c;

        public C5304b(WorkManagerImpl workManagerImpl, UUID uuid) {
            this.f38733b = workManagerImpl;
            this.f38734c = uuid;
        }

        @Override // androidx.work.impl.utils.StatusRunnable
        /* renamed from: b */
        public WorkInfo mo52154a() {
            WorkSpec.WorkInfoPojo workStatusPojoForId = this.f38733b.getWorkDatabase().workSpecDao().getWorkStatusPojoForId(this.f38734c.toString());
            if (workStatusPojoForId != null) {
                return workStatusPojoForId.toWorkInfo();
            }
            return null;
        }
    }

    /* renamed from: androidx.work.impl.utils.StatusRunnable$c */
    /* loaded from: classes.dex */
    public class C5305c extends StatusRunnable {

        /* renamed from: b */
        public final /* synthetic */ WorkManagerImpl f38735b;

        /* renamed from: c */
        public final /* synthetic */ String f38736c;

        public C5305c(WorkManagerImpl workManagerImpl, String str) {
            this.f38735b = workManagerImpl;
            this.f38736c = str;
        }

        @Override // androidx.work.impl.utils.StatusRunnable
        /* renamed from: b */
        public List mo52154a() {
            return WorkSpec.WORK_INFO_MAPPER.apply(this.f38735b.getWorkDatabase().workSpecDao().getWorkStatusPojoForTag(this.f38736c));
        }
    }

    /* renamed from: androidx.work.impl.utils.StatusRunnable$d */
    /* loaded from: classes.dex */
    public class C5306d extends StatusRunnable {

        /* renamed from: b */
        public final /* synthetic */ WorkManagerImpl f38737b;

        /* renamed from: c */
        public final /* synthetic */ String f38738c;

        public C5306d(WorkManagerImpl workManagerImpl, String str) {
            this.f38737b = workManagerImpl;
            this.f38738c = str;
        }

        @Override // androidx.work.impl.utils.StatusRunnable
        /* renamed from: b */
        public List mo52154a() {
            return WorkSpec.WORK_INFO_MAPPER.apply(this.f38737b.getWorkDatabase().workSpecDao().getWorkStatusPojoForName(this.f38738c));
        }
    }

    /* renamed from: androidx.work.impl.utils.StatusRunnable$e */
    /* loaded from: classes.dex */
    public class C5307e extends StatusRunnable {

        /* renamed from: b */
        public final /* synthetic */ WorkManagerImpl f38739b;

        /* renamed from: c */
        public final /* synthetic */ WorkQuery f38740c;

        public C5307e(WorkManagerImpl workManagerImpl, WorkQuery workQuery) {
            this.f38739b = workManagerImpl;
            this.f38740c = workQuery;
        }

        @Override // androidx.work.impl.utils.StatusRunnable
        /* renamed from: b */
        public List mo52154a() {
            return WorkSpec.WORK_INFO_MAPPER.apply(this.f38739b.getWorkDatabase().rawWorkInfoDao().getWorkInfoPojos(RawQueries.toRawQuery(this.f38740c)));
        }
    }

    @NonNull
    public static StatusRunnable<List<WorkInfo>> forStringIds(@NonNull WorkManagerImpl workManagerImpl, @NonNull List<String> list) {
        return new C5303a(workManagerImpl, list);
    }

    @NonNull
    public static StatusRunnable<List<WorkInfo>> forTag(@NonNull WorkManagerImpl workManagerImpl, @NonNull String str) {
        return new C5305c(workManagerImpl, str);
    }

    @NonNull
    public static StatusRunnable<WorkInfo> forUUID(@NonNull WorkManagerImpl workManagerImpl, @NonNull UUID uuid) {
        return new C5304b(workManagerImpl, uuid);
    }

    @NonNull
    public static StatusRunnable<List<WorkInfo>> forUniqueWork(@NonNull WorkManagerImpl workManagerImpl, @NonNull String str) {
        return new C5306d(workManagerImpl, str);
    }

    @NonNull
    public static StatusRunnable<List<WorkInfo>> forWorkQuerySpec(@NonNull WorkManagerImpl workManagerImpl, @NonNull WorkQuery workQuery) {
        return new C5307e(workManagerImpl, workQuery);
    }

    /* renamed from: a */
    public abstract Object mo52154a();

    @NonNull
    public ListenableFuture<T> getFuture() {
        return this.f38730a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f38730a.set(mo52154a());
        } catch (Throwable th2) {
            this.f38730a.setException(th2);
        }
    }
}
