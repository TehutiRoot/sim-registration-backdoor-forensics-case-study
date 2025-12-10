package com.google.common.p014io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.CheckForNull;

@J2ktIncompatible
@GwtIncompatible
/* renamed from: com.google.common.io.LineReader */
/* loaded from: classes4.dex */
public final class LineReader {

    /* renamed from: a */
    public final Readable f53973a;

    /* renamed from: b */
    public final Reader f53974b;

    /* renamed from: c */
    public final CharBuffer f53975c;

    /* renamed from: d */
    public final char[] f53976d;

    /* renamed from: e */
    public final Queue f53977e;

    /* renamed from: f */
    public final AbstractC18757Xi0 f53978f;

    /* renamed from: com.google.common.io.LineReader$a */
    /* loaded from: classes4.dex */
    public class C8111a extends AbstractC18757Xi0 {
        public C8111a() {
        }

        @Override // p000.AbstractC18757Xi0
        /* renamed from: d */
        public void mo39977d(String str, String str2) {
            LineReader.this.f53977e.add(str);
        }
    }

    public LineReader(Readable readable) {
        Reader reader;
        CharBuffer m39992c = CharStreams.m39992c();
        this.f53975c = m39992c;
        this.f53976d = m39992c.array();
        this.f53977e = new ArrayDeque();
        this.f53978f = new C8111a();
        this.f53973a = (Readable) Preconditions.checkNotNull(readable);
        if (readable instanceof Reader) {
            reader = (Reader) readable;
        } else {
            reader = null;
        }
        this.f53974b = reader;
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public String readLine() throws IOException {
        int read;
        while (true) {
            if (this.f53977e.peek() != null) {
                break;
            }
            AbstractC17599Fg0.m68379a(this.f53975c);
            Reader reader = this.f53974b;
            if (reader != null) {
                char[] cArr = this.f53976d;
                read = reader.read(cArr, 0, cArr.length);
            } else {
                read = this.f53973a.read(this.f53975c);
            }
            if (read == -1) {
                this.f53978f.m65444b();
                break;
            }
            this.f53978f.m65445a(this.f53976d, 0, read);
        }
        return (String) this.f53977e.poll();
    }
}
