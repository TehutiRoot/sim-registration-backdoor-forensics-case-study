package com.chuckerteam.chucker.internal.data.har;

import com.chuckerteam.chucker.internal.data.har.log.Browser;
import com.chuckerteam.chucker.internal.data.har.log.Creator;
import com.chuckerteam.chucker.internal.data.har.log.Entry;
import com.chuckerteam.chucker.internal.data.har.log.Page;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u001f\b\u0016\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J^\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0018R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001aR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u0010\u0014¨\u00067"}, m29142d2 = {"Lcom/chuckerteam/chucker/internal/data/har/Log;", "", "", ClientCookie.VERSION_ATTR, "Lcom/chuckerteam/chucker/internal/data/har/log/Creator;", "creator", "Lcom/chuckerteam/chucker/internal/data/har/log/Browser;", "browser", "", "Lcom/chuckerteam/chucker/internal/data/har/log/Page;", "pages", "Lcom/chuckerteam/chucker/internal/data/har/log/Entry;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, ClientCookie.COMMENT_ATTR, "<init>", "(Ljava/lang/String;Lcom/chuckerteam/chucker/internal/data/har/log/Creator;Lcom/chuckerteam/chucker/internal/data/har/log/Browser;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transactions", "(Ljava/util/List;Lcom/chuckerteam/chucker/internal/data/har/log/Creator;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/chuckerteam/chucker/internal/data/har/log/Creator;", "component3", "()Lcom/chuckerteam/chucker/internal/data/har/log/Browser;", "component4", "()Ljava/util/List;", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/chuckerteam/chucker/internal/data/har/log/Creator;Lcom/chuckerteam/chucker/internal/data/har/log/Browser;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/Log;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getVersion", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/chuckerteam/chucker/internal/data/har/log/Creator;", "getCreator", OperatorName.CURVE_TO, "Lcom/chuckerteam/chucker/internal/data/har/log/Browser;", "getBrowser", "d", "Ljava/util/List;", "getPages", "e", "getEntries", OperatorName.FILL_NON_ZERO, "getComment", "com.github.ChuckerTeam.Chucker.library"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Log.kt\ncom/chuckerteam/chucker/internal/data/har/Log\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n1549#2:26\n1620#2,3:27\n*S KotlinDebug\n*F\n+ 1 Log.kt\ncom/chuckerteam/chucker/internal/data/har/Log\n*L\n22#1:26\n22#1:27,3\n*E\n"})
/* loaded from: classes3.dex */
public final class Log {
    @SerializedName(ClientCookie.VERSION_ATTR)
    @NotNull

    /* renamed from: a */
    private final String f42818a;
    @SerializedName("creator")
    @NotNull

    /* renamed from: b */
    private final Creator f42819b;
    @SerializedName("browser")
    @Nullable

    /* renamed from: c */
    private final Browser f42820c;
    @SerializedName("pages")
    @Nullable

