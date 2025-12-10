package org.apache.http;

/* loaded from: classes6.dex */
public interface Header extends NameValuePair {
    HeaderElement[] getElements() throws ParseException;
}
