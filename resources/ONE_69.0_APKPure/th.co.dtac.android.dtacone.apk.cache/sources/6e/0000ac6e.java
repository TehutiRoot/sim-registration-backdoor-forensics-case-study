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
    public final Readable f53985a;

    /* renamed from: b */
    public final Reader f53986b;

    /* renamed from: c */
    public final CharBuffer f53987c;

    /* renamed from: d */
    public final char[] f53988d;

    /* renamed from: e */
    public final Queue f53989e;

    /* renamed from: f */
    public final AbstractC19618dj0 f53990f;

    /* renamed from: com.google.common.io.LineReader$a */
    /* loaded from: classes4.dex */
    public class C8100a extends AbstractC19618dj0 {
        public C8100a() {
        }

        @Override // p000.AbstractC19618dj0
        /* renamed from: d */
        public void mo31769d(String str, String str2) {
            LineReader.this.f53989e.add(str);
        }
    }

    public LineReader(Readable readable) {
        Reader reader;
        CharBuffer m39983c = CharStreams.m39983c();
        this.f53987c = m39983c;
        this.f53988d = m39983c.array();
        this.f53989e = new ArrayDeque();
        this.f53990f = new C8100a();
        this.f53985a = (Readable) Preconditions.checkNotNull(readable);
        if (readable instanceof Reader) {
            reader = (Reader) readable;
        } else {
            reader = null;
        }
        this.f53986b = reader;
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public String readLine() throws IOException {
        int read;
        while (true) {
            if (this.f53989e.peek() != null) {
                break;
            }
            AbstractC18017Lg0.m67532a(this.f53987c);
            Reader reader = this.f53986b;
            if (reader != null) {
                char[] cArr = this.f53988d;
                read = reader.read(cArr, 0, cArr.length);
            } else {
                read = this.f53985a.read(this.f53987c);
            }
            if (read == -1) {
                this.f53990f.m31771b();
                break;
            }
            this.f53990f.m31772a(this.f53988d, 0, read);
        }
        return (String) this.f53989e.poll();
    }
}