    /* renamed from: d */
    private final List<Page> f42821d;
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.ENTRIES)
    @NotNull

    /* renamed from: e */
    private final List<Entry> f42822e;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @Nullable

    /* renamed from: f */
    private final String f42823f;

    public Log(@NotNull String version, @NotNull Creator creator, @Nullable Browser browser, @Nullable List<Page> list, @NotNull List<Entry> entries, @Nullable String str) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f42818a = version;
        this.f42819b = creator;
        this.f42820c = browser;
        this.f42821d = list;
        this.f42822e = entries;
        this.f42823f = str;
    }

    public static /* synthetic */ Log copy$default(Log log, String str, Creator creator, Browser browser, List list, List list2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = log.f42818a;
        }
        if ((i & 2) != 0) {
            creator = log.f42819b;
        }
        Creator creator2 = creator;
        if ((i & 4) != 0) {
            browser = log.f42820c;
        }
        Browser browser2 = browser;
        List<Page> list3 = list;
        if ((i & 8) != 0) {
            list3 = log.f42821d;
        }
        List list4 = list3;
        List<Entry> list5 = list2;
        if ((i & 16) != 0) {
            list5 = log.f42822e;
        }
        List list6 = list5;
        if ((i & 32) != 0) {
            str2 = log.f42823f;
        }
        return log.copy(str, creator2, browser2, list4, list6, str2);
    }

    @NotNull
    public final String component1() {
        return this.f42818a;
    }

    @NotNull
    public final Creator component2() {
        return this.f42819b;
    }

    @Nullable
    public final Browser component3() {
        return this.f42820c;
    }

    @Nullable
    public final List<Page> component4() {
        return this.f42821d;
    }

    @NotNull
    public final List<Entry> component5() {
        return this.f42822e;
    }

    @Nullable
    public final String component6() {
        return this.f42823f;
    }

    @NotNull
    public final Log copy(@NotNull String version, @NotNull Creator creator, @Nullable Browser browser, @Nullable List<Page> list, @NotNull List<Entry> entries, @Nullable String str) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new Log(version, creator, browser, list, entries, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Log) {
            Log log = (Log) obj;
            return Intrinsics.areEqual(this.f42818a, log.f42818a) && Intrinsics.areEqual(this.f42819b, log.f42819b) && Intrinsics.areEqual(this.f42820c, log.f42820c) && Intrinsics.areEqual(this.f42821d, log.f42821d) && Intrinsics.areEqual(this.f42822e, log.f42822e) && Intrinsics.areEqual(this.f42823f, log.f42823f);
        }
        return false;
    }

    @Nullable
    public final Browser getBrowser() {
        return this.f42820c;
    }

    @Nullable
    public final String getComment() {
        return this.f42823f;
    }

    @NotNull
    public final Creator getCreator() {
        return this.f42819b;
    }

    @NotNull
    public final List<Entry> getEntries() {
        return this.f42822e;
    }

    @Nullable
    public final List<Page> getPages() {
        return this.f42821d;
    }

    @NotNull
    public final String getVersion() {
        return this.f42818a;
    }

    public int hashCode() {
        int hashCode = ((this.f42818a.hashCode() * 31) + this.f42819b.hashCode()) * 31;
        Browser browser = this.f42820c;
        int hashCode2 = (hashCode + (browser == null ? 0 : browser.hashCode())) * 31;
        List<Page> list = this.f42821d;
        int hashCode3 = (((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.f42822e.hashCode()) * 31;
        String str = this.f42823f;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f42818a;
        Creator creator = this.f42819b;
        Browser browser = this.f42820c;
        List<Page> list = this.f42821d;
        List<Entry> list2 = this.f42822e;
        String str2 = this.f42823f;
        return "Log(version=" + str + ", creator=" + creator + ", browser=" + browser + ", pages=" + list + ", entries=" + list2 + ", comment=" + str2 + ")";
    }

    public /* synthetic */ Log(String str, Creator creator, Browser browser, List list, List list2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "1.2" : str, creator, (i & 4) != 0 ? null : browser, (i & 8) != 0 ? null : list, list2, (i & 32) != 0 ? null : str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Log(@org.jetbrains.annotations.NotNull java.util.List<com.chuckerteam.chucker.internal.data.entity.HttpTransaction> r10, @org.jetbrains.annotations.NotNull com.chuckerteam.chucker.internal.data.har.log.Creator r11) {
        /*
            r9 = this;
            java.lang.String r0 = "transactions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "creator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = p000.AbstractC10172es.collectionSizeOrDefault(r10, r0)
            r5.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L1b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r10.next()
            com.chuckerteam.chucker.internal.data.entity.HttpTransaction r0 = (com.chuckerteam.chucker.internal.data.entity.HttpTransaction) r0
            com.chuckerteam.chucker.internal.data.har.log.Entry r1 = new com.chuckerteam.chucker.internal.data.har.log.Entry
            r1.<init>(r0)
            r5.add(r1)
            goto L1b
        L30:
            r7 = 45
            r8 = 0
            r1 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r0 = r9
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.data.har.Log.<init>(java.util.List, com.chuckerteam.chucker.internal.data.har.log.Creator):void");
    }
}