package p000;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;

/* renamed from: T5 */
/* loaded from: classes.dex */
public final class C1345T5 {

    /* renamed from: a */
    public TextView f6250a;

    /* renamed from: b */
    public TextClassifier f6251b;

    /* renamed from: T5$a */
    /* loaded from: classes.dex */
    public static final class C1346a {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static TextClassifier m66370a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    public C1345T5(TextView textView) {
        this.f6250a = (TextView) Preconditions.checkNotNull(textView);
    }

    /* renamed from: a */
    public TextClassifier m66372a() {
        TextClassifier textClassifier = this.f6251b;
        if (textClassifier == null) {
            return C1346a.m66370a(this.f6250a);
        }
        return textClassifier;
    }

    /* renamed from: b */
    public void m66371b(TextClassifier textClassifier) {
        this.f6251b = textClassifier;
    }
}