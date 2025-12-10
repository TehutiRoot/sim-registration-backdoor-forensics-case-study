package com.tom_roush.pdfbox.pdmodel.font.encoding;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class Encoding implements COSObjectable {
    protected static final int CHAR_CODE = 0;
    protected static final int CHAR_NAME = 1;
    protected final Map<Integer, String> codeToName = new HashMap((int) ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    protected final Map<String, Integer> inverted = new HashMap((int) ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);

    public static Encoding getInstance(COSName cOSName) {
        if (COSName.STANDARD_ENCODING.equals(cOSName)) {
            return StandardEncoding.INSTANCE;
        }
        if (COSName.WIN_ANSI_ENCODING.equals(cOSName)) {
            return WinAnsiEncoding.INSTANCE;
        }
        if (COSName.MAC_ROMAN_ENCODING.equals(cOSName)) {
            return MacRomanEncoding.INSTANCE;
        }
        if (COSName.MAC_EXPERT_ENCODING.equals(cOSName)) {
            return MacExpertEncoding.INSTANCE;
        }
        return null;
    }

    public void add(int i, String str) {
        this.codeToName.put(Integer.valueOf(i), str);
        if (!this.inverted.containsKey(str)) {
            this.inverted.put(str, Integer.valueOf(i));
        }
    }

    public boolean contains(String str) {
        return this.inverted.containsKey(str);
    }

    public Map<Integer, String> getCodeToNameMap() {
        return Collections.unmodifiableMap(this.codeToName);
    }

    public abstract String getEncodingName();

    public String getName(int i) {
        String str = this.codeToName.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        return ".notdef";
    }

    public Map<String, Integer> getNameToCodeMap() {
        return Collections.unmodifiableMap(this.inverted);
    }

    public void overwrite(int i, String str) {
        Integer num;
        String str2 = this.codeToName.get(Integer.valueOf(i));
        if (str2 != null && (num = this.inverted.get(str2)) != null && num.intValue() == i) {
            this.inverted.remove(str2);
        }
        this.inverted.put(str, Integer.valueOf(i));
        this.codeToName.put(Integer.valueOf(i), str);
    }

    public boolean contains(int i) {
        return this.codeToName.containsKey(Integer.valueOf(i));
    }
}
