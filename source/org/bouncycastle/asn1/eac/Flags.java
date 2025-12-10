package org.bouncycastle.asn1.eac;

import java.util.Enumeration;
import java.util.Hashtable;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes6.dex */
public class Flags {
    int value;

    /* loaded from: classes6.dex */
    public static class StringJoiner {
        boolean First = true;

        /* renamed from: b */
        StringBuffer f74676b = new StringBuffer();
        String mSeparator;

        public StringJoiner(String str) {
            this.mSeparator = str;
        }

        public void add(String str) {
            if (this.First) {
                this.First = false;
            } else {
                this.f74676b.append(this.mSeparator);
            }
            this.f74676b.append(str);
        }

        public String toString() {
            return this.f74676b.toString();
        }
    }

    public Flags() {
        this.value = 0;
    }

    public String decode(Hashtable hashtable) {
        StringJoiner stringJoiner = new StringJoiner(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            if (isSet(num.intValue())) {
                stringJoiner.add((String) hashtable.get(num));
            }
        }
        return stringJoiner.toString();
    }

    public int getFlags() {
        return this.value;
    }

    public boolean isSet(int i) {
        return (i & this.value) != 0;
    }

    public void set(int i) {
        this.value = i | this.value;
    }

    public Flags(int i) {
        this.value = i;
    }
}
