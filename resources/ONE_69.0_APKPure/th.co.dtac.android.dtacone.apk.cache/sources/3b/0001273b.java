package th.p047co.dtac.android.dtacone.util.format;

import android.text.Spanned;
import android.text.method.NumberKeyListener;

/* renamed from: th.co.dtac.android.dtacone.util.format.PhoneNumberFilter */
/* loaded from: classes8.dex */
public class PhoneNumberFilter extends NumberKeyListener {
    /* renamed from: a */
    public final boolean m16756a(CharSequence charSequence) {
        if (charSequence.charAt(0) != '0' && charSequence.charAt(0) != '6') {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m16755b(CharSequence charSequence) {
        if (charSequence.length() == 0 || charSequence.charAt(0) != '6') {
            return false;
        }
        return true;
    }

    @Override // android.text.method.NumberKeyListener, android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence.length() == 1 && "0".equals(charSequence.toString())) {
            return null;
        }
        if (i3 == 0 && charSequence.length() == 1) {
            if (!m16756a(charSequence)) {
                return "";
            }
        } else if (spanned.length() == 1 && spanned.charAt(0) == '6' && !m16755b(charSequence)) {
            return "";
        }
        if (i2 > i && !"".equals(spanned.toString())) {
            String obj = spanned.toString();
            if (!(obj.substring(0, i3) + ((Object) charSequence.subSequence(i, i2)) + obj.substring(i4)).matches("^\\d{1,1}(\\d{1,1}(\\d{1,1}(\\-(\\d{1,1}(\\d{1,1}(\\d{1,1}(\\-(\\d{1,1}(\\d{1,1}(\\d{1,1}(\\d{1,1}?)?)?)?)?)?)?)?)?)?)?)?")) {
                return "";
            }
        }
        return null;
    }

    @Override // android.text.method.NumberKeyListener
    public char[] getAcceptedChars() {
        return new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-'};
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return 3;
    }
}