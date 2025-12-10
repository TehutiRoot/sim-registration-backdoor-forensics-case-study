package p000;

import com.google.common.collect.ImmutableList;
import io.grpc.MetricInstrument;
import java.util.Collection;
import java.util.List;

/* renamed from: Ki1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC17959Ki1 implements MetricInstrument {
    protected final String description;
    protected final boolean enableByDefault;
    protected final int index;
    protected final String name;
    protected final List<String> optionalLabelKeys;
    protected final List<String> requiredLabelKeys;
    protected final String unit;

    public AbstractC17959Ki1(int i, String str, String str2, String str3, List list, List list2, boolean z) {
        this.index = i;
        this.name = str;
        this.description = str2;
        this.unit = str3;
        this.requiredLabelKeys = ImmutableList.copyOf((Collection) list);
        this.optionalLabelKeys = ImmutableList.copyOf((Collection) list2);
        this.enableByDefault = z;
    }

    @Override // io.grpc.MetricInstrument
    public String getDescription() {
        return this.description;
    }

    @Override // io.grpc.MetricInstrument
    public int getIndex() {
        return this.index;
    }

    @Override // io.grpc.MetricInstrument
    public String getName() {
        return this.name;
    }

    @Override // io.grpc.MetricInstrument
    public List getOptionalLabelKeys() {
        return this.optionalLabelKeys;
    }

    @Override // io.grpc.MetricInstrument
    public List getRequiredLabelKeys() {
        return this.requiredLabelKeys;
    }

    @Override // io.grpc.MetricInstrument
    public String getUnit() {
        return this.unit;
    }

    @Override // io.grpc.MetricInstrument
    public boolean isEnableByDefault() {
        return this.enableByDefault;
    }

    public String toString() {
        return getClass().getName() + "(" + getName() + ")";
    }
}