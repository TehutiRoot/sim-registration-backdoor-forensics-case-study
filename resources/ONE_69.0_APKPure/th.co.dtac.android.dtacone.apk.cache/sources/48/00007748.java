package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class LiveDataUtils {

    /* renamed from: androidx.work.impl.utils.LiveDataUtils$a */
    /* loaded from: classes.dex */
    public class C5282a implements Observer {

        /* renamed from: a */
        public Object f38797a = null;

        /* renamed from: b */
        public final /* synthetic */ TaskExecutor f38798b;

        /* renamed from: c */
        public final /* synthetic */ Object f38799c;

        /* renamed from: d */
        public final /* synthetic */ Function f38800d;

        /* renamed from: e */
        public final /* synthetic */ MediatorLiveData f38801e;

        /* renamed from: androidx.work.impl.utils.LiveDataUtils$a$a */
        /* loaded from: classes.dex */
        public class RunnableC5283a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Object f38802a;

            public RunnableC5283a(Object obj) {
                this.f38802a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (C5282a.this.f38799c) {
                    try {
                        Object apply = C5282a.this.f38800d.apply(this.f38802a);
                        C5282a c5282a = C5282a.this;
                        Object obj = c5282a.f38797a;
                        if (obj == null && apply != null) {
                            c5282a.f38797a = apply;
                            c5282a.f38801e.postValue(apply);
                        } else if (obj != null && !obj.equals(apply)) {
                            C5282a c5282a2 = C5282a.this;
                            c5282a2.f38797a = apply;
                            c5282a2.f38801e.postValue(apply);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public C5282a(TaskExecutor taskExecutor, Object obj, Function function, MediatorLiveData mediatorLiveData) {
            this.f38798b = taskExecutor;
            this.f38799c = obj;
            this.f38800d = function;
            this.f38801e = mediatorLiveData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            this.f38798b.executeOnTaskThread(new RunnableC5283a(obj));
        }
    }

    @NonNull
    @SuppressLint({"LambdaLast"})
    public static <In, Out> LiveData<Out> dedupedMappedLiveDataFor(@NonNull LiveData<In> liveData, @NonNull Function<In, Out> function, @NonNull TaskExecutor taskExecutor) {
        Object obj = new Object();
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new C5282a(taskExecutor, obj, function, mediatorLiveData));
        return mediatorLiveData;
    }
}