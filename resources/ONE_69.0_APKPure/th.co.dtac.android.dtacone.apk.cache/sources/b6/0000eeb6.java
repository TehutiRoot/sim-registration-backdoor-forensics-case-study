package org.apache.commons.cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes6.dex */
public class PosixParser extends Parser {

    /* renamed from: c */
    public final List f73089c = new ArrayList();

    /* renamed from: d */
    public boolean f73090d;

    /* renamed from: e */
    public Option f73091e;

    /* renamed from: f */
    public Options f73092f;

    /* renamed from: b */
    public final void m25884b(Iterator it) {
        if (this.f73090d) {
            while (it.hasNext()) {
                this.f73089c.add((String) it.next());
            }
        }
    }

    public void burstToken(String str, boolean z) {
        int i;
        for (int i2 = 1; i2 < str.length(); i2++) {
            String valueOf = String.valueOf(str.charAt(i2));
            if (!this.f73092f.hasOption(valueOf)) {
                if (z) {
                    m25882d(str.substring(i2), true);
                    return;
                } else {
                    this.f73089c.add(str);
                    return;
                }
            }
            List list = this.f73089c;
            list.add(HelpFormatter.DEFAULT_OPT_PREFIX + valueOf);
            Option option = this.f73092f.getOption(valueOf);
            this.f73091e = option;
            if (option.hasArg() && str.length() != (i = i2 + 1)) {
                this.f73089c.add(str.substring(i));
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m25883c() {
        this.f73090d = false;
        this.f73089c.clear();
    }

    /* renamed from: d */
    public final void m25882d(String str, boolean z) {
        Option option;
        if (z && ((option = this.f73091e) == null || !option.hasArg())) {
            this.f73090d = true;
            this.f73089c.add(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        }
        this.f73089c.add(str);
    }

    /* renamed from: e */
    public final void m25881e(String str, boolean z) {
        if (z && !this.f73092f.hasOption(str)) {
            this.f73090d = true;
        }
        if (this.f73092f.hasOption(str)) {
            this.f73091e = this.f73092f.getOption(str);
        }
        this.f73089c.add(str);
    }

    @Override // org.apache.commons.cli.Parser
    public String[] flatten(Options options, String[] strArr, boolean z) throws ParseException {
        String substring;
        m25883c();
        this.f73092f = options;
        Iterator it = Arrays.asList(strArr).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                if (!HelpFormatter.DEFAULT_OPT_PREFIX.equals(str) && !HelpFormatter.DEFAULT_LONG_OPT_PREFIX.equals(str)) {
                    if (str.startsWith(HelpFormatter.DEFAULT_LONG_OPT_PREFIX)) {
                        int m25926l = DefaultParser.m25926l(str);
                        if (m25926l == -1) {
                            substring = str;
                        } else {
                            substring = str.substring(0, m25926l);
                        }
                        List<String> matchingOptions = options.getMatchingOptions(substring);
                        if (matchingOptions.isEmpty()) {
                            m25882d(str, z);
                        } else if (matchingOptions.size() <= 1) {
                            this.f73091e = options.getOption(matchingOptions.get(0));
                            List list = this.f73089c;
                            list.add(HelpFormatter.DEFAULT_LONG_OPT_PREFIX + this.f73091e.getLongOpt());
                            if (m25926l != -1) {
                                this.f73089c.add(str.substring(m25926l + 1));
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
                                    m25881e(HelpFormatter.DEFAULT_OPT_PREFIX + option.getLongOpt(), z);
                                } else {
                                    throw new AmbiguousOptionException(str, matchingOptions2);
                                }
                            } else {
                                burstToken(str, z);
                            }
                        } else {
                            m25881e(str, z);
                        }
                    } else {
                        m25882d(str, z);
                    }
                } else {
                    this.f73089c.add(str);
                }
            }
            m25884b(it);
        }
        return (String[]) this.f73089c.toArray(A12.f4a);
    }
}