package com.google.android.gms.vision.face;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.internal.vision.zzw;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.internal.client.zzb;
import com.google.android.gms.vision.face.internal.client.zzf;
import com.google.android.gms.vision.zzc;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class FaceDetector extends Detector<Face> {
    public static final int ACCURATE_MODE = 1;
    public static final int ALL_CLASSIFICATIONS = 1;
    public static final int ALL_LANDMARKS = 1;
    public static final int CONTOUR_LANDMARKS = 2;
    public static final int FAST_MODE = 0;
    public static final int NO_CLASSIFICATIONS = 0;
    public static final int NO_LANDMARKS = 0;
    public static final int SELFIE_MODE = 2;

    /* renamed from: c */
    public final zzc f48675c;

    /* renamed from: d */
    public final zzb f48676d;

    /* renamed from: e */
    public final Object f48677e;

    /* renamed from: f */
    public boolean f48678f;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final Context f48679a;

        /* renamed from: b */
        public int f48680b = 0;

        /* renamed from: c */
        public boolean f48681c = false;

        /* renamed from: d */
        public int f48682d = 0;

        /* renamed from: e */
        public boolean f48683e = true;

        /* renamed from: f */
        public int f48684f = 0;

        /* renamed from: g */
        public float f48685g = -1.0f;

        public Builder(@RecentlyNonNull Context context) {
            this.f48679a = context;
        }

        @RecentlyNonNull
        public FaceDetector build() {
            zzf zzfVar = new zzf();
            zzfVar.zza = this.f48684f;
            zzfVar.zzb = this.f48680b;
            zzfVar.zzc = this.f48682d;
            zzfVar.zzd = this.f48681c;
            zzfVar.zze = this.f48683e;
            zzfVar.zzf = this.f48685g;
            if (FaceDetector.m45993b(zzfVar)) {
                return new FaceDetector(new zzb(this.f48679a, zzfVar));
            }
            throw new IllegalArgumentException("Invalid build options");
        }

        @RecentlyNonNull
        public Builder setClassificationType(int i) {
            if (i != 0 && i != 1) {
                StringBuilder sb = new StringBuilder(40);
                sb.append("Invalid classification type: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f48682d = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setLandmarkType(int i) {
            if (i != 0 && i != 1 && i != 2) {
                StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid landmark type: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f48680b = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setMinFaceSize(float f) {
            if (f >= 0.0f && f <= 1.0f) {
                this.f48685g = f;
                return this;
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid proportional face size: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        }

        @RecentlyNonNull
        public Builder setMode(int i) {
            if (i != 0 && i != 1 && i != 2) {
                StringBuilder sb = new StringBuilder(25);
                sb.append("Invalid mode: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f48684f = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setProminentFaceOnly(boolean z) {
            this.f48681c = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setTrackingEnabled(boolean z) {
            this.f48683e = z;
            return this;
        }
    }

    public FaceDetector(zzb zzbVar) {
        this.f48675c = new zzc();
        this.f48677e = new Object();
        this.f48678f = true;
        this.f48676d = zzbVar;
    }

    /* renamed from: b */
    public static boolean m45993b(zzf zzfVar) {
        boolean z;
        if (zzfVar.zza != 2 && zzfVar.zzb == 2) {
            z = false;
        } else {
            z = true;
        }
        if (zzfVar.zzb == 2 && zzfVar.zzc == 1) {
            return false;
        }
        return z;
    }

    @Override // com.google.android.gms.vision.Detector
    @RecentlyNonNull
    public final SparseArray<Face> detect(@RecentlyNonNull Frame frame) {
        ByteBuffer grayscaleImageData;
        Face[] zza;
        if (frame != null) {
            if (frame.getPlanes() != null && ((Image.Plane[]) Preconditions.checkNotNull(frame.getPlanes())).length == 3) {
                synchronized (this.f48677e) {
                    try {
                        if (this.f48678f) {
                            zza = this.f48676d.zza((Image.Plane[]) Preconditions.checkNotNull(frame.getPlanes()), zzs.zza(frame));
                        } else {
                            throw new IllegalStateException("Cannot use detector after release()");
                        }
                    } finally {
                    }
                }
            } else {
                if (frame.getBitmap() != null) {
                    grayscaleImageData = zzw.zza((Bitmap) Preconditions.checkNotNull(frame.getBitmap()), true);
                } else {
                    grayscaleImageData = frame.getGrayscaleImageData();
                }
                synchronized (this.f48677e) {
                    if (this.f48678f) {
                        zza = this.f48676d.zza((ByteBuffer) Preconditions.checkNotNull(grayscaleImageData), zzs.zza(frame));
                    } else {
                        throw new IllegalStateException("Cannot use detector after release()");
                    }
                }
            }
            HashSet hashSet = new HashSet();
            SparseArray<Face> sparseArray = new SparseArray<>(zza.length);
            int i = 0;
            for (Face face : zza) {
                int id2 = face.getId();
                i = Math.max(i, id2);
                if (hashSet.contains(Integer.valueOf(id2))) {
                    id2 = i + 1;
                    i = id2;
                }
                hashSet.add(Integer.valueOf(id2));
                sparseArray.append(this.f48675c.zza(id2), face);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this.f48677e) {
                if (this.f48678f) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    release();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.vision.Detector
    public final boolean isOperational() {
        return this.f48676d.zzb();
    }

    @Override // com.google.android.gms.vision.Detector
    public final void release() {
        super.release();
        synchronized (this.f48677e) {
            try {
                if (!this.f48678f) {
                    return;
                }
                this.f48676d.zzc();
                this.f48678f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.vision.Detector
    public final boolean setFocus(int i) {
        boolean zza;
        int zzb = this.f48675c.zzb(i);
        synchronized (this.f48677e) {
            try {
                if (this.f48678f) {
                    zza = this.f48676d.zza(zzb);
                } else {
                    throw new RuntimeException("Cannot use detector after release()");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zza;
    }
}
