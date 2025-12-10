package com.google.android.gms.identity.intents;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface AddressConstants {

    /* loaded from: classes3.dex */
    public interface ErrorCodes {
        public static final int ERROR_CODE_NO_APPLICABLE_ADDRESSES = 555;
    }

    /* loaded from: classes3.dex */
    public interface Extras {
        @NonNull
        public static final String EXTRA_ADDRESS = "com.google.android.gms.identity.intents.EXTRA_ADDRESS";
        @NonNull
        public static final String EXTRA_ERROR_CODE = "com.google.android.gms.identity.intents.EXTRA_ERROR_CODE";
    }

    /* loaded from: classes3.dex */
    public interface ResultCodes {
        public static final int RESULT_ERROR = 1;
    }

    /* loaded from: classes3.dex */
    public interface Themes {
        public static final int THEME_DARK = 0;
        @Deprecated
        public static final int THEME_HOLO_DARK = 0;
        @Deprecated
        public static final int THEME_HOLO_LIGHT = 1;
        public static final int THEME_LIGHT = 1;
    }
}