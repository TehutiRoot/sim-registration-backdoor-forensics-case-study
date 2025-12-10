package io.opencensus.metrics.data;

import javax.annotation.concurrent.Immutable;

/* loaded from: classes5.dex */
public abstract class AttachmentValue {

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class AttachmentValueString extends AttachmentValue {
        public static AttachmentValueString create(String str) {
            return new C10601a(str);
        }
    }

    public abstract String getValue();
}
