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
public class C5845a implements ModelLoader {

    /* renamed from: a */
    public final List f42267a;

    /* renamed from: b */
    public final Pools.Pool f42268b;

    /* renamed from: com.bumptech.glide.load.model.a$a */
    /* loaded from: classes3.dex */
    public static class C5846a implements DataFetcher, DataFetcher.DataCallback {

        /* renamed from: a */
        public final List f42269a;

        /* renamed from: b */
        public final Pools.Pool f42270b;

        /* renamed from: c */
        public int f42271c;

        /* renamed from: d */
        public Priority f42272d;

        /* renamed from: e */
        public DataFetcher.DataCallback f42273e;

        /* renamed from: f */
        public List f42274f;

        /* renamed from: g */
        public boolean f42275g;

        public C5846a(List list, Pools.Pool pool) {
            this.f42270b = pool;
            Preconditions.checkNotEmpty(list);
            this.f42269a = list;
            this.f42271c = 0;
        }

        /* renamed from: a */
        public final void m50255a() {
            if (this.f42275g) {
                return;
            }
            if (this.f42271c < this.f42269a.size() - 1) {
                this.f42271c++;
                loadData(this.f42272d, this.f42273e);
                return;
            }
            Preconditions.checkNotNull(this.f42274f);
            this.f42273e.onLoadFailed(new GlideException("Fetch failed", new ArrayList(this.f42274f)));
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
            this.f42275g = true;
            for (DataFetcher dataFetcher : this.f42269a) {
                dataFetcher.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
            List list = this.f42274f;
            if (list != null) {
                this.f42270b.release(list);
            }
            this.f42274f = null;
            for (DataFetcher dataFetcher : this.f42269a) {
                dataFetcher.cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public Class getDataClass() {
            return ((DataFetcher) this.f42269a.get(0)).getDataClass();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public DataSource getDataSource() {
            return ((DataFetcher) this.f42269a.get(0)).getDataSource();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(Priority priority, DataFetcher.DataCallback dataCallback) {
            this.f42272d = priority;
            this.f42273e = dataCallback;
            this.f42274f = (List) this.f42270b.acquire();
            ((DataFetcher) this.f42269a.get(this.f42271c)).loadData(priority, this);
            if (this.f42275g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public void onDataReady(Object obj) {
            if (obj != null) {
                this.f42273e.onDataReady(obj);
            } else {
                m50255a();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public void onLoadFailed(Exception exc) {
            ((List) Preconditions.checkNotNull(this.f42274f)).add(exc);
            m50255a();
        }
    }

    public C5845a(List list, Pools.Pool pool) {
        this.f42267a = list;
        this.f42268b = pool;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData buildLoadData(Object obj, int i, int i2, Options options) {
        ModelLoader.LoadData buildLoadData;
        int size = this.f42267a.size();
        ArrayList arrayList = new ArrayList(size);
        Key key = null;
        for (int i3 = 0; i3 < size; i3++) {
            ModelLoader modelLoader = (ModelLoader) this.f42267a.get(i3);
            if (modelLoader.handles(obj) && (buildLoadData = modelLoader.buildLoadData(obj, i, i2, options)) != null) {
                key = buildLoadData.sourceKey;
                arrayList.add(buildLoadData.fetcher);
            }
        }
        if (arrayList.isEmpty() || key == null) {
            return null;
        }
        return new ModelLoader.LoadData(key, new C5846a(arrayList, this.f42268b));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(Object obj) {
        for (ModelLoader modelLoader : this.f42267a) {
            if (modelLoader.handles(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f42267a.toArray()) + '}';
    }
}