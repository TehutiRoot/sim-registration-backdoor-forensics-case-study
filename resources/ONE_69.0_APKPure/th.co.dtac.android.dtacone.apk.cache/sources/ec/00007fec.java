package com.azimolabs.maskformatter;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.feitian.readerdk.Tool.C6139DK;
import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public class MaskFormatter implements TextWatcher {

    /* renamed from: a */
    public final String f41654a;

    /* renamed from: b */
    public final EditText f41655b;

    /* renamed from: c */
    public final char f41656c;

    /* renamed from: d */
    public boolean f41657d;

    /* renamed from: e */
    public int f41658e;

    /* renamed from: f */
    public String f41659f;

    /* renamed from: g */
    public int f41660g;

    /* renamed from: h */
    public int f41661h;

    public MaskFormatter(String str, EditText editText) {
        this(str, editText, TokenParser.f74644SP);
    }

    /* renamed from: a */
    public final String m50634a(String str) {
        char[] charArray;
        String replaceAll = str.replaceAll(String.valueOf(this.f41656c), "");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (char c : replaceAll.toCharArray()) {
            if (i < this.f41654a.length()) {
                while (true) {
                    char charAt = this.f41654a.charAt(i);
                    char c2 = this.f41656c;
                    if (charAt == c2) {
                        sb.append(c2);
                        i++;
                    }
                }
                sb.append(m50633b(c, i));
                i++;
            } else {
                throw new InvalidTextException();
            }
        }
        return sb.toString();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.f41657d) {
            this.f41655b.setSelection(this.f41658e);
        }
        m50627h();
    }

    /* renamed from: b */
    public final char m50633b(char c, int i) {
        return CharTransforms.transformChar(c, this.f41654a.charAt(i));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f41659f = charSequence.toString();
        this.f41660g = this.f41655b.getSelectionEnd();
    }

    /* renamed from: c */
    public final int m50632c(int i, String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (i < 1) {
            return m50628g(str);
        }
        return m50629f(str);
    }

    /* renamed from: d */
    public final char m50631d() {
        int selectionEnd = this.f41655b.getSelectionEnd();
        while (selectionEnd < this.f41654a.length() && this.f41654a.charAt(selectionEnd) == this.f41656c) {
            selectionEnd++;
        }
        return this.f41654a.charAt(selectionEnd);
    }

    /* renamed from: e */
    public final int m50630e(EditText editText) {
        return editText.getInputType() & C6139DK.ERROR_RECEIVE_LRC;
    }

    /* renamed from: f */
    public final int m50629f(String str) {
        if (this.f41660g >= str.length()) {
            return str.length();
        }
        if (str.charAt(this.f41660g) == this.f41656c) {
            return this.f41660g + 2;
        }
        return this.f41660g + 1;
    }

    /* renamed from: g */
    public final int m50628g(String str) {
        if (this.f41660g > str.length()) {
            this.f41660g = str.length();
        } else {
            this.f41660g--;
        }
        int i = this.f41660g;
        if (i < 0) {
            return 0;
        }
        if (i - 1 >= 0 && str.charAt(i - 1) == this.f41656c) {
            return this.f41660g - 1;
        }
        return this.f41660g;
    }

    public String getRawTextValue() {
        return this.f41655b.getText().toString().replaceAll(String.valueOf(this.f41656c), "");
    }

    /* renamed from: h */
    public final void m50627h() {
        char m50631d;
        if (this.f41655b.getSelectionEnd() >= this.f41654a.length() || (m50631d = m50631d()) == this.f41656c) {
            return;
        }
        this.f41655b.setInputType(CharInputType.getKeyboardTypeForNextChar(m50631d) | this.f41661h);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f41657d) {
            this.f41655b.setSelection(this.f41658e);
            this.f41657d = false;
            return;
        }
        try {
            String m50634a = m50634a(charSequence.toString());
            if (!m50634a.equals(charSequence.toString())) {
                this.f41657d = true;
                this.f41658e = m50632c(i3, m50634a);
                this.f41655b.setText(m50634a);
            }
        } catch (InvalidTextException unused) {
            this.f41657d = true;
            this.f41658e = this.f41660g;
            this.f41655b.setText(this.f41659f);
        }
    }

    public MaskFormatter(String str, EditText editText, char c) {
        this.f41654a = str;
        this.f41655b = editText;
        this.f41656c = c;
        this.f41661h = m50630e(editText);
        m50627h();
    }
}