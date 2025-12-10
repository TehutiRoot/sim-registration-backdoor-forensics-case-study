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
public class C0782L5 {

    /* renamed from: a */
    public final TextView f3379a;

    /* renamed from: b */
    public final EmojiTextViewHelper f3380b;

    public C0782L5(TextView textView) {
        this.f3379a = textView;
        this.f3380b = new EmojiTextViewHelper(textView, false);
    }

    /* renamed from: a */
    public InputFilter[] m67554a(InputFilter[] inputFilterArr) {
        return this.f3380b.getFilters(inputFilterArr);
    }

    /* renamed from: b */
    public boolean m67553b() {
        return this.f3380b.isEnabled();
    }

    /* renamed from: c */
    public void m67552c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f3379a.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTextView_emojiCompatEnabled)) {
                z = obtainStyledAttributes.getBoolean(R.styleable.AppCompatTextView_emojiCompatEnabled, true);
            }
            obtainStyledAttributes.recycle();
            m67550e(z);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* renamed from: d */
    public void m67551d(boolean z) {
        this.f3380b.setAllCaps(z);
    }

    /* renamed from: e */
    public void m67550e(boolean z) {
        this.f3380b.setEnabled(z);
    }

    /* renamed from: f */
    public TransformationMethod m67549f(TransformationMethod transformationMethod) {
        return this.f3380b.wrapTransformationMethod(transformationMethod);
    }
}
