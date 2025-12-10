package org.apache.commons.p028io.output;

import java.io.Writer;
import java.util.Collection;

/* renamed from: org.apache.commons.io.output.TeeWriter */
/* loaded from: classes6.dex */
public class TeeWriter extends ProxyCollectionWriter {
    public TeeWriter(Collection<Writer> collection) {
        super(collection);
    }

    public TeeWriter(Writer... writerArr) {
        super(writerArr);
    }
}