package androidx.compose.p003ui.platform.coreshims;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.List;
import java.util.Objects;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat */
/* loaded from: classes2.dex */
public class ContentCaptureSessionCompat {

    /* renamed from: a */
    public final Object f30839a;

    /* renamed from: b */
    public final View f30840b;

    /* renamed from: androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat$a */
    /* loaded from: classes2.dex */
    public static class C3594a {
        @DoNotInline
        /* renamed from: a */
        public static Bundle m59171a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* renamed from: androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat$b */
    /* loaded from: classes2.dex */
    public static class C3595b {
        @DoNotInline
        /* renamed from: a */
        public static AutofillId m59170a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        @DoNotInline
        /* renamed from: b */
        public static ViewStructure m59169b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        @DoNotInline
        /* renamed from: c */
        public static ViewStructure m59168c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m59167d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        @DoNotInline
        /* renamed from: e */
        public static void m59166e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        @DoNotInline
        /* renamed from: f */
        public static void m59165f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    /* renamed from: androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat$c */
    /* loaded from: classes2.dex */
    public static class C3596c {
        @DoNotInline
        /* renamed from: a */
        public static void m59164a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
        }
    }

    public ContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        this.f30839a = contentCaptureSession;
        this.f30840b = view;
    }

    @NonNull
    @RequiresApi(29)
    public static ContentCaptureSessionCompat toContentCaptureSessionCompat(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        return new ContentCaptureSessionCompat(contentCaptureSession, view);
    }

    @Nullable
    public AutofillId newAutofillId(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession m359a = AbstractC17087xx.m359a(this.f30839a);
            AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(this.f30840b);
            Objects.requireNonNull(autofillId);
            return C3595b.m59170a(m359a, autofillId.toAutofillId(), j);
        }
        return null;
    }

    @Nullable
    public ViewStructureCompat newVirtualViewStructure(@NonNull AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ViewStructureCompat.toViewStructureCompat(C3595b.m59168c(AbstractC17087xx.m359a(this.f30839a), autofillId, j));
        }
        return null;
    }

    public void notifyViewTextChanged(@NonNull AutofillId autofillId, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            C3595b.m59166e(AbstractC17087xx.m359a(this.f30839a), autofillId, charSequence);
        }
    }

    public void notifyViewsAppeared(@NonNull List<ViewStructure> list) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            C3596c.m59164a(AbstractC17087xx.m359a(this.f30839a), list);
        } else if (i >= 29) {
            ViewStructure m59169b = C3595b.m59169b(AbstractC17087xx.m359a(this.f30839a), this.f30840b);
            C3594a.m59171a(m59169b).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C3595b.m59167d(AbstractC17087xx.m359a(this.f30839a), m59169b);
            for (int i2 = 0; i2 < list.size(); i2++) {
                C3595b.m59167d(AbstractC17087xx.m359a(this.f30839a), AbstractC17162yx.m155a(list.get(i2)));
            }
            ViewStructure m59169b2 = C3595b.m59169b(AbstractC17087xx.m359a(this.f30839a), this.f30840b);
            C3594a.m59171a(m59169b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C3595b.m59167d(AbstractC17087xx.m359a(this.f30839a), m59169b2);
        }
    }

    public void notifyViewsDisappeared(@NonNull long[] jArr) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ContentCaptureSession m359a = AbstractC17087xx.m359a(this.f30839a);
            AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(this.f30840b);
            Objects.requireNonNull(autofillId);
            C3595b.m59165f(m359a, autofillId.toAutofillId(), jArr);
        } else if (i >= 29) {
            ViewStructure m59169b = C3595b.m59169b(AbstractC17087xx.m359a(this.f30839a), this.f30840b);
            C3594a.m59171a(m59169b).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C3595b.m59167d(AbstractC17087xx.m359a(this.f30839a), m59169b);
            ContentCaptureSession m359a2 = AbstractC17087xx.m359a(this.f30839a);
            AutofillIdCompat autofillId2 = ViewCompatShims.getAutofillId(this.f30840b);
            Objects.requireNonNull(autofillId2);
            C3595b.m59165f(m359a2, autofillId2.toAutofillId(), jArr);
            ViewStructure m59169b2 = C3595b.m59169b(AbstractC17087xx.m359a(this.f30839a), this.f30840b);
            C3594a.m59171a(m59169b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C3595b.m59167d(AbstractC17087xx.m359a(this.f30839a), m59169b2);
        }
    }

    @NonNull
    @RequiresApi(29)
    public ContentCaptureSession toContentCaptureSession() {
        return AbstractC17087xx.m359a(this.f30839a);
    }
}
