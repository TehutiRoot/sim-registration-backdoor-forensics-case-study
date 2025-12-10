package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HeaderIterator;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: classes6.dex */
public class BasicHeaderElementIterator implements HeaderElementIterator {

    /* renamed from: a */
    public final HeaderIterator f74619a;

    /* renamed from: b */
    public final HeaderValueParser f74620b;

    /* renamed from: c */
    public HeaderElement f74621c;

    /* renamed from: d */
    public CharArrayBuffer f74622d;

    /* renamed from: e */
    public ParserCursor f74623e;

    public BasicHeaderElementIterator(HeaderIterator headerIterator, HeaderValueParser headerValueParser) {
        this.f74621c = null;
        this.f74622d = null;
        this.f74623e = null;
        this.f74619a = (HeaderIterator) Args.notNull(headerIterator, "Header iterator");
        this.f74620b = (HeaderValueParser) Args.notNull(headerValueParser, "Parser");
    }

    /* renamed from: a */
    public final void m24757a() {
        this.f74623e = null;
        this.f74622d = null;
        while (this.f74619a.hasNext()) {
            Header nextHeader = this.f74619a.nextHeader();
            if (nextHeader instanceof FormattedHeader) {
                FormattedHeader formattedHeader = (FormattedHeader) nextHeader;
                CharArrayBuffer buffer = formattedHeader.getBuffer();
                this.f74622d = buffer;
                ParserCursor parserCursor = new ParserCursor(0, buffer.length());
                this.f74623e = parserCursor;
                parserCursor.updatePos(formattedHeader.getValuePos());
                return;
            }
            String value = nextHeader.getValue();
            if (value != null) {
                CharArrayBuffer charArrayBuffer = new CharArrayBuffer(value.length());
                this.f74622d = charArrayBuffer;
                charArrayBuffer.append(value);
                this.f74623e = new ParserCursor(0, this.f74622d.length());
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m24756b() {
        /*
            r3 = this;
        L0:
            org.apache.http.HeaderIterator r0 = r3.f74619a
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto Le
            org.apache.http.message.ParserCursor r0 = r3.f74623e
            if (r0 == 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            org.apache.http.message.ParserCursor r0 = r3.f74623e
            if (r0 == 0) goto L18
            boolean r0 = r0.atEnd()
            if (r0 == 0) goto L1b
        L18:
            r3.m24757a()
        L1b:
            org.apache.http.message.ParserCursor r0 = r3.f74623e
            if (r0 == 0) goto L0
        L1f:
            org.apache.http.message.ParserCursor r0 = r3.f74623e
            boolean r0 = r0.atEnd()
            if (r0 != 0) goto L44
            org.apache.http.message.HeaderValueParser r0 = r3.f74620b
            org.apache.http.util.CharArrayBuffer r1 = r3.f74622d
            org.apache.http.message.ParserCursor r2 = r3.f74623e
            org.apache.http.HeaderElement r0 = r0.parseHeaderElement(r1, r2)
            java.lang.String r1 = r0.getName()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L41
            java.lang.String r1 = r0.getValue()
            if (r1 == 0) goto L1f
        L41:
            r3.f74621c = r0
            return
        L44:
            org.apache.http.message.ParserCursor r0 = r3.f74623e
            boolean r0 = r0.atEnd()
            if (r0 == 0) goto L0
            r0 = 0
            r3.f74623e = r0
            r3.f74622d = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.message.BasicHeaderElementIterator.m24756b():void");
    }

    @Override // org.apache.http.HeaderElementIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.f74621c == null) {
            m24756b();
        }
        if (this.f74621c != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException {
        return nextElement();
    }

    @Override // org.apache.http.HeaderElementIterator
    public HeaderElement nextElement() throws NoSuchElementException {
        if (this.f74621c == null) {
            m24756b();
        }
        HeaderElement headerElement = this.f74621c;
        if (headerElement != null) {
            this.f74621c = null;
            return headerElement;
        }
        throw new NoSuchElementException("No more header elements available");
    }

    @Override // java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public BasicHeaderElementIterator(HeaderIterator headerIterator) {
        this(headerIterator, BasicHeaderValueParser.INSTANCE);
    }
}