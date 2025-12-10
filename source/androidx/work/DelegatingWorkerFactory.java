package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class DelegatingWorkerFactory extends WorkerFactory {

    /* renamed from: c */
    public static final String f38229c = Logger.tagWithPrefix("DelegatingWkrFctry");

    /* renamed from: b */
    public final List f38230b = new CopyOnWriteArrayList();

    public final void addFactory(@NonNull WorkerFactory workerFactory) {
        this.f38230b.add(workerFactory);
    }

    @Override // androidx.work.WorkerFactory
    @Nullable
    public final ListenableWorker createWorker(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        for (WorkerFactory workerFactory : this.f38230b) {
            try {
                ListenableWorker createWorker = workerFactory.createWorker(context, str, workerParameters);
                if (createWorker != null) {
                    return createWorker;
                }
            } catch (Throwable th2) {
                Logger.get().error(f38229c, "Unable to instantiate a ListenableWorker (" + str + ")", th2);
                throw th2;
            }
        }
        return null;
    }
}
