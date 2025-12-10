package p000;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: wr0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C22929wr0 implements InputFilter {

    /* renamed from: a */
    public int f108579a;

    public C22929wr0(int i) {
        this.f108579a = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f108579a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}