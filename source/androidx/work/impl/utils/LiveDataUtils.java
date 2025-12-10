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
    public class C5300a implements Observer {

        /* renamed from: a */
        public Object f38709a = null;

        /* renamed from: b */
        public final /* synthetic */ TaskExecutor f38710b;

        /* renamed from: c */
        public final /* synthetic */ Object f38711c;

        /* renamed from: d */
        public final /* synthetic */ Function f38712d;

        /* renamed from: e */
        public final /* synthetic */ MediatorLiveData f38713e;

        /* renamed from: androidx.work.impl.utils.LiveDataUtils$a$a */
        /* loaded from: classes.dex */
        public class RunnableC5301a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Object f38714a;

            public RunnableC5301a(Object obj) {
                this.f38714a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (C5300a.this.f38711c) {
                    try {
                        Object apply = C5300a.this.f38712d.apply(this.f38714a);
                        C5300a c5300a = C5300a.this;
                        Object obj = c5300a.f38709a;
                        if (obj == null && apply != null) {
                            c5300a.f38709a = apply;
                            c5300a.f38713e.postValue(apply);
                        } else if (obj != null && !obj.equals(apply)) {
                            C5300a c5300a2 = C5300a.this;
                            c5300a2.f38709a = apply;
                            c5300a2.f38713e.postValue(apply);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public C5300a(TaskExecutor taskExecutor, Object obj, Function function, MediatorLiveData mediatorLiveData) {
            this.f38710b = taskExecutor;
            this.f38711c = obj;
            this.f38712d = function;
            this.f38713e = mediatorLiveData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            this.f38710b.executeOnTaskThread(new RunnableC5301a(obj));
        }
    }

    @NonNull
    @SuppressLint({"LambdaLast"})
    public static <In, Out> LiveData<Out> dedupedMappedLiveDataFor(@NonNull LiveData<In> liveData, @NonNull Function<In, Out> function, @NonNull TaskExecutor taskExecutor) {
        Object obj = new Object();
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new C5300a(taskExecutor, obj, function, mediatorLiveData));
        return mediatorLiveData;
    }
}
