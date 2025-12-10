package p000;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.EmojiCompat;

/* renamed from: mR */
/* loaded from: classes2.dex */
public class C12285mR implements TransformationMethod {

    /* renamed from: a */
    public final TransformationMethod f71904a;

    public C12285mR(TransformationMethod transformationMethod) {
        this.f71904a = transformationMethod;
    }

    /* renamed from: a */
    public TransformationMethod m26257a() {
        return this.f71904a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f71904a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && EmojiCompat.get().getLoadState() == 1) {
            return EmojiCompat.get().process(charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f71904a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
