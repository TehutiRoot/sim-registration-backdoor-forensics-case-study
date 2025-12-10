package com.airbnb.lottie.compose;

import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m29142d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "Asset", "ContentProvider", "File", "JsonString", "RawRes", "Url", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "lottie-compose_release"}, m29141k = 1, m29140mv = {1, 6, 0}, m29138xi = 48)
/* loaded from: classes3.dex */
public interface LottieCompositionSpec {

    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m29142d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "assetName", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString-impl", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getAssetName", "()Ljava/lang/String;", "lottie-compose_release"}, m29141k = 1, m29140mv = {1, 6, 0})
    @JvmInline
    /* loaded from: classes3.dex */
    public static final class Asset implements LottieCompositionSpec {

        /* renamed from: a */
        public final String f41266a;

        public /* synthetic */ Asset(String str) {
            this.f41266a = str;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Asset m74170boximpl(String str) {
            return new Asset(str);
        }

        @NotNull
        /* renamed from: constructor-impl  reason: not valid java name */
        public static String m74171constructorimpl(@NotNull String assetName) {
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            return assetName;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m74172equalsimpl(String str, Object obj) {
            return (obj instanceof Asset) && Intrinsics.areEqual(str, ((Asset) obj).m74176unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m74173equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m74174hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m74175toStringimpl(String str) {
            return "Asset(assetName=" + str + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public boolean equals(Object obj) {
            return m74172equalsimpl(this.f41266a, obj);
        }

        @NotNull
        public final String getAssetName() {
            return this.f41266a;
        }

        public int hashCode() {
            return m74174hashCodeimpl(this.f41266a);
        }

        public String toString() {
            return m74175toStringimpl(this.f41266a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m74176unboximpl() {
            return this.f41266a;
        }
    }

    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m29142d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "Landroid/net/Uri;", "uri", "constructor-impl", "(Landroid/net/Uri;)Landroid/net/Uri;", "", "toString-impl", "(Landroid/net/Uri;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroid/net/Uri;)I", "hashCode", "", "other", "", "equals-impl", "(Landroid/net/Uri;Ljava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "lottie-compose_release"}, m29141k = 1, m29140mv = {1, 6, 0})
    @JvmInline
    /* loaded from: classes3.dex */
    public static final class ContentProvider implements LottieCompositionSpec {

        /* renamed from: a */
        public final Uri f41267a;

        public /* synthetic */ ContentProvider(Uri uri) {
            this.f41267a = uri;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ ContentProvider m74177boximpl(Uri uri) {
            return new ContentProvider(uri);
        }

        @NotNull
        /* renamed from: constructor-impl  reason: not valid java name */
        public static Uri m74178constructorimpl(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return uri;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m74179equalsimpl(Uri uri, Object obj) {
            return (obj instanceof ContentProvider) && Intrinsics.areEqual(uri, ((ContentProvider) obj).m74183unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m74180equalsimpl0(Uri uri, Uri uri2) {
            return Intrinsics.areEqual(uri, uri2);
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m74181hashCodeimpl(Uri uri) {
            return uri.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m74182toStringimpl(Uri uri) {
            return "ContentProvider(uri=" + uri + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public boolean equals(Object obj) {
            return m74179equalsimpl(this.f41267a, obj);
        }

        @NotNull
        public final Uri getUri() {
            return this.f41267a;
        }

        public int hashCode() {
            return m74181hashCodeimpl(this.f41267a);
        }

        public String toString() {
            return m74182toStringimpl(this.f41267a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ Uri m74183unboximpl() {
            return this.f41267a;
        }
    }

    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m29142d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "fileName", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString-impl", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "lottie-compose_release"}, m29141k = 1, m29140mv = {1, 6, 0})
    @JvmInline
    /* loaded from: classes3.dex */
    public static final class File implements LottieCompositionSpec {

        /* renamed from: a */
        public final String f41268a;

        public /* synthetic */ File(String str) {
            this.f41268a = str;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ File m74184boximpl(String str) {
            return new File(str);
        }

        @NotNull
        /* renamed from: constructor-impl  reason: not valid java name */
        public static String m74185constructorimpl(@NotNull String fileName) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            return fileName;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m74186equalsimpl(String str, Object obj) {
            return (obj instanceof File) && Intrinsics.areEqual(str, ((File) obj).m74190unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m74187equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m74188hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m74189toStringimpl(String str) {
            return "File(fileName=" + str + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public boolean equals(Object obj) {
            return m74186equalsimpl(this.f41268a, obj);
        }

        @NotNull
        public final String getFileName() {
            return this.f41268a;
        }

        public int hashCode() {
            return m74188hashCodeimpl(this.f41268a);
        }

        public String toString() {
            return m74189toStringimpl(this.f41268a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m74190unboximpl() {
            return this.f41268a;
        }
    }

    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m29142d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "jsonString", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString-impl", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getJsonString", "()Ljava/lang/String;", "lottie-compose_release"}, m29141k = 1, m29140mv = {1, 6, 0})
    @JvmInline
    /* loaded from: classes3.dex */
    public static final class JsonString implements LottieCompositionSpec {

        /* renamed from: a */
        public final String f41269a;

        public /* synthetic */ JsonString(String str) {
            this.f41269a = str;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ JsonString m74191boximpl(String str) {
            return new JsonString(str);
        }

        @NotNull
        /* renamed from: constructor-impl  reason: not valid java name */
        public static String m74192constructorimpl(@NotNull String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            return jsonString;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m74193equalsimpl(String str, Object obj) {
            return (obj instanceof JsonString) && Intrinsics.areEqual(str, ((JsonString) obj).m74197unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m74194equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m74195hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m74196toStringimpl(String str) {
            return "JsonString(jsonString=" + str + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public boolean equals(Object obj) {
            return m74193equalsimpl(this.f41269a, obj);
        }

        @NotNull
        public final String getJsonString() {
            return this.f41269a;
        }

        public int hashCode() {
            return m74195hashCodeimpl(this.f41269a);
        }

        public String toString() {
            return m74196toStringimpl(this.f41269a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m74197unboximpl() {
            return this.f41269a;
        }
    }

    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m29142d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "resId", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getResId", "()I", "lottie-compose_release"}, m29141k = 1, m29140mv = {1, 6, 0})
    @JvmInline
    /* loaded from: classes3.dex */
    public static final class RawRes implements LottieCompositionSpec {

        /* renamed from: a */
        public final int f41270a;

        public /* synthetic */ RawRes(int i) {
            this.f41270a = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ RawRes m74198boximpl(int i) {
            return new RawRes(i);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m74199constructorimpl(@androidx.annotation.RawRes int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m74200equalsimpl(int i, Object obj) {
            return (obj instanceof RawRes) && i == ((RawRes) obj).m74204unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m74201equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m74202hashCodeimpl(int i) {
            return i;
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m74203toStringimpl(int i) {
            return "RawRes(resId=" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public boolean equals(Object obj) {
            return m74200equalsimpl(this.f41270a, obj);
        }

        public final int getResId() {
            return this.f41270a;
        }

        public int hashCode() {
            return m74202hashCodeimpl(this.f41270a);
        }

        public String toString() {
            return m74203toStringimpl(this.f41270a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m74204unboximpl() {
            return this.f41270a;
        }
    }

    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m29142d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", ImagesContract.URL, "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString-impl", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "lottie-compose_release"}, m29141k = 1, m29140mv = {1, 6, 0})
    @JvmInline
    /* loaded from: classes3.dex */
    public static final class Url implements LottieCompositionSpec {

        /* renamed from: a */
        public final String f41271a;

        public /* synthetic */ Url(String str) {
            this.f41271a = str;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Url m74205boximpl(String str) {
            return new Url(str);
        }

        @NotNull
        /* renamed from: constructor-impl  reason: not valid java name */
        public static String m74206constructorimpl(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return url;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m74207equalsimpl(String str, Object obj) {
            return (obj instanceof Url) && Intrinsics.areEqual(str, ((Url) obj).m74211unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m74208equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m74209hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m74210toStringimpl(String str) {
            return "Url(url=" + str + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public boolean equals(Object obj) {
            return m74207equalsimpl(this.f41271a, obj);
        }

        @NotNull
        public final String getUrl() {
            return this.f41271a;
        }

        public int hashCode() {
            return m74209hashCodeimpl(this.f41271a);
        }

        public String toString() {
            return m74210toStringimpl(this.f41271a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m74211unboximpl() {
            return this.f41271a;
        }
    }
}