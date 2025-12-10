package org.apache.commons.cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes6.dex */
public class PosixParser extends Parser {

    /* renamed from: c */
    public final List f73005c = new ArrayList();

    /* renamed from: d */
    public boolean f73006d;

    /* renamed from: e */
    public Option f73007e;

    /* renamed from: f */
    public Options f73008f;

    /* renamed from: b */
    public final void m25694b(Iterator it) {
        if (this.f73006d) {
            while (it.hasNext()) {
                this.f73005c.add((String) it.next());
            }
        }
    }

    public void burstToken(String str, boolean z) {
        int i;
        for (int i2 = 1; i2 < str.length(); i2++) {
            String valueOf = String.valueOf(str.charAt(i2));
            if (!this.f73008f.hasOption(valueOf)) {
                if (z) {
                    m25692d(str.substring(i2), true);
                    return;
                } else {
                    this.f73005c.add(str);
                    return;
                }
            }
            List list = this.f73005c;
            list.add(HelpFormatter.DEFAULT_OPT_PREFIX + valueOf);
            Option option = this.f73008f.getOption(valueOf);
            this.f73007e = option;
            if (option.hasArg() && str.length() != (i = i2 + 1)) {
                this.f73005c.add(str.substring(i));
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m25693c() {
        this.f73006d = false;
        this.f73005c.clear();
    }

    /* renamed from: d */
    public final void m25692d(String str, boolean z) {
        Option option;
        if (z && ((option = this.f73007e) == null || !option.hasArg())) {
            this.f73006d = true;
            this.f73005c.add(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        }
        this.f73005c.add(str);
    }

    /* renamed from: e */
    public final void m25691e(String str, boolean z) {
        if (z && !this.f73008f.hasOption(str)) {
            this.f73006d = true;
        }
        if (this.f73008f.hasOption(str)) {
            this.f73007e = this.f73008f.getOption(str);
        }
        this.f73005c.add(str);
    }

    @Override // org.apache.commons.cli.Parser
    public String[] flatten(Options options, String[] strArr, boolean z) throws ParseException {
        String substring;
        m25693c();
        this.f73008f = options;
        Iterator it = Arrays.asList(strArr).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                if (!HelpFormatter.DEFAULT_OPT_PREFIX.equals(str) && !HelpFormatter.DEFAULT_LONG_OPT_PREFIX.equals(str)) {
                    if (str.startsWith(HelpFormatter.DEFAULT_LONG_OPT_PREFIX)) {
                        int m25736l = DefaultParser.m25736l(str);
                        if (m25736l == -1) {
                            substring = str;
                        } else {
                            substring = str.substring(0, m25736l);
                        }
                        List<String> matchingOptions = options.getMatchingOptions(substring);
                        if (matchingOptions.isEmpty()) {
                            m25692d(str, z);
                        } else if (matchingOptions.size() <= 1) {
                            this.f73007e = options.getOption(matchingOptions.get(0));
                            List list = this.f73005c;
                            list.add(HelpFormatter.DEFAULT_LONG_OPT_PREFIX + this.f73007e.getLongOpt());
                            if (m25736l != -1) {
                                this.f73005c.add(str.substring(m25736l + 1));
                            }
                        } else {
                            throw new AmbiguousOptionException(substring, matchingOptions);
                        }
                    } else if (str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX)) {
                        if (str.length() != 2 && !options.hasOption(str)) {
                            if (!options.getMatchingOptions(str).isEmpty()) {
                                List<String> matchingOptions2 = options.getMatchingOptions(str);
                                if (matchingOptions2.size() <= 1) {
                                    Option option = options.getOption(matchingOptions2.get(0));
                                    m25691e(HelpFormatter.DEFAULT_OPT_PREFIX + option.getLongOpt(), z);
                                } else {
                                    throw new AmbiguousOptionException(str, matchingOptions2);
                                }
                            } else {
                                burstToken(str, z);
                            }
                        } else {
                            m25691e(str, z);
                        }
                    } else {
                        m25692d(str, z);
                    }
                } else {
                    this.f73005c.add(str);
                }
            }
            m25694b(it);
        }
        return (String[]) this.f73005c.toArray(D02.f886a);
    }
}
