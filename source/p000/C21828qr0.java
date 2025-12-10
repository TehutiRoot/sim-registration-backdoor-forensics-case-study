package p000;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: qr0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C21828qr0 implements InputFilter {

    /* renamed from: a */
    public int f77089a;

    public C21828qr0(int i) {
        this.f77089a = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f77089a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
