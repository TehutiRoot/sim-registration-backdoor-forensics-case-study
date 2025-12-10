package org.apache.http.message;

import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

/* loaded from: classes6.dex */
public class BasicHeaderElement implements HeaderElement, Cloneable {

    /* renamed from: a */
    public final String f74532a;

    /* renamed from: b */
    public final String f74533b;

    /* renamed from: c */
    public final NameValuePair[] f74534c;

    public BasicHeaderElement(String str, String str2, NameValuePair[] nameValuePairArr) {
        this.f74532a = (String) Args.notNull(str, "Name");
        this.f74533b = str2;
        if (nameValuePairArr != null) {
            this.f74534c = nameValuePairArr;
        } else {
            this.f74534c = new NameValuePair[0];
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderElement)) {
            return false;
        }
        BasicHeaderElement basicHeaderElement = (BasicHeaderElement) obj;
        if (this.f74532a.equals(basicHeaderElement.f74532a) && LangUtils.equals(this.f74533b, basicHeaderElement.f74533b) && LangUtils.equals((Object[]) this.f74534c, (Object[]) basicHeaderElement.f74534c)) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.HeaderElement
    public String getName() {
        return this.f74532a;
    }

    @Override // org.apache.http.HeaderElement
    public NameValuePair getParameter(int i) {
        return this.f74534c[i];
    }

    @Override // org.apache.http.HeaderElement
    public NameValuePair getParameterByName(String str) {
        NameValuePair[] nameValuePairArr;
        Args.notNull(str, "Name");
        for (NameValuePair nameValuePair : this.f74534c) {
            if (nameValuePair.getName().equalsIgnoreCase(str)) {
                return nameValuePair;
            }
        }
        return null;
    }

    @Override // org.apache.http.HeaderElement
    public int getParameterCount() {
        return this.f74534c.length;
    }

    @Override // org.apache.http.HeaderElement
    public NameValuePair[] getParameters() {
        return (NameValuePair[]) this.f74534c.clone();
    }

    @Override // org.apache.http.HeaderElement
    public String getValue() {
        return this.f74533b;
    }

    public int hashCode() {
        int hashCode = LangUtils.hashCode(LangUtils.hashCode(17, this.f74532a), this.f74533b);
        for (NameValuePair nameValuePair : this.f74534c) {
            hashCode = LangUtils.hashCode(hashCode, nameValuePair);
        }
        return hashCode;
    }

    public String toString() {
        NameValuePair[] nameValuePairArr;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f74532a);
        if (this.f74533b != null) {
            sb.append("=");
            sb.append(this.f74533b);
        }
        for (NameValuePair nameValuePair : this.f74534c) {
            sb.append("; ");
            sb.append(nameValuePair);
        }
        return sb.toString();
    }

    public BasicHeaderElement(String str, String str2) {
        this(str, str2, null);
    }
}
