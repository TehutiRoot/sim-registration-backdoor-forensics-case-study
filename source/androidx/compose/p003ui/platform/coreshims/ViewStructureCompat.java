package androidx.compose.p003ui.platform.coreshims;

import android.os.Build;
import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.compose.ui.platform.coreshims.ViewStructureCompat */
/* loaded from: classes2.dex */
public class ViewStructureCompat {

    /* renamed from: a */
    public final Object f30845a;

    /* renamed from: androidx.compose.ui.platform.coreshims.ViewStructureCompat$a */
    /* loaded from: classes2.dex */
    public static class C3603a {
        @DoNotInline
        /* renamed from: a */
        public static void m59154a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m59153b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m59152c(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m59151d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }
    }

    public ViewStructureCompat(ViewStructure viewStructure) {
        this.f30845a = viewStructure;
    }

    @NonNull
    @RequiresApi(23)
    public static ViewStructureCompat toViewStructureCompat(@NonNull ViewStructure viewStructure) {
        return new ViewStructureCompat(viewStructure);
    }

    public void setClassName(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            C3603a.m59154a(AbstractC17162yx.m155a(this.f30845a), str);
        }
    }

    public void setContentDescription(@NonNull CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            C3603a.m59153b(AbstractC17162yx.m155a(this.f30845a), charSequence);
        }
    }

    public void setDimens(int i, int i2, int i3, int i4, int i5, int i6) {
        if (Build.VERSION.SDK_INT >= 23) {
            C3603a.m59152c(AbstractC17162yx.m155a(this.f30845a), i, i2, i3, i4, i5, i6);
        }
    }

    public void setText(@NonNull CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            C3603a.m59151d(AbstractC17162yx.m155a(this.f30845a), charSequence);
        }
    }

    @NonNull
    @RequiresApi(23)
    public ViewStructure toViewStructure() {
        return AbstractC17162yx.m155a(this.f30845a);
    }
}
