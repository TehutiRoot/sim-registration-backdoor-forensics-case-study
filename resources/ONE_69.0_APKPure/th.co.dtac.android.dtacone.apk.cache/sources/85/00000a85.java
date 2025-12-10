package p000;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

/* renamed from: L5 */
/* loaded from: classes.dex */
public class C0775L5 {

    /* renamed from: a */
    public final TextView f3507a;

    /* renamed from: b */
    public final EmojiTextViewHelper f3508b;

    public C0775L5(TextView textView) {
        this.f3507a = textView;
        this.f3508b = new EmojiTextViewHelper(textView, false);
    }

    /* renamed from: a */
    public InputFilter[] m67637a(InputFilter[] inputFilterArr) {
        return this.f3508b.getFilters(inputFilterArr);
    }

    /* renamed from: b */
    public boolean m67636b() {
        return this.f3508b.isEnabled();
    }

    /* renamed from: c */
    public void m67635c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3507a.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextView_emojiCompatEnabled)) {
                z = obtainStyledAttributes.getBoolean(R.styleable.AppCompatTextView_emojiCompatEnabled, true);
            }
            obtainStyledAttributes.recycle();
            m67633e(z);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* renamed from: d */
    public void m67634d(boolean z) {
        this.f3508b.setAllCaps(z);
    }

    /* renamed from: e */
    public void m67633e(boolean z) {
        this.f3508b.setEnabled(z);
    }

    /* renamed from: f */
    public TransformationMethod m67632f(TransformationMethod transformationMethod) {
        return this.f3508b.wrapTransformationMethod(transformationMethod);
    }
}