package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ResourceDecoderRegistry {

    /* renamed from: a */
    public final List f42541a = new ArrayList();

    /* renamed from: b */
    public final Map f42542b = new HashMap();

    /* renamed from: com.bumptech.glide.provider.ResourceDecoderRegistry$a */
    /* loaded from: classes3.dex */
    public static class C5906a {

        /* renamed from: a */
        public final Class f42543a;

        /* renamed from: b */
        public final Class f42544b;

        /* renamed from: c */
        public final ResourceDecoder f42545c;

        public C5906a(Class cls, Class cls2, ResourceDecoder resourceDecoder) {
            this.f42543a = cls;
            this.f42544b = cls2;
            this.f42545c = resourceDecoder;
        }

        /* renamed from: a */
        public boolean m50076a(Class cls, Class cls2) {
            if (this.f42543a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f42544b)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized List m50077a(String str) {
        List list;
        try {
            if (!this.f42541a.contains(str)) {
                this.f42541a.add(str);
            }
            list = (List) this.f42542b.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f42542b.put(str, list);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return list;
    }

    public synchronized <T, R> void append(@NonNull String str, @NonNull ResourceDecoder<T, R> resourceDecoder, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        m50077a(str).add(new C5906a(cls, cls2, resourceDecoder));
    }

    @NonNull
    public synchronized <T, R> List<ResourceDecoder<T, R>> getDecoders(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f42541a) {
            List<C5906a> list = (List) this.f42542b.get(str);
            if (list != null) {
                for (C5906a c5906a : list) {
                    if (c5906a.m50076a(cls, cls2)) {
                        arrayList.add(c5906a.f42545c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public synchronized <T, R> List<Class<R>> getResourceClasses(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f42541a) {
            List<C5906a> list = (List) this.f42542b.get(str);
            if (list != null) {
                for (C5906a c5906a : list) {
                    if (c5906a.m50076a(cls, cls2) && !arrayList.contains(c5906a.f42544b)) {
                        arrayList.add(c5906a.f42544b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void prepend(@NonNull String str, @NonNull ResourceDecoder<T, R> resourceDecoder, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        m50077a(str).add(0, new C5906a(cls, cls2, resourceDecoder));
    }

    public synchronized void setBucketPriorityList(@NonNull List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f42541a);
            this.f42541a.clear();
            for (String str : list) {
                this.f42541a.add(str);
            }
            for (String str2 : arrayList) {
                if (!list.contains(str2)) {
                    this.f42541a.add(str2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}