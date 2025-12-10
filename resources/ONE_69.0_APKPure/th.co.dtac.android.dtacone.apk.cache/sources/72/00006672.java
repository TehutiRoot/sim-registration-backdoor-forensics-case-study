package androidx.compose.p003ui.tooling.preview;

import kotlin.Metadata;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, m29142d2 = {"Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "T", "", "count", "", "getCount", "()I", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "ui-tooling-preview_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.tooling.preview.PreviewParameterProvider */
/* loaded from: classes2.dex */
public interface PreviewParameterProvider<T> {

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.tooling.preview.PreviewParameterProvider$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> int getCount(@NotNull PreviewParameterProvider<T> previewParameterProvider) {
            int m23580a;
            m23580a = AbstractC21883qo1.m23580a(previewParameterProvider);
            return m23580a;
        }
    }

    int getCount();

    @NotNull
    Sequence<T> getValues();
}