package p000;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;

/* renamed from: T5 */
/* loaded from: classes.dex */
public final class C1363T5 {

    /* renamed from: a */
    public TextView f5920a;

    /* renamed from: b */
    public TextClassifier f5921b;

    /* renamed from: T5$a */
    /* loaded from: classes.dex */
    public static final class C1364a {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static TextClassifier m66227a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    public C1363T5(TextView textView) {
        this.f5920a = (TextView) Preconditions.checkNotNull(textView);
    }

    /* renamed from: a */
    public TextClassifier m66229a() {
        TextClassifier textClassifier = this.f5921b;
        if (textClassifier == null) {
            return C1364a.m66227a(this.f5920a);
        }
        return textClassifier;
    }

    /* renamed from: b */
    public void m66228b(TextClassifier textClassifier) {
        this.f5921b = textClassifier;
    }
}
