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
    public final List f42529a = new ArrayList();

    /* renamed from: b */
    public final Map f42530b = new HashMap();

    /* renamed from: com.bumptech.glide.provider.ResourceDecoderRegistry$a */
    /* loaded from: classes3.dex */
    public static class C5917a {

        /* renamed from: a */
        public final Class f42531a;

        /* renamed from: b */
        public final Class f42532b;

        /* renamed from: c */
        public final ResourceDecoder f42533c;

        public C5917a(Class cls, Class cls2, ResourceDecoder resourceDecoder) {
            this.f42531a = cls;
            this.f42532b = cls2;
            this.f42533c = resourceDecoder;
        }

        /* renamed from: a */
        public boolean m50079a(Class cls, Class cls2) {
            if (this.f42531a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f42532b)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized List m50080a(String str) {
        List list;
        try {
            if (!this.f42529a.contains(str)) {
                this.f42529a.add(str);
            }
            list = (List) this.f42530b.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f42530b.put(str, list);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return list;
    }

    public synchronized <T, R> void append(@NonNull String str, @NonNull ResourceDecoder<T, R> resourceDecoder, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        m50080a(str).add(new C5917a(cls, cls2, resourceDecoder));
    }

    @NonNull
    public synchronized <T, R> List<ResourceDecoder<T, R>> getDecoders(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f42529a) {
            List<C5917a> list = (List) this.f42530b.get(str);
            if (list != null) {
                for (C5917a c5917a : list) {
                    if (c5917a.m50079a(cls, cls2)) {
                        arrayList.add(c5917a.f42533c);
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
        for (String str : this.f42529a) {
            List<C5917a> list = (List) this.f42530b.get(str);
            if (list != null) {
                for (C5917a c5917a : list) {
                    if (c5917a.m50079a(cls, cls2) && !arrayList.contains(c5917a.f42532b)) {
                        arrayList.add(c5917a.f42532b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void prepend(@NonNull String str, @NonNull ResourceDecoder<T, R> resourceDecoder, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        m50080a(str).add(0, new C5917a(cls, cls2, resourceDecoder));
    }

    public synchronized void setBucketPriorityList(@NonNull List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f42529a);
            this.f42529a.clear();
            for (String str : list) {
                this.f42529a.add(str);
            }
            for (String str2 : arrayList) {
                if (!list.contains(str2)) {
                    this.f42529a.add(str2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
