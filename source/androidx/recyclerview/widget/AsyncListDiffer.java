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
    public static final Executor f36561h = new ExecutorC4878b();

    /* renamed from: a */
    public final ListUpdateCallback f36562a;

    /* renamed from: b */
    public final AsyncDifferConfig f36563b;

    /* renamed from: c */
    public Executor f36564c;

    /* renamed from: d */
    public final List f36565d;

    /* renamed from: e */
    public List f36566e;

    /* renamed from: f */
    public List f36567f;

    /* renamed from: g */
    public int f36568g;

    /* loaded from: classes2.dex */
    public interface ListListener<T> {
        void onCurrentListChanged(@NonNull List<T> list, @NonNull List<T> list2);
    }

    /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$a */
    /* loaded from: classes2.dex */
    public class RunnableC4875a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f36569a;

        /* renamed from: b */
        public final /* synthetic */ List f36570b;

        /* renamed from: c */
        public final /* synthetic */ int f36571c;

        /* renamed from: d */
        public final /* synthetic */ Runnable f36572d;

        /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$a$a */
        /* loaded from: classes2.dex */
        public class C4876a extends DiffUtil.Callback {
            public C4876a() {
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areContentsTheSame(int i, int i2) {
                Object obj = RunnableC4875a.this.f36569a.get(i);
                Object obj2 = RunnableC4875a.this.f36570b.get(i2);
                if (obj != null && obj2 != null) {
                    return AsyncListDiffer.this.f36563b.getDiffCallback().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areItemsTheSame(int i, int i2) {
                Object obj = RunnableC4875a.this.f36569a.get(i);
                Object obj2 = RunnableC4875a.this.f36570b.get(i2);
                if (obj != null && obj2 != null) {
                    return AsyncListDiffer.this.f36563b.getDiffCallback().areItemsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public Object getChangePayload(int i, int i2) {
                Object obj = RunnableC4875a.this.f36569a.get(i);
                Object obj2 = RunnableC4875a.this.f36570b.get(i2);
                if (obj != null && obj2 != null) {
                    return AsyncListDiffer.this.f36563b.getDiffCallback().getChangePayload(obj, obj2);
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getNewListSize() {
                return RunnableC4875a.this.f36570b.size();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getOldListSize() {
                return RunnableC4875a.this.f36569a.size();
            }
        }

        /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$a$b */
        /* loaded from: classes2.dex */
        public class RunnableC4877b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DiffUtil.DiffResult f36575a;

            public RunnableC4877b(DiffUtil.DiffResult diffResult) {
                this.f36575a = diffResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC4875a runnableC4875a = RunnableC4875a.this;
                AsyncListDiffer asyncListDiffer = AsyncListDiffer.this;
                if (asyncListDiffer.f36568g == runnableC4875a.f36571c) {
                    asyncListDiffer.m53669a(runnableC4875a.f36570b, this.f36575a, runnableC4875a.f36572d);
                }
            }
        }

        public RunnableC4875a(List list, List list2, int i, Runnable runnable) {
            this.f36569a = list;
            this.f36570b = list2;
            this.f36571c = i;
            this.f36572d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncListDiffer.this.f36564c.execute(new RunnableC4877b(DiffUtil.calculateDiff(new C4876a())));
        }
    }

    /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$b */
    /* loaded from: classes2.dex */
    public static class ExecutorC4878b implements Executor {

        /* renamed from: a */
        public final Handler f36577a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f36577a.post(runnable);
        }
    }

    public AsyncListDiffer(@NonNull RecyclerView.Adapter adapter, @NonNull DiffUtil.ItemCallback<T> itemCallback) {
        this(new AdapterListUpdateCallback(adapter), new AsyncDifferConfig.Builder(itemCallback).build());
    }

    /* renamed from: a */
    public void m53669a(List list, DiffUtil.DiffResult diffResult, Runnable runnable) {
        List list2 = this.f36567f;
        this.f36566e = list;
        this.f36567f = Collections.unmodifiableList(list);
        diffResult.dispatchUpdatesTo(this.f36562a);
        m53668b(list2, runnable);
    }

    public void addListListener(@NonNull ListListener<T> listListener) {
        this.f36565d.add(listListener);
    }

    /* renamed from: b */
    public final void m53668b(List list, Runnable runnable) {
        for (ListListener listListener : this.f36565d) {
            listListener.onCurrentListChanged(list, this.f36567f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @NonNull
    public List<T> getCurrentList() {
        return this.f36567f;
    }

    public void removeListListener(@NonNull ListListener<T> listListener) {
        this.f36565d.remove(listListener);
    }

    public void submitList(@Nullable List<T> list) {
        submitList(list, null);
    }

    public void submitList(@Nullable List<T> list, @Nullable Runnable runnable) {
        int i = this.f36568g + 1;
        this.f36568g = i;
        List<T> list2 = this.f36566e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f36567f;
        if (list == null) {
            int size = list2.size();
            this.f36566e = null;
            this.f36567f = Collections.emptyList();
            this.f36562a.onRemoved(0, size);
            m53668b(list3, runnable);
        } else if (list2 == null) {
            this.f36566e = list;
            this.f36567f = Collections.unmodifiableList(list);
            this.f36562a.onInserted(0, list.size());
            m53668b(list3, runnable);
        } else {
            this.f36563b.getBackgroundThreadExecutor().execute(new RunnableC4875a(list2, list, i, runnable));
        }
    }

    public AsyncListDiffer(@NonNull ListUpdateCallback listUpdateCallback, @NonNull AsyncDifferConfig<T> asyncDifferConfig) {
        this.f36565d = new CopyOnWriteArrayList();
        this.f36567f = Collections.emptyList();
        this.f36562a = listUpdateCallback;
        this.f36563b = asyncDifferConfig;
        if (asyncDifferConfig.getMainThreadExecutor() != null) {
            this.f36564c = asyncDifferConfig.getMainThreadExecutor();
        } else {
            this.f36564c = f36561h;
        }
    }
}
