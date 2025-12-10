package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class TranscoderRegistry {

    /* renamed from: a */
    public final List f42468a = new ArrayList();

    /* renamed from: com.bumptech.glide.load.resource.transcode.TranscoderRegistry$a */
    /* loaded from: classes3.dex */
    public static final class C5896a {

        /* renamed from: a */
        public final Class f42469a;

        /* renamed from: b */
        public final Class f42470b;

        /* renamed from: c */
        public final ResourceTranscoder f42471c;

        public C5896a(Class cls, Class cls2, ResourceTranscoder resourceTranscoder) {
            this.f42469a = cls;
            this.f42470b = cls2;
            this.f42471c = resourceTranscoder;
        }

        /* renamed from: a */
        public boolean m50110a(Class cls, Class cls2) {
            if (this.f42469a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f42470b)) {
                return true;
            }
            return false;
        }
    }

    @NonNull
    public synchronized <Z, R> ResourceTranscoder<Z, R> get(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return UnitTranscoder.get();
        }
        for (C5896a c5896a : this.f42468a) {
            if (c5896a.m50110a(cls, cls2)) {
                return c5896a.f42471c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    public synchronized <Z, R> List<Class<R>> getTranscodeClasses(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C5896a c5896a : this.f42468a) {
            if (c5896a.m50110a(cls, cls2) && !arrayList.contains(c5896a.f42470b)) {
                arrayList.add(c5896a.f42470b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void register(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull ResourceTranscoder<Z, R> resourceTranscoder) {
        this.f42468a.add(new C5896a(cls, cls2, resourceTranscoder));
    }
}
