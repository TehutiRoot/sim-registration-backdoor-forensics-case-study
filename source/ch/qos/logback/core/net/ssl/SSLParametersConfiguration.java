package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.OptionHelper;
import ch.qos.logback.core.util.StringCollectionUtil;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class SSLParametersConfiguration extends ContextAwareBase {

    /* renamed from: c */
    public String f39955c;

    /* renamed from: d */
    public String f39956d;

    /* renamed from: e */
    public String f39957e;

    /* renamed from: f */
    public String f39958f;

    /* renamed from: g */
    public Boolean f39959g;

    /* renamed from: h */
    public Boolean f39960h;

    /* renamed from: i */
    public String[] f39961i;

    /* renamed from: j */
    public String[] f39962j;

    /* renamed from: b */
    public final String[] m51436b(String[] strArr, String[] strArr2) {
        String[] strArr3;
        if (this.f39962j == null) {
            if (OptionHelper.isEmpty(getIncludedCipherSuites()) && OptionHelper.isEmpty(getExcludedCipherSuites())) {
                this.f39962j = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            } else {
                this.f39962j = m51434g(strArr, getIncludedCipherSuites(), getExcludedCipherSuites());
            }
            for (String str : this.f39962j) {
                addInfo("enabled cipher suite: " + str);
            }
        }
        return this.f39962j;
    }

    public void configure(SSLConfigurable sSLConfigurable) {
        sSLConfigurable.setEnabledProtocols(m51435d(sSLConfigurable.getSupportedProtocols(), sSLConfigurable.getDefaultProtocols()));
        sSLConfigurable.setEnabledCipherSuites(m51436b(sSLConfigurable.getSupportedCipherSuites(), sSLConfigurable.getDefaultCipherSuites()));
        if (isNeedClientAuth() != null) {
            sSLConfigurable.setNeedClientAuth(isNeedClientAuth().booleanValue());
        }
        if (isWantClientAuth() != null) {
            sSLConfigurable.setWantClientAuth(isWantClientAuth().booleanValue());
        }
    }

    /* renamed from: d */
    public final String[] m51435d(String[] strArr, String[] strArr2) {
        String[] strArr3;
        if (this.f39961i == null) {
            if (OptionHelper.isEmpty(getIncludedProtocols()) && OptionHelper.isEmpty(getExcludedProtocols())) {
                this.f39961i = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            } else {
                this.f39961i = m51434g(strArr, getIncludedProtocols(), getExcludedProtocols());
            }
            for (String str : this.f39961i) {
                addInfo("enabled protocol: " + str);
            }
        }
        return this.f39961i;
    }

    /* renamed from: g */
    public final String[] m51434g(String[] strArr, String str, String str2) {
        ArrayList arrayList = new ArrayList(strArr.length);
        arrayList.addAll(Arrays.asList(strArr));
        if (str != null) {
            StringCollectionUtil.retainMatching(arrayList, m51433i(str));
        }
        if (str2 != null) {
            StringCollectionUtil.removeMatching(arrayList, m51433i(str2));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String getExcludedCipherSuites() {
        return this.f39958f;
    }

    public String getExcludedProtocols() {
        return this.f39956d;
    }

    public String getIncludedCipherSuites() {
        return this.f39957e;
    }

    public String getIncludedProtocols() {
        return this.f39955c;
    }

    /* renamed from: i */
    public final String[] m51433i(String str) {
        return str.split("\\s*,\\s*");
    }

    public Boolean isNeedClientAuth() {
        return this.f39959g;
    }

    public Boolean isWantClientAuth() {
        return this.f39960h;
    }

    public void setExcludedCipherSuites(String str) {
        this.f39958f = str;
    }

    public void setExcludedProtocols(String str) {
        this.f39956d = str;
    }

    public void setIncludedCipherSuites(String str) {
        this.f39957e = str;
    }

    public void setIncludedProtocols(String str) {
        this.f39955c = str;
    }

    public void setNeedClientAuth(Boolean bool) {
        this.f39959g = bool;
    }

    public void setWantClientAuth(Boolean bool) {
        this.f39960h = bool;
    }
}
