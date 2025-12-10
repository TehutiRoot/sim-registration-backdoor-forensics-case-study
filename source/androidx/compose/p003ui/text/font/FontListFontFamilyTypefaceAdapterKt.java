package androidx.compose.p003ui.text.font;

import androidx.compose.p003ui.text.font.AsyncTypefaceCache;
import androidx.compose.p003ui.text.font.FontLoadingStrategy;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m28850d2 = {"", "Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "Lkotlin/Function1;", "", "createDefaultTypeface", "Lkotlin/Pair;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/List;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n416#2:428\n417#2,9:430\n416#2:439\n417#2,7:441\n424#2,2:449\n24#3:429\n24#3:440\n1#4:448\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n185#1:428\n185#1:430,9\n201#1:439\n201#1:441,7\n201#1:449,2\n185#1:429\n201#1:440\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapterKt */
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* renamed from: a */
    public static final Pair m59048a(List list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1 function1) {
        Object loadBlocking;
        Font font;
        Object m74087constructorimpl;
        Font font2;
        int size = list.size();
        List list2 = null;
        for (int i = 0; i < size; i++) {
            Font font3 = (Font) list.get(i);
            int mo73258getLoadingStrategyPKNRLFQ = font3.mo73258getLoadingStrategyPKNRLFQ();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
            if (FontLoadingStrategy.m73298equalsimpl0(mo73258getLoadingStrategyPKNRLFQ, companion.m73303getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.f31251d) {
                    try {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font3, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.f31249b.get(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.f31250c.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            loadBlocking = asyncTypefaceResult.m73277unboximpl();
                            font = font3;
                        } else {
                            Unit unit = Unit.INSTANCE;
                            try {
                                loadBlocking = platformFontLoader.loadBlocking(font3);
                                font = font3;
                                AsyncTypefaceCache.put$default(asyncTypefaceCache, font3, platformFontLoader, loadBlocking, false, 8, null);
                            } catch (Exception e) {
                                throw new IllegalStateException("Unable to load font " + font3, e);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (loadBlocking != null) {
                    return TuplesKt.m28844to(list2, FontSynthesis_androidKt.m73330synthesizeTypefaceFxwP2eA(typefaceRequest.m73346getFontSynthesisGVVA2EU(), loadBlocking, font, typefaceRequest.getFontWeight(), typefaceRequest.m73345getFontStyle_LCdwA()));
                }
                throw new IllegalStateException("Unable to load font " + font);
            }
            if (FontLoadingStrategy.m73298equalsimpl0(mo73258getLoadingStrategyPKNRLFQ, companion.m73304getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.f31251d) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font3, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.f31249b.get(key2);
                        if (asyncTypefaceResult2 == null) {
                            asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.f31250c.get(key2);
                        }
                        if (asyncTypefaceResult2 != null) {
                            m74087constructorimpl = asyncTypefaceResult2.m73277unboximpl();
                            font2 = font3;
                        } else {
                            Unit unit2 = Unit.INSTANCE;
                            try {
                                Result.Companion companion2 = Result.Companion;
                                m74087constructorimpl = Result.m74087constructorimpl(platformFontLoader.loadBlocking(font3));
                            } catch (Throwable th3) {
                                Result.Companion companion3 = Result.Companion;
                                m74087constructorimpl = Result.m74087constructorimpl(ResultKt.createFailure(th3));
                            }
                            if (Result.m74093isFailureimpl(m74087constructorimpl)) {
                                m74087constructorimpl = null;
                            }
                            font2 = font3;
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font3, platformFontLoader, m74087constructorimpl, false, 8, null);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (m74087constructorimpl != null) {
                    return TuplesKt.m28844to(list2, FontSynthesis_androidKt.m73330synthesizeTypefaceFxwP2eA(typefaceRequest.m73346getFontSynthesisGVVA2EU(), m74087constructorimpl, font2, typefaceRequest.getFontWeight(), typefaceRequest.m73345getFontStyle_LCdwA()));
                }
            } else if (FontLoadingStrategy.m73298equalsimpl0(mo73258getLoadingStrategyPKNRLFQ, companion.m73302getAsyncPKNRLFQ())) {
                AsyncTypefaceCache.AsyncTypefaceResult m73269get1ASDuI8 = asyncTypefaceCache.m73269get1ASDuI8(font3, platformFontLoader);
                if (m73269get1ASDuI8 == null) {
                    if (list2 == null) {
                        list2 = CollectionsKt__CollectionsKt.mutableListOf(font3);
                    } else {
                        list2.add(font3);
                    }
                } else if (!AsyncTypefaceCache.AsyncTypefaceResult.m73275isPermanentFailureimpl(m73269get1ASDuI8.m73277unboximpl()) && m73269get1ASDuI8.m73277unboximpl() != null) {
                    return TuplesKt.m28844to(list2, FontSynthesis_androidKt.m73330synthesizeTypefaceFxwP2eA(typefaceRequest.m73346getFontSynthesisGVVA2EU(), m73269get1ASDuI8.m73277unboximpl(), font3, typefaceRequest.getFontWeight(), typefaceRequest.m73345getFontStyle_LCdwA()));
                }
            } else {
                throw new IllegalStateException("Unknown font type " + font3);
            }
        }
        return TuplesKt.m28844to(list2, function1.invoke(typefaceRequest));
    }

    public static final /* synthetic */ Pair access$firstImmediatelyAvailable(List list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1 function1) {
        return m59048a(list, typefaceRequest, asyncTypefaceCache, platformFontLoader, function1);
    }
}
