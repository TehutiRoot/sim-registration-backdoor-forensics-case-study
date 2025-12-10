package com.google.mlkit.vision.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public interface TextRecognizerOptionsInterface {
    @KeepForSdk
    public static final int CREDIT_CARD = 6;
    @KeepForSdk
    public static final int DOCUMENT = 7;
    public static final int LATIN = 1;
    public static final int LATIN_AND_CHINESE = 2;
    public static final int LATIN_AND_DEVANAGARI = 3;
    public static final int LATIN_AND_JAPANESE = 4;
    public static final int LATIN_AND_KOREAN = 5;
    @KeepForSdk
    public static final int PIXEL_AI = 8;

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes4.dex */
    public @interface LanguageOption {
    }

    @NonNull
    @KeepForSdk
    String getConfigLabel();

    @Nullable
    @KeepForSdk
    Executor getExecutor();

    @KeepForSdk
    boolean getIsThickClient();

    @NonNull
    @KeepForSdk
    String getLanguageHint();

    @KeepForSdk
    int getLoggingEventId();

    @LanguageOption
    @KeepForSdk
    int getLoggingLanguageOption();

    @NonNull
    @KeepForSdk
    String getLoggingLibraryName();

    @NonNull
    @KeepForSdk
    String getLoggingLibraryNameForOptionalModule();

    @NonNull
    @KeepForSdk
    String getModuleId();
}
