package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.pool.GlideTrace;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.f */
/* loaded from: classes3.dex */
public class C5826f implements DataFetcherGenerator, DataFetcher.DataCallback {

    /* renamed from: a */
    public final DataFetcherGenerator.FetcherReadyCallback f42130a;

    /* renamed from: b */
    public final C5800c f42131b;

    /* renamed from: c */
    public int f42132c;

    /* renamed from: d */
    public int f42133d = -1;

    /* renamed from: e */
    public Key f42134e;

    /* renamed from: f */
    public List f42135f;

    /* renamed from: g */
    public int f42136g;

    /* renamed from: h */
    public volatile ModelLoader.LoadData f42137h;

    /* renamed from: i */
    public File f42138i;

    /* renamed from: j */
    public C17320Ax1 f42139j;

    public C5826f(C5800c c5800c, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.f42131b = c5800c;
        this.f42130a = fetcherReadyCallback;
    }

    /* renamed from: b */
    private boolean m50326b() {
        if (this.f42136g < this.f42135f.size()) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    /* renamed from: a */
    public boolean mo50325a() {
        GlideTrace.beginSection("ResourceCacheGenerator.startNext");
        try {
            List m50386c = this.f42131b.m50386c();
            boolean z = false;
            if (m50386c.isEmpty()) {
                GlideTrace.endSection();
                return false;
            }
            List m50376m = this.f42131b.m50376m();
            if (m50376m.isEmpty()) {
                if (File.class.equals(this.f42131b.m50371r())) {
                    GlideTrace.endSection();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f42131b.m50380i() + " to " + this.f42131b.m50371r());
            }
            while (true) {
                if (this.f42135f != null && m50326b()) {
                    this.f42137h = null;
                    while (!z && m50326b()) {
                        List list = this.f42135f;
                        int i = this.f42136g;
                        this.f42136g = i + 1;
                        this.f42137h = ((ModelLoader) list.get(i)).buildLoadData(this.f42138i, this.f42131b.m50369t(), this.f42131b.m50383f(), this.f42131b.m50378k());
                        if (this.f42137h != null && this.f42131b.m50368u(this.f42137h.fetcher.getDataClass())) {
                            this.f42137h.fetcher.loadData(this.f42131b.m50377l(), this);
                            z = true;
                        }
                    }
                    GlideTrace.endSection();
                    return z;
                }
                int i2 = this.f42133d + 1;
                this.f42133d = i2;
                if (i2 >= m50376m.size()) {
                    int i3 = this.f42132c + 1;
                    this.f42132c = i3;
                    if (i3 >= m50386c.size()) {
                        GlideTrace.endSection();
                        return false;
                    }
                    this.f42133d = 0;
                }
                Key key = (Key) m50386c.get(this.f42132c);
                Class cls = (Class) m50376m.get(this.f42133d);
                this.f42139j = new C17320Ax1(this.f42131b.m50387b(), key, this.f42131b.m50373p(), this.f42131b.m50369t(), this.f42131b.m50383f(), this.f42131b.m50370s(cls), cls, this.f42131b.m50378k());
                File file = this.f42131b.m50385d().get(this.f42139j);
                this.f42138i = file;
                if (file != null) {
                    this.f42134e = key;
                    this.f42135f = this.f42131b.m50379j(file);
                    this.f42136g = 0;
                }
            }
        } catch (Throwable th2) {
            GlideTrace.endSection();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public void cancel() {
        ModelLoader.LoadData loadData = this.f42137h;
        if (loadData != null) {
            loadData.fetcher.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onDataReady(Object obj) {
        this.f42130a.onDataFetcherReady(this.f42134e, obj, this.f42137h.fetcher, DataSource.RESOURCE_DISK_CACHE, this.f42139j);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onLoadFailed(Exception exc) {
        this.f42130a.onDataFetcherFailed(this.f42139j, exc, this.f42137h.fetcher, DataSource.RESOURCE_DISK_CACHE);
    }
}
