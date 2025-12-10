package com.azimolabs.maskformatter;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.feitian.readerdk.Tool.C6150DK;
import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public class MaskFormatter implements TextWatcher {

    /* renamed from: a */
    public final String f41642a;

    /* renamed from: b */
    public final EditText f41643b;

    /* renamed from: c */
    public final char f41644c;

    /* renamed from: d */
    public boolean f41645d;

    /* renamed from: e */
    public int f41646e;

    /* renamed from: f */
    public String f41647f;

    /* renamed from: g */
    public int f41648g;

    /* renamed from: h */
    public int f41649h;

    public MaskFormatter(String str, EditText editText) {
        this(str, editText, TokenParser.f74560SP);
    }

    /* renamed from: a */
    public final String m50637a(String str) {
        char[] charArray;
        String replaceAll = str.replaceAll(String.valueOf(this.f41644c), "");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (char c : replaceAll.toCharArray()) {
            if (i < this.f41642a.length()) {
                while (true) {
                    char charAt = this.f41642a.charAt(i);
                    char c2 = this.f41644c;
                    if (charAt == c2) {
                        sb.append(c2);
                        i++;
                    }
                }
                sb.append(m50636b(c, i));
                i++;
            } else {
                throw new InvalidTextException();
            }
        }
        return sb.toString();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.f41645d) {
            this.f41643b.setSelection(this.f41646e);
        }
        m50630h();
    }

    /* renamed from: b */
    public final char m50636b(char c, int i) {
        return CharTransforms.transformChar(c, this.f41642a.charAt(i));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f41647f = charSequence.toString();
        this.f41648g = this.f41643b.getSelectionEnd();
    }

    /* renamed from: c */
    public final int m50635c(int i, String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (i < 1) {
            return m50631g(str);
        }
        return m50632f(str);
    }

    /* renamed from: d */
    public final char m50634d() {
        int selectionEnd = this.f41643b.getSelectionEnd();
        while (selectionEnd < this.f41642a.length() && this.f41642a.charAt(selectionEnd) == this.f41644c) {
            selectionEnd++;
        }
        return this.f41642a.charAt(selectionEnd);
    }

    /* renamed from: e */
    public final int m50633e(EditText editText) {
        return editText.getInputType() & C6150DK.ERROR_RECEIVE_LRC;
    }

    /* renamed from: f */
    public final int m50632f(String str) {
        if (this.f41648g >= str.length()) {
            return str.length();
        }
        if (str.charAt(this.f41648g) == this.f41644c) {
            return this.f41648g + 2;
        }
        return this.f41648g + 1;
    }

    /* renamed from: g */
    public final int m50631g(String str) {
        if (this.f41648g > str.length()) {
            this.f41648g = str.length();
        } else {
            this.f41648g--;
        }
        int i = this.f41648g;
        if (i < 0) {
            return 0;
        }
        if (i - 1 >= 0 && str.charAt(i - 1) == this.f41644c) {
            return this.f41648g - 1;
        }
        return this.f41648g;
    }

    public String getRawTextValue() {
        return this.f41643b.getText().toString().replaceAll(String.valueOf(this.f41644c), "");
    }

    /* renamed from: h */
    public final void m50630h() {
        char m50634d;
        if (this.f41643b.getSelectionEnd() >= this.f41642a.length() || (m50634d = m50634d()) == this.f41644c) {
            return;
        }
        this.f41643b.setInputType(CharInputType.getKeyboardTypeForNextChar(m50634d) | this.f41649h);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f41645d) {
            this.f41643b.setSelection(this.f41646e);
            this.f41645d = false;
            return;
        }
        try {
            String m50637a = m50637a(charSequence.toString());
            if (!m50637a.equals(charSequence.toString())) {
                this.f41645d = true;
                this.f41646e = m50635c(i3, m50637a);
                this.f41643b.setText(m50637a);
            }
        } catch (InvalidTextException unused) {
            this.f41645d = true;
            this.f41646e = this.f41648g;
            this.f41643b.setText(this.f41647f);
        }
    }

    public MaskFormatter(String str, EditText editText, char c) {
        this.f41642a = str;
        this.f41643b = editText;
        this.f41644c = c;
        this.f41649h = m50633e(editText);
        m50630h();
    }
}
