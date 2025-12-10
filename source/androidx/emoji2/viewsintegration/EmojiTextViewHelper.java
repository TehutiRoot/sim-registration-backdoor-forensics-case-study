package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;

/* loaded from: classes2.dex */
public final class EmojiTextViewHelper {

    /* renamed from: a */
    public final C4548b f35286a;

    /* renamed from: androidx.emoji2.viewsintegration.EmojiTextViewHelper$a */
    /* loaded from: classes2.dex */
    public static class C4547a extends C4548b {

        /* renamed from: a */
        public final TextView f35287a;

        /* renamed from: b */
        public final C11653kR f35288b;

        /* renamed from: c */
        public boolean f35289c = true;

        public C4547a(TextView textView) {
            this.f35287a = textView;
            this.f35288b = new C11653kR(textView);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.C4548b
        /* renamed from: a */
        public InputFilter[] mo54611a(InputFilter[] inputFilterArr) {
            if (!this.f35289c) {
                return m54616i(inputFilterArr);
            }
            return m54618g(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.C4548b
        /* renamed from: b */
        public boolean mo54610b() {
            return this.f35289c;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.C4548b
        /* renamed from: c */
        public void mo54609c(boolean z) {
            if (z) {
                mo54607e();
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.C4548b
        /* renamed from: d */
        public void mo54608d(boolean z) {
            this.f35289c = z;
            mo54607e();
            m54613l();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.C4548b
        /* renamed from: e */
        public void mo54607e() {
            this.f35287a.setTransformationMethod(mo54606f(this.f35287a.getTransformationMethod()));
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.C4548b
        /* renamed from: f */
        public TransformationMethod mo54606f(TransformationMethod transformationMethod) {
            if (this.f35289c) {
                return m54612m(transformationMethod);
            }
            return m54614k(transformationMethod);
        }

        /* renamed from: g */
        public final InputFilter[] m54618g(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f35288b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f35288b;
            return inputFilterArr2;
        }

        /* renamed from: h */
        public final SparseArray m54617h(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C11653kR) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        /* renamed from: i */
        public final InputFilter[] m54616i(InputFilter[] inputFilterArr) {
            SparseArray m54617h = m54617h(inputFilterArr);
            if (m54617h.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - m54617h.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (m54617h.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        /* renamed from: j */
        public void m54615j(boolean z) {
            this.f35289c = z;
        }

        /* renamed from: k */
        public final TransformationMethod m54614k(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof C12285mR) {
                return ((C12285mR) transformationMethod).m26257a();
            }
            return transformationMethod;
        }

        /* renamed from: l */
        public final void m54613l() {
            this.f35287a.setFilters(mo54611a(this.f35287a.getFilters()));
        }

        /* renamed from: m */
        public final TransformationMethod m54612m(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof C12285mR) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new C12285mR(transformationMethod);
        }
    }

    /* renamed from: androidx.emoji2.viewsintegration.EmojiTextViewHelper$b */
    /* loaded from: classes2.dex */
    public static class C4548b {
        /* renamed from: a */
        public abstract InputFilter[] mo54611a(InputFilter[] inputFilterArr);

        /* renamed from: b */
        public abstract boolean mo54610b();

        /* renamed from: c */
        public abstract void mo54609c(boolean z);

        /* renamed from: d */
        public abstract void mo54608d(boolean z);

        /* renamed from: e */
        public abstract void mo54607e();

        /* renamed from: f */
        public abstract TransformationMethod mo54606f(TransformationMethod transformationMethod);
    }

    /* renamed from: androidx.emoji2.viewsintegration.EmojiTextViewHelper$c */
    /* loaded from: classes2.dex */
    public static class C4549c extends C4548b {

        /* renamed from: a */
        public final C4547a f35290a;

        public C4549c(TextView textView) {
            this.f35290a = new C4547a(textView);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.C4548b
        /* renamed from: a */
        public InputFilter[] mo54611a(InputFilter[] inputFilterArr) {
            if (m54605g()) {
                return inputFilterArr;
            }
            return this.f35290a.mo54611a(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.C4548b
        /* renamed from: b */
        public boolean mo54610b() {
            return this.f35290a.mo54610b();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.C4548b
        /* renamed from: c */
        public void mo54609c(boolean z) {
            if (m54605g()) {
                return;
            }
            this.f35290a.mo54609c(z);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.C4548b
        /* renamed from: d */
        public void mo54608d(boolean z) {
            if (m54605g()) {
                this.f35290a.m54615j(z);
            } else {
                this.f35290a.mo54608d(z);
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.C4548b
        /* renamed from: e */
        public void mo54607e() {
            if (m54605g()) {
                return;
            }
            this.f35290a.mo54607e();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.C4548b
        /* renamed from: f */
        public TransformationMethod mo54606f(TransformationMethod transformationMethod) {
            if (m54605g()) {
                return transformationMethod;
            }
            return this.f35290a.mo54606f(transformationMethod);
        }

        /* renamed from: g */
        public final boolean m54605g() {
            return !EmojiCompat.isConfigured();
        }
    }

    public EmojiTextViewHelper(@NonNull TextView textView) {
        this(textView, true);
    }

    @NonNull
    public InputFilter[] getFilters(@NonNull InputFilter[] inputFilterArr) {
        return this.f35286a.mo54611a(inputFilterArr);
    }

    public boolean isEnabled() {
        return this.f35286a.mo54610b();
    }

    public void setAllCaps(boolean z) {
        this.f35286a.mo54609c(z);
    }

    public void setEnabled(boolean z) {
        this.f35286a.mo54608d(z);
    }

    public void updateTransformationMethod() {
        this.f35286a.mo54607e();
    }

    @Nullable
    public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod transformationMethod) {
        return this.f35286a.mo54606f(transformationMethod);
    }

    public EmojiTextViewHelper(@NonNull TextView textView, boolean z) {
        Preconditions.checkNotNull(textView, "textView cannot be null");
        if (!z) {
            this.f35286a = new C4549c(textView);
        } else {
            this.f35286a = new C4547a(textView);
        }
    }
}
