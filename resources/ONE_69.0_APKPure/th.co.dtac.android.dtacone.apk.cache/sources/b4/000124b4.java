package th.p047co.dtac.android.dtacone.presenter.rectify;

import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.model.rectify.RectifyListCollection;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "rectify", "Lth/co/dtac/android/dtacone/model/rectify/RectifyListCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nRectifyListPresenterKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectifyListPresenterKt.kt\nth/co/dtac/android/dtacone/presenter/rectify/RectifyListPresenterKt$getRectifyList$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,89:1\n731#2,9:90\n37#3,2:99\n*S KotlinDebug\n*F\n+ 1 RectifyListPresenterKt.kt\nth/co/dtac/android/dtacone/presenter/rectify/RectifyListPresenterKt$getRectifyList$5\n*L\n54#1:90,9\n54#1:99,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.rectify.RectifyListPresenterKt$getRectifyList$5 */
/* loaded from: classes8.dex */
public final class RectifyListPresenterKt$getRectifyList$5 extends Lambda implements Function1<RectifyListCollection, String> {
    final /* synthetic */ int $SPLIT_DATE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RectifyListPresenterKt$getRectifyList$5(int i) {
        super(1);
        this.$SPLIT_DATE = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(RectifyListCollection rectifyListCollection) {
        List emptyList;
        String createdDateTime = rectifyListCollection.getCreatedDateTime();
        Intrinsics.checkNotNullExpressionValue(createdDateTime, "rectify.createdDateTime");
        List<String> split = new Regex(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR).split(createdDateTime, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    emptyList = CollectionsKt___CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return ((String[]) emptyList.toArray(new String[0]))[this.$SPLIT_DATE];
    }
}