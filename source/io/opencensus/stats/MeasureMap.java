package io.opencensus.stats;

import ch.qos.logback.core.joran.action.Action;
import io.opencensus.internal.Utils;
import io.opencensus.metrics.data.AttachmentValue;
import io.opencensus.stats.Measure;
import io.opencensus.tags.TagContext;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes5.dex */
public abstract class MeasureMap {
    public abstract MeasureMap put(Measure.MeasureDouble measureDouble, double d);

    public abstract MeasureMap put(Measure.MeasureLong measureLong, long j);

    @Deprecated
    public MeasureMap putAttachment(String str, String str2) {
        return putAttachment(str, AttachmentValue.AttachmentValueString.create(str2));
    }

    public abstract void record();

    public abstract void record(TagContext tagContext);

    public MeasureMap putAttachment(String str, AttachmentValue attachmentValue) {
        Utils.checkNotNull(str, Action.KEY_ATTRIBUTE);
        Utils.checkNotNull(attachmentValue, "value");
        return this;
    }
}
