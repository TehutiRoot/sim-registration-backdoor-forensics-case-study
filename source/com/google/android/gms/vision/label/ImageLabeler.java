package com.google.android.gms.vision.label;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.vision.zzu;
import com.google.android.gms.internal.vision.zzv;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.label.internal.client.ImageLabelerOptions;
import com.google.android.gms.vision.label.internal.client.LabelOptions;
import com.google.android.gms.vision.label.internal.client.zzi;
import java.util.Locale;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes4.dex */
public class ImageLabeler extends Detector<ImageLabel> {

    /* renamed from: d */
    public static final LabelOptions f48695d = new LabelOptions(-1);

    /* renamed from: c */
    public final zzi f48696c;

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public Context f48697a;

        /* renamed from: b */
        public ImageLabelerOptions f48698b = new ImageLabelerOptions(ImageLabelerOptions.zza(Locale.getDefault().getLanguage()), -1, 0.5f, 1);

        @KeepForSdk
        public Builder(Context context) {
            this.f48697a = context;
        }

        @KeepForSdk
        public ImageLabeler build() {
            return new ImageLabeler(new zzi(this.f48697a, this.f48698b));
        }

        @KeepForSdk
        public Builder setScoreThreshold(float f) {
            if (f >= 0.0f && f <= 1.0f) {
                this.f48698b.zzec = f;
                return this;
            }
            throw new IllegalArgumentException("scoreThreshold should be between [0, 1]");
        }
    }

    public ImageLabeler(zzi zziVar) {
        this.f48696c = zziVar;
    }

    @Override // com.google.android.gms.vision.Detector
    @KeepForSdk
    public SparseArray<ImageLabel> detect(Frame frame) {
        return detect(frame, f48695d);
    }

    @Override // com.google.android.gms.vision.Detector
    @KeepForSdk
    public boolean isOperational() {
        return this.f48696c.isOperational();
    }

    @Override // com.google.android.gms.vision.Detector
    @KeepForSdk
    public void release() {
        super.release();
        this.f48696c.zzp();
    }

    @KeepForSdk
    public SparseArray<ImageLabel> detect(Frame frame, LabelOptions labelOptions) {
        if (frame != null) {
            ImageLabel[] zza = this.f48696c.zza(zzv.zzb(frame.getBitmap(), zzu.zzd(frame)), labelOptions);
            SparseArray<ImageLabel> sparseArray = new SparseArray<>(zza.length);
            for (int i = 0; i < zza.length; i++) {
                sparseArray.append(i, zza[i]);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }
}
