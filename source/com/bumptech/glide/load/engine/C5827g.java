package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.LogTime;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.g */
/* loaded from: classes3.dex */
public class C5827g implements DataFetcherGenerator, DataFetcherGenerator.FetcherReadyCallback {

    /* renamed from: a */
    public final C5800c f42140a;

    /* renamed from: b */
    public final DataFetcherGenerator.FetcherReadyCallback f42141b;

    /* renamed from: c */
    public volatile int f42142c;

    /* renamed from: d */
    public volatile C5792b f42143d;

    /* renamed from: e */
    public volatile Object f42144e;

    /* renamed from: f */
    public volatile ModelLoader.LoadData f42145f;

    /* renamed from: g */
    public volatile C0373FD f42146g;

    /* renamed from: com.bumptech.glide.load.engine.g$a */
    /* loaded from: classes3.dex */
    public class C5828a implements DataFetcher.DataCallback {

        /* renamed from: a */
        public final /* synthetic */ ModelLoader.LoadData f42147a;

        public C5828a(ModelLoader.LoadData loadData) {
            this.f42147a = loadData;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public void onDataReady(Object obj) {
            if (C5827g.this.m50322d(this.f42147a)) {
                C5827g.this.m50321e(this.f42147a, obj);
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public void onLoadFailed(Exception exc) {
            if (C5827g.this.m50322d(this.f42147a)) {
                C5827g.this.m50320f(this.f42147a, exc);
            }
        }
    }

    public C5827g(C5800c c5800c, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.f42140a = c5800c;
        this.f42141b = fetcherReadyCallback;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    /* renamed from: a */
    public boolean mo50325a() {
        if (this.f42144e != null) {
            Object obj = this.f42144e;
            this.f42144e = null;
            try {
                if (!m50324b(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.f42143d != null && this.f42143d.mo50325a()) {
            return true;
        }
        this.f42143d = null;
        this.f42145f = null;
        boolean z = false;
        while (!z && m50323c()) {
            List m50382g = this.f42140a.m50382g();
            int i = this.f42142c;
            this.f42142c = i + 1;
            this.f42145f = (ModelLoader.LoadData) m50382g.get(i);
            if (this.f42145f != null && (this.f42140a.m50384e().isDataCacheable(this.f42145f.fetcher.getDataSource()) || this.f42140a.m50368u(this.f42145f.fetcher.getDataClass()))) {
                m50319g(this.f42145f);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final boolean m50324b(Object obj) {
        long logTime = LogTime.getLogTime();
        boolean z = false;
        try {
            DataRewinder m50374o = this.f42140a.m50374o(obj);
            Object rewindAndGet = m50374o.rewindAndGet();
            Encoder m50372q = this.f42140a.m50372q(rewindAndGet);
            C0439GD c0439gd = new C0439GD(m50372q, rewindAndGet, this.f42140a.m50378k());
            C0373FD c0373fd = new C0373FD(this.f42145f.sourceKey, this.f42140a.m50373p());
            DiskCache m50385d = this.f42140a.m50385d();
            m50385d.put(c0373fd, c0439gd);
            if (Log.isLoggable("SourceGenerator", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Finished encoding source to cache, key: ");
                sb.append(c0373fd);
                sb.append(", data: ");
                sb.append(obj);
                sb.append(", encoder: ");
                sb.append(m50372q);
                sb.append(", duration: ");
                sb.append(LogTime.getElapsedMillis(logTime));
            }
            if (m50385d.get(c0373fd) != null) {
                this.f42146g = c0373fd;
                this.f42143d = new C5792b(Collections.singletonList(this.f42145f.sourceKey), this.f42140a, this);
                this.f42145f.fetcher.cleanup();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Attempt to write: ");
                sb2.append(this.f42146g);
                sb2.append(", data: ");
                sb2.append(obj);
                sb2.append(" to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f42141b.onDataFetcherReady(this.f42145f.sourceKey, m50374o.rewindAndGet(), this.f42145f.fetcher, this.f42145f.fetcher.getDataSource(), this.f42145f.sourceKey);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (!z) {
                    this.f42145f.fetcher.cleanup();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: c */
    public final boolean m50323c() {
        if (this.f42142c < this.f42140a.m50382g().size()) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public void cancel() {
        ModelLoader.LoadData loadData = this.f42145f;
        if (loadData != null) {
            loadData.fetcher.cancel();
        }
    }

    /* renamed from: d */
    public boolean m50322d(ModelLoader.LoadData loadData) {
        ModelLoader.LoadData loadData2 = this.f42145f;
        if (loadData2 != null && loadData2 == loadData) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m50321e(ModelLoader.LoadData loadData, Object obj) {
        DiskCacheStrategy m50384e = this.f42140a.m50384e();
        if (obj != null && m50384e.isDataCacheable(loadData.fetcher.getDataSource())) {
            this.f42144e = obj;
            this.f42141b.reschedule();
            return;
        }
        DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback = this.f42141b;
        Key key = loadData.sourceKey;
        DataFetcher<Data> dataFetcher = loadData.fetcher;
        fetcherReadyCallback.onDataFetcherReady(key, obj, dataFetcher, dataFetcher.getDataSource(), this.f42146g);
    }

    /* renamed from: f */
    public void m50320f(ModelLoader.LoadData loadData, Exception exc) {
        DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback = this.f42141b;
        Key key = this.f42146g;
        DataFetcher<Data> dataFetcher = loadData.fetcher;
        fetcherReadyCallback.onDataFetcherFailed(key, exc, dataFetcher, dataFetcher.getDataSource());
    }

    /* renamed from: g */
    public final void m50319g(ModelLoader.LoadData loadData) {
        this.f42145f.fetcher.loadData(this.f42140a.m50377l(), new C5828a(loadData));
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherFailed(Key key, Exception exc, DataFetcher dataFetcher, DataSource dataSource) {
        this.f42141b.onDataFetcherFailed(key, exc, dataFetcher, this.f42145f.fetcher.getDataSource());
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherReady(Key key, Object obj, DataFetcher dataFetcher, DataSource dataSource, Key key2) {
        this.f42141b.onDataFetcherReady(key, obj, dataFetcher, this.f42145f.fetcher.getDataSource(), key);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void reschedule() {
        throw new UnsupportedOperationException();
    }
}
