package com.bumptech.glide.load.model;

import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bumptech.glide.load.model.a */
/* loaded from: classes3.dex */
public class C5856a implements ModelLoader {

    /* renamed from: a */
    public final List f42255a;

    /* renamed from: b */
    public final Pools.Pool f42256b;

    /* renamed from: com.bumptech.glide.load.model.a$a */
    /* loaded from: classes3.dex */
    public static class C5857a implements DataFetcher, DataFetcher.DataCallback {

        /* renamed from: a */
        public final List f42257a;

        /* renamed from: b */
        public final Pools.Pool f42258b;

        /* renamed from: c */
        public int f42259c;

        /* renamed from: d */
        public Priority f42260d;

        /* renamed from: e */
        public DataFetcher.DataCallback f42261e;

        /* renamed from: f */
        public List f42262f;

        /* renamed from: g */
        public boolean f42263g;

        public C5857a(List list, Pools.Pool pool) {
            this.f42258b = pool;
            Preconditions.checkNotEmpty(list);
            this.f42257a = list;
            this.f42259c = 0;
        }

        /* renamed from: a */
        public final void m50258a() {
            if (this.f42263g) {
                return;
            }
            if (this.f42259c < this.f42257a.size() - 1) {
                this.f42259c++;
                loadData(this.f42260d, this.f42261e);
                return;
            }
            Preconditions.checkNotNull(this.f42262f);
            this.f42261e.onLoadFailed(new GlideException("Fetch failed", new ArrayList(this.f42262f)));
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
            this.f42263g = true;
            for (DataFetcher dataFetcher : this.f42257a) {
                dataFetcher.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
            List list = this.f42262f;
            if (list != null) {
                this.f42258b.release(list);
            }
            this.f42262f = null;
            for (DataFetcher dataFetcher : this.f42257a) {
                dataFetcher.cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public Class getDataClass() {
            return ((DataFetcher) this.f42257a.get(0)).getDataClass();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public DataSource getDataSource() {
            return ((DataFetcher) this.f42257a.get(0)).getDataSource();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(Priority priority, DataFetcher.DataCallback dataCallback) {
            this.f42260d = priority;
            this.f42261e = dataCallback;
            this.f42262f = (List) this.f42258b.acquire();
            ((DataFetcher) this.f42257a.get(this.f42259c)).loadData(priority, this);
            if (this.f42263g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public void onDataReady(Object obj) {
            if (obj != null) {
                this.f42261e.onDataReady(obj);
            } else {
                m50258a();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public void onLoadFailed(Exception exc) {
            ((List) Preconditions.checkNotNull(this.f42262f)).add(exc);
            m50258a();
        }
    }

    public C5856a(List list, Pools.Pool pool) {
        this.f42255a = list;
        this.f42256b = pool;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData buildLoadData(Object obj, int i, int i2, Options options) {
        ModelLoader.LoadData buildLoadData;
        int size = this.f42255a.size();
        ArrayList arrayList = new ArrayList(size);
        Key key = null;
        for (int i3 = 0; i3 < size; i3++) {
            ModelLoader modelLoader = (ModelLoader) this.f42255a.get(i3);
            if (modelLoader.handles(obj) && (buildLoadData = modelLoader.buildLoadData(obj, i, i2, options)) != null) {
                key = buildLoadData.sourceKey;
                arrayList.add(buildLoadData.fetcher);
            }
        }
        if (arrayList.isEmpty() || key == null) {
            return null;
        }
        return new ModelLoader.LoadData(key, new C5857a(arrayList, this.f42256b));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(Object obj) {
        for (ModelLoader modelLoader : this.f42255a) {
            if (modelLoader.handles(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f42255a.toArray()) + '}';
    }
}
