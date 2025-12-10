package com.google.mlkit.vision.text;

import androidx.annotation.NonNull;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.text.internal.zzo;

/* loaded from: classes4.dex */
public class TextRecognition {
    @NonNull
    public static TextRecognizer getClient(@NonNull TextRecognizerOptionsInterface textRecognizerOptionsInterface) {
        return ((zzo) MlKitContext.getInstance().get(zzo.class)).zza(textRecognizerOptionsInterface);
    }
}
