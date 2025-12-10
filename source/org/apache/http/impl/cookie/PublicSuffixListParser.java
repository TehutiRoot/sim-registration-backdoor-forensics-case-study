package org.apache.http.impl.cookie;

import java.io.IOException;
import java.io.Reader;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.util.PublicSuffixList;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: classes6.dex */
public class PublicSuffixListParser {

    /* renamed from: a */
    public final PublicSuffixFilter f74371a;

    /* renamed from: b */
    public final org.apache.http.conn.util.PublicSuffixListParser f74372b;

    public void parse(Reader reader) throws IOException {
        PublicSuffixList parse = this.f74372b.parse(reader);
        this.f74371a.setPublicSuffixes(parse.getRules());
        this.f74371a.setExceptions(parse.getExceptions());
    }
}
