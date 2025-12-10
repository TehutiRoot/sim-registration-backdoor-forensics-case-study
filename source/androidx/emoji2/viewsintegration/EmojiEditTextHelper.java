package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public final class EmojiEditTextHelper {

    /* renamed from: a */
    public final C4546b f35277a;

    /* renamed from: b */
    public int f35278b;

    /* renamed from: c */
    public int f35279c;

    /* renamed from: androidx.emoji2.viewsintegration.EmojiEditTextHelper$a */
    /* loaded from: classes2.dex */
    public static class C4545a extends C4546b {

        /* renamed from: a */
        public final EditText f35280a;

        /* renamed from: b */
        public final C12219lR f35281b;

        public C4545a(EditText editText, boolean z) {
            this.f35280a = editText;
            C12219lR c12219lR = new C12219lR(editText, z);
            this.f35281b = c12219lR;
            editText.addTextChangedListener(c12219lR);
            editText.setEditableFactory(C10466iR.getInstance());
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.C4546b
        /* renamed from: a */
        public KeyListener mo54625a(KeyListener keyListener) {
            if (keyListener instanceof EmojiKeyListener) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new EmojiKeyListener(keyListener);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.C4546b
        /* renamed from: b */
        public boolean mo54624b() {
            return this.f35281b.m26477b();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.C4546b
        /* renamed from: c */
        public InputConnection mo54623c(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof EmojiInputConnection) {
                return inputConnection;
            }
            return new EmojiInputConnection(this.f35280a, inputConnection, editorInfo);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.C4546b
        /* renamed from: d */
        public void mo54622d(int i) {
            this.f35281b.m26475d(i);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.C4546b
        /* renamed from: e */
        public void mo54621e(boolean z) {
            this.f35281b.m26474e(z);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.C4546b
        /* renamed from: f */
        public void mo54620f(int i) {
            this.f35281b.m26473f(i);
        }
    }

    /* renamed from: androidx.emoji2.viewsintegration.EmojiEditTextHelper$b */
    /* loaded from: classes2.dex */
    public static class C4546b {
        /* renamed from: a */
        public abstract KeyListener mo54625a(KeyListener keyListener);

        /* renamed from: b */
        public abstract boolean mo54624b();

        /* renamed from: c */
        public abstract InputConnection mo54623c(InputConnection inputConnection, EditorInfo editorInfo);

        /* renamed from: d */
        public abstract void mo54622d(int i);

        /* renamed from: e */
        public abstract void mo54621e(boolean z);

        /* renamed from: f */
        public abstract void mo54620f(int i);
    }

    public EmojiEditTextHelper(@NonNull EditText editText) {
        this(editText, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getEmojiReplaceStrategy() {
        return this.f35279c;
    }

    @Nullable
    public KeyListener getKeyListener(@Nullable KeyListener keyListener) {
        return this.f35277a.mo54625a(keyListener);
    }

    public int getMaxEmojiCount() {
        return this.f35278b;
    }

    public boolean isEnabled() {
        return this.f35277a.mo54624b();
    }

    @Nullable
    public InputConnection onCreateInputConnection(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f35277a.mo54623c(inputConnection, editorInfo);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setEmojiReplaceStrategy(int i) {
        this.f35279c = i;
        this.f35277a.mo54622d(i);
    }

    public void setEnabled(boolean z) {
        this.f35277a.mo54621e(z);
    }

    public void setMaxEmojiCount(@IntRange(from = 0) int i) {
        Preconditions.checkArgumentNonnegative(i, "maxEmojiCount should be greater than 0");
        this.f35278b = i;
        this.f35277a.mo54620f(i);
    }

    public EmojiEditTextHelper(@NonNull EditText editText, boolean z) {
        this.f35278b = Integer.MAX_VALUE;
        this.f35279c = 0;
        Preconditions.checkNotNull(editText, "editText cannot be null");
        this.f35277a = new C4545a(editText, z);
    }
}
