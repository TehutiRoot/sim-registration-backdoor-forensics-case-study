package org.apache.http.p030io;

import org.apache.http.HttpMessage;
import org.apache.http.config.MessageConstraints;

/* renamed from: org.apache.http.io.HttpMessageParserFactory */
/* loaded from: classes6.dex */
public interface HttpMessageParserFactory<T extends HttpMessage> {
    HttpMessageParser<T> create(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints);
}
