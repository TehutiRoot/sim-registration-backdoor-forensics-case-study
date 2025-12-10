package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.b */
/* loaded from: classes3.dex */
public class C5792b implements DataFetcherGenerator, DataFetcher.DataCallback {

    /* renamed from: a */
    public final List f41975a;

    /* renamed from: b */
    public final C5800c f41976b;

    /* renamed from: c */
    public final DataFetcherGenerator.FetcherReadyCallback f41977c;

    /* renamed from: d */
    public int f41978d;

    /* renamed from: e */
    public Key f41979e;

    /* renamed from: f */
    public List f41980f;

    /* renamed from: g */
    public int f41981g;

    /* renamed from: h */
    public volatile ModelLoader.LoadData f41982h;

    /* renamed from: i */
    public File f41983i;

    public C5792b(C5800c c5800c, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this(c5800c.m50386c(), c5800c, fetcherReadyCallback);
    }

    /* renamed from: b */
    private boolean m50426b() {
        if (this.f41981g < this.f41980f.size()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (m50426b() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        r0 = r7.f41980f;
        r3 = r7.f41981g;
        r7.f41981g = r3 + 1;
        r7.f41982h = ((com.bumptech.glide.load.model.ModelLoader) r0.get(r3)).buildLoadData(r7.f41983i, r7.f41976b.m50369t(), r7.f41976b.m50383f(), r7.f41976b.m50378k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r7.f41982h == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r7.f41976b.m50368u(r7.f41982h.fetcher.getDataClass()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        r7.f41982h.fetcher.loadData(r7.f41976b.m50377l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        r7.f41982h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r2 != false) goto L30;
     */
    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo50325a() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            com.bumptech.glide.util.pool.GlideTrace.beginSection(r0)
        L5:
            java.util.List r0 = r7.f41980f     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.m50426b()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.f41982h = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.m50426b()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List r0 = r7.f41980f     // Catch: java.lang.Throwable -> L68
            int r3 = r7.f41981g     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.f41981g = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.model.ModelLoader r0 = (com.bumptech.glide.load.model.ModelLoader) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.f41983i     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.c r4 = r7.f41976b     // Catch: java.lang.Throwable -> L68
            int r4 = r4.m50369t()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.c r5 = r7.f41976b     // Catch: java.lang.Throwable -> L68
            int r5 = r5.m50383f()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.c r6 = r7.f41976b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.Options r6 = r6.m50378k()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.model.ModelLoader$LoadData r0 = r0.buildLoadData(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.f41982h = r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.model.ModelLoader$LoadData r0 = r7.f41982h     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            com.bumptech.glide.load.engine.c r0 = r7.f41976b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.model.ModelLoader$LoadData r3 = r7.f41982h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.DataFetcher<Data> r3 = r3.fetcher     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.getDataClass()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.m50368u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            com.bumptech.glide.load.model.ModelLoader$LoadData r0 = r7.f41982h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.DataFetcher<Data> r0 = r0.fetcher     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.c r2 = r7.f41976b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.Priority r2 = r2.m50377l()     // Catch: java.lang.Throwable -> L68
            r0.loadData(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = 1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return r2
        L6e:
            int r0 = r7.f41978d     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.f41978d = r0     // Catch: java.lang.Throwable -> L68
            java.util.List r1 = r7.f41975a     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return r2
        L7f:
            java.util.List r0 = r7.f41975a     // Catch: java.lang.Throwable -> L68
            int r1 = r7.f41978d     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.Key r0 = (com.bumptech.glide.load.Key) r0     // Catch: java.lang.Throwable -> L68
            FD r1 = new FD     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.c r3 = r7.f41976b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.Key r3 = r3.m50373p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.c r3 = r7.f41976b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.cache.DiskCache r3 = r3.m50385d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.get(r1)     // Catch: java.lang.Throwable -> L68
            r7.f41983i = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.f41979e = r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.c r0 = r7.f41976b     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.m50379j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f41980f = r0     // Catch: java.lang.Throwable -> L68
            r7.f41981g = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C5792b.mo50325a():boolean");
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public void cancel() {
        ModelLoader.LoadData loadData = this.f41982h;
        if (loadData != null) {
            loadData.fetcher.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onDataReady(Object obj) {
        this.f41977c.onDataFetcherReady(this.f41979e, obj, this.f41982h.fetcher, DataSource.DATA_DISK_CACHE, this.f41979e);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onLoadFailed(Exception exc) {
        this.f41977c.onDataFetcherFailed(this.f41979e, exc, this.f41982h.fetcher, DataSource.DATA_DISK_CACHE);
    }

    public C5792b(List list, C5800c c5800c, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.f41978d = -1;
        this.f41975a = list;
        this.f41976b = c5800c;
        this.f41977c = fetcherReadyCallback;
    }
}
