package com.google.mlkit.vision.text.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_text_common.zzun;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;

/* loaded from: classes4.dex */
public final class zzo {

    /* renamed from: a */
    public final zzp f57180a;

    /* renamed from: b */
    public final ExecutorSelector f57181b;

    public zzo(zzp zzpVar, ExecutorSelector executorSelector) {
        this.f57180a = zzpVar;
        this.f57181b = executorSelector;
    }

    @NonNull
    public final TextRecognizer zza(@NonNull TextRecognizerOptionsInterface textRecognizerOptionsInterface) {
        return new zzn((TextRecognizerTaskWithResource) this.f57180a.get(textRecognizerOptionsInterface), this.f57181b.getExecutorToUse(textRecognizerOptionsInterface.getExecutor()), zzun.zzb(textRecognizerOptionsInterface.getLoggingLibraryName()), textRecognizerOptionsInterface);
    }
}
