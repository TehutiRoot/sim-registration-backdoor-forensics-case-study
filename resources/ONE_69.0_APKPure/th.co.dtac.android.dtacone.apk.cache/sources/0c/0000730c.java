package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class AsyncListDiffer<T> {

    /* renamed from: h */
    public static final Executor f36649h = new ExecutorC4860b();

    /* renamed from: a */
    public final ListUpdateCallback f36650a;

    /* renamed from: b */
    public final AsyncDifferConfig f36651b;

    /* renamed from: c */
    public Executor f36652c;

    /* renamed from: d */
    public final List f36653d;

    /* renamed from: e */
    public List f36654e;

    /* renamed from: f */
    public List f36655f;

    /* renamed from: g */
    public int f36656g;

    /* loaded from: classes2.dex */
    public interface ListListener<T> {
        void onCurrentListChanged(@NonNull List<T> list, @NonNull List<T> list2);
    }

    /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$a */
    /* loaded from: classes2.dex */
    public class RunnableC4857a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f36657a;

        /* renamed from: b */
        public final /* synthetic */ List f36658b;

        /* renamed from: c */
        public final /* synthetic */ int f36659c;

        /* renamed from: d */
        public final /* synthetic */ Runnable f36660d;

        /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$a$a */
        /* loaded from: classes2.dex */
        public class C4858a extends DiffUtil.Callback {
            public C4858a() {
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areContentsTheSame(int i, int i2) {
                Object obj = RunnableC4857a.this.f36657a.get(i);
                Object obj2 = RunnableC4857a.this.f36658b.get(i2);
                if (obj != null && obj2 != null) {
                    return AsyncListDiffer.this.f36651b.getDiffCallback().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areItemsTheSame(int i, int i2) {
                Object obj = RunnableC4857a.this.f36657a.get(i);
                Object obj2 = RunnableC4857a.this.f36658b.get(i2);
                if (obj != null && obj2 != null) {
                    return AsyncListDiffer.this.f36651b.getDiffCallback().areItemsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public Object getChangePayload(int i, int i2) {
                Object obj = RunnableC4857a.this.f36657a.get(i);
                Object obj2 = RunnableC4857a.this.f36658b.get(i2);
                if (obj != null && obj2 != null) {
                    return AsyncListDiffer.this.f36651b.getDiffCallback().getChangePayload(obj, obj2);
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getNewListSize() {
                return RunnableC4857a.this.f36658b.size();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getOldListSize() {
                return RunnableC4857a.this.f36657a.size();
            }
        }

        /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$a$b */
        /* loaded from: classes2.dex */
        public class RunnableC4859b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DiffUtil.DiffResult f36663a;

            public RunnableC4859b(DiffUtil.DiffResult diffResult) {
                this.f36663a = diffResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC4857a runnableC4857a = RunnableC4857a.this;
                AsyncListDiffer asyncListDiffer = AsyncListDiffer.this;
                if (asyncListDiffer.f36656g == runnableC4857a.f36659c) {
                    asyncListDiffer.m53620a(runnableC4857a.f36658b, this.f36663a, runnableC4857a.f36660d);
                }
            }
        }

        public RunnableC4857a(List list, List list2, int i, Runnable runnable) {
            this.f36657a = list;
            this.f36658b = list2;
            this.f36659c = i;
            this.f36660d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncListDiffer.this.f36652c.execute(new RunnableC4859b(DiffUtil.calculateDiff(new C4858a())));
        }
    }

    /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$b */
    /* loaded from: classes2.dex */
    public static class ExecutorC4860b implements Executor {

        /* renamed from: a */
        public final Handler f36665a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f36665a.post(runnable);
        }
    }

    public AsyncListDiffer(@NonNull RecyclerView.Adapter adapter, @NonNull DiffUtil.ItemCallback<T> itemCallback) {
        this(new AdapterListUpdateCallback(adapter), new AsyncDifferConfig.Builder(itemCallback).build());
    }

    /* renamed from: a */
    public void m53620a(List list, DiffUtil.DiffResult diffResult, Runnable runnable) {
        List list2 = this.f36655f;
        this.f36654e = list;
        this.f36655f = Collections.unmodifiableList(list);
        diffResult.dispatchUpdatesTo(this.f36650a);
        m53619b(list2, runnable);
    }

    public void addListListener(@NonNull ListListener<T> listListener) {
        this.f36653d.add(listListener);
    }

    /* renamed from: b */
    public final void m53619b(List list, Runnable runnable) {
        for (ListListener listListener : this.f36653d) {
            listListener.onCurrentListChanged(list, this.f36655f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @NonNull
    public List<T> getCurrentList() {
        return this.f36655f;
    }

    public void removeListListener(@NonNull ListListener<T> listListener) {
        this.f36653d.remove(listListener);
    }

    public void submitList(@Nullable List<T> list) {
        submitList(list, null);
    }

    public void submitList(@Nullable List<T> list, @Nullable Runnable runnable) {
        int i = this.f36656g + 1;
        this.f36656g = i;
        List<T> list2 = this.f36654e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f36655f;
        if (list == null) {
            int size = list2.size();
            this.f36654e = null;
            this.f36655f = Collections.emptyList();
            this.f36650a.onRemoved(0, size);
            m53619b(list3, runnable);
        } else if (list2 == null) {
            this.f36654e = list;
            this.f36655f = Collections.unmodifiableList(list);
            this.f36650a.onInserted(0, list.size());
            m53619b(list3, runnable);
        } else {
            this.f36651b.getBackgroundThreadExecutor().execute(new RunnableC4857a(list2, list, i, runnable));
        }
    }

    public AsyncListDiffer(@NonNull ListUpdateCallback listUpdateCallback, @NonNull AsyncDifferConfig<T> asyncDifferConfig) {
        this.f36653d = new CopyOnWriteArrayList();
        this.f36655f = Collections.emptyList();
        this.f36650a = listUpdateCallback;
        this.f36651b = asyncDifferConfig;
        if (asyncDifferConfig.getMainThreadExecutor() != null) {
            this.f36652c = asyncDifferConfig.getMainThreadExecutor();
        } else {
            this.f36652c = f36649h;
        }
    }
}