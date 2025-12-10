package com.google.mlkit.vision.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.inject.Provider;
import com.google.mlkit.common.sdkinternal.ClientPriority;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@KeepForSdk
/* loaded from: classes4.dex */
public class MultiFlavorDetectorCreator {

    /* renamed from: a */
    public final Map f57123a = new HashMap();

    @KeepForSdk
    /* loaded from: classes4.dex */
    public interface DetectorCreator<DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> {
        @NonNull
        @KeepForSdk
        DetectorT create(@NonNull OptionsT optionst);
    }

    @KeepForSdk
    /* loaded from: classes4.dex */
    public interface DetectorOptions<DetectorT> {
    }

    @KeepForSdk
    /* loaded from: classes4.dex */
    public interface MultiFlavorDetector {
    }

    @KeepForSdk
    /* loaded from: classes4.dex */
    public static class Registration {

        /* renamed from: a */
        public final Class f57124a;

        /* renamed from: b */
        public final Provider f57125b;

        /* renamed from: c */
        public final int f57126c;

        @KeepForSdk
        public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> Registration(@NonNull Class<? extends OptionsT> cls, @NonNull Provider<? extends DetectorCreator<DetectorT, OptionsT>> provider, @ClientPriority int i) {
            this.f57124a = cls;
            this.f57125b = provider;
            this.f57126c = i;
        }

        /* renamed from: a */
        public final int m37177a() {
            return this.f57126c;
        }

        /* renamed from: b */
        public final Provider m37176b() {
            return this.f57125b;
        }

        /* renamed from: c */
        public final Class m37175c() {
            return this.f57124a;
        }

        @KeepForSdk
        public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> Registration(@NonNull Class<? extends OptionsT> cls, @NonNull Provider<? extends DetectorCreator<DetectorT, OptionsT>> provider) {
            this(cls, provider, 100);
        }
    }

    public MultiFlavorDetectorCreator(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Registration registration = (Registration) it.next();
            Class m37175c = registration.m37175c();
            if (!this.f57123a.containsKey(m37175c) || registration.m37177a() >= ((Integer) Preconditions.checkNotNull((Integer) hashMap.get(m37175c))).intValue()) {
                this.f57123a.put(m37175c, registration.m37176b());
                hashMap.put(m37175c, Integer.valueOf(registration.m37177a()));
            }
        }
    }

    @NonNull
    @KeepForSdk
    public static synchronized MultiFlavorDetectorCreator getInstance() {
        MultiFlavorDetectorCreator multiFlavorDetectorCreator;
        synchronized (MultiFlavorDetectorCreator.class) {
            multiFlavorDetectorCreator = (MultiFlavorDetectorCreator) MlKitContext.getInstance().get(MultiFlavorDetectorCreator.class);
        }
        return multiFlavorDetectorCreator;
    }

    @NonNull
    @KeepForSdk
    public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> DetectorT create(@NonNull OptionsT optionst) {
        return (DetectorT) ((DetectorCreator) ((Provider) Preconditions.checkNotNull((Provider) this.f57123a.get(optionst.getClass()))).get()).create(optionst);
    }
}