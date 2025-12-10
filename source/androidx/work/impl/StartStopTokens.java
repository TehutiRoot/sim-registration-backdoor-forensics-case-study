package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\t\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0007\u0010\u0013J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\t\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m28850d2 = {"Landroidx/work/impl/StartStopTokens;", "", "<init>", "()V", "Landroidx/work/impl/model/WorkGenerationalId;", "id", "Landroidx/work/impl/StartStopToken;", "tokenFor", "(Landroidx/work/impl/model/WorkGenerationalId;)Landroidx/work/impl/StartStopToken;", ProductAction.ACTION_REMOVE, "", "workSpecId", "", "(Ljava/lang/String;)Ljava/util/List;", "", "contains", "(Landroidx/work/impl/model/WorkGenerationalId;)Z", "Landroidx/work/impl/model/WorkSpec;", "spec", "(Landroidx/work/impl/model/WorkSpec;)Landroidx/work/impl/StartStopToken;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Object;", "lock", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/Map;", "runs", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStartStopToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartStopToken.kt\nandroidx/work/impl/StartStopTokens\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n361#2,7:66\n467#2,7:73\n1855#3,2:80\n1#4:82\n*S KotlinDebug\n*F\n+ 1 StartStopToken.kt\nandroidx/work/impl/StartStopTokens\n*L\n40#1:66,7\n52#1:73,7\n53#1:80,2\n*E\n"})
/* loaded from: classes.dex */
public final class StartStopTokens {

    /* renamed from: a */
    public final Object f38316a = new Object();

    /* renamed from: b */
    public final Map f38317b = new LinkedHashMap();

    public final boolean contains(@NotNull WorkGenerationalId id2) {
        boolean containsKey;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f38316a) {
            containsKey = this.f38317b.containsKey(id2);
        }
        return containsKey;
    }

    @Nullable
    public final StartStopToken remove(@NotNull WorkGenerationalId id2) {
        StartStopToken startStopToken;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f38316a) {
            startStopToken = (StartStopToken) this.f38317b.remove(id2);
        }
        return startStopToken;
    }

    @NotNull
    public final StartStopToken tokenFor(@NotNull WorkGenerationalId id2) {
        StartStopToken startStopToken;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f38316a) {
            try {
                Map map = this.f38317b;
                Object obj = map.get(id2);
                if (obj == null) {
                    obj = new StartStopToken(id2);
                    map.put(id2, obj);
                }
                startStopToken = (StartStopToken) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return startStopToken;
    }

    @NotNull
    public final List<StartStopToken> remove(@NotNull String workSpecId) {
        List<StartStopToken> list;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f38316a) {
            try {
                Map map = this.f38317b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (Intrinsics.areEqual(((WorkGenerationalId) entry.getKey()).getWorkSpecId(), workSpecId)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (WorkGenerationalId workGenerationalId : linkedHashMap.keySet()) {
                    this.f38317b.remove(workGenerationalId);
                }
                list = CollectionsKt___CollectionsKt.toList(linkedHashMap.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    @NotNull
    public final StartStopToken tokenFor(@NotNull WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return tokenFor(WorkSpecKt.generationalId(spec));
    }

    @Nullable
    public final StartStopToken remove(@NotNull WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return remove(WorkSpecKt.generationalId(spec));
    }
}
