package io.opencensus.metrics;

import io.opencensus.internal.Utils;
import io.opencensus.metrics.C10585a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class MetricOptions {

    /* loaded from: classes5.dex */
    public static abstract class Builder {
        /* renamed from: a */
        public abstract MetricOptions mo30568a();

        /* renamed from: b */
        public abstract Map mo30567b();

        public MetricOptions build() {
            setLabelKeys(Collections.unmodifiableList(new ArrayList(mo30566c())));
            setConstantLabels(Collections.unmodifiableMap(new LinkedHashMap(mo30567b())));
            MetricOptions mo30568a = mo30568a();
            Utils.checkListElementNotNull(mo30568a.getLabelKeys(), "labelKeys elements");
            Utils.checkMapElementNotNull(mo30568a.getConstantLabels(), "constantLabels elements");
            HashSet hashSet = new HashSet();
            for (LabelKey labelKey : mo30568a.getLabelKeys()) {
                if (!hashSet.contains(labelKey.getKey())) {
                    hashSet.add(labelKey.getKey());
                } else {
                    throw new IllegalArgumentException("Invalid LabelKey in labelKeys");
                }
            }
            for (Map.Entry<LabelKey, LabelValue> entry : mo30568a.getConstantLabels().entrySet()) {
                if (!hashSet.contains(entry.getKey().getKey())) {
                    hashSet.add(entry.getKey().getKey());
                } else {
                    throw new IllegalArgumentException("Invalid LabelKey in constantLabels");
                }
            }
            return mo30568a;
        }

        /* renamed from: c */
        public abstract List mo30566c();

        public abstract Builder setConstantLabels(Map<LabelKey, LabelValue> map);

        public abstract Builder setDescription(String str);

        public abstract Builder setLabelKeys(List<LabelKey> list);

        public abstract Builder setUnit(String str);
    }

    public static Builder builder() {
        return new C10585a.C10587b().setDescription("").setUnit("1").setLabelKeys(Collections.emptyList()).setConstantLabels(Collections.emptyMap());
    }

    public abstract Map<LabelKey, LabelValue> getConstantLabels();

    public abstract String getDescription();

    public abstract List<LabelKey> getLabelKeys();

    public abstract String getUnit();
}