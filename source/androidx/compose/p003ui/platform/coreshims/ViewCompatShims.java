package androidx.compose.p003ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.compose.ui.platform.coreshims.ViewCompatShims */
/* loaded from: classes2.dex */
public class ViewCompatShims {
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;

    /* renamed from: androidx.compose.ui.platform.coreshims.ViewCompatShims$a */
    /* loaded from: classes2.dex */
    public static class C3600a {
        @DoNotInline
        /* renamed from: a */
        public static AutofillId m59157a(View view) {
            return view.getAutofillId();
        }
    }

    /* renamed from: androidx.compose.ui.platform.coreshims.ViewCompatShims$b */
    /* loaded from: classes2.dex */
    public static class C3601b {
        @DoNotInline
        /* renamed from: a */
        public static ContentCaptureSession m59156a(View view) {
            return view.getContentCaptureSession();
        }
    }

    /* renamed from: androidx.compose.ui.platform.coreshims.ViewCompatShims$c */
    /* loaded from: classes2.dex */
    public static class C3602c {
        @DoNotInline
        /* renamed from: a */
        public static void m59155a(View view, int i) {
            view.setImportantForContentCapture(i);
        }
    }

    @Nullable
    public static AutofillIdCompat getAutofillId(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return AutofillIdCompat.toAutofillIdCompat(C3600a.m59157a(view));
        }
        return null;
    }

    @Nullable
    public static ContentCaptureSessionCompat getContentCaptureSession(@NonNull View view) {
        ContentCaptureSession m59156a;
        if (Build.VERSION.SDK_INT < 29 || (m59156a = C3601b.m59156a(view)) == null) {
            return null;
        }
        return ContentCaptureSessionCompat.toContentCaptureSessionCompat(m59156a, view);
    }

    public static void setImportantForContentCapture(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            C3602c.m59155a(view, i);
        }
    }
}
