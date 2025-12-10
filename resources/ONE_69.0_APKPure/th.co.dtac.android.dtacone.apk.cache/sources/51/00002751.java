package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001eB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0002\b\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u001aR\u00020\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m29142d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function0;)V", Action.KEY_ATTRIBUTE, "getContentType", "(Ljava/lang/Object;)Ljava/lang/Object;", "", FirebaseAnalytics.Param.INDEX, "contentType", "", "Landroidx/compose/runtime/Composable;", "getContent", "(ILjava/lang/Object;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/saveable/SaveableStateHolder;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function0;", "getItemProvider", "()Lkotlin/jvm/functions/Function0;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", OperatorName.CURVE_TO, "Ljava/util/Map;", "lambdasCache", "CachedItemContent", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory {

    /* renamed from: a */
    public final SaveableStateHolder f13719a;

    /* renamed from: b */
    public final Function0 f13720b;

    /* renamed from: c */
    public final Map f13721c;

    /* loaded from: classes.dex */
    public final class CachedItemContent {

        /* renamed from: a */
        public final Object f13722a;

        /* renamed from: b */
        public final Object f13723b;

        /* renamed from: c */
        public int f13724c;

        /* renamed from: d */
        public Function2 f13725d;

        /* renamed from: e */
        public final /* synthetic */ LazyLayoutItemContentFactory f13726e;

        public CachedItemContent(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, int i, Object key, Object obj) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f13726e = lazyLayoutItemContentFactory;
            this.f13722a = key;
            this.f13723b = obj;
            this.f13724c = i;
        }

        /* renamed from: c */
        public final Function2 m61157c() {
            return ComposableLambdaKt.composableLambdaInstance(1403994769, true, new C2911xbaaa624f(this.f13726e, this));
        }

        /* renamed from: d */
        public final Function2 m61156d() {
            Function2 function2 = this.f13725d;
            if (function2 == null) {
                Function2 m61157c = m61157c();
                this.f13725d = m61157c;
                return m61157c;
            }
            return function2;
        }

        /* renamed from: e */
        public final Object m61155e() {
            return this.f13723b;
        }

        /* renamed from: f */
        public final int m61154f() {
            return this.f13724c;
        }

        /* renamed from: g */
        public final Object m61153g() {
            return this.f13722a;
        }
    }

    public LazyLayoutItemContentFactory(@NotNull SaveableStateHolder saveableStateHolder, @NotNull Function0<? extends LazyLayoutItemProvider> itemProvider) {
        Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        this.f13719a = saveableStateHolder;
        this.f13720b = itemProvider;
        this.f13721c = new LinkedHashMap();
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getContent(int i, @NotNull Object key, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        CachedItemContent cachedItemContent = (CachedItemContent) this.f13721c.get(key);
        if (cachedItemContent != null && cachedItemContent.m61154f() == i && Intrinsics.areEqual(cachedItemContent.m61155e(), obj)) {
            return cachedItemContent.m61156d();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(this, i, key, obj);
        this.f13721c.put(key, cachedItemContent2);
        return cachedItemContent2.m61156d();
    }

    @Nullable
    public final Object getContentType(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = (CachedItemContent) this.f13721c.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.m61155e();
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.f13720b.invoke();
        int index = lazyLayoutItemProvider.getIndex(obj);
        if (index == -1) {
            return null;
        }
        return lazyLayoutItemProvider.getContentType(index);
    }

    @NotNull
    public final Function0<LazyLayoutItemProvider> getItemProvider() {
        return this.f13720b;
    }
}